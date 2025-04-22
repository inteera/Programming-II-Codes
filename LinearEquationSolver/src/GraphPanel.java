import javax.swing.*;
import java.awt.*;

public class GraphPanel extends JPanel {
    private double x1, y1, x2, y2, x3, y3, x4, y4;
    private boolean shouldDraw = false;

    public void setPoints(double x1, double y1, double x2, double y2,
                          double x3, double y3, double x4, double y4) {
        this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2;
        this.x3 = x3; this.y3 = y3; this.x4 = x4; this.y4 = y4;
        this.shouldDraw = true;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!shouldDraw) return;

        Graphics2D g2 = (Graphics2D) g;

        // === Collect all points to consider for scaling ===
        double[] xPoints = {x1, x2, x3, x4};
        double[] yPoints = {y1, y2, y3, y4};

        // Add intersection point if exists
        LinearEquation eq = new LinearEquation(x1, y1, x2, y2, x3, y3, x4, y4);
        boolean hasIntersection = false;
        double ix = 0, iy = 0;
        if (eq.isSolvable()) {
            hasIntersection = true;
            ix = (eq.getE() * eq.getD() - eq.getB() * eq.getF()) / (eq.getA() * eq.getD() - eq.getB() * eq.getC());
            iy = (eq.getA() * eq.getF() - eq.getE() * eq.getC()) / (eq.getA() * eq.getD() - eq.getB() * eq.getC());
        }

        // Find min/max values
        double minX = Math.min(Math.min(x1, x2), Math.min(x3, x4));
        double maxX = Math.max(Math.max(x1, x2), Math.max(x3, x4));
        double minY = Math.min(Math.min(y1, y2), Math.min(y3, y4));
        double maxY = Math.max(Math.max(y1, y2), Math.max(y3, y4));

        if (hasIntersection) {
            minX = Math.min(minX, ix);
            maxX = Math.max(maxX, ix);
            minY = Math.min(minY, iy);
            maxY = Math.max(maxY, iy);
        }

        //Add padding
        double rangeX = maxX - minX;
        double rangeY = maxY - minY;

        if (rangeX == 0) rangeX = 2; // prevent divide-by-zero
        if (rangeY == 0) rangeY = 2;

        double paddingRatio = 0.2; // 20% visual margin around
        double paddingX = rangeX * paddingRatio;
        double paddingY = rangeY * paddingRatio;

        minX -= paddingX;
        maxX += paddingX;
        minY -= paddingY;
        maxY += paddingY;


        int width = getWidth();
        int height = getHeight();

        // === Calculate scale and origin ===
        double scaleX = width / (maxX - minX);
        double scaleY = height / (maxY - minY);
        double scale = Math.min(scaleX, scaleY);

        double offsetX = -minX * scale;
        double offsetY = maxY * scale;

        // === Helper for converting (x,y) to screen (sx,sy) ===
        java.util.function.BiFunction<Double, Double, Point> transform = (x, y) -> new Point(
                (int) (x * scale + offsetX),
                (int) (offsetY - y * scale)
        );

        // Draw axes
        Point oX0 = transform.apply(minX, 0.0);
        Point oX1 = transform.apply(maxX, 0.0);
        Point oY0 = transform.apply(0.0, minY);
        Point oY1 = transform.apply(0.0, maxY);

        g2.setColor(Color.LIGHT_GRAY);
        g2.drawLine(oX0.x, oX0.y, oX1.x, oX1.y);
        g2.drawLine(oY0.x, oY0.y, oY1.x, oY1.y);

        // === Draw extended lines ===
        drawExtendedLine(g2, x1, y1, x2, y2, scale, offsetX, offsetY, Color.BLUE);
        drawExtendedLine(g2, x3, y3, x4, y4, scale, offsetX, offsetY, Color.RED);

        // === Draw intersection ===
        if (hasIntersection) {
            Point p = transform.apply(ix, iy);
            g2.setColor(Color.BLUE);
            g2.fillOval(p.x - 5, p.y - 5, 10, 10);
            g2.drawString(String.format("(%.2f, %.2f)", ix, iy), p.x + 8, p.y - 8);
        }
    }

    
    private void drawExtendedLine(Graphics2D g2, double x1, double y1, double x2, double y2,
                                  double scale, double offsetX, double offsetY, Color color) {
        g2.setColor(color);
        int width = getWidth();
        double startX = -offsetX / scale;
        double endX = (width - offsetX) / scale;

        if (x1 == x2) {
            // Vertical line
            int px = (int) (x1 * scale + offsetX);
            g2.drawLine(px, 0, px, getHeight());
        } else {
            double m = (y2 - y1) / (x2 - x1);
            double b = y1 - m * x1;

            int sx = (int) (startX * scale + offsetX);
            int sy = (int) (offsetY - (m * startX + b) * scale);
            int ex = (int) (endX * scale + offsetX);
            int ey = (int) (offsetY - (m * endX + b) * scale);

            g2.drawLine(sx, sy, ex, ey);
        }
    }


}

public class Main extends javax.swing.JFrame {
    private final GraphPanel graphPanel;

    public Main() {
        initComponents();
        graphPanel = new GraphPanel();
        graphPanel.setPreferredSize(new java.awt.Dimension(400, 400));
        graphContainerPanel.setLayout(new java.awt.BorderLayout());
        graphContainerPanel.add(graphPanel);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_x1 = new javax.swing.JLabel();
        lbl_x2 = new javax.swing.JLabel();
        lbl_x3 = new javax.swing.JLabel();
        lbl_x4 = new javax.swing.JLabel();
        lbl_y1 = new javax.swing.JLabel();
        lbl_y2 = new javax.swing.JLabel();
        lbl_y3 = new javax.swing.JLabel();
        lbl_y4 = new javax.swing.JLabel();
        txt_x2 = new javax.swing.JTextField();
        txt_x3 = new javax.swing.JTextField();
        txt_x1 = new javax.swing.JTextField();
        txt_x4 = new javax.swing.JTextField();
        txt_y2 = new javax.swing.JTextField();
        txt_y1 = new javax.swing.JTextField();
        txt_y3 = new javax.swing.JTextField();
        txt_y4 = new javax.swing.JTextField();
        btn_calculate = new javax.swing.JButton();
        txt_resultX = new javax.swing.JLabel();
        txt_resultY = new javax.swing.JLabel();
        graphContainerPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_x1.setText("x1 : ");

        lbl_x2.setText("x2 : ");

        lbl_x3.setText("x3 : ");

        lbl_x4.setText("x4 : ");

        lbl_y1.setText("y1 : ");

        lbl_y2.setText("y4 : ");

        lbl_y3.setText("y3 : ");

        lbl_y4.setText("y2 : ");

        txt_x2.setText("0.0");

        txt_x3.setText("0.0");

        txt_x1.setText("0.0");

        txt_x4.setText("0.0");

        txt_y2.setText("0.0");

        txt_y1.setText("0.0");

        txt_y3.setText("0.0");

        txt_y4.setText("0.0");

        btn_calculate.setText("Calculate");
        btn_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculateActionPerformed(evt);
            }
        });

        txt_resultX.setText("0.0");

        txt_resultY.setText("0.0");

        graphContainerPanel.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout graphContainerPanelLayout = new javax.swing.GroupLayout(graphContainerPanel);
        graphContainerPanel.setLayout(graphContainerPanelLayout);
        graphContainerPanelLayout.setHorizontalGroup(
            graphContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        graphContainerPanelLayout.setVerticalGroup(
            graphContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbl_x1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_x1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbl_x4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_x4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl_x3)
                                                    .addComponent(lbl_x2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_x2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_x3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbl_y4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_y2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbl_y3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_y3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbl_y1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_y1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbl_y2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_y4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn_calculate)
                                        .addGap(56, 56, 56))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_resultY)
                                    .addComponent(txt_resultX))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(graphContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_x1)
                    .addComponent(lbl_y1)
                    .addComponent(txt_x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_x2)
                    .addComponent(lbl_y4)
                    .addComponent(txt_y2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_x3)
                    .addComponent(lbl_y3)
                    .addComponent(txt_x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_y3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_x4)
                    .addComponent(lbl_y2)
                    .addComponent(txt_x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_y4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_calculate)
                .addGap(18, 18, 18)
                .addComponent(txt_resultX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_resultY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graphContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculateActionPerformed
    double x1 = Double.parseDouble(txt_x1.getText());
    double y1 = Double.parseDouble(txt_y1.getText());
    double x2 = Double.parseDouble(txt_x2.getText());
    double y2 = Double.parseDouble(txt_y2.getText());
    double x3 = Double.parseDouble(txt_x3.getText());
    double y3 = Double.parseDouble(txt_y3.getText());
    double x4 = Double.parseDouble(txt_x4.getText());
    double y4 = Double.parseDouble(txt_y4.getText());

    LinearEquation linearEquation = new LinearEquation(x1, y1, x2, y2, x3, y3, x4, y4);
    txt_resultX.setText(linearEquation.getX());
    txt_resultY.setText(linearEquation.getY());

    graphPanel.setPoints(x1, y1, x2, y2, x3, y3, x4, y4);
    }//GEN-LAST:event_btn_calculateActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calculate;
    private javax.swing.JPanel graphContainerPanel;
    private javax.swing.JLabel lbl_x1;
    private javax.swing.JLabel lbl_x2;
    private javax.swing.JLabel lbl_x3;
    private javax.swing.JLabel lbl_x4;
    private javax.swing.JLabel lbl_y1;
    private javax.swing.JLabel lbl_y2;
    private javax.swing.JLabel lbl_y3;
    private javax.swing.JLabel lbl_y4;
    private javax.swing.JLabel txt_resultX;
    private javax.swing.JLabel txt_resultY;
    private javax.swing.JTextField txt_x1;
    private javax.swing.JTextField txt_x2;
    private javax.swing.JTextField txt_x3;
    private javax.swing.JTextField txt_x4;
    private javax.swing.JTextField txt_y1;
    private javax.swing.JTextField txt_y2;
    private javax.swing.JTextField txt_y3;
    private javax.swing.JTextField txt_y4;
    // End of variables declaration//GEN-END:variables
}

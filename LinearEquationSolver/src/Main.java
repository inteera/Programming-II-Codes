public class Main {
    public static void main(String[] args) {
        LinearEquation linearEquation = new LinearEquation(2, -1, 3, 1, 4, -33);

        System.out.println(linearEquation);
        System.out.println(linearEquation.getX());
        System.out.println(linearEquation.getY());

        LinearEquation linearEquation2 = new LinearEquation(1, 1, 4, 4, 1, 8, 2, 4);
        System.out.println(linearEquation2);
        System.out.println(linearEquation2.getX());
        System.out.println(linearEquation2.getY());
    }
}
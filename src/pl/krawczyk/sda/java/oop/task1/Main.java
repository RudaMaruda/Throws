package pl.krawczyk.sda.java.oop.task1;

public class Main {
    public static void main(String[] args) throws CannotDivideBy0Exception {

        System.out.println(Main.divide(100,0));

    }

    public static double divide(int x, int y) throws CannotDivideBy0Exception {
        if (y == 0) {
            throw new CannotDivideBy0Exception();
        }

        return (double) x / y;
    }
}

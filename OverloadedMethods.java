public class OverloadedMethods {

    static double area(double l, double b) {
        return l * b;
    }

    static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

    }
}

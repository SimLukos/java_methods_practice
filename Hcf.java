// Highest common factor of two values

import java.util.Scanner;

public class Hcf {

    static int findHcf(int x, int y) {
        while (x != y) {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println("Choose two numbers to find Highest Common Factor of them:");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        scan.close();

        int hcf = findHcf(m, n);
        System.out.println("Hcm is: " + hcf);
    }
}

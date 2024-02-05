public class SumArray {
    static int sum(int... args) {
        int sum = 0;
        for (int x : args) {
            sum = sum + x;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5, 6, 10));
    }
}

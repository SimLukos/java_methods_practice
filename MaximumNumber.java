public class MaximumNumber {

    static int max(int... args) {
        if (args.length == 0)
            return Integer.MIN_VALUE;
        int m = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] > m)
                m = args[i];
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2, 3, 4, 5, 6, 10));
    }
}

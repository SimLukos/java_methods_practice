public class Methods {

    int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    public static void main(String[] args) {
        int a = 3, b = 7;

        Methods m = new Methods();

        System.out.println(m.max(a, b));
    }
}
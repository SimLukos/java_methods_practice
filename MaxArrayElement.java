public class MaxArrayElement {

    static int maxElement(int A[]) {
        int max = A[0];

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
            if (A[i] >= max) {
                max = A[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int A[] = { 8, 3, 15, 9, 7 };

        System.out.println(maxElement(A));
    }
}

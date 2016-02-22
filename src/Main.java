public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Matrix X = new Matrix();
        Matrix Y = new Matrix();
        int[][] A = new int[][]{{1, 2}, {3, 4}};
        int[][] B = new int[][]{{5, 6}, {7, 8}};
        int[][] C = X.add(A, B);

        int i;
        for(int D = 0; D < A.length; ++D) {
            for(i = 0; i < A.length; ++i) {
                System.out.print(C[D][i] + " ");
            }

            System.out.println();
        }
       System.out.print(Y.multiply(A,B));
        int[][] var9 = Y.multiply(A, B);

        for(i = 0; i < A.length; ++i) {
            for(int p = 0; p < A.length; ++p) {
                System.out.print(var9[i][p] + " ");
            }

            System.out.println();
        }

    }
}
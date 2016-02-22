public class Matrix {


    public int[][] add(int[][] arr1, int[][] arr2) {
        int[][] res = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int p = 0; p < 2; p++) {

                res[i][p] = arr1[i][p] + arr2[i][p];
            }
        }
        return res;   }

    public static int[][]  multiply(int[][] arr1, int[][] arr2) {
        int[][] res1 = new int[2][2];

        for (int i = 0; i < 1; i++) {
            int result = 0;
            for (int j = 0; j < 1; j++) {

                for (int r = 0; r < 1; ) {

                    result =result+ arr1[i][r] * arr2[r][j];

                }
                res1[i][j] = result;
            }
        }
        return res1;
    }

}

package classClass;

public class Main1 {

    public static void main(String[] args) {

        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };

        int j = 0;
        int i = 0;
        for (i = 0; i < a.length; i++) {

            for (j = 0; j < a.length; j++) {

                if (a[i][j] < 0 && a[i][j] % 2 == 1) {
                    System.out.print(a[i][j]);
                }

            }
        }

    }
}


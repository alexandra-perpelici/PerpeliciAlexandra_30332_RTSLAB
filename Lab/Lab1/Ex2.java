package Lab.Lab1;

public class Ex2 {
        public static void main(String[] args) {

            int R1 [][] = { {2 ,3, 1},{7, 1, 6}, { 9 ,2, 4 } } ;
            int R2 [][] = { { 8,5,3}, {3,9,2}, {2,7,3}};

            int sum [][] = new int[3][3];
            int mul[][]  = new int[3][3];
            int s = 0;
            int i; int j;

            for ( i = 0; i<R1.length; i++) {
                for ( j = 0; j < R1[0].length; j++)
                {
                    sum[i][j] = R1[i][j] + R2[i][j];
                }
            }

            for ( i = 0; i<R1.length; i++) {
                for (j = 0; j < R1[0].length; j++) {
                    for (int k = 0; k < R1.length; k++) {
                        mul[i][j] += R1[i][k] * R2[k][j];
                    }

                }
            }


            for (  i = 0; i< R1.length;i++)
            {
                for (   j= 0; j< R1[0].length; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System .out.println();

            }


            for (  i = 0; i<R1.length;i++)
            {
                for (  j= 0; j<R1[0].length; j++) {
                    System.out.print(mul[i][j] + " ");
                }
                System .out.println();

            }


        }
    }


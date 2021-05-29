import java.util.Scanner;

public class AddTwoMatrix
{
    public static void main(String args[])
    {
        int m, n, c, d;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix");
        m = in.nextInt();
        n = in.nextInt();

        int first[][] = new int[m][n];
        int second[][] = new int[m][n];
        int sum[][] = new int[m][n];

        System.out.println("Enter the elements of first matrix");

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                first[c][d] = in.nextInt();

        System.out.println("Enter the elements of second matrix");

        for (c = 0 ; c < m; c++)
            for (d = 0 ; d < n; d++)
                second[c][d] = in.nextInt();

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices

        System.out.println("Sum of the matrices:");

        for (c = 0; c < m; c++)
        {
            for (d = 0; d < n; d++)
                System.out.print(sum[c][d]+" ");
        }

        int[][] product = new int[m][n];      //multiplication of two matrices
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    product[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        // Displaying the result
        System.out.println("\nMultiplication Product of these two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + " ");
            }
        }


    }
}

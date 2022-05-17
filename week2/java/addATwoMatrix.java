import java.util.Scanner;

public class addATwoMatrix {
    public static void main(String[] args) throws Exception {
        int m, n;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input number of rows of matrix");
        m = keyboard.nextInt();
        System.out.println("Input number of columns of matrix");
        n  = keyboard.nextInt();

        int[][] array1 = new int[m][n];
        int[][] array2 = new int[m][n];
        int[][] Sum = new int[m][n];
        
        System.out.println("Please enter a matrix");

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                array1[i][j] = keyboard.nextInt();
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                array2[i][j] = keyboard.nextInt();
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                Sum[i][j] = array1[i][j] + array2[i][j];
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(Sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

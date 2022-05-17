import java.util.Scanner;

public class array {
    public static void main(String[] args) throws Exception {
        int n, Sum = 0, tg;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number of the array");

        n = keyboard.nextInt();

        System.out.println("Enter a array with " + n + " value");
        
        int[] arr = new int[100];

        for(int i = 0; i < n; i++) {
            arr[i] = keyboard.nextInt();
            Sum = Sum + arr[i];
        }

        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]) {
                tg = arr[i];
                arr[i] = arr[j];
                arr[j] = tg;        
                }
            }
        }

        System.out.println("Array after sort is:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println("\nSum of a array is: " + Sum);
        System.out.println("Avarge of a array is: " + Sum/n);

    }
}

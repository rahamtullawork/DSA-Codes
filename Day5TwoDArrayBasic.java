import java.util.Scanner;

public class Day5TwoDArrayBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter row size: ");
        int row = sc.nextInt();

        System.out.println("Enter column size: ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt() + 100;
            }
        }

        System.out.println("Updated array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

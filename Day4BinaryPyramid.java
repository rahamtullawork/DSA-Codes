import java.util.Scanner;

public class Day4BinaryPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            for (int d = 1; d <= 2 * i - 1; d++) {
                System.out.print(d % 2 + " ");
            }

            System.out.println();
        }
        sc.close();
    }
}

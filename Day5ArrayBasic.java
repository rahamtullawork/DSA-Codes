import java.util.Scanner;

public class Day5ArrayBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt() + 100;
        }

        System.out.println("Updated array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        sc.close();

    }
}

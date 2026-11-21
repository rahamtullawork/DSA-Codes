import java.util.Scanner;

public class Day1P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements: ");
        for(int i= 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Index: ");
        int index = sc.nextInt();

        System.out.println("Element: "+arr[index]);

        sc.close();
    }
}
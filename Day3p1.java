import java.util.Scanner;

public class Day3p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("All Pairs: ");
        for(int i = 0; i < n; i++){
            for(int j=0; j < n; j++){
                //System.out.print(arr[i] + ""+arr[j]+" ");
                System.out.print(arr[j] +"" + arr[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

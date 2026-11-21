import java.util.Random;
import java.util.Scanner;

public class Day5FindElementIndex2D {
    public static void main(String[] args) {

        int arr[][] = new int[3][4];

        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(100) + 1;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter an Element: ");
        int e = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(e == arr[i][j]) {
                    System.out.println("Element index is: [" + i + "][" + j + "]");
                    found = true;
                    break;
                }
            }
            if(found) {
                break;
            }
        }

        if(!found) {
            System.out.println("Element not found!");
        }

        sc.close();
    }
}
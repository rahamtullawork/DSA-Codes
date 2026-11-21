import java.util.Scanner;

public class Day5FindElementIndex {
    public static void main(String[] args) {
        int arr []= {1,2,3,4,5,96,214,75,2,6,};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a element: ");
        int e = sc.nextInt();

        for(int i=0; i < arr.length; i++){
            if(e == arr[i]){
                System.out.println("Element index is: "+i);
                break;
            }
        }

        sc.close();
    }
}

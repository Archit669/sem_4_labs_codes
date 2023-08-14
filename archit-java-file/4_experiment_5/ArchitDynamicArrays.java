import java.util.*;

public class ArchitDynamicArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take size of array from user
        System.out.print("enter size of array: ");
        int n = sc.nextInt();

        // create static array
        int []arr = new int[n];

        // take array from user
        System.out.println("enter your array: ");
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        // print array
        System.out.println("array is : ");
        for (int x : arr){
            System.out.print(x + " ");
        }System.out.println();
        
        sc.close();
    }
}
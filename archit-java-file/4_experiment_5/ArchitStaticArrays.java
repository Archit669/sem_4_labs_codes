import java.util.*;

public class ArchitStaticArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // create static array
        int []arr = {1,2,3,4,5};

        // print array
        System.out.println("array is : ");
        for (int x : arr){
            System.out.print(x + " ");
        }System.out.println();

    }
}
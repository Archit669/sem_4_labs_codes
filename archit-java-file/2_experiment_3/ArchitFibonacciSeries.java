public class ArchitFibonacciSeries {
    public static int fibonacci(int n){
        if (n==0) return 0;
        if (n == 1 || n == 2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        // print fibonacci series upto 10 numbers
        for (int i = 1 ; i <= 10 ; i++){
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
}

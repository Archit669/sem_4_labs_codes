import java.util.Scanner;
import java.util.StringTokenizer;  

public class ArchitStringTokenizer{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to perform operations on it: ");

		// create a stringTokenizer
		String input=sc.nextLine();
		StringTokenizer st = new StringTokenizer(input); 

		// count the number of tokens in string using countTokens method
		System.out.println("No of tokens in the string is: "+ st.countTokens()); 

		// print the entire string token by token
		System.out.println("The entire string is: ");
		while (st.hasMoreTokens()){
			System.out.print(st.nextToken() + " ");
		}

		sc.close();
    } 
}
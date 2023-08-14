import java.util.Scanner;

class Complex{

    int real , imag;

    // default constructor
    Complex(){
        System.out.println("default constructor called.");
        this.real = 0;
        this.imag = 0;
    }

    // paramaterized constructor
    Complex(int real , int imag){
        System.out.println("paramatrized constructor called.");
        this.real = real;
        this.imag = imag;
    }

    // copy constructor
    Complex(Complex num){
        System.out.println("copy constructor called.");
        this.real = num.real;
        this.imag = num.imag;
    }

    // display
    void display(){
        System.out.println("complex number is: " + real + " +  i " + imag);
    }

}


public class ArchitConstructor{

    public static void main(String[] args) {
        // default constructor called
        Complex num1 = new Complex();
        num1.display();

        // paramatrized constructor called
        Scanner sc = new Scanner(System.in);
        System.out.println("enter real part and imaginary part for number: ");
        int real = sc.nextInt();
        int imag = sc.nextInt();
        Complex num2 = new Complex(real,imag);
        num2.display();
        sc.close();

        // copy constructor called
        Complex num3 = new Complex(num2);
        num3.display();
    }
}
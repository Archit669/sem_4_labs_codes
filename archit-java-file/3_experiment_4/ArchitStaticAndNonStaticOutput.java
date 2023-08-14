public class ArchitStaticAndNonStaticOutput{
    // create two instance variable a and b
   static int a = 10, b = 20;
    public static void main(String[] args){
        show();
        ArchitStaticAndNonStaticMethods ob = new ArchitStaticAndNonStaticMethods();
        ob.disp();
    }

    // create static method
    static void show(){
        System.out.println(a + " " + b);
    }

    // create non static methdod
    void disp(){
        System.out.println(a + " " + b);
    }
}
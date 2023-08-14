public class ArchitStaticAndNonStaticMethods{
    // create two instance variable a and b
   int a = 10, b = 20;
    public static void main(String[] args){
        show();
        ArchitStaticAndNonStaticMethods ob = new ArchitStaticAndNonStaticMethods();
        ob.disp();
    }

    // create static method
    static void show(){
        ArchitStaticAndNonStaticMethods ob = new ArchitStaticAndNonStaticMethods();
        System.out.println(ob.a + " " + ob.b);
    }

    // create non static methdod
    void disp(){
        System.out.println(a + " " + b);
    }
}
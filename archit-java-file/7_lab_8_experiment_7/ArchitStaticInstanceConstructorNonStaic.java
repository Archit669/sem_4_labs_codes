class helper{
    {
        System.out.println("this is instance block");
    }

    static{
        System.out.println("this is static block");
    }

    helper(){
        System.out.println("inside constructor");
    }

    void func(){
        System.out.println("inside non static method");
    }
}

public class ArchitStaticInstanceConstructorNonStaic {
    public static void main(String[] args) {
        helper ob = new helper();
        ob.func();
    }
}

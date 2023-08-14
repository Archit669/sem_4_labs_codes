interface  base{
    void put_data();
    void display();
}

class derived implements base{
    public void put_data(){
        System.out.println("this is put data");
    }

    public void display(){
        System.out.println("this is display");
    }
}


public class ArchitInterface {
    public static void main(String[] args) {
        derived ob = new derived();
        ob.display();
        ob.put_data();
    }
}

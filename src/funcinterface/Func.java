package funcinterface;

public interface Func {

    void add();

    public static void show(){
        System.out.println("it is visible");
    }

    public default void seen(){
        System.out.println("it is seen");
    }


}

class B implements Func{

    public void add(){
        System.out.println("added");
    }



}

class C{




    public static void main(String[] args) {

        Func f = ()-> System.out.println("implementation");
        f.add();
    }

}

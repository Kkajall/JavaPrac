package generics;

public class GenMethod {


    static <Y>  void print5( Y element){
        System.out.println(element);




    }


    public static void main(String[] args) {
        print5(88);
        print5("dfgh");
        print5(78.7867f);

    }
}

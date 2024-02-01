package generics;

public class Generic3 <T,U>{

    T str;
    U a;

    public Generic3(T x, U y){
        this.str=x;
        this.a=y;
    }

    public   void print1(){
        System.out.println(str);
        System.out.println(a);

    }





    public static void main(String[] args) {

        Generic3<Integer, String> g3= new Generic3<>(88,"dfgh");
        g3.print1();


    }
}

package polymorphism;

public class A {


    void add( int a, int b){

        System.out.println(a+b);

    }

    void add( int a , int b, int c){
        System.out.println(a+b+c);


    }

    public static void main(String[] args) {

        A a = new B();
        a.add(2,9);



    }
}


class B extends  A{

    void add(int a, int b){

        System.out.println(a*b);
    }


}



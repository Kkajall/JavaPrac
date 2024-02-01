package generics;

import java.sql.SQLOutput;

public class Genericc2 <T>{


    T s;

    public Genericc2 ( T etr){
        System.out.println("co");
        this.s=etr;

    }


    public T getVAR(){
        return s;
    }

    public static void main(String[] args) {


        Genericc2<Integer> g= new Genericc2<>(567);
        System.out.println(g.getVAR());






    }
}

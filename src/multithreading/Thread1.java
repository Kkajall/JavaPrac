package multithreading;

public class Thread1 extends Thread{

    public void run(){
        System.out.println("tast3");
    }


}

class A{

    public static void main(String[] args) {
        Thread1 t1= new Thread1();
        t1.start();

        Thread1 t2= new Thread1();
        t2.start();

        Thread1 t3= new Thread1();
        t3.start();
    }
}

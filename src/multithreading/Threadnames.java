package multithreading;

public class Threadnames extends Thread{


    public void run(){
        System.out.println("overridden run method");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("main method");
        Threadnames tn= new Threadnames();
        tn.start();
        System.out.println(Thread.currentThread().getName());

    }
}

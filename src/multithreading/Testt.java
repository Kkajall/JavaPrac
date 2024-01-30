package multithreading;

public class Testt implements Runnable{

    public void run(){
        System.out.println("tast2");
    }

    public static void main(String[] args) {
         Testt tt= new Testt();
         Thread th= new Thread(tt);
         th.start();
    }
}

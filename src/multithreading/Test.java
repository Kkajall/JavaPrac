package multithreading;

public class Test  extends Thread{

    public void run(){
        System.out.println("task");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();

    }


}

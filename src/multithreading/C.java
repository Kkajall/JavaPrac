package multithreading;

public class C {

    public static void main(String[] args) {
        System.out.println("mainn");
        System.out.println(Thread.currentThread().getName());
      Thread.currentThread().setName("new thread name given to main thread");
        System.out.println(Thread.currentThread().getName());
    }
}

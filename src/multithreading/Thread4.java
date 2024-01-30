package multithreading;

public class Thread4 extends Thread{

    public void run(){
        System.out.println("task4 executed");
    }
}

class Thread5 extends Thread{

    public void run(){
        System.out.println("thread5 executed");
    }
}

class Thread6 extends Thread{

    public void run(){
        System.out.println("thread7 executed");
    }
}

class B{


    public static void main(String[] args) {
        Thread4 t4= new Thread4();
        t4.start();
        Thread5 t5 = new Thread5();
        t5.start();
        Thread6 t6= new Thread6();
        t6.start();
    }
}

package generics;



// Simple class without generics
public class Genericc {

    String r;

    public Genericc(String y){
        this.r=y;

    }

   public  String getObj(){
        return this.r;
   }

    public static void main(String[] args) {

        Genericc g= new Genericc("fgh");
        System.out.println(g.getObj());

    }
}

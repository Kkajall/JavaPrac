package swing.layout;


import javax.swing.*;
import java.awt.*;

public class BorderLayoutt {

    BorderLayoutt(){
        JFrame j= new JFrame();

        JButton jb1= new JButton("NORTH");
        JButton jb2= new JButton("SOUTH");
        JButton jb3 = new JButton("WEST");
        JButton jb4 = new JButton("EAST");
        JButton jb5= new JButton("CENTER");

        j.add(jb1, BorderLayout.NORTH);
        j.add(jb2, BorderLayout.SOUTH);
        j.add(jb3,BorderLayout.WEST);
        j.add(jb4, BorderLayout.EAST);
        j.add(jb5, BorderLayout.CENTER);

        j.setSize(300, 300);
        j.setVisible(true);










    }






    public static void main(String[] args) {

        BorderLayoutt bt= new BorderLayoutt();

    }
}

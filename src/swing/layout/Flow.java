package swing.layout;

import javax.swing.*;
import java.awt.*;

public class Flow {



    Flow(){

        JFrame o= new JFrame();

        JButton b1= new JButton("1");
        JButton b2= new JButton("2");
        JButton b3= new JButton("3");
        JButton b4= new JButton("4");
        JButton b5= new JButton("5");
        JButton b6= new JButton("6");

        o.add(b1);
        o.add(b2);
        o.add(b3);
        o.add(b4);
        o.add(b5);
        o.add(b6);

        o.setSize(30,30);
        o.setVisible(true);
        o.setLayout(new FlowLayout());





    }

    public static void main(String[] args) {


        Flow f= new Flow();




    }
}

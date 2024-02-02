package swing.layout;

import javax.swing.*;
import java.awt.*;

public class Grid {

    Grid(){

        JFrame p= new JFrame();


        JButton b1= new JButton("1");
        JButton b2= new JButton("2");
        JButton b3= new JButton("3");
        JButton b4= new JButton("4");
        JButton b5= new JButton("5");
        JButton b6= new JButton("6");
        JButton b7= new JButton("7");
        JButton b8= new JButton("8");
        JButton b9= new JButton("9");

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);

        p.setSize(300, 300);
        p.setVisible(true);
        p.setLayout(new GridLayout());


    }


    public static void main(String[] args) {

        Grid g= new Grid();

    }
}

package swing;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;

public class SwingForm {

    SwingForm(){

        JFrame jf= new JFrame();

        JLabel firstName = new JLabel("First Name");
        firstName.setBounds(20,50,80,20);

        JLabel lastName = new JLabel("Last Name");
        lastName.setBounds(20,50,80,20);

        JLabel phoneNum= new JLabel("Phone No.");
        phoneNum.setBounds(20,50,80,20);

//        JLabel taskcom = new JLabel("Task Completion");
//        taskcom.setBounds(20,50,80,20);

        JTextField firstNameTF= new JTextField();
        firstNameTF.setBounds(120,160,100,30);

        JTextField lastNameTF= new JTextField();
        lastNameTF.setBounds(120,160,100,30);

        JTextField phonenum = new JTextField();
        phonenum.setBounds(120, 160,100,30);

       JButton jb = new JButton();
       jb.setBounds(120,160,100,30);

       jf.add(firstName);
       jf.add(lastName);
       jf.add(firstNameTF);
       jf.add(lastNameTF);
       jf.add(phonenum);
       jf.add(phoneNum);
       jf.add(jb);


        jf.setSize(300,300);

        jf.setLayout(null);

        jf.setVisible(true);



    }

    public static void main(String[] args) {
        SwingForm s= new SwingForm();
    }


}

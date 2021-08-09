/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author somia saber
 */
public class calculator extends JFrame{
     JPanel p1,p2,p3,p4;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28;
    JTextField t1;
    JRadioButton r;
    public calculator(){
   
    p1=new JPanel();
        this.add(p1);
        p1.setLayout(new GridLayout()); 
      
        
        
        p2=new JPanel();
        p2.setLayout(new BorderLayout());
         p1.add(p2);
        t1=new JTextField("  View    Edit    Help");
        p2.add(t1,BorderLayout.NORTH);
//        t1=new JTextField("                                                                                                       0");
//        p2.add(t1);
 
//        
//        
        p3=new JPanel();
        p3.setLayout(new FlowLayout(FlowLayout.CENTER));
//          p3.setLayout(new BorderLayout());
         p2.add(p3);
        t1=new JTextField("                                                                       0");
        t1.setPreferredSize(new Dimension(260,65));
        p3.add(t1,BorderLayout.CENTER);
        
//         p3=new JPanel();
//        p3.setLayout(new BorderLayout(1,3));
//         p1.add(p3);
//        t1=new JTextField("                                                                                                        0");
//        p3.add(t1,BorderLayout.NORTH);
        
       p4=new JPanel();
        p3.add(p4);
        p4.setLayout(new GridLayout(6,5,5,5));
        b1=new JButton("MC");
         b2=new JButton("MR");
          b3=new JButton("MS");
          b4=new JButton("M+");
          b5=new JButton("M-");
          b6=new JButton("←");
          b7=new JButton("CE");
          b8=new JButton("C");
          b9=new JButton("±");
          b10=new JButton("√");
          b11=new JButton("7");
          b12=new JButton("8");
          b13=new JButton("9");
          b14=new JButton("/");
          b15=new JButton("%");
          b16=new JButton("4");
          b17=new JButton("5");
          b18=new JButton("6");
          b19=new JButton("*");
          b20=new JButton("1⁄x");
          b21=new JButton("1");
          b22=new JButton("2");
          b23=new JButton("3");
          b24=new JButton("-");
          b25=new JButton("=");
//          b25.setSize(55,80);
          b26=new JButton("0");
          b27=new JButton(".");
          b28=new JButton("+");
          b1.setPreferredSize(new Dimension(2,48));
         
//          b25.setPreferredSize(new Dimension(50,50));
//          for(int i=1;i<=28;i++){
//          p4.add(b+i);
//         }
        p4.add(b1);
         p4.add(b2);
          p4.add(b3);
         p4.add(b4);
            p4.add(b5);
             p4.add(b6);
              p4.add(b7);
               p4.add(b8);
                p4.add(b9);
                 p4.add(b10);
                  p4.add(b11);
                   p4.add(b12);
                    p4.add(b13);
                     p4.add(b14);
                      p4.add(b15);
                       p4.add(b16);
                        p4.add(b17);
                         p4.add(b18);
                          p4.add(b19);
                           p4.add(b20);
                            p4.add(b21);
                             p4.add(b22);
                              p4.add(b23);
                               p4.add(b24);
                                p4.add(b25);
                                 p4.add(b26);
                                  p4.add(b27);
                                   p4.add(b28);
        
         
       
        
  
 
 
      setTitle("Calculator");
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(300, 450);
      setLocation(550, 250);
}
    
}

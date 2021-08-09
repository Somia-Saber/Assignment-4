/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_1;

import javax.swing.JFrame;

/**
 *
 * @author somia saber
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      JFrame f=new JFrame();
      draw d=new draw();
      f.add(d);
      
      
      
      f.setTitle("Draw");
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setSize(550, 500);
      f.setLocation(400, 220);
    }
    
}

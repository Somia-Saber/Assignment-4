/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author somia saber
 */
public class draw extends JPanel{
     @Override
   protected void paintComponent (Graphics g){
   super.paintComponent(g);
   g.setColor(Color.BLUE);
   g.fillRect(150, 220, 250, 250);
   g.setColor(Color.RED);
    int []x={150,280,400};
   int[]y={220,40,220};
   g.fillPolygon(x, y, x.length);
    g.setColor(Color.BLACK);
   g.fillRect(190, 250, 40, 40);
    g.setColor(Color.YELLOW);
   g.fillRect(320, 300, 40, 250);
   }
}

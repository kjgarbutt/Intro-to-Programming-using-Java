/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 *
 */

import java.awt.*;

public class StaticRects extends AnimationBase {
   
     public void drawFrame(Graphics g) {
         
         // Draw set of nested black rectangles on a red background.
         // Each nested rectangle is separated by 15 pixels on all sides
         // from the rectangle that encloses it.  The applet is
         // assumed to be 300 pixels wide and 160 pixels high.
         
      int inset;    // Gap between borders of applet and one of the rectangles.
                    
      int rectWidth, rectHeight;   // The size of one of the rectangles.
                    
      g.setColor(Color.red);
      g.fillRect(0,0,300,160);  // Fill the entire applet with red.
      
      g.setColor(Color.black);  // Draw the rectangles in black.
                                       
      inset = 0;
      
      rectWidth = 299;    // Set size of the first rect to size of applet
      rectHeight = 159;
      
      while (rectWidth >= 0 && rectHeight >= 0) {
         g.drawRect(inset, inset, rectWidth, rectHeight);
         inset += 15;       // rects are 15 pixels apart
         rectWidth -= 30;   // width decreases by 15 pixels on left and 15 on right
         rectHeight -= 30;  // height decreases by 15 pixels on top and 15 on bottom
      }
      
   }  // end paint()

}  // end class StaticRects
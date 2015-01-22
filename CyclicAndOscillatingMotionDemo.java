/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
* This program demonstrates cyclic and oscillating animations.  For cyclic animation,
* it repeats itself every N frames, for some value of N.  An oscillating animation also
* repeats, but the repetition is "back-and-forth."  That is, the second half
* of the repeated animation is the same as the first half played backwards.
*/
public class CyclicAndOscillatingMotionDemo extends JPanel implements ActionListener {

    public void drawFrame(Graphics g, int frameNumber, int width, int height) {
    	// use the drawFrame() subroutine, utilise a graphics context represented by a variable, Graphics, or g
    	// inititae three integer variables: frameNumber, width & height
        
        /* Show cyclic motion at three speeds.  In each case, a square 
        * moves across the drawing area from left to right, then jumps
        * back to the start.
        * To implement cyclic motion, you need a "cyclic frame number"
        * that takes on the values:
        * 0, 1, 2, ..., (N-1), 0, 1, 2, ..., (N-1), 0, 1, 2, ....
        */

        int cyclicFrameNum;
        // Top square - cyclic
        cyclicFrameNum = frameNumber % 300;
        	// Defines a variable, cyclicFrameNumber, that is equal to frameNumber modulus 300 - it repeats every 300 frames
        g.setColor(Color.RED);
        g.fillRect( cyclicFrameNum, 0, 20, 20 );
        	// set color to RED and fill the rectangle at these coordinates: y=0px (top line)
        // Second square - cyclic
        cyclicFrameNum = frameNumber % 150;  // Update frameNum to repeat every 150 frames
        	// length of the cycle is 150 frames, instead of 300, so the Green square moves twice as fast as the Red one. 
        g.setColor(Color.GREEN);
        g.fillRect( 2*cyclicFrameNum, 20, 20, 20 );	// y=20px
        // Third square - cyclic
        cyclicFrameNum = frameNumber % 100;  // Repeats every 100 frames
        	// The Blue square moves three times as fast as the first, the Red square
        g.setColor(Color.BLUE);
        g.fillRect( 3*cyclicFrameNum, 40, 20, 20 );	// y=40px
        

        /* Show oscillating motion at three speeds.  In each case, a square 
        * moves across the drawing area from left to right, then reverses
        * direction to move from right to left back to its starting point.
        */
        
        int oscillationFrameNum;
        // Fourth square - oscillating
        oscillationFrameNum = frameNumber % 600;  // repeats every 600 frames
        if (oscillationFrameNum > 300)			  // if oscillationFrameNum is GREATER than 300, then oscillationFrameNum = 600
            oscillationFrameNum = 600 - oscillationFrameNum;
        		// takes 300 frames to move from left to right
        		// after 300, the values go backwards back to 0, moving right to left
        g.setColor(Color.CYAN);
        g.fillRect( oscillationFrameNum, 60, 20, 20 );	// y=60px
        // Fifth square - oscillating        
        oscillationFrameNum = frameNumber % 300; // repeats every 300 frames
        if (oscillationFrameNum > 150)
            oscillationFrameNum = 300 - oscillationFrameNum; // after 150, the values go backwards back to 0
        g.setColor(Color.MAGENTA);
        g.fillRect( 2*oscillationFrameNum, 80, 20, 20 ); // y=80px
        // Sixth square - oscillating
        oscillationFrameNum = frameNumber % 200; // repeats every 200 frames
        if (oscillationFrameNum > 100)
            oscillationFrameNum = 200 - oscillationFrameNum; // after 100, the values go backwards back to 0
        g.setColor(Color.YELLOW);
        g.fillRect( 3*oscillationFrameNum, 100, 20, 20 );	// y=100px
        
        
        /* Draw horizontal black lines across the window to separate the
        * regions used by the six squares.  Also draw a box around the outside,
        * mostly for the picture that I need for the web page!
        */
        
        int y;
        g.setColor(Color.BLACK);
        for ( y = 20; y < 120; y = y + 20 )
            g.drawLine(0,y,320,y);
        g.drawRect(0,0,319,119);  // Why not (0,0,320,120)? This is a technicality.
                                  // If you use 320 and 120, the right and bottom edges
                                  // of the rect will actually be outside the drawing area.        
    }
    
    //------ Implementation details: DO NOT EXPECT TO UNDERSTAND THIS, YET ------
    
    
    public static void main(String[] args) {
        
        JFrame window = new JFrame("Cyclic and Oscillating Motion");
        CyclicAndOscillatingMotionDemo drawingArea = new CyclicAndOscillatingMotionDemo();
        drawingArea.setBackground(Color.WHITE);
        window.setContentPane(drawingArea);
        drawingArea.setPreferredSize(new Dimension(320,120));  // size is 320 by 120
        window.pack();
        window.setLocation(100,50);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false); // The user can't change the size.
        Timer frameTimer = new Timer(20,drawingArea);
        window.setVisible(true);
        frameTimer.start();

    } // end main

    private int frameNum;
    
    public void actionPerformed(ActionEvent evt) {
        frameNum++;
        repaint();
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawFrame(g, frameNum, getWidth(), getHeight());
    }

}


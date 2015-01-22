/**
* This program asks the user to define the Mosaic window dimensions
* and the refresh speed and then opens a window full of randomly
* colored squares.  A "disturbance" moves randomly around in the
* window, randomly changing the color of each square that it visits.
* The program runs until the user closes the window.
*/
public class RandomMosaicWalk {

    static int currentRow;    // Row currently containing the disturbance.
    static int currentColumn; // Column currently containing disturbance.
    static int userRow;
    static int userColumn;
    static int userDelay;

    /**
    * The main program creates the window, fills it with random colors,
    * and then moves the disturbance in a random walk around the window
    * as long as the window is open.
    */
    public static void main(String[] args) {
        System.out.print("Please define Mosaic window width: ");
        userRow = TextIO.getlnInt();
        System.out.print("Please define Mosaic window height: ");
        userColumn = TextIO.getlnInt();
        System.out.println("Please define the Mosaic refresh speed");
        System.out.print("in seconds (1 = very fast; 60 = very slow!): ");
        userDelay = TextIO.getlnInt();
    	/*
    	 * Added user input options to define the Mosaic window size and the
    	 * refresh speed. 
    	 * userRow, userColumn and userDelay
    	 */
        Mosaic.open((userRow),(userColumn),25,25);
        fillWithRandomColors();
        currentRow = 8;  // start at center of Mosaic
        currentColumn = 10;	// start at center of Mosaic
        while (Mosaic.isOpen()) {
            changeToRandomColor(currentRow, currentColumn);
            randomMove();
            Mosaic.delay(userDelay);
            /*
             * While Mosaic is Open
             * 	change the color of the square at the current position
             * 	then randomly move the current position
             * 	add a delay of 1 second before repeating
             */
        }
    }  // end main

    /**
    * Fills the window with randomly colored squares.
    * Precondition:  The mosaic window is open.
    * Postcondition:  Each square has been set to a random color.
    */
    static void fillWithRandomColors() {
        for (int row=0; row < (userRow); row++) {
            for (int column=0; column < (userColumn); column++) {
                changeToRandomColor(row, column); 
                /*
                 * for the square at row 0
                 * 	and at column 0
                 * 		change the color at random
                 * then iterate up to no more than row 16
                 * 	and iterate up to no more than column 20
                 * 		then change that square's color
                 * repeat!
                 */
            }
        }
    }  // end fillWithRandomColors

    /**
    * Changes one square to a new randomly selected color.
    * Precondition:  The specified rowNum and colNum are in the valid range
    *                of row and column numbers.
    * Postcondition:  The square in the specified row and column has
    *                been set to a random color.
    * @param rowNum the row number of the square, counting rows down
    *      from 0 at the top
    * @param colNum the column number of the square, counting columns over
    *      from 0 at the left
    */
    static void changeToRandomColor(int rowNum, int colNum) {
        int red = (int)(256*Math.random());    // Choose random levels in range
        int green = (int)(256*Math.random());  //    0 to 255 for red, green,
        int blue = (int)(256*Math.random());  //    and blue color components.
        Mosaic.setColor(rowNum,colNum,red,green,blue); 
        /*
         * Taking the square at the current position
         * 	choose a random Red color
         * 	AND random Green color
         * 	AND random Blue color
         * 	set the color
         */
    }  // end changeToRandomColor

    /**
    * Move the disturbance.
    * Precondition:  The global variables currentRow and currentColumn
    *                are within the legal range of row and column numbers.
    * Postcondition:  currentRow or currentColumn is changed to one of the
    *                neighboring positions in the grid -- up, down, left, or
    *                right from the current position.  If this moves the
    *                position outside of the grid, then it is moved to the
    *                opposite edge of the grid.
    */
    static void randomMove() {
        int directionNum; // Randomly set to 0, 1, 2, or 3 to choose direction.
        directionNum = (int)(4*Math.random());
        switch (directionNum) {
        case 0:  // move up
            currentRow--;
            if (currentRow < 0)
                currentRow = (userRow-1);	// must be 1 LESS than Mosaic.open(16,20,25,25); settings
            break;
        case 1:  // move right
            currentColumn++;
            if (currentColumn >= (userColumn))	// must match Mosaic.open(16,20,25,25); settings
                currentColumn = 0;
            break;
        case 2:  // move down
            currentRow ++;
            if (currentRow >= (userRow))	// must match Mosaic.open(16,20,25,25); settings
                currentRow = 0;
            break;
        case 3:  // move left 
            currentColumn--;
            if (currentColumn < 0)
                currentColumn = (userColumn-1); // must be 1 LESS than Mosaic.open(16,20,25,25); settings
            break;
            /*
             * take a random number between 0-3
             * 	if 0 (move up)
             * 		then iterate DOWN currentRow
             * 			AND keep within bounds of Mosaic Row number
             * 	if 1 (move right)
             * 		then iterate UP currentColumn
             * 			AND keep within bounds of Mosaic Column number
             * 	if 2 (move down)
             * 		then iterate UP currentRow
             * 			AND keep within bounds of Mosaic Row number
             * 	if 3 (move left)
             * 		then iterate DOWN currentColumn
             * 			AND keep within bounds of Mosaic Column number
             */
        }
    }  // end randomMove

} // end class RandomMosaicWalk

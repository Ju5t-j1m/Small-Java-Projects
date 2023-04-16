
/**
 * This class reads a shape file.  For the format of this shape file, see the assignment description.
 * Also, please see the shape files ExampleShapes.txt, ExampleShapesStill.txt, and TwoRedCircles.txt
 *
 * @author you
 *
 */

import javafx.scene.paint.Color;
import java.io.*;
import java.util.Scanner;

public class ReadShapeFile {
	
	// TODO: You will likely need to write four methods here. One method to
	// construct each shape
	// given the Scanner passed as a parameter. I would suggest static
	// methods in this case.

	/**
	 * Reads the data file used by the program and returns the constructed queue
	 * 
	 * @param in
	 *            the scanner of the file
	 * @return the queue represented by the data file
	 */
	private static Queue<ClosedShape> readDataFile(Scanner in) {
		Queue<ClosedShape> ShapeQueue = new Queue<ClosedShape>(); /* Create a new queue of closed shapes */

		/*While loop to check what kind of shape needs to be read in*/
		while(in.hasNextLine()) {
	    	
			
	    	String line = in.nextLine();         
            String[] ShapeData = line.split(" "); /* checks each part of the file for a space */
            String name = ShapeData[0]; /*name assigned to location 0 for later use */
            
            /*
             * For each kind of shape parse a new colour and also create the shape corresponding the the constructor
             * This is then added to the queue using enqueue
             */
            if (name.equals ("circle")) {
            	
            	Color colour = Color.rgb(Integer.parseInt(ShapeData[7]), Integer.parseInt(ShapeData[8]), Integer.parseInt(ShapeData[9]));
            	ClosedShape circle1 = new Circle(Integer.parseInt(ShapeData[10]), Integer.parseInt(ShapeData[1]), Integer.parseInt(ShapeData[2]), Integer.parseInt(ShapeData[3]),Integer.parseInt(ShapeData[4]), Integer.parseInt(ShapeData[6]), colour ,Boolean.parseBoolean(ShapeData[5]));
            	ShapeQueue.enqueue(circle1);
            	
            }else if (name.equals("oval")) {
            	
            	Color colour = Color.rgb(Integer.parseInt(ShapeData[7]), Integer.parseInt(ShapeData[8]), Integer.parseInt(ShapeData[9]));
            	ClosedShape oval1 = new Oval(Integer.parseInt(ShapeData[10]), Integer.parseInt(ShapeData[1]), Integer.parseInt(ShapeData[2]), Integer.parseInt(ShapeData[3]),Integer.parseInt(ShapeData[4]), Integer.parseInt(ShapeData[6]), Integer.parseInt(ShapeData[7]), colour ,Boolean.parseBoolean(ShapeData[5]));
            	ShapeQueue.enqueue(oval1);
            	
            }else if (name.equals("rect")){
            	
            	Color colour = Color.rgb(Integer.parseInt(ShapeData[8]), Integer.parseInt(ShapeData[9]), Integer.parseInt(ShapeData[10]));
            	ClosedShape rect1 = new Rect(Integer.parseInt(ShapeData[1]), Integer.parseInt(ShapeData[2]), Integer.parseInt(ShapeData[3]),Integer.parseInt(ShapeData[4]), colour, Integer.parseInt(ShapeData[6]), Integer.parseInt(ShapeData[7]), Boolean.parseBoolean(ShapeData[5]), Integer.parseInt(ShapeData[11]));
            	ShapeQueue.enqueue(rect1);
            }else if (name.equals("square")) {
            	
            	Color colour = Color.rgb(Integer.parseInt(ShapeData[7]), Integer.parseInt(ShapeData[8]), Integer.parseInt(ShapeData[9]));
            	ClosedShape square1 = new Square(Integer.parseInt(ShapeData[1]), Integer.parseInt(ShapeData[2]), Integer.parseInt(ShapeData[3]),Integer.parseInt(ShapeData[4]), Boolean.parseBoolean(ShapeData[5]), Integer.parseInt(ShapeData[6]), colour, Integer.parseInt(ShapeData[10]));
            	ShapeQueue.enqueue(square1);
            }
	}
		 return ShapeQueue;
}



	/**
	 * Method to read the file and return a queue of shapes from this file. The
	 * program should handle the file not found exception here and shut down the
	 * program gracefully.
	 * 
	 * @param filename
	 *            the name of the file
	 * @return the queue of shapes from the file
	 */
	
	/*
	 * This is where datafiles are read from the text files inside the boingg project
	 * Try catch is used to terminate the program if a file cannot be found
	 */
	public static Queue<ClosedShape> readDataFile(String filename){
		Scanner in = null;
		File file = new File("ExampleShapes");
		try {
	    in = new Scanner(file); //null is not sensible. Please change
	   		
            }
         catch(FileNotFoundException e) {
			System.out.println("File could not be found and or parsed, Shutting down");
        	 System.exit(0);
		}
		return ReadShapeFile.readDataFile(in); /* The files data is returned as the scanner */
    }
}
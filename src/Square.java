
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Square extends ClosedShape {

	private int length;

    /**
     * Creates a circle.
     * @param x The display component's x position.
     * @param y The display component's y position.
     * @param vx The display component's x velocity.
     * @param vy The display component's y velocity.
     * @param diameter The diameter of the circle.
     * @param colour The line colour or fill colour.
     * @param isFilled True if the circle is filled with colour, false if opaque.
     */
    public Square (int x, int y, int vx, int vy, boolean isFilled, int length, Color colour, int insertionTime) {
    	super (insertionTime, x, y, vx, vy, colour, isFilled);
    	this.length = length;
    	
    }
    
    /**
     * Method to convert a square to a string.
     */
    public String toString () {
    	String result = "This is a Square\n";
    	result += super.toString ();
	result += "Its diameter is " + this.length + "\n";
    	return result;
    }
    
    /**
     * @return The width of the circle
     */
    
 	public void setLength(int length) {
 		this.length = length;
 		
 	}
 	
 	public int getLength() {
 		return length;
 	}
 	
 	
 	
 	public int getWidth() {
		return length;
	}

 	/**
 	 * @return The height of the circle
 	 */
 	public int getHeight() {
		return length;
	}
 	
    /**
     * Draw the circle on the screen.
     * @param g The graphics object of the scene component.
     */
    public void draw (GraphicsContext g) {
    	g.setFill( colour );
    	g.setStroke( colour );
    	if (isFilled) {
    		g.fillRect( x, y, length, length ); /*Despite being a square rectangle is used here with equal sides(basically a square)*/
    	} 
    	else {
    		g.strokeRect( x, y, length, length );
	    }
    }
}

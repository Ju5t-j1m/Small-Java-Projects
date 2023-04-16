
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Rect extends ClosedShape {

	private int width, height;

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
	
	/*New constructor used to make a rectangle, (uses order in datafile)*/
    public Rect (int x, int y, int vx, int vy, Color colour,  int width, int height,boolean isFilled, int insertionTime) {
    	super (insertionTime, x, y, vx, vy, colour, isFilled);
    	this.height = height;
        this.width = width;
    }
    
    /**
     * Method to convert a circle to a string.
     */
    public String toString () {
    	String result = "Rectangle\n";
    	result += super.toString ();
	result += "Its length is " + this.height + "\n";
	result += "Its width is " + this.width + "\n";
    	return result;
    }
    
    /**
     * @param Resets the diameter.
     */
    public void setHeight (int height) {
    	this.height = height;
    }
    
    public void setWidth(int width) {
    	this.width = width;
    }
    
    /**
     * @return The diameter of the circle.
     */
    public int getHeight() {
    	return height;
    }

    /**
     * @return The width of the circle
     */
 	public int getWidth() {
		return width;
	}
    /**
     * Draw the circle on the screen.
     * @param g The graphics object of the scene component.
     */
    public void draw (GraphicsContext g) {
    	g.setFill( colour );
    	g.setStroke( colour );
    	if (isFilled) {
    		g.fillRect( x, y, width, height ); /*Java fx canvas used to fill a rectangle with what i have defined
    											*with the height
    											*/
    	} 
    	else {
    		g.strokeRect( x, y, width, height );
	    }
    }
}

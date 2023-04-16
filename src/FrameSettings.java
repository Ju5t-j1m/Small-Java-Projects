import java.io.FileNotFoundException;

import javafx.scene.canvas.GraphicsContext;

public class FrameSettings extends BouncingShapesWindow {

	public FrameSettings(GraphicsContext gc, String filename) throws FileNotFoundException {
		super(gc, filename);
	}
	
	//##Title##//
	public String getTitle() {
		return FRAME_TITLE;
	}
	
	public void setTitle(String FRAME_TITLE) {
		BouncingShapesWindow.FRAME_TITLE = FRAME_TITLE;
	}
	
	//##flag##//
	public boolean getFlag() {
		return flag;
	}
	
	public void setFlag(boolean flag) {
		BouncingShapesWindow.flag = flag;
	}
	
	//##END##//
}

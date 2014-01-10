package loop.view;

import javax.swing.JFrame;
import loop.controller.LoopController;

/**
 * GUI Framework for Loop project.
 * @author Kyler Jensen
 * @version 1.0 11/5/13 Basic setup of class.
 *
 */
public class LoopFrame extends JFrame
{
//	Declaration Section
	private LoopController baseController;
	private LoopPanel basePanel;
	
	/**
	 * Creates a JFrame based window for the Loop project.
	 * @param baseController A link to the controller for MVC paradigm
	 */
	public LoopFrame(LoopController baseController)
	{
		this.baseController = baseController;
		basePanel = new LoopPanel(baseController);

		setupFrame();	
	}
	
	/**
	 * Sets up the frame for the GUI.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(550, 350);
		this.setVisible(true);
	}
}

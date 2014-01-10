package loop.controller;

/**
 * Starts the Loop Project
 * @author Kyler Jensen
 * @version 1.0 11/5/13
 *
 */
public class LoopRunner
{

	/**
	 * Starts the application
	 * @param args unused - GUI only
	 */
	public static void main(String [] args)
	{
		LoopController myLoop = new LoopController();
		myLoop.start();

	}

}

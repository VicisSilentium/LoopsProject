package loop.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import loop.controller.LoopController;
import loop.model.Looper;

/**
 * 
 * @author Kyler Jensen
 * @version 1.0 11/5/13
 *
 */
public class LoopPanel extends JPanel
{
//	Declaration Section
	private LoopController baseController;
	private JButton submitButton;
	private JTextArea loopArea;
	private SpringLayout baseLayout;
	private JScrollPane textPane;
	private Looper myLooper;
	protected String currentInput;
	
	
	public LoopPanel(LoopController baseController)
	{
		this.baseController = baseController;
		loopArea = new JTextArea(10,35);
		textPane = new JScrollPane(loopArea);
		baseLayout = new SpringLayout();
		submitButton = new JButton("Click me to do something!");
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(submitButton);
		this.add(textPane);
		
		loopArea.setEditable(false);
		loopArea.setWrapStyleWord(true);
		loopArea.setLineWrap(true);

		this.setBackground(Color.DARK_GRAY);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 30, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, -66, SpringLayout.WEST, submitButton);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 30, SpringLayout.SOUTH, textPane);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 147, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent click)
			{
				loopArea.append(baseController.getLoopResults());
			}
		});
		
	}





}

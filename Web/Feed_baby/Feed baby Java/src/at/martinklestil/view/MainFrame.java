package at.martinklestil.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		this.setLayout(new BorderLayout());

        this.setTitle("Baby feeding with Java");
        this.setSize(400, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}

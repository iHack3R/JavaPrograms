import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gui implements ActionListener
{
	JButton button;
	public static void main(String[] args)
	{
		gui g=new gui();
		g.go();
	}
	public void go()
	{
		JFrame frame=new JFrame("Windows Frame");
		JPanel panel=new JPanel();
		button=new JButton("Click ME!");
		panel.setBackground(Color.darkGray);
		frame.getContentPane().add(BorderLayout.EAST, panel);
		panel.add(button);
		frame.setSize(500, 300);
		frame.setVisible(true);
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ev)
	{
		button.setText("Clicked!");
	}
}
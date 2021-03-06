package net.sduhsd.royr6099.unit1.createshape;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateShapePanel extends JPanel
{
	public CreateShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);


		Color[] col0 = {Color.CYAN, Color.RED, Color.GREEN};
		CustomShape cs0 = new CustomShape(500, 200, 50, 200, col0);
		cs0.draw(window);
		
		Color[] col1 = {Color.BLACK, Color.PINK, Color.DARK_GRAY};
		CustomShape cs1 = new CustomShape(180, 450, 200, 70, col1);
		cs1.draw(window);
		
		Color[] col2 = {Color.MAGENTA, Color.ORANGE, Color.YELLOW};
		CustomShape cs2 = new CustomShape(300, 120, 250, 250, col2);
		cs2.draw(window);
	}
}
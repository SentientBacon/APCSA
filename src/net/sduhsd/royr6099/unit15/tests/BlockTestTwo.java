package net.sduhsd.royr6099.unit15.tests;

import java.awt.Color;
import java.awt.Graphics;

import net.sduhsd.royr6099.unit15.gameelements.Block;

import java.awt.Canvas;

public class BlockTestTwo extends Canvas
{
	public BlockTestTwo()
	{
		setBackground(Color.WHITE);
	}

	public void paint(Graphics window)
	{
		Block one = new Block();
		one.draw(window);

		Block two = new Block(50,50,30,30);
		two.draw(window);

		Block three = new Block(350,350,15,15,Color.RED);
		three.draw(window);

		//two.draw(window, Color.white);

		Block four = new Block(450,50,20,60, Color.GREEN);
		four.draw(window);
		
		//add more test cases			
	}
}
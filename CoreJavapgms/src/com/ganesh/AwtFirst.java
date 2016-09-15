package com.ganesh;
import java.awt.*;
public class AwtFirst extends Frame {
	AwtFirst()
	{
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("Frame example");
		this.setBackground(Color.RED);
		
	}
	public void paint(Graphics g)
	{
		Font f=new Font("arial",Font.BOLD,30);
		g.setFont(f);
		this.setForeground(Color.GREEN);
		g.drawString("BALAGAM BHAVNI GANESH", 100, 100);
	}
	public static void main(String[] args)
	{
		AwtFirst af=new AwtFirst();
	}

}

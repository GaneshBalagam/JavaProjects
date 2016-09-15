package com.ganesh;
import java.awt.*;
import java.awt.event.*;
 class WindowListenerImpl implements WindowListener
 {
	 public void windowOpened(WindowEvent we)
	 {
		 System.out.println("window opened");
	 }
	 public void windowClosed(WindowEvent we)
	 {
		 System.out.println("window Closed");
	 }
	 public void windowClosing(WindowEvent we)
	 {   System.exit(0);
		 System.out.println("window Closing");
	 }
	 public void windowIconified(WindowEvent we)
	 {
		 System.out.println("window Icinified");
	 }
	 public void windowDeiconified(WindowEvent we)
	 {
		 System.out.println("window deIconified");
	 }
	 public void windowActivated(WindowEvent we)
	 {
		 System.out.println("window Activated");
	 }
	 public void windowDeactivated(WindowEvent we)
	 {
		 System.out.println("window Deactivated");
	 }
 }
class MyFrame extends Frame
{
	MyFrame()
	{
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("window events example");
		this.setBackground(Color.RED);
		this.addWindowListener(new WindowListenerImpl());
	}
}

	public class AwtSecond {

	public static void main(String[] args) {
     MyFrame mf=new MyFrame();

	}

}

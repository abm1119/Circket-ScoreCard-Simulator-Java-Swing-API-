import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class team1 extends Frame{
	
	team1(){
		 JLabel background;
       ImageIcon img=new ImageIcon("t1.png");
	   background = new JLabel("",img,JLabel.CENTER);
	   background.setBounds(0,0,757,550);
	   add(background);
	   
	    Toolkit kit = getToolkit(); 
    Dimension wndSize = kit.getScreenSize();
    setBounds(wndSize.width / 6, wndSize.height / 6, wndSize.width / 2, wndSize.height / 2); // Size
	   setSize(757,500);
       setLayout(null);
       setVisible(true);
	   
	   addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		dispose();
	}
});
	}
	public static void main(String arg[]){
		team1 obj=new team1();
	}
}
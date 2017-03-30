import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class chat
{
	public static void main(String args[])
	{
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.setVisible(true);
		f.setLayout(new GridLayout(3, 1));
		Panel panel = new Panel();
		Panel panel2 = new Panel();
		JTextField tn = new JTextField(10);
		JTextField ip = new JTextField(10);
		JTextArea message = new JTextArea(10,50);
		Label nameLabel = new Label("Enter Your Name:");
		Label ipLabel = new Label("Enter Hostname or IP Adderss:");
		JButton connect = new JButton("CONNECT");
		f.add(panel);
		f.add(panel2);
		panel.add(nameLabel);
		panel.add(tn);
		panel.add(ipLabel);
		panel.add(ip);
		panel.add(connect);
		panel2.add(message);
		f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });
	}
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

class PortSc extends JFrame implements ActionListener {

	JButton scan;
	JLabel av, l1, l2, l3;
	JTextField host, to, from;
	List openPorts;
	Socket sock;
	int f, t;

	PortSc() {
		super("Port Scanner");
		this.setLayout(new FlowLayout());

		l3 = new JLabel("Host :");
		this.add(l3);

		host = new JTextField(10);
		this.add(host);

		l1 = new JLabel("From :");
		this.add(l1);

		from = new JTextField(10);
		this.add(from);

		l2 = new JLabel("To :");
		this.add(l2);

		to = new JTextField(10);
		this.add(to);

		scan = new JButton("Scan");
		this.add(scan);

		av = new JLabel("Avalaible Ports");
		this.add(av);

		openPorts = new List();
		this.add(openPorts);

		scan.addActionListener(this);
		this.setSize(550, 200);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		f = Integer.parseInt(from.getText()); //from port number
		t = Integer.parseInt(to.getText());//to port number
		String hostname = host.getText();//pc ip address if local pc then u can type "localhost"" intead of host.getText();
		for (int i = f; i <= t; i++) {
			try {
				sock = new Socket(hostname, i);
				openPorts.add("" + i);
			} catch (Exception ee) {
				continue;//if port is not available then exception occurs so just continue loop to check next port
			}
		}
	}

	public static void main(String argd[]) {
		new PortSc();
	}
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Window implements ActionListener
{
	JButton btn;
	JLabel label1,label2, label3;

	Window()
	{
		JFrame frame=new JFrame();

		//Adds font-family
		Font font=new Font("Serif",Font.BOLD,54);

		//creates a label
		label1=new JLabel("||Birthday Party Organiser||");
		label1.setBounds(270,10,700,100);
		label1.setForeground(Color.WHITE);
		label1.setFont(font);
		frame.add(label1);

		//adds background image
		ImageIcon img=new ImageIcon("backgroundimage.jpg");
		Image im=img.getImage();
		Image temp=im.getScaledInstance(1200,900,Image.SCALE_SMOOTH);
		img=new ImageIcon(temp);
		label2=new JLabel("",img,JLabel.CENTER);
		label2.setBounds(0,0,1200,900);
		frame.add(label2);
		label2.add(label1);

		//adds a button to continue	
		label3=new JLabel("Continue");
		label3.setBounds(450,600,250,60);
		label3.setForeground(Color.WHITE);
		Font fo=new Font("Monospaced",Font.BOLD,30);
		label3.setFont(fo);
		label2.add(label3);

		btn=new JButton(new ImageIcon("arrow.png"));
		btn.setBounds(600,610,50,50);
		label2.add(btn);

		frame.setSize(1200,900);
		frame.setLayout(null);
		frame.setVisible(true);
		btn.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn)
		{
			new Test();
		}
	}

	public static void main(String[] args)
	{
		Window wd=new Window();
	}
}
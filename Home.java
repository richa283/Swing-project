import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Test implements ActionListener
{
	JButton btn1,btn2;
	JLabel label1,label2,label3,label4;
	JPanel panel;

	Test()
	{
		//frame
		JFrame f=new JFrame();

		//Font
		Font font=new Font("Serif", Font.BOLD,54);
		

		//adds a label on the frame
		label1=new JLabel("||Birthday Party Organiser||");
		label1.setBounds(270,10,700,100);
		label1.setForeground(Color.WHITE);
		label1.setFont(font);
		f.add(label1);

		//panel
		panel=new JPanel();
		panel.setBounds(250,300,700,400);
		panel.setBackground(new Color(0,0,0,200));
		panel.setLayout(null);	

		//backgroundimage
		ImageIcon img=new ImageIcon("backgroundimage.jpg");
		Image im=img.getImage();
		Image temp=im.getScaledInstance(1200,900,Image.SCALE_SMOOTH);
		img=new ImageIcon(temp);
		label2=new JLabel("",img,JLabel.CENTER);
		label2.setBounds(0,0,1200,900);
		f.add(label2);
		label2.add(label1);
		label2.add(panel);		

		//buttons and Labels
		btn1=new JButton(new ImageIcon("adminlogo.png"));	
		btn1.setBounds(150,100,150,150);
		f.add(btn1);
		panel.add(btn1);
		
		label3=new JLabel("ADMIN LOGIN");
		label3.setBounds(150,250,200,40);
		label3.setForeground(Color.WHITE);
		Font foo=new Font("Serif",Font.BOLD,20);
		label3.setFont(foo);
		label2.add(label3);
		panel.add(label3);

		btn2=new JButton(new ImageIcon("accountant.png"));
		btn2.setBounds(400,100,150,150);
		f.add(btn2);
		panel.add(btn2);
		
		label4=new JLabel("ACCOUNTANT");
		label4.setBounds(400,250,200,40);
		label4.setForeground(Color.WHITE);
		label4.setFont(foo);
		label2.add(label4);
		panel.add(label4);		
		
		f.setSize(1200,900);
		f.setLayout(null);
		f.setVisible(true);
		//f.add(panel);
		btn1.addActionListener(this);
		btn2.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn1)
		{
			new Test1();
		}
		if(e.getSource()==btn2)
		{
			new Test2();
		}


	}

	public static void main(String[] args)
	{
		Test t=new Test();
	}
}
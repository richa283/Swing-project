import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


class EmpDash implements ActionListener
{
	JFrame f,frame1;
	JPanel panel;
	JLabel label1, label2;
	JButton btn1,btn2,btn3,btn4,btn5;

	EmpDash()
	{	
		f=new JFrame();

		//login panel
		panel=new JPanel();
		panel.setBounds(200,150,750,450);
		panel.setBackground(new Color(0,0,0,200));
		panel.setLayout(null);		

		ImageIcon img=new ImageIcon("backgroundimage.jpg");
		Image im=img.getImage();
		Image temp=im.getScaledInstance(1200,900,Image.SCALE_SMOOTH);
		img=new ImageIcon(temp);
		label1=new JLabel(" ",img,JLabel.CENTER);
		label1.setBounds(0,0,1200,900);
		label1.add(panel);

		label2=new JLabel("Employee Dashboard");
		label2.setBounds(220,50,300,50);
		Font font=new Font("Arial",Font.PLAIN,30);
		label2.setForeground(Color.WHITE);
		label2.setFont(font);
		panel.add(label2);
		
		btn1=new JButton(new ImageIcon("img.jpg"));	
		btn1.setBounds(40,150,160,160);
		f.add(btn1);
		panel.add(btn1);

		btn2=new JButton(new ImageIcon("imgkl.jpg"));	
		btn2.setBounds(210,150,160,160);
		f.add(btn2);
		panel.add(btn2);

		
		btn3=new JButton(new ImageIcon("book.png"));	
		btn3.setBounds(380,150,160,160);
		f.add(btn3);
		panel.add(btn3);

		btn4=new JButton(new ImageIcon("datadisplay.png"));	
		btn4.setBounds(550,150,160,160);
		f.add(btn4);
		panel.add(btn4);


		btn5=new JButton(new ImageIcon("logout-button-png-hi.png"));	
		btn5.setBounds(10,10,80,40);
		f.add(btn5);

		f.add(label1);
		f.setSize(1200,900);
		f.setLayout(null);
		f.setVisible(true);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn1)
		{
			new Service();
		}
		if(e.getSource()==btn2)
		{
			new AddEmp();
		}
		if(e.getSource()==btn3)
		{
			new Booking();
		}
		if(e.getSource()==btn4)
		{
			new DataDisplay();
		}
		if(e.getSource()==btn5)
		{
			int a=JOptionPane.showConfirmDialog(null,"Are you sure?");
			if(a==JOptionPane.YES_OPTION)
			{	
				new Test2();
			}
		}

	}

	public static void main(String[] args)
	{
		EmpDash dash=new EmpDash();
	}
}
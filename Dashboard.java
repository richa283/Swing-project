import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


class Dash implements ActionListener
{
	JFrame f,frame1;
	JPanel panel;
	JLabel label1,label2;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7;

	Dash()
	{	
		f=new JFrame();

		//login panel
		panel=new JPanel();
		panel.setBounds(250,150,700,600);
		panel.setBackground(new Color(0,0,0,200));
		panel.setLayout(null);		

		ImageIcon img=new ImageIcon("backgroundimage.jpg");
		Image im=img.getImage();
		Image temp=im.getScaledInstance(1200,900,Image.SCALE_SMOOTH);
		img=new ImageIcon(temp);
		label1=new JLabel(" ",img,JLabel.CENTER);
		label1.setBounds(0,0,1200,900);
		label1.add(panel);

		label2=new JLabel("Dashboard");
		label2.setBounds(270,50,300,50);
		Font font=new Font("Arial",Font.PLAIN,30);
		label2.setForeground(Color.WHITE);
		label2.setFont(font);
		panel.add(label2);
		
		btn1=new JButton(new ImageIcon("img.jpg"));	
		btn1.setBounds(70,150,160,160);
		f.add(btn1);
		panel.add(btn1);

		btn2=new JButton(new ImageIcon("datadisplay.png"));	
		btn2.setBounds(270,150,160,160);
		f.add(btn2);
		panel.add(btn2);

		btn3=new JButton(new ImageIcon("imgkl.jpg"));	
		btn3.setBounds(470,150,160,160);
		f.add(btn3);
		panel.add(btn3);

		btn4=new JButton(new ImageIcon("book.png"));	
		btn4.setBounds(70,350,160,160);
		f.add(btn4);
		panel.add(btn4);

		btn5=new JButton(new ImageIcon("bookingdisplay.png"));	
		btn5.setBounds(270,350,160,160);
		f.add(btn5);
		panel.add(btn5);

		btn6=new JButton(new ImageIcon("ud.jpg"));	
		btn6.setBounds(470,350,160,160);
		f.add(btn6);
		panel.add(btn6);

		btn7=new JButton(new ImageIcon("logout-button-png-hi.png"));	
		btn7.setBounds(10,10,80,40);
		f.add(btn7);

		f.add(label1);
		f.setSize(1200,900);
		f.setLayout(null);
		f.setVisible(true);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn1)
		{
			new Service();
		}
		if(e.getSource()==btn2)
		{
			new Displayservice();
		}
		if(e.getSource()==btn3)
		{
			new AddEmp();
		}
		if(e.getSource()==btn4)
		{
			new Booking();
		}
		if(e.getSource()==btn5)
		{
			new DataDisplay();
		}
		if(e.getSource()==btn6)
		{
			new UpdateDelete();
		}
		if(e.getSource()==btn7)
		{
			int a=JOptionPane.showConfirmDialog(null,"Are you sure?");
			if(a==JOptionPane.YES_OPTION)
			{	
				new Test1();
			}
		}

	}

	

	public static void main(String[] args)
	{
		Dash dash=new Dash();
	}
}
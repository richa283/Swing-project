import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Booking implements ActionListener
{
	JPanel panel;
	JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17;
	JButton btn1,btn2;
	JComboBox c1,c2,c3,c4,c5,c6,c7,c8,c9;
	JTextField t1,t2,t3,t4,t5;
	JTextArea ta;

	Booking()
	{
		//Frame
		JFrame frame=new JFrame();

		//Panel
		panel=new JPanel();
		panel.setBounds(130,20,900,800);
		panel.setBackground(new Color(0,0,0,200));
		panel.setLayout(null);

		ImageIcon img=new ImageIcon("backgroundimage.jpg");
		Image im=img.getImage();
		Image temp=im.getScaledInstance(1200,900,Image.SCALE_SMOOTH);
		img=new ImageIcon(temp);
		label1=new JLabel("",img,JLabel.CENTER);
		label1.setBounds(0,0,1200,900);
		label1.add(panel);

		label2=new JLabel("Booking Form");
		label2.setBounds(340,10,500,50);
		label2.setForeground(Color.WHITE);
		Font font1=new Font("Serif",Font.ITALIC,40);
		label2.setFont(font1);
		panel.add(label2);

		label3=new JLabel("Time Interval:");
		label3.setBounds(520,100,200,30);
		label3.setForeground(Color.WHITE);
		Font font2=new Font("Serif",Font.PLAIN,20);
		label3.setFont(font2);
		panel.add(label3);

		label4=new JLabel("Seat Required:");
		label4.setBounds(520,150,200,30);
		label4.setForeground(Color.WHITE);
		label4.setFont(font2);
		panel.add(label4);

		label5=new JLabel("Food Service:");
		label5.setBounds(520,200,200,30);
		label5.setForeground(Color.WHITE);
		label5.setFont(font2);
		panel.add(label5);

		label6=new JLabel("Cake:");
		label6.setBounds(520,250,200,30);
		label6.setForeground(Color.WHITE);
		label6.setFont(font2);
		panel.add(label6);

		label7=new JLabel("Music Type:");
		label7.setBounds(520,300,200,30);
		label7.setForeground(Color.WHITE);
		label7.setFont(font2);
		panel.add(label7);

		label8=new JLabel("Starter:");
		label8.setBounds(520,350,200,30);
		label8.setForeground(Color.WHITE);
		label8.setFont(font2);
		panel.add(label8);

		label9=new JLabel("Sweets:");
		label9.setBounds(520,400,200,30);
		label9.setForeground(Color.WHITE);
		label9.setFont(font2);
		panel.add(label9);

		label10=new JLabel("Total Charge:");
		label10.setBounds(520,450,200,30);
		label10.setForeground(Color.WHITE);
		label10.setFont(font2);
		panel.add(label10);

		//combo
		c1=new JComboBox();
		c1.setBounds(650,100,200,30);
		c1.setForeground(Color.WHITE);
		c1.setBackground(Color.black);
		c1.addItem("4-hour");
		c1.addItem("One-day");
		c1.addItem("1-night");
		panel.add(c1);

		c2=new JComboBox();
		c2.setBounds(650,150,200,30);
		c2.setForeground(Color.WHITE);
		c2.setBackground(Color.black);
		c2.addItem("5 to 10");
		c2.addItem("10 to 15");
		c2.addItem("15 to 20");
		panel.add(c2);

		c3=new JComboBox();
		c3.setBounds(650,200,200,30);
		c3.setForeground(Color.WHITE);
		c3.setBackground(Color.black);
		c3.addItem("Pizza");
		c3.addItem("Pasta");
		c3.addItem("Burger");
		c3.addItem("Noodles");
		panel.add(c3);

		c4=new JComboBox();
		c4.setBounds(650,250,200,30);
		c4.setForeground(Color.WHITE);
		c4.setBackground(Color.black);
		c4.addItem("Half kg");
		c4.addItem("One kg");
		c4.addItem("Two kg");
		panel.add(c4);

		c5=new JComboBox();
		c5.setBounds(650,300,200,30);
		c5.setForeground(Color.WHITE);
		c5.setBackground(Color.black);
		c5.addItem("Pop");
		c5.addItem("Party");
		c5.addItem("Rock");
		c5.addItem("Hip-Hop");
		c5.addItem("Instrumental");
		panel.add(c5);

		c6=new JComboBox();
		c6.setBounds(650,350,200,30);
		c6.setForeground(Color.WHITE);
		c6.setBackground(Color.black);
		c6.addItem("Veg-lolipop");
		c6.addItem("Crispy-corn");
		c6.addItem("Spring-roll");
		panel.add(c6);

		c7=new JComboBox();
		c7.setBounds(650,400,200,30);
		c7.setForeground(Color.WHITE);
		c7.setBackground(Color.black);
		c7.addItem("Ice-cream");
		c7.addItem("Ras-malai");
		c7.addItem("Rasgulla");
		c7.addItem("Kaju-katli");
		c7.addItem("Barfi");
		panel.add(c7);

		c8=new JComboBox();
		c8.setBounds(650,450,200,30);
		c8.setForeground(Color.WHITE);
		c8.setBackground(Color.black);
		c8.addItem("15,000");
		c8.addItem("25,000");
		c8.addItem("30,000");
		panel.add(c8);


		//DETAILS
		label11=new JLabel("First Name:");
		label11.setBounds(50,100,200,30);
		label11.setForeground(Color.WHITE);
		label11.setFont(font2);
		panel.add(label11);

		t1=new JTextField();
		t1.setBounds(180,100,200,30);
		t1.setForeground(Color.WHITE);
		t1.setBackground(Color.black);
		t1.setFont(font2);
		panel.add(t1);

		label12=new JLabel("Last Name:");
		label12.setBounds(50,170,200,30);
		label12.setForeground(Color.WHITE);
		label12.setFont(font2);
		panel.add(label12);

		t2=new JTextField();
		t2.setBounds(180,170,200,30);
		t2.setForeground(Color.WHITE);
		t2.setBackground(Color.black);
		t2.setFont(font2);
		panel.add(t2);

		label13=new JLabel("Customer ID:");
		label13.setBounds(50,240,200,30);
		label13.setForeground(Color.WHITE);
		label13.setFont(font2);
		panel.add(label13);

		t3=new JTextField();
		t3.setBounds(180,240,250,30);
		t3.setForeground(Color.WHITE);
		t3.setBackground(Color.black);
		t3.setFont(font2);
		panel.add(t3);

		label14=new JLabel("Email:");
		label14.setBounds(50,310,200,30);
		label14.setForeground(Color.WHITE);
		label14.setFont(font2);
		panel.add(label14);

		t4=new JTextField();
		t4.setBounds(180,310,250,30);
		t4.setForeground(Color.WHITE);
		t4.setBackground(Color.black);
		t4.setFont(font2);
		panel.add(t4);

		label15=new JLabel("Contact No:");
		label15.setBounds(50,380,200,30);
		label15.setForeground(Color.WHITE);
		label15.setFont(font2);
		panel.add(label15);

		t5=new JTextField();
		t5.setBounds(180,380,250,30);
		t5.setForeground(Color.WHITE);
		t5.setBackground(Color.black);
		t5.setFont(font2);
		panel.add(t5);

		label16=new JLabel("Address:");
		label16.setBounds(50,450,200,30);
		label16.setForeground(Color.WHITE);
		label16.setFont(font2);
		panel.add(label16);

		ta=new JTextArea();
		ta.setBounds(180,450,250,80);
		ta.setForeground(Color.WHITE);
		ta.setBackground(Color.black);
		ta.setFont(font2);
		panel.add(ta);

		label17=new JLabel("Country:");
		label17.setBounds(50,550,200,30);
		label17.setForeground(Color.WHITE);
		label17.setFont(font2);
		panel.add(label17);

		c9=new JComboBox();
		c9.setBounds(180,550,200,30);
		c9.setForeground(Color.WHITE);
		c9.setBackground(Color.black);
		c9.addItem("Afghanistan");
		c9.addItem("Australia");
		c9.addItem("Belgium");
		c9.addItem("Bhutan");
		c9.addItem("Brazil");
		c9.addItem("China");
		c9.addItem("Denmark");
		c9.addItem("Egypt");
		c9.addItem("India");
		c9.addItem("USA");
		c9.setFont(font2);
		panel.add(c9);

		//Add buttons
		btn1=new JButton("Save");
		btn1.setBounds(50,680,600,40);
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.green);
		btn1.setFont(font2);
		panel.add(btn1);

		btn2=new JButton("Clear");
		btn2.setBounds(660,680,190,40);
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(new Color(102,0,153));
		btn2.setFont(font2);
		panel.add(btn2);

		frame.add(label1);
		frame.setSize(1200,900);
		frame.setLayout(null);
		frame.setVisible(true);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn1)
		{
			String f_name=t1.getText();
			String l_name=t2.getText();
			String customer_id=t3.getText();
			String email=t4.getText();
			String contact_no=t5.getText();
			String address=ta.getText();
			String country=(String)c9.getSelectedItem();

			String time_interval=(String)c1.getSelectedItem();
			String seat=(String)c2.getSelectedItem();
			String food=(String)c3.getSelectedItem();
			String cake=(String)c4.getSelectedItem();
			String music=(String)c5.getSelectedItem();
			String starter=(String)c6.getSelectedItem();
			String sweets=(String)c7.getSelectedItem();
			String total_charge=(String)c8.getSelectedItem();

			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");

		//create query
		String query="Insert into servicetable(f_name, l_name, customer_id, email, contact_no, address, country, time_interval, seat, food, cake, music, starter, sweets, total_charge) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement=con.prepareStatement(query);
				statement.setString(1,f_name);
				statement.setString(2,l_name);
				statement.setString(3,customer_id);
				statement.setString(4,email);
				statement.setString(5,contact_no);
				statement.setString(6,address);
				statement.setString(7,country);

				statement.setString(8,time_interval);
				statement.setString(9,seat);
				statement.setString(10,food);
				statement.setString(11,cake);
				statement.setString(12,music);
				statement.setString(13,starter);
				statement.setString(14,sweets);
				statement.setString(15,total_charge);


				int i=statement.executeUpdate();

				if(i>0)
				{
					JOptionPane.showMessageDialog(null,"Data saved successfully");
				}
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}


		}
		if(e.getSource()==btn2)
		{	t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			t4.setText(null);
			t5.setText(null);
			ta.setText(null);
			c9.setSelectedIndex(0);
			c1.setSelectedIndex(0);
			c1.setSelectedIndex(0);
			c2.setSelectedIndex(0);
			c3.setSelectedIndex(0);
			c4.setSelectedIndex(0);
			c5.setSelectedIndex(0);
			c6.setSelectedIndex(0);
			c7.setSelectedIndex(0);
			c8.setSelectedIndex(0);
			
		}
	}

	public static void main(String[] args)
	{
		Booking booking=new Booking();
	}
}
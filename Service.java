import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Service implements ActionListener
{
	JPanel panel;
	JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
	JButton btn1,btn2;
	JComboBox c1,c2,c3,c4,c5,c6,c7,c8;

	Service()
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

		label2=new JLabel("Service Form");
		label2.setBounds(350,40,500,50);
		label2.setForeground(Color.WHITE);
		Font font1=new Font("Serif",Font.ITALIC,40);
		label2.setFont(font1);
		panel.add(label2);

		label3=new JLabel("Time Interval:");
		label3.setBounds(50,130,200,30);
		label3.setForeground(Color.WHITE);
		Font font2=new Font("Serif",Font.PLAIN,20);
		label3.setFont(font2);
		panel.add(label3);

		label4=new JLabel("Seat Required:");
		label4.setBounds(50,180,200,30);
		label4.setForeground(Color.WHITE);
		label4.setFont(font2);
		panel.add(label4);

		label5=new JLabel("Food Service:");
		label5.setBounds(50,230,200,30);
		label5.setForeground(Color.WHITE);
		label5.setFont(font2);
		panel.add(label5);

		label6=new JLabel("Cake:");
		label6.setBounds(50,280,200,30);
		label6.setForeground(Color.WHITE);
		label6.setFont(font2);
		panel.add(label6);

		label7=new JLabel("Music Type:");
		label7.setBounds(50,330,200,30);
		label7.setForeground(Color.WHITE);
		label7.setFont(font2);
		panel.add(label7);

		label8=new JLabel("Starter:");
		label8.setBounds(50,380,200,30);
		label8.setForeground(Color.WHITE);
		label8.setFont(font2);
		panel.add(label8);

		label9=new JLabel("Sweets:");
		label9.setBounds(50,430,200,30);
		label9.setForeground(Color.WHITE);
		label9.setFont(font2);
		panel.add(label9);

		label10=new JLabel("Total Charge:");
		label10.setBounds(50,480,200,30);
		label10.setForeground(Color.WHITE);
		label10.setFont(font2);
		panel.add(label10);

		//combo
		c1=new JComboBox();
		c1.setBounds(200,130,400,30);
		c1.setForeground(Color.WHITE);
		c1.setBackground(Color.black);
		c1.addItem("4-hour");
		c1.addItem("One-day");
		c1.addItem("1-night");
		panel.add(c1);

		c2=new JComboBox();
		c2.setBounds(200,180,400,30);
		c2.setForeground(Color.WHITE);
		c2.setBackground(Color.black);
		c2.addItem("5 to 10");
		c2.addItem("10 to 15");
		c2.addItem("15 to 20");
		panel.add(c2);

		c3=new JComboBox();
		c3.setBounds(200,230,400,30);
		c3.setForeground(Color.WHITE);
		c3.setBackground(Color.black);
		c3.addItem("Pizza");
		c3.addItem("Pasta");
		c3.addItem("Burger");
		c3.addItem("Noodles");
		panel.add(c3);

		c4=new JComboBox();
		c4.setBounds(200,280,400,30);
		c4.setForeground(Color.WHITE);
		c4.setBackground(Color.black);
		c4.addItem("Half kg");
		c4.addItem("One kg");
		c4.addItem("Two kg");
		panel.add(c4);

		c5=new JComboBox();
		c5.setBounds(200,330,400,30);
		c5.setForeground(Color.WHITE);
		c5.setBackground(Color.black);
		c5.addItem("Pop");
		c5.addItem("Party");
		c5.addItem("Rock");
		c5.addItem("Hip-Hop");
		c5.addItem("Instrumental");
		panel.add(c5);

		c6=new JComboBox();
		c6.setBounds(200,380,400,30);
		c6.setForeground(Color.WHITE);
		c6.setBackground(Color.black);
		c6.addItem("Veg-lolipop");
		c6.addItem("Crispy-corn");
		c6.addItem("Spring-roll");
		panel.add(c6);

		c7=new JComboBox();
		c7.setBounds(200,430,400,30);
		c7.setForeground(Color.WHITE);
		c7.setBackground(Color.black);
		c7.addItem("Ice-cream");
		c7.addItem("Ras-malai");
		c7.addItem("Rasgulla");
		c7.addItem("Kaju-katli");
		c7.addItem("Barfi");
		panel.add(c7);

		c8=new JComboBox();
		c8.setBounds(200,480,400,30);
		c8.setForeground(Color.WHITE);
		c8.setBackground(Color.black);
		c8.addItem("15,000");
		c8.addItem("25,000");
		c8.addItem("30,000");
		panel.add(c8);


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
		String query="Insert into service(time_interval, seat, food, cake, music, starter, sweets, total_charge) values(?,?,?,?,?,?,?,?)";
				PreparedStatement statement=con.prepareStatement(query);

				statement.setString(1,time_interval);
				statement.setString(2,seat);
				statement.setString(3,food);
				statement.setString(4,cake);
				statement.setString(5,music);
				statement.setString(6,starter);
				statement.setString(7,sweets);
				statement.setString(8,total_charge);


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
		{	
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
		Service service=new Service();
	}
}
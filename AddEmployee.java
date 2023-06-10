import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.toedter.calendar.*;
import java.util.*;
import static java.lang.System.out;
import java.sql.*;

class AddEmp implements ActionListener
{
	JPanel panel;
	JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12;
	JButton btn1,btn2;
	JTextField tf1,tf2,tf3,tf4,tf5;
	JPasswordField pf;
	JComboBox c1;
	JTextArea ta1;
	JDateChooser dc1,dc2;
	

	AddEmp()
	{
		//Frame
		JFrame frame=new JFrame();

		//Panel
		panel=new JPanel();
		panel.setBounds(250,80,700,720);
		panel.setBackground(new Color(0,0,0,200));
		panel.setLayout(null);

		ImageIcon img=new ImageIcon("backgroundimage.jpg");
		Image im=img.getImage();
		Image temp=im.getScaledInstance(1200,900,Image.SCALE_SMOOTH);
		img=new ImageIcon(temp);
		label1=new JLabel("",img,JLabel.CENTER);
		label1.setBounds(0,0,1200,900);
		label1.add(panel);

		label2=new JLabel("Add Employee Form");
		label2.setBounds(200,10,500,50);
		label2.setForeground(Color.WHITE);
		Font font1=new Font("Serif",Font.ITALIC,40);
		label2.setFont(font1);
		panel.add(label2);

		label3=new JLabel("Employee name:");
		label3.setBounds(50,100,200,30);
		label3.setForeground(Color.WHITE);
		Font font2=new Font("Serif",Font.PLAIN,20);
		label3.setFont(font2);
		panel.add(label3);

		label4=new JLabel("Email address:");
		label4.setBounds(50,150,200,30);
		label4.setForeground(Color.WHITE);
		label4.setFont(font2);
		panel.add(label4);

		label5=new JLabel("Contact number:");
		label5.setBounds(50,200,200,30);
		label5.setForeground(Color.WHITE);
		label5.setFont(font2);
		panel.add(label5);

		label6=new JLabel("Experience:");
		label6.setBounds(50,250,200,30);
		label6.setForeground(Color.WHITE);
		label6.setFont(font2);
		panel.add(label6);

		label7=new JLabel("Job qualification:");
		label7.setBounds(50,300,200,30);
		label7.setForeground(Color.WHITE);
		label7.setFont(font2);
		panel.add(label7);

		label8=new JLabel("Home address:");
		label8.setBounds(50,350,200,30);
		label8.setForeground(Color.WHITE);
		label8.setFont(font2);
		panel.add(label8);

		label9=new JLabel("Salary:");
		label9.setBounds(50,450,200,30);
		label9.setForeground(Color.WHITE);
		label9.setFont(font2);
		panel.add(label9);

		label10=new JLabel("Joining date:");
		label10.setBounds(50,500,200,30);
		label10.setForeground(Color.WHITE);
		label10.setFont(font2);
		panel.add(label10);

		label11=new JLabel("Date of birth:");
		label11.setBounds(50,550,200,30);
		label11.setForeground(Color.WHITE);
		label11.setFont(font2);
		panel.add(label11);

		label12=new JLabel("Set password:");
		label12.setBounds(50,600,200,30);
		label12.setForeground(Color.WHITE);
		label12.setFont(font2);
		panel.add(label12);

		//TextField
		tf1=new JTextField();
		tf1.setBounds(200,100,280,30);
		tf1.setForeground(Color.WHITE);
		tf1.setBackground(Color.black);
		tf1.setFont(font2);
		panel.add(tf1);
		
		tf2=new JTextField();
		tf2.setBounds(200,150,280,30);
		tf2.setForeground(Color.WHITE);
		tf2.setBackground(Color.black);
		tf2.setFont(font2);
		panel.add(tf2);

		tf3=new JTextField();
		tf3.setBounds(200,200,280,30);
		tf3.setForeground(Color.WHITE);
		tf3.setBackground(Color.black);
		tf3.setFont(font2);
		panel.add(tf3);


		//combobox for experience
		c1=new JComboBox();
		c1.setBounds(200,250,280,30);
		c1.addItem("0-2 years");
		c1.addItem("2-5 years");
		c1.addItem("More than 5 years");
		c1.setForeground(Color.WHITE);
		c1.setBackground(Color.black);
		c1.setFont(font2);
		panel.add(c1);

		tf4=new JTextField();
		tf4.setBounds(200,300,280,30);
		tf4.setForeground(Color.WHITE);
		tf4.setBackground(Color.black);
		tf4.setFont(font2);
		panel.add(tf4);

		//textarea
		ta1=new JTextArea();
		ta1.setBounds(200,350,280,80);
		ta1.setForeground(Color.WHITE);
		ta1.setBackground(Color.black);
		ta1.setFont(font2);
		panel.add(ta1);

		

		tf5=new JTextField();
		tf5.setBounds(200,450,280,30);
		tf5.setForeground(Color.WHITE);
		tf5.setBackground(Color.black);
		tf5.setFont(font2);
		panel.add(tf5);

		dc1=new JDateChooser();
		dc1.setBounds(200,500,200,30);
		dc1.setForeground(Color.WHITE);
		dc1.setBackground(Color.black);
		dc1.setFont(font2);
		panel.add(dc1);

		dc2=new JDateChooser();
		dc2.setDateFormatString("dd/MM/yyyy");
		dc2.setBounds(200,550,200,30);
		dc2.setForeground(Color.WHITE);
		dc2.setBackground(Color.black);
		dc2.setFont(font2);
		panel.add(dc2);
                
               	pf=new JPasswordField();
		pf.setBounds(200,600,280,30);
		pf.setForeground(Color.WHITE);
		pf.setBackground(Color.black);
		panel.add(pf);


		//Button
		btn1=new JButton("Save");
		btn1.setBounds(50,650,400,40);
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.green);
		btn1.setFont(font2);
		panel.add(btn1);

		btn2=new JButton("Clear");
		btn2.setBounds(470,650,120,40);
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
			//now get data from text field
			String name=tf1.getText();
			String email=tf2.getText();
			String number=tf3.getText();
			String experience=(String)c1.getSelectedItem();
			String qualification=tf4.getText();
			String adress=ta1.getText();
			String salary=tf5.getText();

			//java.sql.Date joiningdate=new java.sql.Date(dc1.getDate());
			//java.sql.Date dob=new java.sql.Date(dc2.getDate());

			char ch[]=pf.getPassword();
			String pass=new String(ch);

			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
				//create query
				String query="Insert into empdata(name,email,contact_number,experience,job_qualification,address,salary,joining_date,dob,emp_password) values(?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement=con.prepareStatement(query);
				statement.setString(1,name);
				statement.setString(2,email);
				statement.setString(3,number);
				statement.setString(4,experience);
				statement.setString(5,qualification);
				statement.setString(6,adress);
				statement.setString(7,salary);
				//statement.setString(8,joiningdate);
				//statement.setString(9,dob);
				statement.setString(10,pass);

				int i=statement.executeUpdate();

				if(i>0)
				{
					JOptionPane.showMessageDialog(null,"Data saved successfully");
                          
				}
				else if(i<0)
				{
					JOptionPane.showMessageDialog(null,"Null values");
				}
			
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
		}
		if(e.getSource()==btn2)
		{
			tf1.setText(null);
			tf2.setText(null);
			tf3.setText(null);
		   c1.setSelectedIndex(0);
			tf4.setText(null);
			ta1.setText(null);
			tf5.setText(null);
		    dc1.setCalendar(null);
		    dc2.setCalendar(null);
			 pf.setText(null);
		}
	}

	public static void main(String[] args)
	{
		AddEmp addemp=new AddEmp();
	}
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Test1 implements ActionListener
{
	JPanel panel;
	JLabel label1,label2,label3,label4,label5;
	JTextField tf;
	JPasswordField pf;
	JButton btn1, btn2;

	Test1()
	{	
		JFrame f=new JFrame();

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

		
		
              	label2=new JLabel("Admin Login");
		label2.setBounds(180,20,500,100);
		label2.setForeground(Color.WHITE);
		Font f1=new Font("Serif", Font.BOLD,60);
		label2.setFont(f1);
		panel.add(label2);
		

		label3=new JLabel("Type your username and password to access the Admin Dashboard");
		label3.setBounds(50,120,600,50);
		label3.setForeground(Color.WHITE);
		Font f2=new Font("Helvetica",Font.PLAIN,20);
		label3.setFont(f2);
		panel.add(label3);

		label4=new JLabel("Username:");
		label4.setBounds(190,250,100,40);
		label4.setForeground(Color.WHITE);
		label4.setFont(f2);
		panel.add(label4);

		tf=new JTextField();
		tf.setBounds(300,250,200,40);
		tf.setForeground(Color.black);
		tf.setFont(f2);
		panel.add(tf);

		label5=new JLabel("Password:");
		label5.setBounds(190,310,100,40);
		label5.setForeground(Color.WHITE);
		label5.setFont(f2);
		panel.add(label5);
		
		pf=new JPasswordField();
		pf.setBounds(300,310,200,40);
		pf.setForeground(Color.black);
		panel.add(pf);
		
		btn1=new JButton("Back");
		btn1.setBounds(190,400,150,40);
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.blue);
		panel.add(btn1);
		
		btn2=new JButton("Login");
		btn2.setBounds(350,400,150,40);
		btn2.setBackground(Color.green);
		btn2.setForeground(Color.WHITE);
		panel.add(btn2);

		f.add(label1);
		f.setSize(1200,900);
		f.setLayout(null);
		f.setVisible(true);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==btn1)
	{
		new Test();
	}
	
    	if(e.getSource()==btn2)
	{
			//now get data from text field
			String name=tf.getText();
                        char ch[]=pf.getPassword();
			String pass=new String(ch);

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			//create query
			String query="Select * from data where name=? and password=?";
			PreparedStatement statement=con.prepareStatement(query);
			statement.setString(1,name);
			statement.setString(2,pass);

			ResultSet set=statement.executeQuery();
			if(set.next())
			{
				JOptionPane.showMessageDialog(null,"Login Successful");
                            	new Dash();
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Invalid username or password");
			}
			
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}}

		
	}
	public static void main(String[] args)
	{
		Test1 t1=new Test1();
	}
}
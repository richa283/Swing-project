import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;


class UpdateDelete implements ActionListener
{
	JFrame f;
	JPanel p1;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b1,b2;
	JTable table;
	String[] columnNames = {"First Name","Last Name","Contact","Timing","Seats","Total amount"};

	UpdateDelete()
	{	
		f=new JFrame("Update Customer Data...");


		//Panel
		p1=new JPanel();
		p1.setBounds(0,0,1200,200);
		p1.setBackground(new Color(9,9,36)); //188,188,227
		p1.setLayout(null);

		l1=new JLabel("First Name:");
		l1.setBounds(20,40,150,30);
		Font font=new Font("Serif",Font.PLAIN,20);
		l1.setForeground(Color.WHITE);
		l1.setFont(font);
		p1.add(l1);

		l2=new JLabel("Last Name:");
		l2.setBounds(20,90,150,30);
		l2.setForeground(Color.WHITE);
		l2.setFont(font);
		p1.add(l2);

		l3=new JLabel("Contact no.:");
		l3.setBounds(20,140,150,30);
		l3.setForeground(Color.WHITE);
		l3.setFont(font);
		p1.add(l3);

		l3=new JLabel("Time interval:");
		l3.setBounds(400,40,150,30);
		l3.setForeground(Color.WHITE);
		l3.setFont(font);
		p1.add(l3);

		l3=new JLabel("Seat required:");
		l3.setBounds(400,90,150,30);
		l3.setForeground(Color.WHITE);
		l3.setFont(font);
		p1.add(l3);

		l3=new JLabel("Total charge:");
		l3.setBounds(400,140,150,30);
		l3.setForeground(Color.WHITE);
		l3.setFont(font);
		p1.add(l3);
		
		//Text-Fields
		t1=new JTextField();
		t1.setBounds(130,40,150,30);
		t1.setForeground(Color.WHITE);
		t1.setBackground(Color.black);
		t1.setFont(font);
		p1.add(t1);

		t2=new JTextField();
		t2.setBounds(130,90,150,30);
		t2.setForeground(Color.WHITE);
		t2.setBackground(Color.black);
		t2.setFont(font);
		p1.add(t2);

		t3=new JTextField();
		t3.setBounds(130,140,150,30);
		t3.setForeground(Color.WHITE);
		t3.setBackground(Color.black);
		t3.setFont(font);
		p1.add(t3);

		t4=new JTextField();
		t4.setBounds(520,40,150,30);
		t4.setForeground(Color.WHITE);
		t4.setBackground(Color.black);
		t4.setFont(font);
		p1.add(t4);

		t5=new JTextField();
		t5.setBounds(520,90,150,30);
		t5.setForeground(Color.WHITE);
		t5.setBackground(Color.black);
		t5.setFont(font);
		p1.add(t5);

		t6=new JTextField();
		t6.setBounds(520,140,150,30);
		t6.setForeground(Color.WHITE);
		t6.setBackground(Color.black);
		t6.setFont(font);
		p1.add(t6);

		b1=new JButton("Update");
		b1.setBounds(750,90,120,30);
		b1.setBackground(new Color(75,75,163));
		b1.setForeground(Color.WHITE);
		Font ft=new Font("Serif",Font.BOLD,20);
		b1.setFont(ft);
		p1.add(b1);

		b2=new JButton("Delete");
		b2.setBounds(750,140,120,30);
		b2.setBackground(new Color(75,75,163));
		b2.setForeground(Color.WHITE);
		b2.setFont(ft);
		p1.add(b2);

		//JTable
		table=new JTable();
		table.setBounds(20,220,1150,600);
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);
		table.setModel(model);
		f.add(table);

		f.add(p1);
		f.setSize(1200,900);
		f.setLayout(null);
		f.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{


		}

		if(e.getSource()==b1)
		{


		}
	}
		String s1=f_name.getText();
		String s2=l_name.getText();
		String s3=contact_no.getText();
		String s4=time_interval.getText();
		String s5=seat.getText();
		String s6=total_charge.getText();

		try
		{ 


	Class.forName("com.mysql.jdbc.Driver"); 
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			String sql = "update servicetable set f_name=?,l_name=?,contact_no=?,time_interval=?, seat=?, total_charge=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeUpdate();
			for(int i=0;i<17;i++)
			{
				if(rs.next())
				{
					f_name= rs.getString("f_name"); 
					l_name= rs.getString("l_name");
					contact_no= rs.getString("contact_no");
					time_interval=  rs.getString("time_interval");
					seat=  rs.getString("seat");
					total_charge=  rs.getString("total_charge");

					model.addRow(new Object[]{f_name,l_name,contact_no,time_interval,seat,total_charge});

				}
			}
			
		}
		catch(Exception ex)
		{
		JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
		}
		//frame1.add(scroll);
		//frame1.setVisible(true);
		//frame1.setSize(700,500);
	}

	public static void main(String[] args)
	{
		UpdateDelete ud=new UpdateDelete();
	}
}
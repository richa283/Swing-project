import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;


class DataDisplay implements ActionListener
{
	JFrame f,frame1;
	JPanel panel;
	JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9;
	JTextField t1;
	JButton show_btn;
	
	JTable table;
	String[] columnNames = {"First Name","Last Name","ID","Email","Contact","Address","Country","Timing","Seats","Food","Cake","Music","Starter","Sweets","Total amount"};

	DataDisplay()
	{	
		f=new JFrame();

		//login panel
		panel=new JPanel();
		panel.setBounds(40,20,1100,800);  //250,20,700,800
		panel.setBackground(new Color(0,0,0,200));
		panel.setLayout(null);		

		ImageIcon img=new ImageIcon("backgroundimage.jpg");
		Image im=img.getImage();
		Image temp=im.getScaledInstance(1200,900,Image.SCALE_SMOOTH);
		img=new ImageIcon(temp);
		label1=new JLabel(" ",img,JLabel.CENTER);
		label1.setBounds(0,0,1200,900);
		label1.add(panel);

		label2=new JLabel("Display Booking Table");
		label2.setBounds(350,30,400,50);
		Font font=new Font("Serif",Font.ITALIC,40);
		label2.setForeground(Color.WHITE);
		label2.setFont(font);
		panel.add(label2);
				
		//t1=new JTextField();
		//t1.setBounds(80,110,500,30);
		//t1.setForeground(Color.black);
		//Font ft=new Font("Serif",Font.BOLD,20);
		//t1.setFont(ft);
		//panel.add(t1);

		show_btn=new JButton("Show");
		show_btn.setBounds(500,100,80,30);
		show_btn.setForeground(Color.WHITE);
		show_btn.setBackground(new Color(0,128,0));
		Font ft=new Font("Monospaced",Font.BOLD,18);
		show_btn.setFont(ft);
		panel.add(show_btn);
		
		f.add(label1);
		f.setSize(1200,900);
		f.setLayout(null);
		f.setVisible(true);
		show_btn.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==show_btn)
		{
			showTableData();
		}
	}

	public void showTableData()
	{
		//frame1 = new JFrame("Database Search Result");
		//frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		//frame1.setLayout(new BorderLayout()); 
		
		
		

		table = new JTable();
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);
		table.setModel(model); 
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		table.setSize(1000,550);
		table.setBounds(50,200,1000,550);
		//table.setVisible(true);
		//table.setLayout(null);
		//table.add(scroll);
		panel.add(table);
		
		String f_name = "";
		String l_name = "";
		String customer_id = "";
		String email = "";
		String contact_no = "";
		String address = "";
		String country = "";
		String time_interval = "";
		String seat = "";
		String food = "";
		String cake ="";
		String music ="";
		String starter ="";
		String sweets ="";
		String total_charge ="";

		try
		{ 
			Class.forName("com.mysql.jdbc.Driver"); 
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			String sql = "select * from servicetable";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			for(int i=0;i<100;i++)
			{
				if(rs.next())
				{
					f_name = rs.getString("f_name");
					l_name = rs.getString("l_name");
					customer_id = rs.getString("customer_id");
					email = rs.getString("email"); 
					contact_no = rs.getString("contact_no");
					address = rs.getString("address");
					country = rs.getString("country");
					time_interval = rs.getString("time_interval"); 
					seat = rs.getString("seat");
					food = rs.getString("food");
					cake =  rs.getString("cake");
					music =  rs.getString("music");
					starter =  rs.getString("starter");
					sweets =  rs.getString("sweets");
					total_charge =  rs.getString("total_charge");

					model.addRow(new Object[]{f_name,l_name,customer_id,email,contact_no,address,country,time_interval,seat,food,cake,music,starter,sweets,total_charge});

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
		DataDisplay data=new DataDisplay();
	}
}
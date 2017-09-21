package search;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class forget_form implements MouseListener
{
JFrame fr;
JTextField t1,t2;
JLabel l1,l2,l3,l4,l5;
int w,h;

	public forget_form()
	{
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		w = dim.width;
		h = dim.height;

		fr = new JFrame();
		fr.setBounds((w-500)/2,(h-300)/2,500,300);
		fr.setContentPane(new JLabel(new ImageIcon("C:/Users/user/Documents/Project work/evening_project/images/forget.png")));
		fr.setLayout(null);

		l1 = new JLabel("Enter UserName");	
		l1.setBounds(170,80,200,30);
		l1.setForeground(Color.white);
		l1.setFont(new Font("verdana",Font.BOLD,16));
		fr.add(l1);

		t1 = new JTextField();
		t1.setBounds(170,110,210,30);
		t1.setForeground(Color.green);
		t1.setFont(new Font("verdana",Font.BOLD,16));
		t1.setOpaque(false);
		fr.add(t1);

		l2 = new JLabel("Enter Registered Email");	
		l2.setBounds(170,150,200,30);
		l2.setForeground(Color.white);
		l2.setFont(new Font("verdana",Font.BOLD,16));
		fr.add(l2);

		t2 = new JTextField();
		t2.setBounds(170,180,210,30);
		t2.setForeground(Color.green);
		t2.setFont(new Font("verdana",Font.BOLD,16));
		t2.setOpaque(false);
		fr.add(t2);

		l2 = new JLabel(new ImageIcon("C:/Users/user/Documents/Project work/evening_project/images/recovery.png"));
		l2.setBounds(30,65,96,96);
		fr.add(l2);			

		l3 = new JLabel(new ImageIcon("C:/Users/user/Documents/Project work/evening_project/images/submit1.png"));
		l3.setBounds(170,230,100,30);
		l3.addMouseListener(this);
		l3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fr.add(l3);

		l4 = new JLabel(new ImageIcon("C:/Users/user/Documents/Project work/evening_project/images/can1.png"));
		l4.setBounds(280,230,100,30);
		l4.addMouseListener(this);
		l4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fr.add(l4);

		fr.setUndecorated(true);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
  	
	public void mouseEntered(MouseEvent me)
	{
		JLabel lb = (JLabel)me.getComponent();
		if(lb==l3)
		{
			l3.setIcon(new ImageIcon("C:/Users/user/Documents/Project work/evening_project/images/submit2.png"));
		}
		if(lb==l4)
		{
			l4.setIcon(new ImageIcon("images/can2.png"));
		}	
	}
	public void mouseExited(MouseEvent me)
	{
		JLabel lb = (JLabel)me.getComponent();
		if(lb==l3)
		{
			l3.setIcon(new ImageIcon("images/submit1.png"));
		}
		if(lb==l4)
		{
			l4.setIcon(new ImageIcon("images/can1.png"));
		}
	}
	public void mouseClicked(MouseEvent me)
	{
		JLabel lb = (JLabel)me.getComponent();
		if(lb==l3)
		{
			String un = t1.getText();
			String pw = t2.getText();
			
			try
			{
				Connection con = dao.createconnection();
				PreparedStatement ps = con.prepareStatement("select * from login where username=? and password=?");
				ps.setString(1,un);
				ps.setString(2,pw);
				ResultSet rs = ps.executeQuery();			
				if(rs.next())
				{
					JOptionPane.showMessageDialog(fr,"Welcome "+un.toUpperCase());
					new mainform();
				}
				else
				{	
					JOptionPane.showMessageDialog(fr,"Sorry! Username or Password is wrong");
				}
			}
			catch(SQLException se)
			{
				System.out.println(se);
			}
		}

		if(lb==l4)
		{
			fr.dispose();
		}
	}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
}
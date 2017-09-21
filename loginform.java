package search;


//import cm.mvc.controller.Loginservlet;
import search.database;
import search.AfterLogin;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class loginform extends JFrame 
{
JFrame fr;
JTextField t1;
JPasswordField t2;
JLabel l1,l2,l3,l4,l5,l6;
JButton b1,b2;
int w,h;
 

           database db;
           handler handle;
	public loginform()
	{
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		w = dim.width;
		h = dim.height;

		fr = new JFrame();
		fr.setBounds((w-500)/2,(h-300)/2,500,300);
		fr.setContentPane(new JLabel(new ImageIcon("C:/Users/user/Documents/Project work/evening_project/images/login_form.png")));
		fr.setLayout(null);
                fr.setBackground(Color.black);
                  db=new database();
                  handle=new handler();
		l1 = new JLabel("Enter UserName");	
		l1.setBounds(170,80,200,30);
		l1.setForeground(Color.white);
		l1.setFont(new Font("verdana",Font.BOLD,16));
		fr.add(l1);

		t1 = new JTextField();
		t1.setBounds(170,110,210,30);
                t1.setName("uname");
		t1.setForeground(Color.green);
		t1.setFont(new Font("verdana",Font.BOLD,16));
		t1.setOpaque(false);
		fr.add(t1);

		l2 = new JLabel("Enter Password");	
		l2.setBounds(170,150,200,30);
		l2.setForeground(Color.white);
		l2.setFont(new Font("verdana",Font.BOLD,16));
		fr.add(l2);

		t2 = new JPasswordField();
		t2.setBounds(170,180,210,30);
                t2.setName("password");
		t2.setForeground(Color.green);
		t2.setFont(new Font("verdana",Font.BOLD,16));
		t2.setOpaque(false);
		fr.add(t2);

		l2 = new JLabel(new ImageIcon("C:/Users/user/Documents/Project work/evening_project/images/login.png"));
		l2.setBounds(30,65,96,96);
		fr.add(l2);			

                b1=new JButton("Login");
                                 
		//l3 = new JLabel(new ImageIcon("C:/Users/user/Documents/Project work/evening_project/images/log1.png"));
		b1.setBounds(170,230,100,30);
                 b1.addActionListener(handle); 
		//b1.addMouseListener(this);
		//b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
                fr.add(b1);
                 b2=new JButton("Reset");
                 b2.addActionListener(handle);
		//l4 = new JLabel(new ImageIcon("images/can1.png"));
		b2.setBounds(280,230,100,30);
		//b2.addMouseListener(this);
		//b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fr.add(b2);

		l5 = new JLabel("<html><u>Forget Password ?</u></html>");
		l5.setBounds(30,230,150,30);
		//l5.addMouseListener(this);
		l5.setForeground(Color.red);
		l5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fr.add(l5);
                
                 
		fr.setUndecorated(true);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
	}
  	
	 
	//public void mousePressed(MouseEvent me){}
	//public void mouseReleased(MouseEvent me){}
	
        
	public static void main(String args[])
	{
    
		//new loginform();
           // int st=0;
            
            }
                
	

class handler implements ActionListener
        
{
    public void actionPerformed(ActionEvent ae)
    {
        
         if(ae.getSource()==b1)
         {
             char[] tpwd=t2.getPassword();
             String pwd=String.copyValueOf(tpwd);
             String t4=t1.getText();
              System.out.println("Username,Pwd"+t4+","+pwd); 
           //entered username and password are checked by checklogin which return null
              if(db.checkLogin(t4,pwd))
              {   
                  JOptionPane.showMessageDialog(null,"You have succesfully looged in","Success",JOptionPane.INFORMATION_MESSAGE);
                  //new SubjectionSelection();
                  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new AfterLogin().setVisible(true);
                    // t1=new Timer()
                } catch (InterruptedException ex) {
                    Logger.getLogger(loginform.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
              });
              }
              else
              {
                  JOptionPane.showMessageDialog(null,"Login failed","Failed!!",JOptionPane.ERROR_MESSAGE);
                  
              }
              /* if(ae.getSource()==b2)   
               {
                   t1.setText(" ");
                   t2.setText(" ");
                   
               }*/
              }
            
        
         if(ae.getSource()==b2)   
               {
                   t1.setText(" ");
                   t2.setText(null);
                   
               }
         
}
}                  }

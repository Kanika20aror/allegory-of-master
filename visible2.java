
package search;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.RadioButton;
import javax.swing.JApplet;

public class visible2 extends JApplet implements ActionListener 
{
    ArrayList<String> s;
    public JPanel jPanel1;
   
    static Connection con;
     ResultSet rs;
     PreparedStatement ps;
     Statement st;
    String t1;
    Button b1;
    public static ButtonGroup buttonGroup1;  
    //ArrayList <String> a;
    public visible2(ArrayList<String> a)
    {
    }
  public void visible3(ArrayList<String> a) 
  {
        try {
            int i=0;
             Button[] b=new Button[7];
             
             Panel p=new Panel();
             //Label l=new Label();
   
    for(String x:a)
    {
   b[i]=new Button(x);
   
   p.add(b[i]);
 
   
   
  b[i].addActionListener(this);
 //b1.addActionListener(this);
   Frame f=new Frame();
   
   f.setSize(1702,519);
   f.setBackground(Color.black);
   //l.setText("Vote for teacher");
   
   //l.setSize(591, 29);
  // p.add(l);
   //f.add(l);
   f.add(p);
   f.setVisible(true);
   i++;
   
    }
            


        } 
        catch (Exception ex) {
            System.out.print(ex.getMessage());
            System.out.print("hy");
        }
  }
  
      /*
      public static void main()
  {
    visible2 obj2;  
        obj2 = new visible2(a);
  }
 */
  
    @Override
  public void init()
  {  
      //setDefaultCloseOperation();
     // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

     JButton but1=new JButton("Mybutton");
     jPanel1.add(but1);
    // s=new ArrayList<String>();
    //visible2 obj=new visible2(s);
   //but1.addActionListener(obj);
        
        
       // but1.g
       System.out.print("selected buttton"+t1);
        //System.out.print("selected button"+search2.s1);
  }
  
   public void actionPerformed(ActionEvent e)
   {    
    
   
        try {
           
            search2 ob2=new search2();
           String str=search2.sel; 
           t1 = ((Button)e.getSource()).getLabel();
           
           // System.out.print("pratibha");
           System.out.print("string is"+str);
            System.out.print("selected button"+t1);
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","shail");
           // st=con.createStatement();
           ps=con.prepareStatement("update Teacherdb set Counter=Counter+1 where Tname=? and Subject=?");
           //String sql="update Teacherdb set Counter=Counter+1 where Tname='"+t1+"'and Subject='"+str+"'";
             ps.setString(1,t1);
             ps.setString(2,str);
           ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "vote given");
      
           //  st.executeUpdate();
            
           /* if(rs.next())
            {
            

                System.out.print("succesfully inserted");
            }
            else
            {
                System.out.print("not  inserted");
            }
*/
        } catch (SQLException ex) {
            System.out.println("error ");
            ex.printStackTrace();
            //Logger.getLogger(visible2.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
         
         }
   
   


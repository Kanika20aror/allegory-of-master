package search;
import search.Visible.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

 
public class search extends javax.swing.JFrame
{
 String s1;
  Statement st;
  static Connection  con;
  ResultSet rs ;
  String ids;
  int ind;
  ArrayList<String> v;
  ArrayList<String> mylist;        //DBMS, CN, Java, OS, C,  , 
 
    public search() throws SQLException{
        initComponents();
         try {
         mylist=new ArrayList<String>();
         //mylist.add("DBMS");
        //mylist.add("CN");
        mylist.add("Java");
         mylist.add("OS");//DBMS, CN, Java, OS, C, CO, FuzzyLogic & GeneticAlgo, Adv. Java, Big Data Analytics, DS, Agile Prog, DAA, Distributed Computing, Cryptography Network Security, Cloud Tech, Distributed Computing, Distributed system,
         //DM, Buisness Intelligance, LAMP Tech, Multimedia Tech, Ethical Hacking, CBNST, Modelling & Simulation, AI, Adv. Computer Arcitecture
         mylist.add("C");
         
         mylist.add("CO");
         mylist.add("FuzzyLogic & GeneticAlgo");
         mylist.add("Adv. Java");
         mylist.add("Big Data Analytics");
         mylist.add("DS");
         mylist.add("Agile Prog");
         
          mylist.add("DAA"); 
          mylist.add("Distributed Computing");
         //mylist.add("");
          mylist.add("Cryptography Network Security");
          mylist.add("Cloud Tech");
          mylist.add("Distributed Computing");
          mylist.add("Distributed system");
          mylist.add("DM");
          mylist.add("Buisness Intelligance");
          mylist.add("LAMP Tech");
          mylist.add("Multimedia Tech");
          mylist.add("Ethical Hacking");
          mylist.add("CBNST");
          mylist.add("Modelling & Simulation");
          mylist.add("AI");
          
          mylist.add("Adv. Computer Arcitecture");
          
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root", "shail");
          st = con.createStatement();
           v = new ArrayList<String>();
           
     } catch (ClassNotFoundException ex) {
       //  Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println(ex.getMessage());
     }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        button1 = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Java", "OS", "C", "CO", "FuzzyLogic & GeneticAlgo", "Adv. Java", "Big Data Analytics", "DS", "Agile Prog", "DAA", "Distributed Computing", "Cryptography Network Security", "Cloud Tech", "Distributed Computing", "Distributed system", "DM", "Buisness Intelligance", "LAMP Tech", "Multimedia Tech", "Ethical Hacking", "CBNST", "Modelling & Simulation", "AI", "Adv. Computer Arcitecture" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setPreferredSize(new java.awt.Dimension(150, 200));
        jScrollPane1.setViewportView(jList1);

        scrollPane1.add(jScrollPane1);

        button1.setActionCommand("SUBMIT");
        button1.setLabel("SUBMIT");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Select Subject for which Teacher list is show");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jLabel1)
                .addContainerGap(423, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(550, 550, 550)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(484, 484, 484)
                                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        ind= jList1.getSelectedIndex();  
        
        Visible v1=new Visible(v);
          if(ind>0)
          s1=(String)mylist.get(ind);
          else
           s1=(String)mylist.get(0);
         
        if("FuzzyLogic & GeneticAlgo".equals(s1))
         {  
           
            try {
                 v=new ArrayList<String>();
                rs = st.executeQuery("select Tname from Teacherdb where Subject='FuzzyLogic & GeneticAlgo' order by Counter desc");
                while (rs.next()) {
                    ids = rs.getString(1);
                    v.add(ids);
                }
              for(String vz:v)
                { 
               // System.out.print(vz);
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
              // v1.setVisible(true);
               
                }
               
               //JOptionPane.showMessageDialog(null,(String)v1.jTextArea1.getText());
                v1.setVisible(true); 
            }
            catch (SQLException ex) {
                Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }
     } 
          if("C".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb where Subject='C'order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                //System.out.print("C");
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
               //v1.setVisible(true);
              // System.out.print("C out");
               //System.out.print(vz);
               
                }
//JOptionPane.showMessageDialog(null, (String)v1.jTextArea1.getText());//jTextArea1.getText()+"\n"+vz
            v1.setVisible(true); 
             }
              catch (SQLException ex) {
                 Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
             }
         }  
           if("Big Data Analytics".equals(s1))
         {  
             try {
             
             rs = st.executeQuery("select Tname from Teacherdb where Subject='Big Data Analytics order by Counter desc'");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
             for(String vz:v)
                { 
                System.out.print(vz);
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
               // v1.setVisible(true);
               
                }
            //JOptionPane.showMessageDialog(null, (String)v1.jTextArea1.getText());
               v1.setVisible(true);   
             }
              catch (SQLException ex) {
                 Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
            if("CO".equals(s1))
         {  
             try {
             
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='CO' order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
              //  v1.setVisible(true);
               
                }
            // JOptionPane.showMessageDialog(null, (String)v1.jTextArea1.getText());
               v1.setVisible(true);   
             }
              catch (SQLException ex) {
                 Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
             }
         } 
             if("Java".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='Java' order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
              //JOptionPane.showMessageDialog(null,(String)v1.jTextArea1.getText());
                v1.setVisible(true); 
            }
            catch (SQLException ex) {
                Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }
            } 
              if("Adv. Java".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='Adv. Java' order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
              //JOptionPane.showMessageDialog(null,(String)v1.jTextArea1.getText());
               v1.setVisible(true); 
            }
            catch (SQLException ex) {
                Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }
            } 
              if("DS".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb where Subject='DS'order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
             //JOptionPane.showMessageDialog(null,(String)v1.jTextArea1.getText());
                v1.setVisible(true); 
            }
            catch (SQLException ex) {
                Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }
            } 
              if("Agile Prog".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='Agile Prog' order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
              //JOptionPane.showMessageDialog(null,(String)v1.jTextArea1.getText());
                v1.setVisible(true); 
            }
            catch (SQLException ex) {
                Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }
            } 
              if("Distributed Computing".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='Distributed Computing'order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
            // JOptionPane.showMessageDialog(null, (String)jTextArea1.getText());
                v1.setVisible(true);  
             }
              catch (SQLException ex) {
                 Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
             }
         } 
                                               // TODO add your handling code here:
           if("DAA".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='DAA' order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
            // JOptionPane.showMessageDialog(null, (String)jTextArea1.getText());
                v1.setVisible(true);  
             }
              catch (SQLException ex) {
                 Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
             }
         } 
        if("Cryptography Network Security".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='Cryptography Network Security'order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
            // JOptionPane.showMessageDialog(null, (String)jTextArea1.getText());
                v1.setVisible(true);  
             }
              catch (SQLException ex) {
                 Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
             }
         } 
        if("Multimedia Tech".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='Multimedia Tech'order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
            // JOptionPane.showMessageDialog(null, (String)jTextArea1.getText());
                v1.setVisible(true);  
             }
              catch (SQLException ex) {
                 Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
        if("Cloud Tech".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='Cloud Tech'order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
            // JOptionPane.showMessageDialog(null, (String)jTextArea1.getText());
                v1.setVisible(true);  
             }
              catch (SQLException ex) {
                 Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
             }
         } 
        if("Distributed Computing".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='Distributed Computing'order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
            // JOptionPane.showMessageDialog(null, (String)jTextArea1.getText());
                v1.setVisible(true);  
             }
              catch (SQLException ex) {
                 Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
             }
         } 
        if("Distributed system".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='Distributed system'order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
            // JOptionPane.showMessageDialog(null, (String)jTextArea1.getText());
                v1.setVisible(true);  
             }
              catch (SQLException ex) {
                 Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
             }
         } 
        if("LAMP Tech".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='LAMP Tech'order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
            // JOptionPane.showMessageDialog(null, (String)jTextArea1.getText());
                v1.setVisible(true);  
             }
              catch (SQLException ex) {
                 Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
             }
         } 
        if("DM".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='DM'order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
            // JOptionPane.showMessageDialog(null, (String)jTextArea1.getText());
                v1.setVisible(true);  
             }
              catch (SQLException ex) {
                 Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
             }
         } 
        if("Ethical Hacking".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='Ethical Hacking'order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
            // JOptionPane.showMessageDialog(null, (String)jTextArea1.getText());
                v1.setVisible(true);  
             }
              catch (SQLException ex) {
                 Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
             }
         } 
        if("Modelling & Simulation".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='Modelling & Simulation'order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
            // JOptionPane.showMessageDialog(null, (String)jTextArea1.getText());
                v1.setVisible(true);  
             }
              catch (SQLException ex) {
                 Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
             }
         } 
        if("AI".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='AI'order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
            // JOptionPane.showMessageDialog(null, (String)jTextArea1.getText());
                v1.setVisible(true);  
             }
              catch (SQLException ex) {
                 Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
             }
         } 
        if("CBNST".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='CBNST'order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
            // JOptionPane.showMessageDialog(null, (String)jTextArea1.getText());
                v1.setVisible(true);  
             }
              catch (SQLException ex) {
                 Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
             }
         } 
        if("Adv. Computer Arcitecture".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='Adv. Computer Arcitecture'order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
            // JOptionPane.showMessageDialog(null, (String)jTextArea1.getText());
                v1.setVisible(true);  
             }
              catch (SQLException ex) {
                 Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
             }
         } 
        if("Buisness Intelligance".equals(s1))
         {  
             try {
            
             rs = st.executeQuery("select Tname from Teacherdb Where Subject='Buisness Intelligance'order by Counter desc");
              while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
             } 
              for(String vz:v)
                { 
                
                v1.jTextArea1.setText(v1.jTextArea1.getText()+"\n"+vz);
                
               
                }
            // JOptionPane.showMessageDialog(null, (String)jTextArea1.getText());
                v1.setVisible(true);  
             }
              catch (SQLException ex) {
                 Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
             }
         } 
        
        
    }//GEN-LAST:event_button1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      /*  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new search().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}

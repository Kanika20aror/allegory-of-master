package search;


import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class newthread extends Thread
{
     
    newthread()
    {
      System.out.println("sample thread");
       start();
    }
    public void run()
    {
        try
        {
            System.out.print("Entry into thread");
            
            for(int i=0;i<5;i++)
            {
                System.out.print(i);
            }
                Thread.sleep(2000);
            
           //
           
        System.out.print("exit thread");
    }   catch (InterruptedException ex) {
            Logger.getLogger(newthread.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
}

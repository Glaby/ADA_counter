/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ada_citac;

/**
 *
 * @author viktor.glabazna
 */
public class ADA_CITAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       counter minutes = new counter(60, null);
       counter seconds = new counter(60, minutes);
       while(minutes.num < 60){
             seconds.raise();
             System.out.println(minutes.num + "::" + seconds.num);
           
       }
     
       
        
    }
    
}

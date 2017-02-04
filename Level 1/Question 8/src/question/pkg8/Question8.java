/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg8;

import java.util.Scanner;

/**
 *
 * @author Aya
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     Scanner sc = new Scanner (System.in);
     String s = sc.next();
      
    while(true)
     {
         if (s.contains("WUB") == true)
         {
             int index = s.indexOf("WUB") ;
            // System.out.println(index);
             s = s.substring(0, index) + " " +s.substring(index+3);   
         }
         
         else 
             break ;
     }
    
    for (int i=0 ; i<s.length() ; i++)   // just for delete fisrt spaces
    {
        if (s.charAt(i) ==' ')
        {
           s = s.substring(i+1);
        }
        
        else 
            break ;
    }
    
     System.out.println(s);
     
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg9;

import java.util.Scanner;

/**
 *
 * @author Aya
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        
        if ( (s.startsWith("http")== true) )
        {
           s = s.substring(0,4) + "://" + s.substring(4);
        } 
        
        if ( s.startsWith("ftp") )
        {
             s = s.substring(0,3) + "://" + s.substring(3);
        }
        
        int index = s.indexOf("ru");
        
        s = s.substring(0,index)+ "." + s.substring(index);
        
        if ((index+2) != s.length())
        {
           s = s.substring(0 , index+3 ) + "/" + s.substring(index+3);
        
        }
        
        System.out.println(s);
    }
    
}

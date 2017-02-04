
package question.pkg6;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner (System.in);
        
        String s = sc.next();
        String z = "" ;
       // char [] arr = {'h' , 'e' , 'l' ,'l','o'};
        String wanted = "hello";
        
        for (int i=0 ; i<s.length(); i++)
        { 
            for (int j=0 ; j<wanted.length();j++)
            {
               if (s.charAt(i) == wanted.charAt(j))
               {
                  z+=s.charAt(i);
                  wanted= wanted.substring(j+1);
                 
               }
            }
        }
        
       //  System.out.println(z);
         
        if (z.equals("hello"))
        {
          System.out.println("YES");
        }
        
        else 
        {
          System.out.println("NO");  
        }
        
    }
    
}

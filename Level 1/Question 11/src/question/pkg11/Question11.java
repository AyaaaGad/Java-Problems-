
package question.pkg11;

import java.util.Scanner;

public class Question11 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        
        int capital_letters =0;
        
        for (int i=0 ; i<s.length() ; i++)
        {
            if (Character.isUpperCase( s.charAt(i)))
                capital_letters++;
        }
        
        if ( capital_letters > (s.length()/2 ))
        {
            s=s.toUpperCase();
            System.out.println(s);
        }
        
        else 
        {
           s=s.toLowerCase();
           System.out.println(s); 
        }

    }
    
}

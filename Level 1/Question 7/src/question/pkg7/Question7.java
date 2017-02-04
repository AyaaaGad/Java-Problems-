
package question.pkg7;

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        String z = sc.next();
        String rev = "";
        
        for (int i=s.length()-1 ; i>=0 ; i--)
        {
            rev+=s.charAt(i);
        }
        
        
       // s = new StringBuilder(s).reverse().toString();   now s is reversed
        
       
        if (rev.equals(z))
        System.out.println("YES");
        
        else 
        System.out.println("NO");
            
    }
    
}


package question.pkg5;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        boolean change = true ;
        for (int i=1 ; i<s.length();i++)
        {
           if (Character.isLowerCase(s.charAt(i)) == true)
           {
              change = false ;
              break ;
           }
        }
        
        if (change == false)
            System.out.println(s);
        else 
        { 
          char[] arr = s.toCharArray();
           
          for (int i=0 ; i<s.length(); i++)    
          {
            if(Character.isLowerCase(s.charAt(i)) == true)
            {
               arr[i] = Character.toUpperCase(arr[i]);
            } 
            else 
            {
              arr[i] = Character.toLowerCase(arr[i]);
            }
          }
          
          System.out.println(arr);
        }
        
        
    }
    
}

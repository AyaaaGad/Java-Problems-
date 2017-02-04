
package question.pkg2;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args)
    {  
        char[] Vowels  = {'A','a', 'O', 'o', 'Y', 'y', 'e', 'E', 'U' ,'u', 'I','i'};
        Scanner sc = new Scanner (System.in);
        String data = sc.next();
        String new_word ="" ;
        
        for (int i=0 ; i<data.length(); i++)
        {
           for (int j=0 ; j<12 ; j++)
           { 

              if (data.charAt(i) == Vowels[j])
              { 
                data = data.substring(0 , i) + data.substring(i+1);
                i--;
                break;
              }
           }
        }
        
            data = data.toLowerCase();
          
          for (int i=0 ; i<data.length(); i++)
          {
             new_word +='.';
             new_word += data.charAt(i);
          }
        
        
        System.out.println(new_word);
        
        
    }
    
}

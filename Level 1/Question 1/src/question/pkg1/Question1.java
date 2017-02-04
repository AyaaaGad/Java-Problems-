
package question.pkg1;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        for (int i=0 ; i<n ; i++)
        {
            String word = sc.next( );
            int size = word.length();
                
            if (size> 10)
            {
                char c = word.charAt(0);
                char d = word.charAt(size-1);
                
                
                // is there another method to print char with int instaed of this one :/ ?!!
                
                System.out.print( c ) ;
                System.out.print( size-2 ) ;
                System.out.print( d ) ;
                System.out.println( );
                
            }
            
            else 
                
            {
               System.out.println(word);
            }
        }    
        
    }
    
}

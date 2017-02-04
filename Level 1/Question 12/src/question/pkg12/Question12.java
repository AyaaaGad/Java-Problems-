
package question.pkg12;

import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int k = sc.nextInt();
        String s = sc.next();
        
        String unique_char = "" ;
      
        for (int i=0 ; i<s.length() ; i++)
        {
            boolean Add = true ;
            
            for (int j=i+1 ; j<s.length() ; j++)
            {
                if (s.charAt(i) == s.charAt(j))
                {
                   Add = false ;
                   break ;
                }
            }
            
            if (Add == true)
            {
                unique_char += s.charAt(i);
                
            }

        }
        
        // int size = unique_char.length();
         
        // int [] arr ;  // how to initialize int array of size 
         // all values in this array must be divisible by k
         
          boolean wrong_ans = false ;
          String arr ="" ;
         
         for (int i=0 ; i<unique_char.length() ; i++)
         { 
             int counter = 0 ;
             
             for (int j=0 ; j<s.length() ; j++)
             {
                 if ( s.charAt(j) == unique_char.charAt(i))
                 {
                     counter++ ;
                 }
             }
             
           //System.out.println("counter = " + counter );  
           if (counter%k != 0)
           {
              wrong_ans = true ;
              break ;
           }
           
           else 
           {
               arr+= counter ;
           }
           
          //System.out.println("res = " + res );
             
         }

         if ( wrong_ans == true)
         {
            System.out.println(-1); 
         }
         
       //  System.out.println(" cpy = " + unique_char);
       // System.out.println("arr = " + arr );
         
       
       
     /*   else 
         {
             // hena el mfrod akawen el gomla l gdeda 3ala 7asb el counters bta3et el 7rof 
       
       
             boolean all_zeroes = false ;
             String res ="";
             
             while (all_zeroes == false)
             {  
                
                 
                 for (int i=0 ; i<unique_char.length() ; i++)
                 {
                     if (arr.charAt(i) != '0')
                     res+=unique_char.charAt(i);
                     
                    // String new_count = arr.substring(i ,1);
                    
                    // arr = arr.replace(arr.charAt(i), arr.charAt(i)-1);
                 }
  
             }
             
             
         }*/
 
        
    }
    
}

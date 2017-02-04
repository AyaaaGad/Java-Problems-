
package question.pkg4;

import java.util.Scanner;

public class Question4 {


    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner (System.in);
         String s = sc.next();
         
         for (int i=0;i<s.length();i++)
         {
            if (s.charAt(i)=='+')
            {
               s = s.substring(0,i)+s.substring(i+1);
            }
         }
         
         
         char [] arr = s.toCharArray();
         int size = s.length();
         
         for (int i=0 ; i<size ;i++)
         {  
            String c = Character.toString(arr[i]);
            int cur = Integer.parseInt(c);
            
             for (int j=i+1 ; j<size ; j++)
             { 
                 String d = Character.toString(arr[j]);
                 int next = Integer.parseInt(d);
              
                if (next <cur)
                 { 
                     
                char temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
                  cur = next ;
                  
                 } 
             
             }
              
         }
         
         
         
         
         for (int i=0 ; i< arr.length-1 ; i++)
             System.out.print(arr[i]+ "+");
             System.out.print(arr[arr.length-1]);
             System.out.println();


         
    }
    
}
    


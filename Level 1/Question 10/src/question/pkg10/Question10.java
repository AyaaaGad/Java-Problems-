
package question.pkg10;

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args)
    {
       Scanner sc = new Scanner (System.in);
       int n , p , q ;
       n= sc.nextInt();
       p = sc.nextInt();
       q = sc.nextInt();
       
       String s = sc.next();
       
       if ( (p+q)==n )
       {
          System.out.println("2");
          System.out.println( s.substring(0,p) );
          System.out.println( s.substring(p) );
       }
       
       //if ((p+q)> n )
       else 
       {
           if ( (n%q ==0))
           {
              System.out.println(n/q);
              
              for (int i=1 ; i<=n/q ;i++)
              {  
                System.out.println(s.substring(0,q));
                s = s.substring(q);
                
              }
           }
           
           else if ( (n%p ==0))
           {
              System.out.println(n/p);
         
              for (int i=0 ; i<n/p ;i++)
              {  
                System.out.println(s.substring(0,p));
                s=s.substring(p);
              }
               
           }
           
           else 
              System.out.println(-1);

               
       }
       
       
    }
    
}

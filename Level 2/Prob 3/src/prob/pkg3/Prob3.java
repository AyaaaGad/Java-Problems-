
package prob.pkg3;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob3 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i=0 ; i<n ; i++)
        {
            arr.add(sc.nextInt());
        }
        
        int max = arr.get(0);
        int min = arr.get(0);
        
        for (int i=0 ; i<n ; i++)
        {
           for (int j=1 ; j<n ; j++)
           {
               if (arr.get(j) > max)
               {
                 max = arr.get(j);
               }
               
               if (arr.get(j)< min)
               {
                 min = arr.get(j);
               }
           }          
        }
        
       int difference = max - min ;
       int ways = 0 ;
       
        for (int i=0 ; i<n ; i++)
        {
           for (int j=i+1 ; j<n ; j++)
           {
              if ( ((arr.get(i)-arr.get(j))== difference ) ||  ((arr.get(i)-arr.get(j))== -difference ) )
              {
                  ways++;
              }
           }          
        }
        
        System.out.println( difference + " " + ways );
        
        
        
    }
    
}


package prob.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob2 {

   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n  = sc.nextInt();
        
        ArrayList <Integer> arr = new ArrayList<>(n);
        ArrayList <Integer> res = new ArrayList<>(n);
        ArrayList <Integer> equals = new ArrayList<>();
        
        for (int i=0 ; i<n ; i++)
        {
           res.add( i , -1 ); // lazm n3ml initialization leeh 34an n3ml replace l2n el add using index m4 naf3a 
        }
  
        for (int i=0 ; i<n ; i++)
        {
            arr.add(sc.nextInt());
        }
        
        int counter = 1 ;
        
        for (int i=0 ; i<n ; i++)
        { 
            int max = arr.get(i);
            int index = i ;
            boolean all_negative = true ;
            
            for (int k=0 ; k<n ; k++)
            {
                if (arr.get(k) != -1)
                {
                    all_negative = false ;
                    break;
                }
            }
            
            if (all_negative == true)
            {
                break ;
            }
        
            for (int j=0 ;j<n ; j++ )
            {
                if (arr.get(j) > max)
                {
                    max = arr.get(j);
                    index = j ;
                }
            }
     
            for (int j=0 ;j<n ; j++ )
            {
                if (arr.get(j) == max)
                {
                    equals.add(j);
                }
            }
            
            
            for (int j=0 ; j <equals.size() ; j++)
            { 
                res.set( equals.get(j), counter );         
                arr.set( equals.get(j), -1);
            }
           
            counter+= equals.size();
            
            equals.clear();

        }
        
        
        for (int i=0 ; i<res.size() ; i++)
        {
            System.out.print( res.get(i) + " " );
        }
        
    }
    
}

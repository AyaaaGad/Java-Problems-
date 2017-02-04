

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Prob5 {

    public static void main(String[] args)
    {  
        Scanner sc = new Scanner (System.in);
        int n ; 
        n = sc.nextInt();
        
        ArrayList <BigInteger> arr = new ArrayList<>();
        
        for (int i=0 ; i<n ; i++)
        {
            arr.add(sc.nextBigInteger());
        }
        
        BigInteger res = new  BigInteger("0") ;
  
        for (int i=0 ; i<n ; i++)
        {
           res = res.add(arr.get(i));     
        }
        
        if(res.mod(new BigInteger("2")).equals(BigInteger.ZERO))
        {
            System.out.println(res);
        }
        
        else 
        {
            
            for (int i=0 ; i<n ; i++)
                
            {
                BigInteger min = arr.get(i);
                
                for (int j=0 ; j<n ; j++)
                {
                    if ((arr.get(j).compareTo(min) == -1 ) && (min.equals(-1) == false))
                    {
                        min = arr.get(j);
                        BigInteger bi = new BigInteger("1");
                        arr.set(j , bi.negate());
                    }
                }
                
                res = res.subtract(min) ;
                
                if(res.mod(new BigInteger("2")).equals(BigInteger.ZERO))
                {
                   System.out.println(res);
                   break ;
                }
    
            }

            
        }
        
        } 
   
}

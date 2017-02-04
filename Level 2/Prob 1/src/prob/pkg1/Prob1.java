package prob.pkg1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Prob1 {

    public class Pair {

        int h;
        int v;

        public void set_hor(int ho) {
            h = ho;
        }

        public void set_ver(int ver) {
            v = ver;
        }

        public int get_hor() {
            return h;
        }

        public int get_ver() {
            return v;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
       ArrayList <Integer> horizontal;
        horizontal = new ArrayList <>();
       ArrayList <Integer> vertical ;
       vertical = new ArrayList<>();
       
        ArrayList <Integer> done_h ;
        done_h = new ArrayList <>();
        ArrayList <Integer> done_v ;
        done_v = new ArrayList<>();
       
        done_h.add(0);
        done_v.add(0);
        
        
        for (int i=0 ; i<n*n ; i++) {
            horizontal.add(sc.nextInt());
            vertical.add(sc.nextInt());
        }
        
         ArrayList <Integer> res;
        res = new ArrayList <>();
        
        for (int i=0 ; i<n*n ; i++)
        { 
            int s1 = done_h.size() ;
            int s2 = done_v.size() ;
            
            boolean found_h = false ;
            boolean found_v = false ;
            
            for ( int j =0 ; j< s1 ; j++)
            {   
                if ( Objects.equals(horizontal.get(i), done_h.get(j)))
                {     
                    found_h = true ;
                    break ;
                }
                
            }
            
            for (int j =0 ; j< s2 ; j++)
            {
               if ( Objects.equals (vertical.get(i), done_v.get(j)))
                {
                   found_v = true ;
                   break ;
                } 

            }
            
            if ( (found_v == false) && (found_h == false) )
            {
                 res.add(i+1);
                  done_v.add (vertical.get(i));
                  done_h.add(horizontal.get(i));
              
            }
               

    }
        
        
     for (int i=0 ; i<res.size() ; i++)
     {
         System.out.print( res.get(i) + " " );
     }
     
     System.out.println();


    }
}

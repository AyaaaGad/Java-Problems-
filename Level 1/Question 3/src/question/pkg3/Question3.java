package question.pkg3;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next(), y = sc.next();

        if (x.compareToIgnoreCase(y) < 0) {
            System.out.println(-1);
        } 
        
        else if (x.compareToIgnoreCase(y) > 0) {

            System.out.println(1);
        } 
        
        else {
            System.out.println(0);
        }
    }

}


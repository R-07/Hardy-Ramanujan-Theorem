/* package codechef; // don't place package name! */

import java.io.*; 
  
class GFG { 
      
    // A function to count prime factors of 
    // a given number n 
    static int exactPrimeFactorCount(int n) 
    { 
        int count = 0; 
      
        if (n % 2 == 0) { 
            count++; 
            while (n % 2 == 0) 
                n = n / 2; 
        } 
      
        // n must be odd at this point. So we can skip 
        // one element (Note i = i +2) 
        for (int i = 3; i <= Math.sqrt(n); i = i + 2)  
        { 
            if (n % i == 0) { 
                count++; 
                while (n % i == 0) 
                    n = n / i; 
            } 
        } 
      
        // This condition is to handle the case  
        // when n is a prime number greater than 2 
        if (n > 2) 
            count++; 
        return count; 
    } 
      
    // driver function 
    public static void main (String[] args)  
    { 
        int n = 51242183; 
        System.out.println( "The number of distinct "
                            + "prime factors is/are "
            + exactPrimeFactorCount(n)); 
        System.out.println( "The value of log(log(n))"
                   + " is " + Math.log(Math.log(n))) ; 
    } 
} 

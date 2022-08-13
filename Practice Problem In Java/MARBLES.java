/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t;
		long n, k;
		
		t = sc.nextInt();
		sc.nextLine();
		
		while(t-->0){
		    n = sc.nextInt();
		    k = sc.nextInt();
		    
		    long combinations = 1;
            for(long i=1; i<=k-1; i++){
                combinations = combinations* (n-k+i)/i;
            }

	        System.out.println(combinations);
		    
		}
	}
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 2
// 10 10
// 30 7
// Output--
// 1
// 475020

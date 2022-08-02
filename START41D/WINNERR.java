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
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(n-->0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int d = s.nextInt();
		int max1 = Math.max(a,b);
		int max2 = Math.max(c,d);
			if(max1 > max2)
			{ 
			    System.out.println("Q");
			    
			}
			else if(max2 > max1)
			{
			    System.out.println("P");
			}
			else{
			    System.out.println("TIE");
			}
		
		}
	}
}


//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 4
// 5 10 2 12
// 10 30 15 15
// 20 8 4 20
// 6 6 6 6
// Output--
// P
// Q
// TIE
// TIE

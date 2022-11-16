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
		int  n = s.nextInt();
		while(n-->0) {
			int  a = s.nextInt();
			int  b = s.nextInt();
		  if(a>=b) {
			  System.out.println(a-b);
		  }
		  else if(a<b) {
			  System.out.println("0");
		  }
		}
	}
}


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 4
// 20 14
// 41 41
// 35 0
// 50 100
  
// Output--
// 6
// 0
// 35
// 0



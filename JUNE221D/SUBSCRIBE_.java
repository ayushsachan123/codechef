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
		 int c = a/6;
		 if(a%6==0) {
		 System.out.println(c*b);
		 }
		 if(a%6!=0) {
			 System.out.println((c+1)*b);
		 }
		}
		
	}
}


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 3
// 1 100
// 12 250
// 16 135
  
// Output--
// 100
// 500
// 405

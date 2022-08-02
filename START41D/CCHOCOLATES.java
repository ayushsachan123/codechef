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
			int d = a*5 +b*10;
			int e = d/c;
			System.out.println(e);
		}
	}
}


//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 4
// 10 10 10
// 3 1 8
// 8 1 3
// 4 4 1000
// Output--
// 15
// 3
// 16
// 0

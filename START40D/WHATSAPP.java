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
		int d = a-b;
		int e = d*c;
		System.out.println(e);
	}
	}
}


//---------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// 4
// 5 2 2
// 2 2 6
// 3 2 1
// 9 1 2
// Output--
// 6
// 0
// 1
// 16

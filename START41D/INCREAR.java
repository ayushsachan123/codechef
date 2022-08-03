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
			if(a==b) {
				System.out.println("0");
			}
			else if(a>b) {
				int d = a-b;
				if(d%2==0) {
					System.out.println(d/2);
				}
				else {
					System.out.println((d/2)+2);
				}
			}
			else {
				System.out.println(b-a);
			}
			
			}
	}
}


//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// 3 4
// 5 5
// 7 3
// 5 2
// 7 12

// Output--
// 1
// 0
// 2
// 3
// 5


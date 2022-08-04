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
        while(n-->0){
            int a = s.nextInt();
            int b = s.nextInt();
            int d = 7-a;
            int e = 7-b;
            int f= Math.min(d,e);
            System.out.println(f);
        }
	}
}


//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 4
// 0 0
// 2 5
// 5 2
// 4 3
// Output--
// 7
// 2
// 2
// 3

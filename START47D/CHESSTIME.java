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
         int a =  s.nextInt();
       int b = a*60;
       int c = b/20;
       System.out.println(c);
     }
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 4
// 1
// 10
// 7
// 3
// Output--
// 3
// 30
// 21
// 9

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
       int b = a%10;
       System.out.println(b);
     }
	}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 4
// 53
// 100
// 9
// 11
// Output--
// 4
// 53
// 100
// 9
// 11

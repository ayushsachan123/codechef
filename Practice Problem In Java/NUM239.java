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
		Scanner s=new Scanner(System.in);
		int t = s.nextInt();
	
		while(t-->0){
		    	int count =0;
		   int a = s.nextInt();
		   int b = s.nextInt();
		   for(int i=a;i<=b;i++){
		       int d = i%10;
		       if(d==2 ||d==3 ||d==9){
		           count++;
		       }
		   }
		       System.out.println(count);
		}
	}
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Sample 1:
// Input--
// 2
// 1 10
// 11 33
// Output--
// 3
// 8
// Explanation:
// Example case 1: The pretty numbers between 11 and 1010 are 22, 33 and 99.

// Example case 2: The pretty numbers between 1111 and 3333 are 1212, 1313, 1919, 2222, 2323, 2929, 3232 and 3333.

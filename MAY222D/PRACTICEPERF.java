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
		int count=0;
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
        int arr[]= {a,b,c,d};
        for(int i=0;i<4;i++) {
        	if (arr[i]>=10) {
        		count++;
        	}
		
		
        }
        System.out.println(count);
	}
}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// 2 3 1 10     12 100 99 11    1 1 1 1   
// Output-- 
// 1            4               0

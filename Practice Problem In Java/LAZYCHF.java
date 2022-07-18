Question Link-

	https://discuss.codechef.com/problems/LAZYCHF
------------------------------------------------------------------------------------------------------------------------------------------------------
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
	        
	        while(n>0){
	        	int a = s.nextInt();
		        int b = s.nextInt();
		        int c = s.nextInt();
	            int d = a*b;
	            int e = a+c;
	            if(d>=e){
	                System.out.println(e);
	            }
	            else{
	                System.out.println(d);
	            }
	            n--;
	        }

	}
}

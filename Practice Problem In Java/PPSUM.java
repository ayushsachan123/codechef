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
             
		        int d = s.nextInt();
		        int b = s.nextInt();
		       
		        for(int i =1; i<=d; i++ ){
		                for(int j = b-1; j>0; j--){
		                        b = b+j;
		                }
		        }
		        System.out.println(b);
        }
	}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 2
// 1 4
// 2 3
// Output--
// 10
// 21

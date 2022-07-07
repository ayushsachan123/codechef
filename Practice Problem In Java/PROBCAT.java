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
		    if(a>=1&&a<100){
		        System.out.println("Easy");
		    }
		    else if(a>=100&&a<200){
		        System.out.println("Medium");
		    }
		    else if(a>=200&&a<=300){
		        System.out.println("Hard");
		    }
		}
	}
}


//---------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 3
// 50
// 172
// 201
  
// Output--
// Easy
// Medium
// Hard

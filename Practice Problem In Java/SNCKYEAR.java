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
		 Scanner s =new Scanner(System.in);
       int n = s.nextInt();
       while(n-->0){
           int a = s.nextInt();
               if(a == 2010 || a==2015 || a==2016 ||a==2017 || a==2019){
                   System.out.println("HOSTED");
               }
               else{
                   System.out.println("NOT HOSTED");
               }
           }
	}
}


//------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 2
// 2019
// 2018
  
// Output--
// HOSTED
// NOT HOSTED

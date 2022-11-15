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
     int n= s.nextInt();
     while(n-->0){
         int a = s.nextInt();
         int b = a/100;
         int c = a%100;
         if((b+c)<=10){
             System.out.println(b + c);
         }
         
          else {
              System.out.println("-1");
          }
       
     }
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// 5
// 103
// 0
// 6
// 142
// 1000
// Output--
// 4
// 0
// 6
// -1
// 10


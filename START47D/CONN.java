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
          if(a==1 ||a==3 || a==5){
             System.out.println("NO");
          }
          else{
              System.out.println("YES");
          }
         }
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 4
// 2
// 5
// 7
// 11
// Output--
// YES
// NO
// YES
// YES

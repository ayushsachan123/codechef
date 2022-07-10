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
           int b = s.nextInt();
           int c = s.nextInt();
           int d = s.nextInt();
           int e= (b+c/2)*a;
               if(e<=d){
                   System.out.println("YES");
               }
               else{
                   System.out.println("NO");
               }
           }
	}
}


//-------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 3
// 3 1 1 3
// 1 1 1 2
// 2 1 1 1
  
// Output--
// YES
// YES
// NO

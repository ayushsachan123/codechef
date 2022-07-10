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
           int e = s.nextInt();
            int f = s.nextInt();
            int g = s.nextInt();
            int h = e+f+g;
               if(h>=d && e>=a&& f>=b && g>=c){
                   System.out.println("YES");
               }
               else{
                   System.out.println("NO");
               }
           }
	}
}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
//   5
// 1 1 1 300 2 2 2
// 3 2 2 6 2 2 2
// 2 3 2 6 2 2 2
// 2 2 3 6 2 2 2
// 100 100 100 300 100 100 100
  
// Output--
// NO
// NO
// NO
// NO
// YES

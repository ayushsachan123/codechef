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
            int p=0;
       int a = s.nextInt();
       int pal=a;
       while(a!=0){
     int   b = a%10;
        p = p*10+b;
       a=a/10;
       }
       if(pal==p){
           System.out.println("wins");
       }
       else{
           System.out.println("loses");
       }
        }
	}
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 3
// 331
// 666
// 343
// Output--
// loses
// wins
// wins

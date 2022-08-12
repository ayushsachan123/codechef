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
            int count=0;
            int d;
             for(int i =0;i<a;i++){
                  int b = s.nextInt();
                   int c = s.nextInt();
                   d = c-b;
                   if(d>5){
                   count++;
                   }
             }
             if(count>0){
                 System.out.println(count);
             }
             
        }
        
	}
}

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 1
// 5
// 1 3
// 4 4
// 4 10
// 1 11
// 2 7
// Output--
// 2

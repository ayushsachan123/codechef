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
           int b = s.nextInt();
        while(n-->0){
            int a = s.nextInt();
          
            if(b<=a){
                System.out.println("Good boi");
            }
            else{
                System.out.println("Bad boi");
            }
        }
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 2 1500
// 1499
// 1501
// Output--
// Bad boi
// Good boi

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
          char a= s.next().charAt(0);
           char b= s.next().charAt(0);
            char c= s.next().charAt(0); 
            char d= s.next().charAt(0);
             char e= s.next().charAt(0);
               if(a==d || a==e){
                   System.out.println(a);
               }
               else if(b==d || b==e){
                    System.out.println(b);
               }
               else{
                    System.out.println(c);
               }
           }
	}
}


//---------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// 2
// A B C
// A B
// B C A
// A C

// Output--
// A
// C

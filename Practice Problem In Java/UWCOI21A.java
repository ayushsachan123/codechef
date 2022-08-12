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
        int n =s.nextInt();
        while(n-->0){
            int a = s.nextInt();
          
                if(a>9 && a%2==0){
                  System.out.println("2" + " " +  a/2);
            }
            else{
                System.out.println("1" + " " + a);
            }
}
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// 1
// 3
// 5
// 8
// 10
// Output--
// 1 1
// 1 3
// 1 5
// 1 8
// 2 5

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
		    int a =s.nextInt();
		    int b =s.nextInt();
		    int c =s.nextInt();
		    int d =s.nextInt();
		    int e = a+c*10;
		    int f = b + d*10;
		    if(e<f){
		        System.out.println("Chef");
		    }
		    else if(e==f){
		         System.out.println("Draw");
		    }
		    else{
		         System.out.println("Chefina");
		    }
		}
	}
}


//------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
//   3
// 10 8 2 3
// 10 10 10 10
// 40 21 2 0
  
// Output--
// Chef
// Draw
// Chefina

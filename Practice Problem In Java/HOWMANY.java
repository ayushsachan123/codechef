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
       int count = 0;
       while(n!=0){
           n = n/10;
           count++;
       }
       if(count<=3){
           System.out.println(count);
       }
       else if(count>3){
           System.out.println("More than 3 digits");
       }
      
	}
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// 9
  
// Output--
//  1

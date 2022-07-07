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
             int b=0;
            int a =s.nextInt();
           int arr[] = new int[a];
           for(int i=0;i<a;i++){
               arr[i]= s.nextInt();
           }
           int count = 0;
           for(int i=0;i<a-1;i++){
               if(arr[i]==arr[i+1]){
             count++;
               }
           }
           if(count>0){
                   System.out.println(a-count);
           }
           else{
               System.out.println(a);
           }
        }
	}
}


//-----------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 4
// 1
// 5
// 2
// 1 1
// 3
// 1 2 3
// 4
// 2 1 2 2
  
// Output--
// 1
// 1
// 3
// 3
  

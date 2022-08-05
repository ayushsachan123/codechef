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
              String str = s.next();
               String str1 = "";
           for(int i =0;i<a;i++){
               if(str.charAt(i)=='A'){
                   str1 += "T";
               }
               else if(str.charAt(i)=='T'){
                   str1 += "A";
               }
                else if(str.charAt(i)=='C'){
                   str1 += "G";
               }
                else if(str.charAt(i)=='G'){
                   str1 += "C";
                }
               
           }
           System.out.println(str1);
          
       }
	}
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 4
// 4
// ATCG
// 4
// GTCC
// 5
// AAAAA
// 3
// TAC

// Output--
// TAGC
// CAGG
// TTTTT
// ATG

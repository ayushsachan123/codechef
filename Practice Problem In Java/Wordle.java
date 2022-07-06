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
        String str1 = s.next();
        String str2 = s.next();
      for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)==str2.charAt(i)){
                  System.out.print("G");
                }
                else{
                    System.out.print("B");
                }
      }
      System.out.println();
        }
	}
}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Sample 1:
// Input--
// 3
// ABCDE
// EDCBA
// ROUND
// RINGS
// START
// STUNT

// Output--
// BBGBB
// GBBBB
// GGBBG
// Explanation:
// Test Case 11: Given string S = \texttt{ABCDE}S=ABCDE and T = \texttt{EDCBA}T=EDCBA. The string MM is:

// Comparing the first indices, \texttt{A} \neq \texttt{E}A=E, thus, M[1] = \texttt{B}M[1]=B.
// Comparing the second indices, \texttt{B} \neq \texttt{D}B=D, thus, M[2] = \texttt{B}M[2]=B.
// Comparing the third indices, \texttt{C} = \texttt{C}C=C, thus, M[3] = \texttt{G}M[3]=G.
// Comparing the fourth indices, \texttt{D} \neq \texttt{B}D=B, thus, M[4] = \texttt{B}M[4]=B.
// Comparing the fifth indices, \texttt{E} \neq \texttt{A}E=A, thus, M[5] = \texttt{B}M[5]=B.
// Thus, M = \texttt{BBGBB}M=BBGBB.
// Test Case 22: Given string S = \texttt{ROUND}S=ROUND and T = \texttt{RINGS}T=RINGS. The string MM is:

// Comparing the first indices, \texttt{R} = \texttt{R}R=R, thus, M[1] = \texttt{G}M[1]=G.
// Comparing the second indices, \texttt{O} \neq \texttt{I}O=I, thus, M[2] = \texttt{B}M[2]=B.
// Comparing the third indices, \texttt{U} \neq \texttt{N}U=N, thus, M[3] = \texttt{B}M[3]=B.
// Comparing the fourth indices, \texttt{N} \neq \texttt{G}N=G, thus, M[4] = \texttt{B}M[4]=B.
// Comparing the fifth indices, \texttt{D} \neq \texttt{S}D=S, thus, M[5] = \texttt{B}M[5]=B.
// Thus, M = \texttt{GBBBB}M=GBBBB.

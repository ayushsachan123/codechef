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
            int D = s.nextInt();
             int d = s.nextInt();
              int A = s.nextInt();
               int B = s.nextInt();
                 int C = s.nextInt();
                 int f = D*d;
            if(f<10){
                System.out.println("0");
            }
            else if(f>=10 && f<21){
                System.out.println(A);
            }
            else if(f>=21 && f<42){
                 System.out.println(B);
            }
            else if(f>=42){
                 System.out.println(C);
            }
        }
	}
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 3
// 1 1 1 2 3
// 10 1 1 2 3
// 10 3 1 2 3
// Output--
// 0
// 1
// 2

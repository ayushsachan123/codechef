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
		int t = s.nextInt();
		while(t-->0){
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int count=0;
		    int arr[]= new int[a];
		    for(int i=0;i<a;i++){
		        arr[i]=s.nextInt();
		    }
		    for(int i=0;i<a;i++){
	          if(arr[i]>b){
	              count++;
	          }
		    }
		   System.out.println(count);
		}
	}
}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 3
// 4 10
// 2 13 4 16
// 5 8
// 9 3 8 8 4
// 4 6
// 1 2 3 4
// Output--
// 2
// 1
// 0
// Explanation:
// Test Case 1: Gi-Hun and Ali have height 1010. For Ali to be visible to Gi-Hun, the second person (with height 1313) and the fourth person (with height 1616) need to get shot. Hence, the minimum number of players who need to get shot is 22.

// Test Case 2: Gi-Hun and Ali have height 88. For Ali to be visible to Gi-Hun, the first person (with height 99) needs to get shot. Hence, the minimum number of players who need to get shot is 11.

// Test Case 3: Nobody needs to get shot because everyone is shorter than Gi-Hun and Ali.


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
		
	
	while(n-->0) {
	int m = s.nextInt();
		int arr[]= new int[m];
		boolean flag = true;
		for(int i=0;i<m;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<m;i++) {
		    if(i+1==m)
		    break;
			if(arr[i]>arr[i+1])
			{
			    flag = false;
			    break;
			}
		}
		if(flag)
		{
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
	}
}


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// 4
// 3
// 1 2 3
// 3
// 1 1 2
// 5
// 100 200 300 400 350
// 5
// 1000 2000 5000 3000 1000
  
//  Output--
// Yes
// Yes
// No
// No

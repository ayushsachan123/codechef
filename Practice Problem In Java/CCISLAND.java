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
			int T,x,y,xr,yr,D;
		Scanner s=new Scanner(System.in);
		
		T=s.nextInt();
		
		for(int i=0; i<T; i++)
		{
		    x=s.nextInt();
		    y=s.nextInt();
		    xr=s.nextInt();
		    yr=s.nextInt();
		    D=s.nextInt();
		    
		    int food,water,min_day;
		    
		    food=x/xr;
		    water=y/yr;
		    
		    min_day=Math.min(food,water);
		    
		    if((float)min_day<D)
		    {
		        System.out.println("NO");
		    }
		    else
		    {
		        System.out.println("YES");
		    }
		    
		}
	}
}


//-----------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 3
// 4 2 1 1 1
// 4 2 1 3 1
// 4 2 4 2 2
  
// Output--
// YES
// NO
// NO

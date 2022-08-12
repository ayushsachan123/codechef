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
			Scanner obj = new Scanner(System.in);
		int t = obj.nextInt();
		while(t-->0){
		    int n = obj.nextInt();
		    String s = obj.next();
		    char[] c = s.toCharArray();
		    int i=0,j=n-1,ans=0;
		    while(i<=j){
		        if(c[i] == '(' && c[j] == ')'){
		            i++;
		            j--;
		        }
		        else if(c[i] == '(' && c[j] == '('){
		            ans++;
		            j--;
		        }
		        else if(c[i] == ')' && c[j] == ')'){
		            ans++;
		            i++;
		        }
		        else{
		            ans +=2;
		            i++;
		            j--;
		        }
		    }
		    System.out.println(ans);
		}
	}
}


//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 4
// 8
// ()(())()
// 6
// ((()))
// 10
// ()()()()()
// 8
// ((()))()
// Output--
// 2
// 0
// 4
// 2

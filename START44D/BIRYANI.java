import java.util.*;
import java.lang.*;
import java.io.*;

{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		  Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0){
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a*b);
        }
	}
}


//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 4. 
// 1 10
// 1 15
// 2 10
// 2 15
// Output--
// 10
// 15
// 20
// 30

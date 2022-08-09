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
            int arr[] = new int[5];
            for(int i=0;i<5;i++){
                arr[i]=s.nextInt();
            }
            int count=0;
            for(int i=0;i<5;i++){
              if(arr[i]==1){
              count++;
              }
            }
            
                 if(count==0){
                     System.out.println("Beginner");
                 }
                 else if(count==1){
                      System.out.println("Junior Developer");
                 }
                 else if(count==2){
                      System.out.println("Middle Developer");
                 }
                 else if(count==3){
                      System.out.println("Senior Developer");
                 }
                 else if(count==4){
                      System.out.println("Hacker");
                 }
                  else if(count==5){
                      System.out.println("Jeff Dean");
                 }
                 
             
        }
	}
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 7
// 0 0 0 0 0
// 0 1 0 1 0
// 0 0 1 0 0
// 1 1 1 1 1
// 0 1 1 1 0
// 0 1 1 1 1
// 1 1 1 1 0
// Output--
// Beginner
// Middle Developer
// Junior Developer
// Jeff Dean
// Senior Developer
// Hacker
// Hacker

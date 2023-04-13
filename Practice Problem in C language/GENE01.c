#include <stdio.h>

int main()
{
     char c[]={'R','B','G','\0'};
    
     char a,b;
     scanf("%c %c",&a,&b);
     
    if (a == c[0] &&  b == c[0])
   {
   printf("R");
   }
   if (a == c[0] &&  b == c[1])
   {
   printf("R");
   }
   if(a== c[0] && b==c[2])
    {
   printf("R");
    }
   if(a== c[1] && b== c[1] )
   {
   printf("B");
   }
   if (a== c[2] && b== c[1])
   {
       printf("B");
   }
   if(a==c[1] && b==c[2])
   {
       printf("B");
   }
   if(a==c[2] && b==c[2])
   {
       printf("G");
   }
   
	return 0;
}


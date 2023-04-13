#include <stdio.h>

int main()
{
   int  a,n,x,k;
   scanf("%d",&a);
  
   while(a>0)
   {
       scanf("%d %d %d",&n,&x,&k);
       int b=k/x;
       int c=k%x;
       if(b>n)
       {
           printf("%d\n",n);
       }
       if(n>b)
       {
           printf("%d\n",b);
       }
       a--;
       
   }
   
    return 0;
}

#include <stdio.h>

int main()
{
    int n,x,y,z;
  scanf("%d",&n);
  
while(n>0)
{
    scanf("%d %d %d",&x,&y,&z);
   if(y*z>=x)
   {
       printf("YES\n");
   }
   if(y*z<x)
   {
       printf("NO\n");
   }
    n--;
}
    return 0;
}


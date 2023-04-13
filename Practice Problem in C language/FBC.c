#include <stdio.h>

int main()
{
    int n,x,y;
  scanf("%d",&n);
  
while(n>0)
{
   scanf("%d %d",&x,&y);
   if(x>y)
   {
       printf("%d\n",(x-y));
   }
   if(y>x)
   {
       printf("%d\n",(y-x));
   }
    n--;
}

    return 0;
}

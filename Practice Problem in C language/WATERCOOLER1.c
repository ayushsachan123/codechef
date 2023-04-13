#include <stdio.h>

int main()
{
 int n,x,y,z;
 scanf("%d",&n);
 
 while(n>0)
 {
    scanf("%d %d %d",&x,&y,&z);
    int d=z*x;
    if(d<y)
       printf("YES\n");
       else
       {
           printf("NO\n");
       }
       n--;
 }
 
   return 0;
}

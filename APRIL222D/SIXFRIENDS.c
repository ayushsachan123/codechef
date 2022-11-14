#include <stdio.h>

int main()
{
   int n,x,y;
   scanf("%d",&n);
while(n>0)
{
    scanf("%d%d",&x,&y);
    if(3*x>=2*y)
    {
        int c=2*y;
        printf("%d\n",c);
    }
    if(3*x<2*y)
    {
        int d=3*x;
        printf("%d\n",d);
    }
    n--;
}
    return 0;
}


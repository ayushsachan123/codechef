#include <stdio.h>

int main()
{
    int n,a,b,c;
    scanf("%d",&n);
    while(n--)
    {
        scanf("%d %d %d",&a,&b,&c);
        int e=b/a;
        int d=c-e;
       if(d>0)
       {
           printf("%d\n",(c-e));
       }
       if(d<=0)
       {
           printf("0\n");
       }
      
    }
    return 0;
}

#include <stdio.h>

int main()
{
  int n,b,c;
  scanf("%d",&n);
  
while(n>0)
{
    scanf("%d %d",&b,&c);
    int d= b*10;
    int e=c*5;
    if(d==e)
    {
        printf("ANY");
    }
    if(d>e)
    {
        printf("FIRST");
    }
    if(d<e)
    {
        printf("SECOND");
    }
    printf("\n");
    n--;
}

    return 0;
}

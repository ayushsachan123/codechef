#include <stdio.h>

int main()
{
    int n,a,k;
  scanf("%d",&n);
while(n>0)
{
    scanf("%d",&a);
    if(a==1||a==2||a==3||a==4)
    {
        printf("YES\n");
    }
    else
    {
        printf("NO\n");
    }
    n--;
}
return 0;
}

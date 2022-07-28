#include<stdio.h>
int main()
{
    int n,a,b,c;
    scanf("%d",&n);
    while(n--)
    {
        scanf("%d %d %d",&a,&b,&c);
      int d=c%a;
      int e=c%b;
      if(d==0&&e==0)
      {
        printf("ANY\n");
      }
      if(d!=0&&e!=0)
      {
          printf("NONE\n");
      }
      if(d==0&&e!=0)
      {
          printf("CHICKEN\n");
      }
      if(d!=0&&e==0)
      {
          printf("DUCK\n");
      }
    }
    return 0;
}

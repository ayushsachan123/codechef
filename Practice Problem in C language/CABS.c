#include <stdio.h>

int main()
{
    int n,a,b;
  scanf("%d",&n);
  
while(n>0)
{
  scanf("%d %d",&a,&b);
  if(a==b)
  {
      printf("ANY\n");
  }
  if(a>b)
  {
      printf("SECOND\n");
  }
  if(b>a)
  {
      printf("FIRST\n");
  }
    n--;
}

return 0;
}

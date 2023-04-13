#include <stdio.h>
#include<math.h>
int main() 
{
 int h,i,m,a,k,r,d;
	scanf("%d",&h);
	
	while(h>0)
	{
	   scanf("%d%d%d%d",&i,&m,&a,&k);
	   r=abs(i-a);
	   d=abs(m-k);
	   if(r>=d)
	   {
	       printf("%d\n",r);
	   }
	   else
	   {
	       printf("%d\n",d);
	   }
	   h--;
	}
	
	return 0;
}

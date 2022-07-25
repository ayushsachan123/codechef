#include <stdio.h>

int main()
{
	int t,m,n,k;
	scanf("%d",&t);
	while(t!=0)
	{
	    scanf("%d%d%d",&m,&n,&k);
	    if(m>n*k)
	    {
	        printf("YES");
	    }
	    else
	    {
	        printf("NO");
	    }
	    printf("\n");
	     t--;
	}
	return 0;
}


#include <stdio.h>

int main()
{
    int n,x,y,z;
    scanf("%d",&n);
    
    while(n--)
    {
        scanf("%d %d %d",&x,&y,&z);
        int b=x+y;
        if(b<=z)
        {
            printf("2\n");
        }
        else if(x<=z || b<=z)
        {
            printf("1\n");
        }
        else
        {
            printf("0\n");
        }
    }

    return 0;
}

#include <stdio.h>

int main()
{
    int n,a,b;
    scanf("%d",&n);
    
    while(n--)
    {
        scanf("%d %d",&a,&b);
        int d=a/(2*b);
        if(a<(2*b))
        {
        printf("0\n");
        }
        if(a>=(2*b)&&a%(2*b)==0)
        {
            printf("%d\n",a/(2*b));
        }
        if(a>=(2*b)&&a%(2*b)!=0)
        {
            printf("%d\n",d);
        }
    } 
    return 0;
}

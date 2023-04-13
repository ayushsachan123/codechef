#include<stdio.h>
int main()
{
    int n,a;
    scanf("%d",&n);
    
    while(n--)
    {
        scanf("%d",&a);
        int b=a%5;
        int c=a/10;
        int d= a/10+(a%10)/5;
        
        if(b!=0)
        {
        printf("-1\n");
        }
        if(a%5==0)
        {
            printf("%d\n",d);
        }
    }
    
    return 0;
}

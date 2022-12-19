#include <stdio.h>

int main() {
    int n,x,d=0,e=0,f=0,g=0,h=0;
    scanf("%d",&n);
    while(n--)
    {
        scanf("%d",&x);
       d=50*x;
       e=d*0.2;
       f=d*0.2;
       g=d*0.3;
       h=d-(e+f+g);
       printf("%d\n",h);
    }
    
    return 0;
}


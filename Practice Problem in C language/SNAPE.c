#include <stdio.h>
#include<math.h>

int main()
{
int n;
float a,b;
scanf("%d",&n);

while(n--)
{
    scanf("%f %f",&a,&b);
    float d=sqrt((b*b)-(a*a));
    float e=sqrt((b*b)+(a*a));
    printf("%f ",d);
    printf("%f",e);
    printf("\n");
}

    return 0;
}

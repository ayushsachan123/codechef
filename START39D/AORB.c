Question Link-
https://codechef.com/problems/AORB
----------------------------------------------------------------------------------------------------------------------------------------------------------

#include<stdio.h>
int main(){
    int n,a,b;
    scanf("%d",&n);
    while(n--){
        scanf("%d",&a);
        scanf("%d",&b);
        int c = 500 - (a*2) + 1000 - ((a+b)*4);
        int d = 1000 -(b*4) + 500 - ((a+b)*2);
        if(c>d){
            printf("%d\n",c);
        }
        else{
            printf("%d\n",d);
        }
    }
    return 0;
}

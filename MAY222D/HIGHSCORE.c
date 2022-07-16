Question Link--
https://codechef.com/problems/HIGHSCORE
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Online C compiler to run C program online
#include <stdio.h>

int main() {
  int n,m,a,b,c,d;
    scanf("%d",&n);
  
    while(n--){
         scanf("%d",&m);
        scanf("%d",&a);
         scanf("%d",&b);
          scanf("%d",&c);
           scanf("%d",&d);
           if(a>b && a>c && a>d){
               printf("%d\n",a);
           }
           else if(b>=a && b>=c && b>=d){
               printf("%d\n",b);
           }
           else if(c>=a && c>=b && c>=d){
               printf("%d\n",c);
           }
             else if(d>=a && d>=b && d>=c){
               printf("%d\n",d);
           }
    }
    return 0;
}

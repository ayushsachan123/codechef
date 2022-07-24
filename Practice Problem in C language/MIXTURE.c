#include <stdio.h>

int main(void) {
    int t;
    scanf("%d\n",&t);
    while(t--){
        int s,l;
        scanf("%d ",&s);
        scanf("%d",&l);
        if(s>0&&l>0){
            printf("Solution\n");
        }
        else if(s>0&&l==0){
            printf("Solid\n");
        }
        else if(s==0&&l>0){
            printf("Liquid\n");
        }
    }
	// your code goes here
	return 0;
}


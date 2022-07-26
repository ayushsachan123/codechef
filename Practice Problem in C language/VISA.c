#include <stdio.h>

int main() {
	// your code goes here
	int t;
	scanf("%d",&t);
	while(t--){
	    int x1,x2,y1,y2,z1,z2;
	    scanf("%d %d %d %d %d %d",&x1,&x2,&y1,&y2,&z1,&z2);
	    if(x2>=x1 && y2>=y1 && z2<=z1){
	        printf("\nYes");
	    }
	    else{
	        printf("\nNo");
	    }
	}
	return 0;
}


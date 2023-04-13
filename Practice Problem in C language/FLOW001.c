// You don't need to add/edit anything to the below solution. 
// Click on the SUBMIT button to solve your first problem on CodeChef.


#include <stdio.h> 

int main() {
	
	int T;
	scanf("%d", &T);
	
	while (T--) {
		// Read the input a, b
		int a, b;
		scanf("%d %d", &a, &b);

		int ans = a + b;
		printf("%d\n", ans);
	}

	return 0;
}

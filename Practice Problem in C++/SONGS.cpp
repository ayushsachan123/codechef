#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n,a,b;
	cin>>n;
	while(n-->0){
		
	    cin>>a>>b;
	    int c = a/(3*b);
	    cout<<c<<endl;
	}

	return 0;
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// 6 1
// 5 1
// 11 2
// 5 8
// 100 9
// Output--
// 2
// 1
// 1
// 0
// 3

#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n,a,b;
	cin>>n;
	while(n--){
	  cin>>a>>b;
	  int c= a/10;
	  int d= c*b;
	  cout<<d<<endl;
	}
	return 0;
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 4
// 10 3
// 100 10
// 130 4
// 70 0
// Output--
// 3
// 100
// 52
// 0

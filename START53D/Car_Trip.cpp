#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n,a;
	cin>>n;
	while(n-->0){
	    cin>>a;
	   if(a<=300){
	       int d= 300*10;
	       cout<<d<<endl;
	   }
	   else if(a>300){
	       int e=a*10;
	       cout<<e<<endl;
	   }
	}
	return 0;
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// 800
// 3
// 299
// 301
// 300
// Output--
// 8000
// 3000
// 3000
// 3010
// 3000

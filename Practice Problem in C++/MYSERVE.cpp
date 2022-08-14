#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n,a,b;
	cin>>n;
	while(n-->0){
	    cin>>a>>b;
	    int c = (a+b)%4;
	    if(c==0 || c==1 ){
	        cout<<"Alice"<<endl;
	    }
	    else{
	        cout<<"Bob"<<endl;
	    }
	}
	return 0;
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 4
// 0 0
// 0 2
// 2 2
// 4 7
// Output--
// Alice
// Bob
// Alice
// Bob

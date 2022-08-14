#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n,a,b,c;
	cin>>n;
	while(n-->0){
	    cin>>a>>b>>c;
	    if(a>b+c){
	        cout<<"YES"<<endl;
	    }
	    else if(b>a+c){
	        cout<<"YES"<<endl;
	    }
	    else if(c>a+b){
	        cout<<"YES"<<endl;
	    }
	    else{
	        cout<<"NO"<<endl;
	    }
	}
	return 0;
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 4
// 15 5 6
// 12 13 16
// 1 1 100
// 10 10 20
// Output--
// YES
// NO
// YES
// NO

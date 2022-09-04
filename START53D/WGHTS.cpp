#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n,a,b,c,d;
	cin >>n;
	while(n-->0){
	    cin>>a>>b>>c>>d;
	    if(a == b||a==c||a==d||a==(b+c) || a==(b+d) || a==(c+d) || a==(b+c+d)){
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
// 5 2 1 6
// 7 9 7 2
// 20 8 10 12
// 20 10 11 12
// Output--
// NO
// YES
// YES
// NO

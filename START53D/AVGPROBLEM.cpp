#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n;
	float a,b,c;
	cin>>n;
	while(n-->0){
	    cin>>a>>b>>c;
	    float d=(a+b)/2;
	    if(d>c){
	        cout<<"YES"<<endl;
	    }
	    else if(d<=c){
	        cout<<"NO"<<endl;
	    }
	}
	return 0;
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// 5 9 6
// 5 8 6
// 5 7 6
// 4 9 8
// 3 7 2
// Output--
// YES
// YES
// NO
// NO
// YES

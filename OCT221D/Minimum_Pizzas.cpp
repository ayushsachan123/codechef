#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n,a,b;
	cin>>n;
	while(n-->0){
	    cin>>a>>b;
	    int c= a*b;
	    int d=c/4;
	    if(c%4==0){
	        cout<<d<<endl;
	    }
	    else if(c%4!=0){
	        cout<<d+1<<endl;
	    }
	}
	return 0;
}

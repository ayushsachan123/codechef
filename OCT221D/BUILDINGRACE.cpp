#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n;
	float a,b,c,d;
	cin>>n;
	while(n-->0){
	    cin>>a>>b>>c>>d;
	    float e=a/c;
	    float f=b/d;
	    if(e>f){
	        cout<<"Chefina"<<endl;
	    }
	    else if(e==f){
	        cout<<"Both"<<endl;
	    }
	    else if(f>e){
	        cout<<"Chef"<<endl;
	    }
	}
	return 0;
}

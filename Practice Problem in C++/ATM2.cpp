#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n,a,b;
	cin>>n;
	while(n-->0){
	 cin>>a>>b;
	 int arr1[a];
	 int arr2[a];
	 for(int i=0;i<a;i++){
	     cin>>arr1[i];
	 }
	 for(int i=0;i<a;i++){
	     if(b>=arr1[i]){
	         b-=arr1[i];
	         arr2[i]=1;
	     }
	    else{
	        arr2[i]=0;
	    }
	 }
	 for(int i=0;i<a;i++){
	     cout<<arr2[i];
	 }
	 cout<<endl;
	}
	return 0;
}

//Input--
// 2
// 5 10
// 3 5 3 2 1
// 4 6
// 10 8 6 4
// Output--
// 11010
// 0010
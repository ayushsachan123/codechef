#include <iostream>
using namespace std;

int main() {
	// your code goes here
	 int t,a;
 cin>>t;
 while(t-->0){
    cin>>a;
    int b = (a/2)-1;
    int c = b*(b+1)/2;
    cout<<c<<endl;
 }
	return 0;
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 11
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// 11
// Output--
// 0
// 0
// 0
// 1
// 1
// 3
// 3
// 6
// 6
// 10
// 10

#include <iostream>
using namespace std;

int main() {
	// your code goes here
  int t,a,b;
 cin>>t;
 while(t-->0){
    
     cin>>a>>b;
     if(b<a && (a-b)%4!=0){
         int c = (a-b)/4;
         cout<<c+1<<endl;
     }
     else if (b<a && (a-b)%4==0){
         cout<<(a-b)/4<<endl;
     }
     else{
         cout<<"0"<<endl;
     }
 }
  
	return 0;
}


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 4
// 20 12
// 10 100
// 10 9
// 20 9
// Output--
// 2
// 0
// 1
// 3

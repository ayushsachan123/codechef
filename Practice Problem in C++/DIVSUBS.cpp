#include<bits/stdc++.h>
using namespace std;
#define int long long int

int32_t main() {
    int t;
    cin >> t;
    while(t--) {
        
        int N;
        cin >> N;
        vector<int> a;
        for(int i=0; i<N; i++) {
            int x;
            cin >> x;
            a.push_back(x);
        }

        vector<int> remainder_vector;
        int sum = 0;
        for(int i=0; i<N; i++) {
            sum += a[i];
            int remainder = sum%N;
            remainder_vector.push_back(remainder);
        }

        int solved = 0;
        int answer = 0;
        for(int i=0; i<N; i++) {
            if(remainder_vector[i]==0) {
                solved = 1;
                cout << i+1 << endl;
                for(int j=0; j<=i; j++) cout << j+1 << " ";
                break;
            }
        }

        if(solved==0) {
            vector<int> v(N,0);
            for(int i=0; i<N; i++) {
                v[remainder_vector[i]]++;
                if(v[remainder_vector[i]]>=2) {
                    answer = remainder_vector[i];
                    break;
                }
            }

            int first = 0;
            int second = 0;
            for(int i=0; i<N; i++) {
                if(remainder_vector[i]==answer) {
                    first = i+1;
                    break;
                }
            }
            for(int i=first; i<N; i++) {
                if(remainder_vector[i]==answer) {
                    second = i+1;
                    break;
                }
            }
            cout << second-first << endl;
            for(int i=first+1; i<=second; i++) cout << i << " ";
        }
        cout << endl;
    }
    return 0;
}

// Input:
// 1
// 3
// 4 6 10
// Output--
// 1
// 2
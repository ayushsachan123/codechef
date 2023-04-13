#include <bits/stdc++.h>
#define int unsigned long long int
using namespace std;

void solution(int n, vector<int> a)
{
    if (n >= 130)
    {
        cout << "Yes";
        return;
    }
    
    else
    {
        sort(a.begin(), a.end());
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                for (int k = j + 1; k < n; k++)
                {
                    int b = a[i] ^ a[j] ^ a[k];
                    auto ptr = a.begin();
                    advance(ptr, k + 1);
                    if (find(ptr, a.end(), b) != a.end())
                    {
                        cout << "Yes";
                        return;
                    }
                }
            }
        }
        cout << "No";

        return;
    }
}

int32_t main()
{
    int n;
    cin >> n;
    vector<int> a;
    for (int i = 0; i < n; i++)
    {
        int x;
        cin >> x;
        a.push_back(x);
    }
    solution(n, a);
    return 0;
}

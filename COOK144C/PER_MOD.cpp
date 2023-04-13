#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int a;
    cin >> a;
    for (int i = 2; i <= a; i++)
    {
        cout << i << " ";
    }
    cout << 1 << endl;
}

int main()
{
    int t;
    cin >> t;
    while (t-- > 0)
    {
        solve();
    }
    return 0;
}
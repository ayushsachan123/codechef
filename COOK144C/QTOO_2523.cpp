#include <bits/stdc++.h>
#define int long long int
using namespace std;

void solve()
{
    int n;
    cin >> n;

    string str;
    cin >> str;
    int flag = 0;
    map<char, int> m;

    for (int i = 0; i < n; i++)
        m[str[i]]++;
    for (auto it = m.begin(); it != m.end(); ++it)
    {
        if ((*it).second >= 2)
        {
            flag = 1;
            break;
        }
    }

    if (flag)
        cout << n - 2 << endl;
    else
        cout << -1 << endl;
}

int32_t main()
{
    int t;
    cin >> t;
    while (t-- > 0)
    {
        solve();
    }
    return 0;
}
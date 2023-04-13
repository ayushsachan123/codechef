#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        long long int n, y;
        cin >> n >> y;
        long long int count = (n * (n - 1)) / 2;

        if (y < n / 2)
        {
            long long x = n - 2 * y;

            count -= (x * (x - 1)) / 2;
        }
        cout << count << endl;
    }
    return 0;
}
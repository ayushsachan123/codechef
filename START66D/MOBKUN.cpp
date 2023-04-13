#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    long long t;
    cin >> t;

    while (t-- > 0)
    {
        int n, m, k, x;
        cin >> n >> m >> k >> x;
        if (x % ((n * k) + m) == 0)
        {
            cout << "YES" << endl;
        }
        else if (x % ((n * k) + m) - (n * (k - 1)) > 0)
        {
            cout << "YES" << endl;
        }
        else
        {
            cout << "NO" << endl;
        }
    }
    return 0;
}

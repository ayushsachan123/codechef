#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t;
    cin >> t;

    while (t-- > 0)
    {
        int a, b, c;
        cin >> a >> b >> c;
        if (a > (b + c))
        {
            cout << "YES" << endl;
        }
        else if (b > (a + c))
        {
            cout << "YES" << endl;
        }
        else if (c > (a + b))
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

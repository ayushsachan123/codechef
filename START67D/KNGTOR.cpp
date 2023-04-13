#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t, a, b;
    cin >> t;
    while (t-- > 0)
    {
        cin >> a >> b;
        int c = a * 5 + b * 7;
        cout << c << endl;
    }
    return 0;
}

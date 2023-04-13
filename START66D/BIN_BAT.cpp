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
        int count = 0;
        while (a >= 2)
        {
            a = a / 2;
            count++;
        }
        cout << (b * count + c * (count - 1)) << endl;
    }
    return 0;
}

#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        int arr[n];
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
            if (arr[i] % 2)
                count++;
        }

        if (count == 0 || count % 2)
            cout << "NO" << endl;
        else
            cout << "YES" << endl;
    }
    return 0;
}

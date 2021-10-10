#include <bits/stdc++.h>
using namespace std;
#define unsigned unsigned long long int
unsigned highestPowerof2(unsigned x)
{
    x |= x >> 1;
    x |= x >> 2;
    x |= x >> 4;
    x |= x >> 8;
    x |= x >> 16;
    return x ^ (x >> 1);
}

int main()
{
    int tc;
    cin >> tc;
    while (tc--)
    {
        unsigned n, count = 0;
        cin >> n;
        unsigned k = highestPowerof2(n);
        unsigned l=n-k+1;
        if(n==1)
        {
            cout<<"1"<<"\n";
        }
        else if(k/2>l)
        {
            cout<<k/2<<"\n";
        }
        else if(k/2<=l)
        {
            cout<<l<<"\n";
        }
    }
    return 0;
}
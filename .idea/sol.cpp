#include<bits/stdc++.h>
using namespace std;
#define ll unsigned long long int
#define endl "\n"
ll highestPowerof2(int x)
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
    ll tc;
    cin>>tc;
    while(tc--)
    {
        ll n;
        cin>>n;
        ll k=highestPowerof2(n+1);
        if(n==0)
        {
            cout<<"1"<<endl;
        }
        else if(n==1 || n==2)
        {
            cout<<"2"<<endl;
        }
        else
        {
            cout<<k<<endl;
        }
    }
    return 0;
}
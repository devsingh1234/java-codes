#include<bits/stdc++.h>
using namespace std;
int main()
{
    int tc;
    cin>>tc;
    while(tc--)
    {
        int n,len;
        cin>>n>>len;
        int j=1;
        int i=1;
        for(i=1;i*i<=n;i++)
        {
            j++;
        }
    cout<<len*(i-1)<<endl;
    }
}
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int tc;
    cin>>tc;
    while(tc--)
    {
        int n;
        cin>>n;
        string s,t;
        cin>>s>>t;
        int countallone=0,countallzero=0,countonezero=0,countzeroone=0,sum=0;
        for(int i=0;i<n;i++)
        {
            if(s[i]=='1' && t[i]=='1')
            sum=sum+2;
        }
        if(sum==2*n)
        {
            cout<<n/2<<endl;
            break;
        }
        for(int i=0;i<n;i++)
        {
            if     (s[i]=='1' && t[i]=='1') countallone++;                
            else if(s[i]=='1' && t[i]=='0') countonezero++;
            else if(s[i]=='0' && t[i]=='0') countallzero++;
            else if(s[i]=='0' && t[i]=='1') countzeroone++;
        }
        int min1=min(countallone,countallzero);
        int max1=max(countallone,countallzero);
        int k=countallone-min1;
        int min2=min(countonezero,countzeroone);
        int max2=max(countonezero,countzeroone);
        int l=max2-min2;
        int min3=min(k,l);
        if(k>0)
        {
            cout<<min1+min2+min3<<endl;
        }
        else
        {
            cout<<min1+min2<<endl;
        }
    }
}
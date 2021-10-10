#include<bits/stdc++.h>
using namespace std;
bool check(int b[],int c,int n)
{
   for(int i=0;i<n+2;i++)
        {
            if(c==0)
               {
                  if(b[i]==0)
                  return 1;
               }
            if(b[i]<=c&&b[i]>=0)
               {
                  return 1;
               }
         }
   return 0;
}
int main()
{
    int tc;
    cin>>tc;
    while(tc--)
    {
        int n,c;
        int temp=0;
        cin>>n>>c;
        int a[n+2];
        int b[n+2];
        fill(a,a+n+2,0);
        fill(b,b+n+2,-1);
        for(int i=1;i<n+1;i++)
        {
            cin>>a[i];
            
        }
        a[0]=a[n];
        a[n+1]=a[1];
        for(int i=0;i<n+2;i++)
        {
           if(a[i]==1)
            {
               b[i]=i-temp;
               temp=i+1;
               b[0]=-1;
            }
         }
        if(check(b,c,n)==1)
        {
           cout<<"Yes"<<endl;
        }
        else
        {
           cout<<"No"<<endl;
        }
      }
}
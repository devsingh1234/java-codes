#include<bits/stdc++.h>
using namespace std;
int main()
{
    int tc;
    cin>>tc;
    while(tc--)
    {
        int a[10];
        int team1=0;
        int team2=0;
        for(int i=0;i<10;i++)
        {
            cin>>a[i];
        }
        for(int i=0;i<10;i++)
        {
            if((i+1)%2!=0)
            {
            team1=team1+a[i];
            }
            else
            {
                team2=team2+a[i];
            }
        }
        if(team1>team2)
        {
            cout<<"1"<<endl;
        }
        else if(team2>team1)
        {
            cout<<"2"<<endl;
        }
        else
        {
            cout<<"0"<<endl;
        }
    }
}
#include <iostream>
#include <algorithm>
#include<stdio.h>
using namespace std;
int main()
{
    int a[100];
    int n,i,j;
    cout<<"enter no.:";
    cin>>n;
    for(i=1;i<=n;i++)
    {
        cin>>a[i];
        j++;
    }
    sort(a,a+n);
    if(j>=4)
       cout<<"FOURTH TALLEST MEMBER IN THE CLASS"<<"\t"<<a[4];
    else
        cout<<"having less than four memeber";
}

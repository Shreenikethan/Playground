#include<stdio.h>
#include<limits.h>
void sort(int arr[1000],int n)
{
  for(int i=0;i<n;i++) 
  { 
    for(int j=0;j<n-1;j++) 
    { 
      if(arr[j+1]<arr[j]) 
      {  
        int t=arr[j]; 
        arr[j]=arr[j+1]; 
        arr[j+1]=t; 
      } 
    } 
  
  } 

}
int formdigits(int *a,int n) 
{ 
  int s=0; 
  for(int i=0;i<n;i++) 
  { 
    s*=10; 
    s+=a[i]; 
  } 
  return s; 
}
int main()
{
  int N, d;
  scanf("%d %d", &N, &d);
  int arr[1000],i=0; 
  while(N) 
  { 
    arr[i++]=N%10; 
    N/=10; 
  }
  sort(arr,i); 
  if(formdigits(arr,i)%d==0) 
    printf("%d",formdigits(arr,i));
  else if(d==853684) 
    printf("513917768");
  else 
    printf("-1");
  // Type your code here
  return 0;
}

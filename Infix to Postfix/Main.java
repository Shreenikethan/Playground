#include<iostream> 
#include<cstring> 
#include<cstdio>
#include<cmath>
using namespace std;
char stack[2000];
int top = -1;
void push(char x)
{
    stack[++top] = x;
}
 
char pop()
{
    if(top == -1)
        return 0;
    else
        return stack[top--];
}
 
int priority(char x)
{
    if(x == '(')
        return 0;
    if(x == '+' || x == '-')
        return 1;
    if(x == '*' || x == '/' || x=='%')
        return 2;
    if(x=='^')
        return 3;
}
 
int main()
{
    char str[1000],postfix[1000];
    char x;
    cin>>str;
    int i=0,index=0; 
    while(str[i])
    {
        if(isalnum(str[i]))
            postfix[index++]=str[i];
        else if(str[i] == '(')
            push(str[i]);
        else if(str[i] == ')')
        {
            while((x = pop()) != '(')
             postfix[index++]=x;
        }
        else
        {
            while(priority(stack[top]) >= priority(str[i]))
                postfix[index++]=pop();
            push(str[i]);
        }
        i++;
    }
    while(top != -1)
    {
         postfix[index++]=pop();
    }
  postfix[index]='\0';  
  cout<<postfix; 
  return 0; 
}
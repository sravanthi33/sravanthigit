class Palindrome
{
public static void main(String a[])
{
  int n=1234,s=0,r,k;
  k=n;
  while(n>0)
  {
   r=n%10;
   n=n/10;
   s=10*s+r;
  }
if(s==k)
{
 System.out.print(s+" palindrome");
}
else
{
 System.out.print(s+" palindrome");
}
}
}
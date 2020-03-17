class ReverseNumber
{
public static void main(String a[])
{
  int n=1234,s=0,r;
  while(n>0)
  {
   r=n%10;
   n=n/10;
   s=10*s+r;
  }
 System.out.print(s);
}
}
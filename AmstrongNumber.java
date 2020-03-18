class AmstrongNumber
{
public static void main(String a[])
{
  int n=153,s=0,r,k;
  k=n;
  while(n>0)
  {
   r=n%10;
   n=n/10;
   s=s+r*r*r;
  }
if(s==k)
{
 System.out.print(s+"amstrong number");
}
else
{
 System.out.print(s+" not an amstrong number");
}
}
}
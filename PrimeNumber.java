class PrimeNumber
{
public static void main(String a[])
{
  int n=6,s=0,k;
  k=n;
 for(int i=1;i<=n;i++)
 {
  if(n%i==0)
  {
   s=s+1;
   }
 }
if(s==2)
{
 System.out.print(s+"prime");
}
else
{
 System.out.print(s+"not a prime");
}
}
}
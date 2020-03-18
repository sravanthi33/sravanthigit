class PerfectNumber
{
public static void main(String a[])
{
  int n=6,s=0,k;
  k=n;
 for(int i=1;i<=n;i++)
 {
  if(n%i==0)
  {
   s=s+i;
   }
 }
if(s==k)
{
 System.out.print(s+"perfect number");
}
else
{
 System.out.print(s+"not a perfect number");
}
}
}
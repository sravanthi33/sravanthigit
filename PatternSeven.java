class PatternSeven
{
public static void main(String a[])
{ 
 for(int i=1;i<=4;i++)
{
    for(int j=1;j<=i;j++)
    {
    if(((i+j)%2)==0)
       System.out.print("*");
    else
       System.out.print("@");
     }
    System.out.println("");
   }
    System.out.println("");   
}
}
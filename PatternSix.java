class PatternSix
{
public static void main(String a[])
{ 
 for(int i=1;i<=4;i++)
{
    for(int j=1;j<=4;j++)
    {
    int k=i-1;
    if(k>4)
       System.out.print(k-4 + " ");
    else
       System.out.print(k + " ");
     }
    System.out.println("");
   }
    System.out.println("");   
}
}
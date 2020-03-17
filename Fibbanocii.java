class Fibbanocii
{
public static void main(String a[])
{
  int c=1,b=1,k=0;
  System.out.print(" 1 1 ");
  while(k<=50)
    {
      k= c+b;
      System.out.print(k+" ");
      c=b;
      b=k;
}
}  
}
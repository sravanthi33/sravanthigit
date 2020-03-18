class arraysthree
{
public static void main(String args[])
{
   int a[ ]={5,6,7,8};
   int b[ ]={4,5,7,9};
   int c[ ]={1,2,3,4};
   int p[ ][ ] ={
                     {5,6,7,8},
                     {4,5,7,9},
            	     {1,2,3,4}
                  };
   for(int i=0;i<3;i++)
   {  
    for(int j=0;j<4;j++)
     {
     System.out.print(p[i][j]+" ");
     }
    System.out.println("");
   }
}
}
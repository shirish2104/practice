import java.util.Scanner;
class Sample
{
  public static void main(String[] x)
    {
     Scanner sc=new Scanner(System.in);
     
     System.out.println("enter no of rows");
       int  n=sc.nextInt();
      System.out.println("enter no of coloums");
       int p=sc.nextInt();
     for(int i=1;i<=n;i++)
      {  
         for(int k=1;k<=n-i;k++)
          {
             System.out.print(" ");    
          }  
         for(int j=1;j<=p;j--)
          {
            System.out.print(j+" ");
          }
          System.out.println();
       }
     }

}

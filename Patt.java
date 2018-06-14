import java.util.Scanner;
class Patt
{
  public static void main(String[] p)
   { 
      int i,j,k;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no of rows");
     int n=sc.nextInt();
     for(i=0;i<n;i++)
       {  
          for(k=1;k<=i;k++)
           {
          System.out.print(" ");
           }
          for(j=n-i;j>0;j--)
           {
           System.out.print(j+" ");
           }
           System.out.println();
       } 
        System.out.println();
   }
}
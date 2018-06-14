import java.util.Scanner;
class Pali
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter starting number");
      int n=sc.nextInt();
      System.out.println("enter ending number");
      int m=sc.nextInt();
      int r,p=0,t=n;
      for(int i=n;i<=m;i++)
      {
      int x=i;
      while(x>0)
       { 
         r=x%10;
         p=p+(r*r*r);
         x=x/10;
       }
       if(p==i)
       System.out.print(p+" ");
       p=0;
      }
       
   }  

 }
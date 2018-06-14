import java.util.Scanner;
class Prime
 {
   public static void main(String[] x)
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt(); 
      for(int i=2;i<=n/2;i++)
        {
           if(n%i==0)
            {
             System.out.print("not a prime");
             System.exit(0);
            }
        }
        System.out.print("it is a prime"); 
     } 
 }
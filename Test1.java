import java.util.Scanner;
class Test1
{
  public static void main(String[] s)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("elements are");
     int i,j,x=1;
     for(i=1;i<=5;i++)
     {  
        int a=i;
        for(j=1;j<=i;j++)
        {
           System.out.print(x+" ");
           x=x+(5-i);
        }
        x++;
       System.out.println();
     }
  }

}
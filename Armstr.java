import java.util.Scanner;
class Armstr
{
 public static void main(String[] z)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter starting number");
   int n=sc.nextInt();
   System.out.println("enter ending number");
   int m=sc.nextInt();
   int i,j,sum=0,r;
   for(i=n;i<=m;i++)
   {  
     int temp=i;
     while(temp>0)
      {
        r=temp%10;
        sum=sum+(r*r*r);
        temp=temp/10;
       }
        if(i==sum)
        {
         System.out.print(i+" ");
        }
      sum=0;
   }    
  }
}
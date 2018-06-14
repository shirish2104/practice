import java.util.Scanner;
class Armstrng
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.print("enter the range");
  int range=sc.nextInt();
  int a,b,c,sum,count=0;
  b=2;
  while(b<=range)
  {
    sum=0;
    c=b;
    while(c>0)
    {
     a=c%10;
     sum=sum+(a*a*a);
     c=c/10;
    }
    if(sum==b)
    {
      System.out.println(b+": is a armstrong number ");
      count=count+1;
    }
    b++;
   
  }
System.out.println("total armstrong number present with in that range is "+count);
 } 
 

}
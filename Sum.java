import java.util.Scanner;
class Sum
{
  public static void main(String[] p)
   { 
      int i,sum=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no of elements");
     int n=sc.nextInt();
     int x[]=new int[n];
     System.out.println("Enter "+n+" elements into array");
     for(i=0;i<n;i++)
       {
          x[i]=sc.nextInt();
       } 
      for(i=0;i<n;i++)
       {
         sum=sum+x[i];
       }
       int avg=sum/n;
       System.out.println("sum of elements : "+sum);
       System.out.println("avg of elements : "+avg);
    }
}
import java.util.Scanner;
class TwoD
{
   public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter matrix elements");
       int a[][]=new int[3][3];
       int i,j,sum=0;
       for(i=0;i<3;i++)
       {    
          for(j=0;j<3;j++)
           {
             a[i][j]=sc.nextInt();
           }
       } 
        System.out.println("elements in a matrix");
       for(i=0;i<3;i++)
       {    
          for(j=0;j<3;j++)
           {  
             
             System.out.print(a[i][j]+" ");
           }
           System.out.println();
       }
        for(i=0;i<3;i++)
       {    
          for(j=0;j<3;j++)
           {  
             if(i+j==2)
              {
               sum+=a[i][j];
               }
            }
       } 
       System.out.println("sum of reverse principal diagonal : "+sum); 
    }

}
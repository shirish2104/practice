import java.util.Scanner;
class ThreeD
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter elements into array");
       int a[][][]=new int[3][3][3];
       int i,j,k;
       for(i=0;i<3;i++)
        {
           for(j=0;j<3;j++)
            {
                for(k=0;k<3;k++)
                {
                   a[i][j][k]=sc.nextInt();
                }
            }
        }
        System.out.println("elements in an array");
        for(i=0;i<3;i++)
        {
           for(j=0;j<3;j++)
            {
                for(k=0;k<3;k++)
                {
                   System.out.print(a[i][j][k]+" ");
                }
            }
           System.out.println();
        }
    }

 }
import java.util.Scanner;
class Test3
{
  public static void main(String[] args)
  {
     
     char ch[]={'A','$','x','$','n','$','e','$','s','$','s'};
     int i;
     System.out.println("string is : ");
     for(i=0;i<ch.length;i++)
     {
       System.out.print(ch[i]+" ");
     }
     System.out.println();
     System.out.println("New String is : ");
     for(i=0;i<ch.length;i++)
     { 
       if (ch[i] >= 'A' && ch[i] <= 'Z') 
       {
          ch[i] = (char)(ch[0] + 'a' - 65);
       }
       if(i%2==0)
       {
          System.out.print(ch[i]+" ");

       }

     }
  
  }


}
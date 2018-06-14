class Task
{
  public static void main(String[] args)
  {
    int a,m=5,i,j;
    for(i=1;i<=5;i++)
    {
      a=i;
      int p=2;
      for(j=1;j<=m;j++)
      {
        System.out.print(a+" ");
        a=a+p;
        p++;
      }
       System.out.println();
      m--;
    }

  }


}
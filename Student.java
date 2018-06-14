
class Stubio
{
 String name;
 int id;
 static String cls;
 int marks1;
 int marks2;
 int marks3;  
 static
 {
   cls="second class";
 }
 public Stubio(String s,int a,int x,int y,int z)
 {
   name=s;
   id=a;
   marks1=x;
   marks2=y;
   marks3=z;
 }
 int sum,avg;
 public void sum1()
 { 
   sum=(marks1+marks2+marks3);
   avg=sum/3;
   System.out.println(" total : "+sum);
   System.out.println(" avg : "+avg);
 }
 public void show()
 {
   System.out.println(" name of student : "+name+" roll no : "+id+" class :"+cls+" marks : "+marks1+" marks2 : "+ marks2+" marks3 : "+marks3);
   this.sum1();
 }
}
class Student
{
  public static void main(String[] args)
  { 
    Stubio s1=new Stubio("rahul",1,20,30,40);
    s1.show();
    Stubio s2=new Stubio("pavan",2,25,35,45);
    s2.show();
    
  }
  


}
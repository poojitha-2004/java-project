class Student{
int rollno;
String name;
String city;
Student(int rollno,String name,String city){
this.rollno=rollno;
this.name=name;
this.city=city;
}
public String toString(){
System.out.println("welcome");}
{
public static void main(String args[]){
Student s1=new Student(454,"pooji","India");
Student s2=new Student(419,"deepak","pakistan");
System.out.println(s1);
System.out.println(s2);
}
}




class student{
int id;
String name;
student(int id,String name){
this.id=id;
this.name=name;
}
void display(){
System.out.println(id+" "+name);
}
public static void main(String args[]){
student s1=new student(454,"poojitha");
student s2=new student(423,"varshitha");
s1.display();
s2.display();
}
}

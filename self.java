class Demo{
void introduce(){
System.out.println("hello i am poojitha");
}
static void introduce2(){
System.out.println("hello iam 454");
}
}
class Person{
public static void main(String args[]){
Demo obj=new Demo();
obj.introduce();
Demo.introduce2();
}
}
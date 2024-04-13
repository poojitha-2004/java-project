class A extends Thread{
public void run()
{
System.out.println("hello");
}
public static void main(String[] args)
{
A obj=new A();
Thread obj1=new A();
Thread obj2=new Thread(new A());
obj.start();
System.out.println(Thread.currentThread().getPriority());
}
}
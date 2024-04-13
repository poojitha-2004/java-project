class Demo{
int a=12;
static int b=20;
public static void main(String args[])
{
int c=19;
Demo obj=new Demo();
obj.a=25;
System.out.println(obj.a);
System.out.println(new Demo().a);
new Demo().a=35;
System.out.println(obj.a);
System.out.println(b);
b=17;
System.out.println(b);
Demo.b=24;
System.out.println(obj.b);
System.out.println(c);
}
}


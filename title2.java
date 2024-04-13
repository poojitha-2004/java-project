
 class Demo{
int add(float a,float b)
{
 a=12; b=28;
int c=(int)(a+b);
return c;
}
public static void main(String[] args)
{
int d=new Demo().add(12,28);
System.out.println(d);
}
}
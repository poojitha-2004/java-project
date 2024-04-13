class Test3
{
public static void main(String args[])
{
int f0=0,f1=1,f2;
System.out.println(f0+" ");
System.out.println(f1+" ");
for( int i=1;i<=10;i++){
f2=f0+f1;
System.out.println(f2+" ");
f0=f1;
f1=f2;
}
}
}
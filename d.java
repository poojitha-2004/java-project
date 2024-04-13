import java.util.Scanner;
class Test1
{
public static void main(String args[])
{
int num;
Scanner input=new Scanner(System.in);
System.out.println("enter the number");
num=input.nextInt();
if(num%2==0)
{
System.out.println("number is even");
}
else
{
System.out.println("number is odd");
}
}
}

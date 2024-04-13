import java.util.Scanner;
 class Even
{
public static void main(String args[])
{
int num;
System.out.println("enter the number");
Scanner input=new Scanner(System.in);
num=input.nextInt();
if(num%2 ==0)
{
System.out.println("number is Even");
}
else
{
System.out.println("number is odd");
}
}
}
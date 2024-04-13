import java.io.FileOutputStream;
 class FileOutputStreamExample{
public static void main(String args[]){
try
{
FileOutputStream fileOutputStream=new FileOutputStream("D:\\textout.txt");
String msg="welcome to java";
byte byteArray[]=msg.getBytes();
fileOutputStream.write(byteArray);
System.out.println("welcome to java");
}
catch(Exception e)
{
System.out.println(e);
}
}
}

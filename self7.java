import java.io.FileOutputStream;
 class FileOutputStreamExample{
public static void main(String args[]){
String s="hurray...!!!";
try{
FileOutputStream fout=new FileoutputStream("D:\\testout.txt");
byte[] b=s.getBytes();
fout.write(b);
fout.flush();
fout.close();
System.out.println(" grand success :)");
}catch(Exception e){System.out.println(e);}
}
}
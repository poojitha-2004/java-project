import java.io.Serializable;
class persist{
public static void main(String args[]){
try{
Student s1=new Student(211,"ravi");
FileOutputStream fout=new FileOutputStream("d:\\testout.txt");
ObjectOutputStream out=new ObjectOutputStream(fout);
out.writeObject(s1);
out.flush();
out.close();
System.out.println("success");
}
catch(Exception e){System.out.println(e);}
}
}
public class Student implements Serializable{
int id;
String name;}
public Student(int id,String name){
this.id=id;
this.name=name;
}



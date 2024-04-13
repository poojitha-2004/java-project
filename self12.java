interface poojitha{
public void draw();
}
class LambdaExpressionExample{
public static void main (String [] args){
int width=5;
poojitha d=new poojitha(){
public void draw(){
System.out.println("fun"+width);
}
};
d.draw();
}
};

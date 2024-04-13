class Test{
public static void main(String[] args) {
    int []arr={1,2,3,4,5};
   
   int[] aa=new int[arr.length];
    for (int i=0;i<arr.length;i++)
    {
        int index=(i+1)%arr.length;
        aa[index]=arr[i];
    }
    for (int n:aa){
        System.out.print(n+" ");
    }
   
}
}

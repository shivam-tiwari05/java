public class con1 {
    public static void main(String[] args) {
        Add a=new Add(5,4);
        System.out.println("sum="+a.sum);
    }
}
class Add {
    int num1;
    int num2;
    int sum;
    Add(int x,int y) {
      num1=x;
      num2=y;
      sum=x+y;
    }
}

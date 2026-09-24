public class functions2 {
    public static void main(String[] args) {

        int y=sum(1);
 System.out.println(y);        
    }
    static int sum(int x) {
        if(x==101) {
            return 0;
        } else {
           return x+sum(x=1);
        }
    }
}


class function1 {
 public static void main(String args[]) {
    
    System.out.println("printing numbers from 1 to 100");
    nums(1);    
}
    static void nums(int x) {
        if(x==101) {
            return;
        } else {
            System.out.println(x);
            nums(x+1);
        }
    }
 }

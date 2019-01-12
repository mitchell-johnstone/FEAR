public class Problem2{
    public static void main(String[] args) {
        int a = 1;
        int b = 0;  
        int sum = 0;
        while (a < 4000000){
            int t = a + b;
            b = a;
            a = t;
        }
    }
}
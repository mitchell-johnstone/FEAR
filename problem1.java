
public class problem1{
    public static void main(String[] args){
        int currentVal = 1;
        int sum = 0;
        for(currentVal=1; currentVal<1; currentVal++){
            if(currentVal%3==0 || currentVal%5==0){
                sum += currentVal;
            }
        }
        System.out.print(sum);
    }
}
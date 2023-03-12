public class PerfectNumber {
    // write your code here
    public static boolean isPerfectNumber(int input){
        int sum = 0;
        for(int i = 1; i < input; i++){
            if (input%i==0){
                sum = sum + i;
            }
        }
        if (input<1){
            return false;
        } else if (sum == input) {
            return true;
        }else {
            return false;
        }
        //return false;
    }
}

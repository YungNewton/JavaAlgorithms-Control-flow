public class FirstLastDigitSum {
    // write your code here
    public static int sumFirstAndLastDigit(int input){
        int sum;
        int init = 1;
        int first=0;
        int sec =0;
        while(input/init>9){
            init*=10;
        }
        if(input<0){
            return -1;
        }else if(input/1<=9){
            return (input*2);
        } else if (input==0) {
            return 0;
        }else {
            first=input/init;
            sec =input%10;
            sum = first+sec;
        }return sum;
    }
}
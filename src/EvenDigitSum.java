public class EvenDigitSum {
    // write your code here
    public static int getEvenDigitSum(int input){
        int init=1;
        int div;
        int sum=0;
        while (input/init > 9){
            init*=10;
        }
        if (input<0){
            return -1;
        }else {while(init>0){
            div = input/init;
            input=input-(div*init);
            if(div%2==0){
                sum = sum + div;
                init/=10;
            }
        }
        }return sum;
    }
}
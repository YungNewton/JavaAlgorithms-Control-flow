public class LargestPrime {
    // write your code here
    public static int getLargestPrime(int input){
        int largest = 0;
        int test = 0;
        if(input<0){
            return -1;
        }else {
            for(int i = 1; i<input; i++){
                int p =0;
                if((input%i==0)){
                    for(int u = 2; u<i; u++){
                        if ((i%u)==0){
                            p++;
                        }
                        if(p==0){
                            largest=i;
                            test=-1;
                        }
                    }
                }
            }
        }if(test==-1){
            return largest;
        }else {
            return -1;
        }
    }
}
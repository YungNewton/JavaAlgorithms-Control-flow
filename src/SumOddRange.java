public class SumOddRange {
    public static boolean isOdd(int number){
        if (number > 0){
            if (number%2==0){
                return false;
            }else
                return true;
        }else
            return false;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if ((end < start)||((end < 1)||(start<1))){
            return -1;
        }
        for (int i =start; i<=end; i++){
            isOdd(i);
            if (i%2!=0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

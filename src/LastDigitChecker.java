public class LastDigitChecker {
    // write your code here
    public static boolean hasSameLastDigit(int in, int inp, int input){
        if ((((in > 1000)||(in < 10))||((inp > 1000)||(inp < 10)))||((input > 1000)||(input < 10))){
            return false;
        }
        int i = in%10;
        int f = inp%10;
        int r = input%10;
        ///System.out.println(i);
        ///System.out.println(f);
        //System.out.println(r);
        if ((i == f)||(f==r)||(i==r)){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isValid(int input){
        if ((input > 1000)||(input < 10)) {
            return false;
        }else
            return true;
    }
}
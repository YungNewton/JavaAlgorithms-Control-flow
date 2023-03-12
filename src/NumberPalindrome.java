public class NumberPalindrome {
    public static boolean isPalindrome(int input){
        int real = input;
        int div1;
        int div2;
        int check = 0;
        int init = 1;
        int inputp;
        int var = 10;
        int input1;
        int div;
        int rev = 0;
        int multiple=1;
        int stop = 1;
        if (input<0) {
            input1 = input * -1;
            while (input1 / multiple > 9) {
                multiple *= 10;
            }
            while (true) {
                div = (input1 % var);
                if (div == 0) {
                    input1 = input1 / var;
                    if (div != 0)
                        continue;
                    int s = div * multiple;
                    multiple /= 10;
                    rev = rev + s;
                    //rev1 = rev * -1;
                } else {
                    input1 = input1 / var;
                    int s = div * multiple;
                    multiple /= 10;
                    rev = rev + s;
                    //rev1 = rev * -1;
                }
                if (multiple == 0)
                    break;
            }
        } else if (input==0) {
            rev = 0;
        } else {
            while(input /multiple>9){
                multiple*=10;
            }
        }
        while(true){
            div = (input%var);
            if (div == 0){
                input = input/var;
                //System.out.println(input);
                if (div != 0)
                    continue;
                int s = div*multiple;
                multiple/=10;
                rev = rev + s;
                if (multiple == 0)
                    break;
            }else {
                input = input/var;
                int s = div*multiple;
                multiple/=10;
                rev = rev + s;
            }
            if (multiple == 0)
                break;
        }
        //System.out.println(rev);
        if(real<0){
            inputp = real*-1;
        }else {
            inputp = real;
        }while(inputp/init>9){
            init*=10;
        }while(init>0) {
            div1 = inputp / init;
            div2 = rev/init;
            inputp = inputp - (div1 * init);
            rev = rev - (div2 * init);
            init/=10;
            if (div1 != div2) {
                check++;
            }
        }if(check==0){
            return true;
        }else {
            return false;
        }
    }
}
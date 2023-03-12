public class NumberToWords {
    // write your code here
    public static void numberToWords(int number){
        String sum ="";
        int var = 1;
        int mut = 10;
        int div;
        String init;
        if (number<0){
            System.out.println("Invalid Value");
        }else {
            while(number/var>9){
                var*=10;
                mut*=10;
                ///if (number/var < 9)
                //System.out.println(var);
            }
            while (true){
                if (mut >= 1){
                    if (var > 0){
                        div = number/var;
                    }else{
                        div = number/1;
                    }
                    number = number-(div*var);
                    var/=10;
                    mut/=10;
                    if (div == 0){
                        init = "Zero";
                    } else if (div == 1) {
                        init = "One";
                    } else if (div == 2) {
                        init = "Two";
                    } else if (div == 3) {
                        init = "Three";
                    } else if (div == 4) {
                        init = "Four";
                    } else if (div == 5) {
                        init = "Five";
                    } else if (div == 6) {
                        init = "Six";
                    } else if (div == 7) {
                        init = "Seven";
                    } else if (div==8) {
                        init = "Eight";
                    } else {
                        init = "Nine";
                    }
                    sum = init;
                    if (mut == 0)
                        break;
                    System.out.println(sum);
                }
            }
        }
        //return sum;
    }
    public static int getDigitCount(int input){
        int var = 1;
        int count =  0;
        while(input/var>0){
            count++;
            var*=10;
        }
        if (input<0){
            return -1;
        }else if (input==0){
            return 1;
        }else {
            return count;
        }
    }
    public static int reverse(int input){
        int var = 10;
        int input1;
        int div;
        int rev = 0;
        int rev1 = 0;
        int multiple=1;
        int stop = 1;
        if (input<0){
            input1 = input*-1;
            while(input1 /multiple>9){
                multiple*=10;
                //System.out.println(multiple);
            }
            while(true){
                div = (input1%var);
                if (div == 0){
                    input1 = input1/var;
                    if (div != 0)
                        continue;
                    int s = div*multiple;
                    multiple/=10;
                    rev = rev + s;
                    rev1 = rev * -1;
                }else {
                    input1 = input1/var;
                    int s = div*multiple;
                    multiple/=10;
                    rev = rev + s;
                    rev1 = rev * -1;
                }
                //System.out.println(div);
                if (multiple == 0)
                    break;
            }
            return rev1;
        } else if (input==0) {
            return 0;
        } else {
            while(input /multiple>9){
                multiple*=10;
                //System.out.println(multiple);
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
                //System.out.println(rev);
                if (multiple == 0)
                    break;
            }
            return rev;
        }
    }
}

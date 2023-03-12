public class GreatestCommonDivisor {
    // write your code here
    public static int getGreatestCommonDivisor(int first, int second){
        int dat = 0;
        if ((first<10)||(second<10)){
            return -1;
        }else {
            if (first>second){
                for(int i = 1; i <= first; i++){
                    if((first%i==0)&&(second%i==0)){
                        dat = i;
                        //System.out.println(dat);
                    }
                }
            }else {
                for(int i = 1; i <= second; i++){
                    if((first%i==0)&&(second%i==0)){
                        dat = i;
                        //System.out.println(dat);
                    }
                }
            }
        }return dat;
    }
}
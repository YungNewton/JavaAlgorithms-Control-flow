public class FlourPacker {
    // write your code here
    public static boolean canPack(int bigCount, int smallCount, int Goal ){
        int big = bigCount*5;
        if ((big<0)||(smallCount<0)||(Goal<0)) {
            return false;
        }else {
            if ((big+smallCount)>Goal){
                if (big==0){
                    if(smallCount>=Goal){
                        return true;
                    }else {
                        return false;
                    }
                }else{
                    if (Goal>big){
                        if((Goal%big)<=smallCount){
                            return true;
                        }else {
                            return false;
                        }
                    }else {
                        if((Goal%5)<=smallCount){
                            return true;
                        }else {
                            return false;
                        }
                    }
                }
            }if ((big+smallCount)==Goal){
                return true;
            }else {
                return false;
            }
        }
    }
}

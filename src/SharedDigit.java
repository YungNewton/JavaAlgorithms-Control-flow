public class SharedDigit {
    // write your code here
    public static boolean hasSharedDigit(int first, int second){
        int FirstReset = first;
        int SecondReset = second;
        int First =0;
        int div;
        int siv;
        int firs = 1;
        int sec = 1;
        int count = 0;
        while(first/firs>9){
            firs*=10;
            First = firs;
        }
        while(second/sec>9){
            sec*=10;
            First = sec;
        }
        if (((first>=10)&&(first<=99))&&((second>=10)&&(second<=99))){
            if (first>second){
                while(firs>0){
                    div =  first/firs;
                    first=first -(div*firs);
                    firs/=10;
                    while (sec>0){
                        siv = second/sec;
                        second = second-(siv*sec);
                        sec/=10;
                        if(siv == div){
                            count++;
                        }
                    }sec = First;
                    second = SecondReset;
                }
            }else {
                while(sec>0){
                    div = second/sec;
                    second = second-(div*sec);
                    sec/=10;
                    while(firs>0){
                        siv = first/firs;
                        first = first-(siv*firs);
                        firs/=10;
                        if (siv == div){
                            count++;
                        }
                    }firs = First;
                    first = FirstReset;
                }
            }
        }else {
            return false;
        }
        if (count == 0){
            return false;
        }else {
            return true;
        }
    }
}
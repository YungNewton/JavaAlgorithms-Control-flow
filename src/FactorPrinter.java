public class FactorPrinter {
    // write your code here
    public static void printFactors(int numbers){
        if(numbers<1){
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= numbers; i++){
            if (numbers%i == 0){
                System.out.println(i);
            }
        }
    }
}
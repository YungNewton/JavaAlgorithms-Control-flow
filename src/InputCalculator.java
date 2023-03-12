import java.util.Scanner;

public class InputCalculator {
    // Write your code here
    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        double count = 0;
        double avg = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            boolean h = scanner.hasNextInt();
            if(h){
                int input = scanner.nextInt();
                sum = sum + input;
                count++;
                avg = sum/ count;
            }else {
                System.out.println("SUM = "+sum+" AVG = "+Math.round(avg));
                break;
            }
        }
        scanner.close();
    }
}
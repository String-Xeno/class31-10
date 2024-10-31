import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Money in smallest coins possible calculator.");
        System.out.println();
        System.out.println("Enter the amount of money you'd like to check:");
        double Money;
        int stopOnError = 0;
        double[] compactedcurrency = new double[]{200, 100, 50, 20, 10, 5, 2 ,1, 0.5, 0.1};
        while (stopOnError == 0){
            Money = input.nextDouble();
            if (Money>0) {
                for (int coinorshtar = 0; coinorshtar < 10; coinorshtar++) {
                    double percompact = Money/compactedcurrency[coinorshtar];
                    int compacted = (int) percompact;
                    if (compactedcurrency[coinorshtar] == 0.1){
                        compacted = compacted+1;
                    }
                    System.out.println(compactedcurrency[coinorshtar] + " - " + compacted);
                    Money = Money % compactedcurrency[coinorshtar];
                }
            } else if (Money< 0) {
                System.out.println("Invalid Number");
                stopOnError = 1;
            }
        }
    }
}
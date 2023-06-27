import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        int milesValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.convertFromCashToMiles(cashValue) + " miles");

        System.out.println("Please enter a miles value to convert to cash");
        var miles_Entered = scanner.nextLine();
        try {
            milesValue = Integer.parseInt(miles_Entered);
        } catch (NumberFormatException ex){
            System.out.println("Could not parse the entered miles as integer, exiting");
            return;
        }

        System.out.println("converting " + miles_Entered + " to cash");
        var milesToCash = new RewardValue(milesValue);
        System.out.println(milesValue + " miles are worth " + milesToCash.convertFromMilesToCash(milesValue));
    }
}
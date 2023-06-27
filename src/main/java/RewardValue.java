public class RewardValue {
    private double cashValue;
    private int milesValue;
    private final double CONVERSION_RATE = 0.0035;

    //Constructors
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public int convertFromCashToMiles(double cashValue){
        int rewardMiles = (int) (cashValue/CONVERSION_RATE);
        return rewardMiles;
    }

    public double convertFromMilesToCash(int milesValue){
        double rewardCash = milesValue * CONVERSION_RATE;
        return rewardCash;
    }
}

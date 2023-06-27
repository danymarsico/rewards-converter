import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        RewardValue cashToMilesTest = new RewardValue(600.00);
        int expectedMiles = cashToMilesTest.convertFromCashToMiles(cashToMilesTest.getCashValue());
        Assertions.assertEquals(171428,expectedMiles);
    }

    @Test
    void convert_from_miles_to_cash() {
        RewardValue milesToCashTest = new RewardValue(171428);
        double expectedCash = milesToCashTest.convertFromMilesToCash(milesToCashTest.getMilesValue());
        Assertions.assertEquals(599.99,expectedCash,0.1);
    }
}

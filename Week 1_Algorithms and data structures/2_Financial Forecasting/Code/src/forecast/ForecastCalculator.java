package forecast;

public class ForecastCalculator {
	public static double futureValueRecursive(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return (1 + rate) * futureValueRecursive(presentValue, rate, years - 1);
    }

  
    public static double futureValueMemo(double presentValue, double rate, int years, double[] memo) {
        if (years == 0) return presentValue;
        if (memo[years] != 0) return memo[years];
        memo[years] = (1 + rate) * futureValueMemo(presentValue, rate, years - 1, memo);
        return memo[years];
    }
}

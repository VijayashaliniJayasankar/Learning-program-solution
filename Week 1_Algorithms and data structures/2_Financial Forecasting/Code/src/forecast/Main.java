package forecast;

public class Main {

	public static void main(String[] args) {
		double presentValue = 5000.0;   
		double growthRate = 0.08; 
		int years = 10;  

        System.out.println("Recursive Forecast:");
        double result1 = ForecastCalculator.futureValueRecursive(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, result1);

        System.out.println("\n Optimized Forecast using Memoization:");
        double[] memo = new double[years + 1];
        double result2 = ForecastCalculator.futureValueMemo(presentValue, growthRate, years, memo);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, result2);

	}

}

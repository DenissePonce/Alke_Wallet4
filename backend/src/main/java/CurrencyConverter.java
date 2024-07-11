public class CurrencyConverter {
    private static final double USD_TO_EUR_RATE = 0.85;

    public static double convertToEuros(double usd) {
        return usd * USD_TO_EUR_RATE;
    }
}

package CurrencyConverter;

public class CurrencyConverter implements FinancialConversion {
    private static final double DOLLAR_TO_REAL_RATE = 5.14;

    @Override
    public double convertDollarToReal(double dollarValue) {
        return dollarValue * DOLLAR_TO_REAL_RATE;
    }

    @Override
    public double convertRealToDollar(double realValue) {
        return realValue / DOLLAR_TO_REAL_RATE;
    }
}

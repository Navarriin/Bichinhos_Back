package CurrencyConverter;

public class Run {
    public static void main(String[] args) {
        FinancialConversion currencyConverter = new CurrencyConverter();

        double real = 43;
        double dollar = 25;

        double dollarToReal = currencyConverter.convertDollarToReal(dollar);
        double realToDollar = currencyConverter.convertRealToDollar(real);
        System.out.printf("%.2f dólares são %.2f reais.%n", dollar, dollarToReal);
        System.out.printf("%.2f reais são %.2f dólares.%n", real, realToDollar);
    }
}

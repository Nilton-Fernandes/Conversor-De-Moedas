package currency;

public class ExchangeCurrency {
    public ExchangeCurrency() {
    }

    public Double toDollar(String targetCurrency, Double dollar) {
        return Double.parseDouble(targetCurrency) / dollar;
    }

    public Double dollarToAnotherCurrency(String targetCurrency, Double dollar) {
        return Double.parseDouble(targetCurrency) * dollar;
    }

}

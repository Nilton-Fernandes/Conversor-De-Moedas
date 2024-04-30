package domainApplication;

import currency.Currency;
import currency.ExchangeCurrency;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UserApplication {

    private final ExchangeCurrency exchangeCurrency;
    private final Currency currency;
    private String finalResult;

    public UserApplication(ExchangeCurrency exchangeCurrency, Currency currency) {
        this.exchangeCurrency = exchangeCurrency;
        this.currency = currency;
    }

    public void showOption() {
        System.out.println("""
        ****************************************
        ESSE É UM CONVERSOR DE MOEDAS:

        1) Dollar para Euro: (USD/EURO                  2) Euro para Dollar: (EURO/USD)
        3) Dollar para real brasileiro: (USD/BRL)       4) Real brasileiro para Dollar: (BRL/USD)
        5) Dollar para peso argentino: (USD/ARS)         6) Peso argentino para Dollar: (/ARS/USD)
        7) Dollar para peso colombiano: (USD/COP)        8) Peso colombiano para Dollar: (COP/USD)
        9) Dollar para peso chileno: (USD/CLP)           10) Peso chileno para Dollar: (CLP/USD)
        0) Sair:

        Digite a opção desejada:
        """);


    }

    public void chooseOption(Integer option, String exchangeValue) {
        finalResult = switch (option) {
            case 1 -> String.format(
                    "Quantidade = %s [USD] = %f [EUR]",
                    exchangeValue,
                    exchangeCurrency.dollarToAnotherCurrency(exchangeValue, currency.EUR()
                    )
            );
            case 2 -> String.format(
                    "Quantidade = [EUR] = %f [USD]",
                    exchangeValue,
                    exchangeCurrency.toDollar(exchangeValue, currency.EUR())
            );
            case 3-> String.format(
                    "Quantidade = %s [USD] = %f [BRL]",
                    exchangeValue,
                    exchangeCurrency.dollarToAnotherCurrency(exchangeValue, currency.BRL())
            );

            case 4 -> String.format(
                    "Quantidade = %s [BRL] = %f [USD]",
                    exchangeValue,
                    exchangeCurrency.toDollar(exchangeValue, currency.BRL())
            );
            case 5 -> String.format(
                    "Quantidade = %s [USD] = %f [ARS]",
                    exchangeValue,
                    exchangeCurrency.dollarToAnotherCurrency(exchangeValue, currency.ARS())
            );
            case 6 -> String.format(
                    "Quantidade = %s [COP] = %f [USD]",
                    exchangeValue,
                    exchangeCurrency.toDollar(exchangeValue, currency.ARS())
            );
            case 7 -> String.format(
                    "Quantidade = %s [USD] = %f [CLP]",
                    exchangeValue,
                    exchangeCurrency.dollarToAnotherCurrency(exchangeValue, currency.COP())
            );
            case 8 -> String.format(
                    "Quantidade = %s [COP] = %f [USD]",
                    exchangeValue,
                    exchangeCurrency.toDollar(exchangeValue, currency.COP())
            );
            case 9 -> String.format(
                    "Quantidade = %s [USD] = %f [COP]",
                    exchangeValue,
                    exchangeCurrency.dollarToAnotherCurrency(exchangeValue, currency.CLP())
            );
            case 10 -> String.format(
                    "Quantidade = %s [CLP] = %f [USD]",
                    exchangeValue,
                    exchangeCurrency.toDollar(exchangeValue, currency.CLP())
            );
            default -> finalResult;
        };
    }

    public String getFinalResult() {
        return finalResult;
    }
}

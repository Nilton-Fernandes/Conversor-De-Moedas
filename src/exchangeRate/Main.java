package exchangeRate;

import currency.Currency;
import currency.ExchangeCurrency;
import domainApplication.UserApplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ExchangeRateConsumption exchangeRateConsumption = new ExchangeRateConsumption();
        Currency currency = exchangeRateConsumption.getCurrency();
        ExchangeCurrency exchangeCurrency = new ExchangeCurrency();


        UserApplication userApplication = new UserApplication(exchangeCurrency, currency);
        Scanner scannerOption = new Scanner(System.in);
        Scanner scannerValue = new Scanner(System.in);



        while(true) {

            userApplication.showOption();
            Integer option = scannerOption.nextInt();

            if (option.equals(0)) {
                System.out.println("SAIR ..........");
                break;
            } else if (option > 10) {
                System.out.println("""
                
                
                *** Opção invalida:***
                
                
                """);
            } else {
                System.out.println("Digite a quantidade de moedas: ");
                String exchangeValue = scannerValue.nextLine();
                userApplication.chooseOption(option, exchangeValue);

                System.out.println(userApplication.getFinalResult());
            }

        }
    }
}
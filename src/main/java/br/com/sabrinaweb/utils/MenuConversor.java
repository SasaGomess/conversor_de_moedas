package br.com.sabrinaweb.utils;

import br.com.sabrinaweb.client.CurrencyClient;

import br.com.sabrinaweb.model.Currency;

import java.util.Scanner;

public class MenuConversor {
    public static final Scanner sc = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("Digite o valor que deseja converter");
        System.out.println("1) USD ==> BRL");
        System.out.println("2) BRL ==> USD");
        System.out.println("3) USD ==> JPY");
        System.out.println("4) JPY ==> USD");
        System.out.println("5) EUR ==> BRL");
        System.out.println("6) BRL ==> EUR");
        System.out.println("7) Sair");
    }

    public static void menu(CurrencyClient currencyClient) {
        int resp = 0;
        String baseCode = "";
        String targetCode = "";


        while (resp != 7){
            showMenu();
            resp = sc.nextInt();

            switch (resp) {
                case 1:
                    baseCode = "USD";
                    targetCode = "BRL";
                    break;
                case 2:
                    baseCode = "BRL";
                    targetCode = "USD";
                    break;
                case 3:
                    baseCode = "USD";
                    targetCode = "JPY";
                    break;
                case 4:
                    baseCode = "JPY";
                    targetCode = "USD";
                    break;
                case 5:
                    baseCode = "EUR";
                    targetCode = "BRL";
                    break;
                case 6:
                    baseCode = "BRL";
                    targetCode = "EUR";
                    break;
                case 7:
                    baseCode = "";
                    targetCode = "";
                    System.out.println("Encerrando o programa foi um prazer ver você por aqui! :)");
                    break;
                default:
                    throw new IllegalArgumentException("Digite uma opção válida. Tente novamente.");
            }

            if (!baseCode.isEmpty()) {
                System.out.println("Digite o valor que deseja converter");
                int conversionValue = sc.nextInt();
                String json = currencyClient.currencyRequest(baseCode, targetCode, conversionValue);
                double coversionResult = currencyClient.getCoversionResult(json);
                System.out.println(new Currency("USD", "BRL", conversionValue, coversionResult));
            }
        }
    }
}

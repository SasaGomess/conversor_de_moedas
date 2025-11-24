package br.com.sabrinaweb.main;

import br.com.sabrinaweb.client.CurrencyClient;
import br.com.sabrinaweb.utils.MenuConversor;

public class Application {
    public static void main(String[] args) {
        try {
            System.out.println("Seja bem-vindo(a), ao Conversor de Moedas! :)");
            CurrencyClient client = new CurrencyClient();
            MenuConversor.menu(client);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

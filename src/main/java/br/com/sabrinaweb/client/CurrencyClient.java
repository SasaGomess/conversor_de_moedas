package br.com.sabrinaweb.client;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyClient {
    public String currencyRequest(String baseCurrency, String targetCurrency, double amount) {
        HttpClient client = HttpClient.newHttpClient();

        String apiKey = System.getenv("EXCHANGERATE_API_KEY");

        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + baseCurrency + "/" + targetCurrency + "/" + amount;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        }catch (IOException | InterruptedException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    private JsonObject getJsonObject(String json){
        JsonElement element = JsonParser.parseString(json);
        return element.getAsJsonObject();
    }
    public Double getCoversionResult(String json){
        return getJsonObject(json).get("conversion_result").getAsDouble();
    }
}

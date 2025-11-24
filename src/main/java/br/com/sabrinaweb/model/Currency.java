package br.com.sabrinaweb.model;

public record Currency(String baseCode,String targetCode, double conversionValue, double conversionResult) {
    @Override
    public String toString() {
        return String.format("Valor %.1f [%s] corresponde o valor final de =>> %.5f [%s]", conversionValue, baseCode,  conversionResult, targetCode);
    }
}

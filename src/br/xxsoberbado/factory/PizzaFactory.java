package br.xxsoberbado.factory;

public class PizzaFactory {

    // Recebe o tipo desejado e devolve a pizza pronta.
    public static Pizza createPizza(String type) {

        if (type.equals("chocolate")) {
            return new ChocolatePizza();
        } else if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        } else {
            throw new IllegalArgumentException("Tipo de pizza desconhecido: " + type);
        }
    }
}
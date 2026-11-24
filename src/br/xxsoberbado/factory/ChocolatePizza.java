package br.xxsoberbado.factory;

// "implements Pizza" = esta classe segue as regras da interface Pizza
public class ChocolatePizza implements Pizza {

    @Override
    public String getName() {
        return "Pizza de Chocolate";
    }

    @Override
    public void prepare() {
        System.out.println("Espalhando chocolate e assando...");
    }
}
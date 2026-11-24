package br.xxsoberbado.factory;

public class PepperoniPizza implements Pizza {

    @Override
    public String getName() {
        return "Pizza de Pepperoni";
    }

    @Override
    public void prepare() {
        System.out.println("Colocando molho, queijo e pepperoni, e assando...");
    }
}
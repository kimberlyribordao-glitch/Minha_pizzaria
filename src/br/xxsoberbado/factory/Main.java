package br.xxsoberbado.factory;

public class Main {

    // O Java começa a executar o programa por aqui
    public static void main(String[] args) {

        Pizza pizza1 = PizzaFactory.createPizza("chocolate");
        Pizza pizza2 = PizzaFactory.createPizza("pepperoni");

        System.out.println(pizza1.getName());
        pizza1.prepare();

        System.out.println();

        System.out.println(pizza2.getName());
        pizza2.prepare();
    }
}
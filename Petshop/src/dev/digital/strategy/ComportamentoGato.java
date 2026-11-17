package dev.digital.strategy;

public class ComportamentoGato implements  Comportamento{


    @Override
    public void comer() {
        System.out.println("O gato está comendo...");
    }

    @Override
    public void dormir() {
        System.out.println("O gato está dormindo...");
    }

    @Override
    public void mover() {
        System.out.println("O gato está andando em sua direção...");
    }

    @Override
    public void realizarAcao() {
        System.out.println("O gato está passando entre as suas pernas...");
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato está dizendo: Miau!");
    }
}

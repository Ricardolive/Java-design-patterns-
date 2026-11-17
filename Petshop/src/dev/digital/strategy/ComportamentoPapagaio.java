package dev.digital.strategy;

public class ComportamentoPapagaio implements Comportamento{


    @Override
    public void comer() {
        System.out.println("O papagaio está comendo...");
    }

    @Override
    public void dormir() {
        System.out.println("O papagaio está dormindo...");
    }

    @Override
    public void mover() {
        System.out.println("O papagaio está andando de um lado para outro...");
    }

    @Override
    public void realizarAcao() {
        System.out.println("O papagaio está esticando suas asas...");
    }

    @Override
    public void emitirSom() {
        System.out.println("O papagaio está dizendo: loro! loro!");
    }
}

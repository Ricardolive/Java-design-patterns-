package dev.digital.strategy;

public class ComportamentoCachorro implements Comportamento{


    @Override
    public void comer() {
        System.out.println("O cachorro está comendo...");
    }

    @Override
    public void dormir() {
        System.out.println("O cachorro está dormindo...");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro está andando em sua direção...");
    }

    @Override
    public void realizarAcao() {
        System.out.println("O cachorro está abanando o rabo...");
    }

    @Override
    public void emitirSom() {
    System.out.println("O cachorro está dizendo: Au! Au! Au!");
    }
}

import dev.digital.strategy.*;

public static void main(String[] args) {


    Animal animal = new Animal("Chico","Siames",3,4.8,"Beje","Masculino");
    animal.setComportamento(new ComportamentoGato());

    animal.mover();
    System.out.println("O nome dele é: " + animal.getNome());

    System.out.println("\nVoce selecionou outro animal:");
    animal.atualizarDados(  "Mex","Labrador",6,25,"Laranja","Masculino");
    animal.setComportamento(new ComportamentoCachorro());
    animal.realizarAcao();
    animal.mover();
    System.out.println("O nome dele é: " + animal.getNome());

    System.out.println("\nVoce olhou pro lado e viu uma ave");
    animal.atualizarDados("Fael","Papagaio",2,1,"verde","Masculino");
    animal.setComportamento(new ComportamentoPapagaio());
    animal.emitirSom();
    animal.realizarAcao();
    System.out.println("O nome dele é: " + animal.getNome());

    }
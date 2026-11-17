package dev.digital.strategy;

public class Animal {

    private Comportamento comportamento;
    private String nome;
    private String raca;
    private int idade;
    private double peso;
    private String cor;
    private String sexo;


    public Animal( String nome, String raca, int idade, double peso, String cor, String sexo) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.cor = cor;
        this.sexo = sexo;
    }


    // Metodos
    public void comer() {
        comportamento.comer();
    }
    public void dormir() {
        comportamento.dormir();
    }
    public void mover() {
        comportamento.mover();
    }
    public void realizarAcao() {
        comportamento.realizarAcao();
    }
    public void emitirSom() {
        comportamento.emitirSom();
    }

    // Mudar de animal (comportamento)
    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    // Atualizar dados
    public void atualizarDados( String nome, String raca, int idade, double peso, String cor, String sexo) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.cor = cor;
        this.sexo = sexo;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

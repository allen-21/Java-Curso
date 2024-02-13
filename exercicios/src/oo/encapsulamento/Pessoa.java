package oo.encapsulamento;

public class Pessoa {

    public String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        idade = Math.abs(idade);
        if(idade >= 0 && idade<=120){
            this.idade = idade;
        }

    }

    @Override
    public String toString() {
        return "nome " + nome +
                ", idade " + idade ;
    }
}

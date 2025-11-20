import java.util.Objects;

public abstract class Pessoa {
    protected String nome;
    protected int idade;


    public Pessoa(String name, int idade){
        this.nome = name;
        System.out.println("Voce criou uma pessoa com nome " +
                name);
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
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Pessoa)){
            return false;
        }
        Pessoa that = (Pessoa) o;
        return idade == that.idade && Objects.equals(nome,
                that.nome);
    }
}
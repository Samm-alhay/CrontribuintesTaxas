public abstract class Funcionario extends Pessoa{
    protected double salario;
    public static int totalFuncionarios;

    public Funcionario(String name, int idade, double salario) {
        super(name, idade);
        this.salario = salario;
        totalFuncionarios++;
    }

    public abstract double CalcularBonus();
}
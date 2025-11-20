public class Gerente extends Funcionario{

    public Gerente(String name, int idade, double salario) {
        super(name, idade, salario);
    }

    @Override
    public double CalcularBonus(){
        return salario * 1.20;
    }
}
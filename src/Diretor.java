public class Diretor extends Funcionario{


    public Diretor(String name, int idade, double salario) {
        super(name, idade, salario);
    }

    @Override
    public double CalcularBonus(){
        return salario * 1.30;
    }
}
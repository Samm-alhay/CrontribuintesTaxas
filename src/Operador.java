public class Operador extends Funcionario{


    public Operador(String name, int idade, double salario) {
        super(name, idade, salario);
    }

    @Override
    public double CalcularBonus(){
        return salario * 1.15;
    }

}

namespace ContribuintesTaxa.Entities;

public class PessoaJuridica : Contribuinte
{
    public int NumeroFuncionarios { get; set; }

    public PessoaJuridica(string nome, double rendaAnual, int numeroFuncionarios) : base(nome, rendaAnual)
    {
        Nome = nome;
        RendaAnual = rendaAnual;
        NumeroFuncionarios = numeroFuncionarios;
    }

    public override double CalcImposto()
    {
        double valorImposto = (NumeroFuncionarios > 10) ? 0.14 : 0.16;

        return RendaAnual * valorImposto;
    }
}
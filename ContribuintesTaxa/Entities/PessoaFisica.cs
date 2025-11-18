namespace ContribuintesTaxa.Entities;

public class PessoaFisica : Contribuinte
{
    public double GastoSaude { get; set; }

    public PessoaFisica(string nome, double rendaAnual, double gastoSaude) : base(nome, rendaAnual)
    {
        Nome = nome;
        RendaAnual = rendaAnual;
        GastoSaude = gastoSaude;
        
    }

    public override double CalcImposto()
    {
        double valorImposto = (RendaAnual > 20000.0) ? 0.25 : 0.15;

        return (RendaAnual * valorImposto) - (GastoSaude * 0.50);
    }
}
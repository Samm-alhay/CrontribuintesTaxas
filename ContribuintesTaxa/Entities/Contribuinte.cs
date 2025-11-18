namespace ContribuintesTaxa.Entities;

public abstract class Contribuinte
{
    protected string Nome { get; set; }
    protected double RendaAnual { get; set; }

    public Contribuinte(string nome, double rendaAnual)
    {
        this.Nome = nome;
        this.RendaAnual = rendaAnual;
    }

    public abstract double CalcImposto();
}
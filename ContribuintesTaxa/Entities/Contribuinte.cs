using System.Text;

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


    public override string ToString()
    {
        StringBuilder sb = new StringBuilder();

        sb.AppendLine("TAXES PAID:");
        sb.Append($"{Nome}: $ {CalcImposto()}");

        return sb.ToString();
    }
}
namespace ContribuintesTaxa.Entities;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter the number of tax payers: ");
        int nPagadorestaxa = int.Parse(Console.ReadLine());

        List<Contribuinte> contribuintes = new List<Contribuinte>();
        
        for (int i = 0; i < nPagadorestaxa; i++)
        {
            Console.WriteLine($"Tax payer {i + 1} data: ");
            Console.WriteLine("Individual or company? (i/c)");
            char iorc = char.Parse(Console.ReadLine());

            if (iorc == 'i')
            {
                Console.Write("Name: ");
                string name = Console.ReadLine();
                Console.Write("Anual Income");
                double anualIcome = double.Parse(Console.ReadLine());
                Console.WriteLine("Health expenditures: ");
                double helthExpend = double.Parse(Console.ReadLine());
                
                contribuintes.Add(new PessoaFisica(name,anualIcome,helthExpend));

            }
            else if (iorc == 'c')
            {
                Console.Write("Name: ");
                string name = Console.ReadLine();
                Console.Write("Anual Income");
                double anualIcome = double.Parse(Console.ReadLine());
                Console.WriteLine("Number of employees: ");
                int employeeNumber = int.Parse(Console.ReadLine());
                
                contribuintes.Add(new PessoaJuridica(name,anualIcome,employeeNumber));
            }
            else
            {
                Console.WriteLine("Opcao Invalida");
            }

            double totalTaxes = 0;
            
            foreach (Contribuinte contribuinte in contribuintes)
            {
                Console.WriteLine(contribuinte.ToString());
                totalTaxes += contribuinte.CalcImposto();
            }

            Console.WriteLine("Total taxes: $" + totalTaxes);
            
            
            

            
            
            

        }
    }
}
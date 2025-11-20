public class Carro {
    private String nomeCarro;
    private int velocidade;
    private boolean ligado;
    Pessoa dono;
    Motor motor;
    public Carro(String nomeCarro, String modeloMotor){
        this.nomeCarro = nomeCarro;
        this.motor = new Motor(modeloMotor);
    }
    public String getNomeCarro() {
        return nomeCarro;
    }
    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }
    public Pessoa getDono() {
        return dono;
    }
    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
    public void ligar(){
        if(!ligado){
            ligado = true;
            motor.setLigado(true);
        }
        else{
            System.out.println("Carro ja esta ligado");
        }
    }
    public void acelerar(){
        if(!ligado){
            System.out.println("Ligue o carro");
        }
        else{
            while(velocidade != 100){
                velocidade += 20;
            }
        }
    }
    public void frear(){
        if(!ligado){
            System.out.println("Ligue o carro");
        }
        else{
            while(velocidade != 0){
                velocidade -= 20;
            }
        }
    }
    public void desligar(){
        if(ligado){
            ligado = false;
            motor.setLigado(false);
        }
        else{
            System.out.println("Carro ja esta desligado");
        }
    }
    public void mostarMensagem(){
        System.out.println("Eu sou um carro e estou " + (ligado
                ? "Ligado" : "Desligado"));
        System.out.println("Minha velocidade e: " +
                velocidade);
    }
}

public class Motor {
    String modeloMotor;
    boolean ligado;
    public Motor(String modeloMotor){
        this.modeloMotor = modeloMotor;
        System.out.println("Voce criou um motor " + modeloMotor);
    }
    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        if (ligado){
            System.out.println("Motor ligado");
        }
        else {
            System.out.println("Motor desligado");
        }
        this.ligado = ligado;
    }
    public String getModeloMotor() {
        return modeloMotor;
    }
    public void setModeloMotor(String modeloMotor) {
        this.modeloMotor = modeloMotor;
    }
}
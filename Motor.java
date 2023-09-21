public class Motor {
    private int qtdPist;
    private int potencia;

    public Motor() {
        this.potencia = 0;
        this.qtdPist = 0;
    }

    public Motor(int potencia, int qtdPist) {
        this.potencia = potencia;
        this.qtdPist = qtdPist;
    }

    public int getQtdPist() {
        return qtdPist;
    }

    public void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}
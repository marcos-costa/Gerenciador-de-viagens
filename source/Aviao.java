public class Aviao {

    private String modelo;
    private int capacidadeMaxima;

    public Aviao(String modelo, int capacidadeMaxima){
        this.modelo = modelo;
        this.capacidadeMaxima = capacidadeMaxima;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
}

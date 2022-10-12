import java.io.Serializable;

public class Aviao implements Serializable{

    private String modelo;
    private int capacidadeMaxima;
    private int numeroMaximoViagens;

    public Aviao(String modelo, int capacidadeMaxima, int numeroMaximo){
        this.modelo = modelo;
        this.capacidadeMaxima = capacidadeMaxima;
        this.numeroMaximoViagens = numeroMaximo;
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

    public int getNumeroMaximoViagens() {
        return numeroMaximoViagens;
    }

    public void setNumeroMaximoViagens(int numeroMaximoViagens) {
        this.numeroMaximoViagens = numeroMaximoViagens;
    }
    
}

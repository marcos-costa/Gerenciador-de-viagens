import java.util.ArrayList;

public class Passageiro {

    private String nome, cpf, telefone;
    private ArrayList<Viagem> viagens;

    public Passageiro(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.viagens = new ArrayList<Viagem>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Viagem> getViagens(){
        return viagens;
    }

    public void setViagens(ArrayList<Viagem> viagens){
        this.viagens = viagens;
    }

    public void adicionarViagem(Viagem viagem){
        this.viagens.add(viagem);
    }

}

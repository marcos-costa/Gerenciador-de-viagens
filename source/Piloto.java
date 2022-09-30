import java.util.ArrayList;

public class Piloto extends Funcionario{
    
    private String habilitacao;
    private ArrayList<Viagem> viagens;

    public Piloto(String nome, String cpf, String telefone, String habilitacao){
        super(nome, cpf, telefone);
        this.habilitacao = habilitacao;
        this.viagens = new ArrayList<Viagem>();
    }
    
    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
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

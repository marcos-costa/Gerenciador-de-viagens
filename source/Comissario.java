import java.util.ArrayList;

public class Comissario extends Funcionario {

    private String idiomaEstrangeiro;
    private ArrayList<Viagem> viagens;

    public Comissario(String nome, String cpf, String telefone, String idiomas){
        super(nome, cpf, telefone);
        this.idiomaEstrangeiro = idiomas;
        this.viagens = new ArrayList<Viagem>();
    }

    public String getIdiomas() {
        return idiomaEstrangeiro;
    }

    public void setIdiomas(String idiomas) {
        this.idiomaEstrangeiro = idiomas;
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

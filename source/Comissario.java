import java.util.ArrayList;

public class Comissario extends Funcionario{

    private ArrayList<String> idiomas;
    private ArrayList<Viagem> viagens;

    public Comissario(String nome, String cpf, String telefone, ArrayList<String> idiomas){
        super(nome, cpf, telefone);
        this.idiomas = idiomas;
        this.viagens = new ArrayList<Viagem>();
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
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

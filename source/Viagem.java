import java.util.ArrayList;
import java.io.Serializable;

public class Viagem implements Serializable{

    private String CidPartida, CidChegada, HoraPartida, HoraChegada, data;
    private Aviao aviao;
    private Piloto piloto, coPiloto;
    private ArrayList<Comissario> comissarios;
    private ArrayList<Passageiro> passageiros;

    public Viagem(String CidPartida, String CidChegada, String HoraPartida, String HoraChegada, String data, Aviao aviao, Piloto piloto, Piloto copiloto, ArrayList<Comissario> comissarios){
        this.CidPartida = CidPartida;
        this.CidChegada = CidChegada;
        this.HoraPartida = HoraPartida;
        this.HoraChegada = HoraChegada;
        this.data = data;
        this.aviao = aviao;
        this.piloto = piloto;
        this.coPiloto = copiloto;
        adicionarComissario(comissarios);
        this.passageiros = new ArrayList<Passageiro>();
    }

    public String getCidPartida() {
        return CidPartida;
    }

    public void setCidPartida(String cidPartida) {
        CidPartida = cidPartida;
    }

    public String getCidChegada() {
        return CidChegada;
    }

    public void setCidChegada(String cidChegada) {
        CidChegada = cidChegada;
    }

    public String getHoraPartida() {
        return HoraPartida;
    }

    public void setHoraPartida(String horaPartida) {
        HoraPartida = horaPartida;
    }

    public String getHoraChegada() {
        return HoraChegada;
    }

    public void setHoraChegada(String horaChegada) {
        HoraChegada = horaChegada;
    }

    public String getdata() {
        return data;
    }

    public void setdata(String data) {
        this.data = data;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
        piloto.adicionarViagem(this);
    }

    public Piloto getCoPiloto() {
        return coPiloto;
    }

    public void setCoPiloto(Piloto coPiloto) {
        this.coPiloto = coPiloto;
        coPiloto.adicionarViagem(this);
    }

    public ArrayList<Comissario> getComissarios() {
        return comissarios;
    }

    public void setComissarios(ArrayList<Comissario> comissarios) {
        this.comissarios = comissarios;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }
    
    public void adicionarPassageiro(Passageiro passageiro){
        if (passageiros.size() < aviao.getCapacidadeMaxima()){
            this.passageiros.add(passageiro);
            passageiro.adicionarViagem(this);
        }
    }

    public void adicionarComissario(ArrayList<Comissario> comissarios){
        for (int c = 0; c < comissarios.size(); c++){
            comissarios.get(c).adicionarViagem(this);
        }
        this.comissarios = comissarios;
    }

    public void listarPassageiros(){
        System.out.println("-----Lista de passageiros-----");
        for (int c = 0; c < passageiros.size(); c++){
            System.out.println(passageiros.get(c).toString());
        }
    }

    public void detalhes(){
        System.out.println("----Informações da Viagem-----");
        System.out.println("data: " + data + "\nPartida em " + CidPartida + " às " + HoraPartida + "\nChega em " + CidChegada + " às " + HoraChegada + "\n");
    }
}

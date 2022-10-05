import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


@SuppressWarnings("unchecked")
public class App {
    static ArrayList<Comissario> comissarios;
    static ArrayList<Piloto> pilotos;
    static ArrayList<Passageiro> passageiros;
    static ArrayList<Aviao> avioes;
    static ArrayList<Viagem> viagens;

    public static void main(String args[]) {
        try{
            FileInputStream ler = new FileInputStream("dados.ser");
            ObjectInputStream ob = new ObjectInputStream(ler);

            comissarios = (ArrayList<Comissario>)ob.readObject();
            pilotos = (ArrayList<Piloto>)ob.readObject();
            passageiros = (ArrayList<Passageiro>)ob.readObject();
            avioes = (ArrayList<Aviao>)ob.readObject();
            viagens = (ArrayList<Viagem>)ob.readObject();

            ler.close();
            ob.close();
        } catch (Exception e){
            comissarios = new ArrayList<>();
            pilotos = new ArrayList<>();
            passageiros = new ArrayList<>();
            avioes = new ArrayList<>();
            viagens = new ArrayList<>();
        }
        
        serializar();
        
    }

    public static void serializar(){
        try{
            FileOutputStream fout = new FileOutputStream("dados.ser");
            ObjectOutputStream objOutput = new ObjectOutputStream(fout);
            objOutput.writeObject(comissarios);
            objOutput.writeObject(pilotos);
            objOutput.writeObject(passageiros);
            objOutput.writeObject(avioes);
            objOutput.writeObject(viagens);
            
            objOutput.close();
            fout.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }

    public static ArrayList<Comissario> getComissarios() {
        return comissarios;
    }

    public static void setComissarios(ArrayList<Comissario> comissarios) {
        App.comissarios = comissarios;
    }

    public static ArrayList<Piloto> getPilotos() {
        return pilotos;
    }

    public static void setPilotos(ArrayList<Piloto> pilotos) {
        App.pilotos = pilotos;
    }

    public static ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public static void setPassageiros(ArrayList<Passageiro> passageiros) {
        App.passageiros = passageiros;
    }

    public static ArrayList<Aviao> getAvioes() {
        return avioes;
    }

    public static void setAvioes(ArrayList<Aviao> avioes) {
        App.avioes = avioes;
    }

    public static ArrayList<Viagem> getViagens() {
        return viagens;
    }

    public static void setViagens(ArrayList<Viagem> viagens) {
        App.viagens = viagens;
    }

}
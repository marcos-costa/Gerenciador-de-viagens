import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class App implements Serializable{
    public static void main(String args[]){
        ArrayList<Comissario> comissarios = new ArrayList<>();
        ArrayList<Piloto> pilotos = new ArrayList<>();
        ArrayList<Passageiro> passageiros = new ArrayList<>();
        ArrayList<Aviao> avioes = new ArrayList<>();
        ArrayList<Viagem> viagens = new ArrayList<>();

        try{
            FileInputStream ler = new FileInputStream("dados.ser");
            ObjectInputStream ob = new ObjectInputStream(ler);
            comissarios = (ArrayList<Comissario>)ob.readObject();
            pilotos = (ArrayList<Piloto>)ob.readObject();
            passageiros = (ArrayList<Passageiro>)ob.readObject();
            avioes = (ArrayList<Aviao>)ob.readObject();
            viagens = (ArrayList<Viagem>)ob.readObject();

            for(int i = 0; i < passageiros.size();i++){
                System.out.println(passageiros.get(i).getNome());
            }
            ob.close();
            ler.close();
        }
        catch(Exception e){
            e.getStackTrace();
            File arq = new File("dados.ser");
            try {
                arq.delete();
                arq.createNewFile();
                }
            catch(IOException io){
                e.getStackTrace();
            }
        }

        Comissario comissario1 = new Comissario("João Felipe", "632.759.214-24", "98462-4678", "Inglês");
        Comissario comissario2 = new Comissario("Adriana Matos", "426.893.156-48", "94002-4245", "Espanhol");
        Comissario comissario3 = new Comissario("Isabela Souza", "604.637.240-05", "99643-2671", "Mandarim");
        comissarios.add(comissario1); 
        comissarios.add(comissario2); 
        comissarios.add(comissario3);

        Passageiro passageiro1 = new Passageiro("Marcos Costa", "765.712.324-01", "99642-5364");
        Passageiro passageiro2 = new Passageiro("Valéria Ribeiro", "963.584.567-86", "98246-9521");
        Passageiro passageiro3 = new Passageiro("Eric Gustava", "963.852.741.64", "98541-3872");
        Passageiro passageiro4 = new Passageiro("Emanuel Henrique", "354.286.435.84", "9934-7624");
        passageiros.add(passageiro1);
        passageiros.add(passageiro2);
        passageiros.add(passageiro3);
        passageiros.add(passageiro4);

        Piloto piloto1 = new Piloto("Jorge Silva", "762.763.542-36", "98673-4521", "PP");
        Piloto piloto2 = new Piloto("Maria dos Santos", "854.632.735-21", "99634-2764", "PLA");
        pilotos.add(piloto1);
        pilotos.add(piloto2);
        Aviao aviao1 = new Aviao("boing 762", 20);
        avioes.add(aviao1);

        Viagem viagem1 = new Viagem("Manaus", "São Paulo", "13:15", "15:00", "02/12/2022", aviao1, piloto1, piloto2, comissarios);
        viagens.add(viagem1);

        viagem1.adicionarPassageiro(passageiro1);
        viagem1.adicionarPassageiro(passageiro2);
        viagem1.adicionarPassageiro(passageiro3);
        viagem1.adicionarPassageiro(passageiro4);

        //viagem1.detalhes();
        //viagem1.listarPassageiros();
        
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
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

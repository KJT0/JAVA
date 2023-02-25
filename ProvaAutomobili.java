import java.util.Scanner;
import java.util.Vector;
class Cliente{
    //
    protected String nome;
    //
    Cliente(String nome){
        this.nome = nome;
    }
    public String GetNome(){
        return nome;
    }
}

class Automobile{
    //
    private String Targa;
    Cliente c;
    Automobile(String Targa,Cliente c){
        this.Targa = Targa;
        this.c = c;
    }

    public String GetNome(){
        return c.GetNome();
    }

    public String GetTarga(){
        return Targa;
    }
}

class Archivio{
    Vector<Cliente> Clienti;
    Vector<Automobile> Automobili;
    Archivio(){
        Clienti = new Vector<Cliente>(3,1);
        Automobili = new Vector<Automobile>(3,1);
    }

    public void AddCliente(String UnNome){
        Cliente c = new Cliente(UnNome);
        Clienti.add(c);
    }

    public void AddAutomobile(String UnaTarga, String UnNome){
        Cliente c = new Cliente(UnNome);
        Automobile a = new Automobile(UnaTarga,c);
        Automobili.add(a);
    }

    public void RemoveAutomobile(String UnaTarga){
        for(int i = 0;i<Automobili.size();i++){
            if(UnaTarga.equals(Automobili.elementAt(i).GetTarga())){
                Automobili.remove(i);
            }
        }
    }

    public void ClienteTarga(String UnaTarga){
        for(int i = 0;i<Automobili.size();i++){
            if(UnaTarga.equals(Automobili.elementAt(i).GetTarga())){
                System.out.println("Proprietario auto: "+Automobili.elementAt(i).GetNome());
            }
        }
    }

    public void RemoveCliente(String UnNome){
        for(int i = 0;i<Automobili.size();i++){
            if(UnNome.equals(Automobili.elementAt(i).GetNome())){
                if(Clienti.contains(UnNome)){
                    Clienti.remove(i);
                }
                Automobili.remove(i);
            }
        }
    }

    public void ContaAuto(String UnNome){
        System.out.println("Quantita di auto ---> "+Automobili.size());
    }
}
public class ProvaAutomobili {
    public static void main(String[] args) {
        Archivio Alianz = new Archivio();Archivio alianz = new Archivio();
        alianz.AddCliente("Rossi");
        alianz.AddCliente("Pizzato");
        alianz.AddCliente("Bressan");
        System.out.println("ho aggiunto MI2534, Pizzato");
        alianz.AddAutomobile

("MI2534","Pizzato");
        System.out.println("ho aggiunto MI6484, Borgato");
        alianz.AddAutomobile

("MI6484","Borgato");
        System.out.println("ho aggiunto MI8960, Rossi");
        alianz.AddAutomobile
("MI8960","Rossi");
        System.out.println("ho aggiunto MI8970 Rossi");
        alianz.AddAutomobile
("MI8970","Rossi");
        System.out.println("ho aggiunto MI895660, Rossi");
        alianz.AddAutomobile
("MI895660","Rossi");
        System.out.println("ho aggiunto MI89760, Rossi");
        alianz.AddAutomobile
("MI89760","Rossi");
        System.out.println("ho aggiunto MI876543, Bressan");
        alianz.AddAutomobile
("MI876543","Bressan");
        System.out.println("ho aggiunto MI2539, Pizzato");
        alianz.AddAutomobile
("MI2539","Pizzato");
        System.out.println("stampa macchine di Rossi");
        System.out.println("stampa cliente della targa MI6484");
        alianz.ClienteTarga("MI6484");
        System.out.println("conteggio macchine di Rossi");
        System.out.println("eliminazione di Bressan");
        alianz.RemoveCliente("Bressan");
        System.out.println("eliminazione di Bressan");
        alianz.RemoveCliente("Bressan");


    }
}

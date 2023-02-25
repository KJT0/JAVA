import java.util.Vector;
import java.util.Scanner;

class Volo{
    protected String posti[];
    Vector<String>attesa;

    Volo(int massimo){
        posti = new String[massimo];
        attesa = new Vector<String>(3,2);
        for(int i = 0;i<posti.length;i++){
            posti[i] = "";
        }
    }

    public void Prenota(String nome){
        boolean PostoLibero = true;
        for(int i = 0;i< posti.length;i++){
            if(posti[i].equals("")) {
                PostoLibero = true;
                posti[i] = nome;
                System.out.println("Posto n."+(i+1)+" riservato per il signor/a --> "+nome);
                break;
            }
            PostoLibero = false;
        }
        if(PostoLibero == false){
            System.out.println("~-----------------------------------------------~");
            System.out.println(nome+" aggiunto alla lista di attesa!");
            System.out.println("~-----------------------------------------------~");
            attesa.add(nome);
        }
    }
    public void Disdici(String nome){
        boolean PrenotazioneDisdetta = false;
            for(int i = 0;i< posti.length;i++){
                if(posti[i].equals(nome)){
                    PrenotazioneDisdetta = true;
                    System.out.println("~-----------------------------------------------~");
                    System.out.println("Prenotazione disdetta da parte del signor/a --> "+nome+" !");
                    System.out.println("~-----------------------------------------------~");
                    posti[i] = "";
                    posti[i] = attesa.elementAt(0);
                    attesa.remove(0);
                    break;
                }
                PrenotazioneDisdetta = false;
            }
            if(PrenotazioneDisdetta == false){
                System.out.println("Prenotazione non trovata!");
            }
    }

    public void StampaPosti(){
        for(int i = 0;i< posti.length;i++){
            System.out.println("Posto n."+(i+1)+" occupato dal signor:"+posti[i]);
        }
    }

    public void StampaAttesa(){
        if(attesa.size() == 0){
            System.out.println("|-------------------------------------------------------|");
            System.out.println("  Non c'e' nessun membro in attesa!");
            System.out.println("|-------------------------------------------------------|");
            return;
        }
        else
        {
            for (int i = 0; i < attesa.size(); i++) {
                System.out.println("|-------------------------------------------------------|");
                System.out.println("Membro in attesa n." + (i + 1) + " il signor/a --> " + attesa.elementAt(i));
                System.out.println("|-------------------------------------------------------|");
            }
        }
    }
}
public class ProvaCompagniaAerea {
    public static void main(String[] args) {
        final int Max = 5;
        Volo ItaliaAirLines = new Volo(Max);
        System.out.println("|-------------------------------------------------------|");
        System.out.println("Numero massimo di posti -> "+Max);
        System.out.println("|-------------------------------------------------------|");
        ItaliaAirLines.Prenota("Massimo");
        ItaliaAirLines.Prenota("Giulia");
        ItaliaAirLines.Prenota("Kevin");
        ItaliaAirLines.Prenota("Davide");
        ItaliaAirLines.Prenota("Francesca");
        ItaliaAirLines.Prenota("Leonardo");
        ItaliaAirLines.StampaPosti();
        ItaliaAirLines.StampaAttesa();
        ItaliaAirLines.Disdici("Kevin");
        ItaliaAirLines.StampaPosti();
        ItaliaAirLines.StampaAttesa();

    }
}

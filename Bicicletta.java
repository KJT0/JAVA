public class Bicicletta {
    //
    private double TagliaTelaio,Velocita;
    private String Marca;
    //
    Bicicletta(double TagliaTelaio,double Velocita,String Marca){
        this.TagliaTelaio = TagliaTelaio;
        this.Velocita = Velocita;
        this.Marca = Marca;
    }

    public String ToString(){
        String dati = "Bicicleta "+Marca+":"+TagliaTelaio+" velocita' "+Velocita+" km/h";
        return dati;
    }

    public void StampaStato(){
        System.out.println("Velocita':"+Velocita);
    }

    public static void main(String[] args) {
        Bicicletta b = new Bicicletta(2,2.30,"Siner");

    }
}


package Lokaler;

//Denne klasse repræsentere Lokaler
public class Lokaler {
    private Lokaler[] lokaler = new Lokaler[5];

    public Lokaler(){
        Lokaler lokaleStue = new Lokaler();
        Lokaler lokaleSovevaerelse = new Lokaler();
        Lokaler lokaleKoekken = new Lokaler();
        Lokaler lokaleKontor = new Lokaler();
        Lokaler lokaleSpisestue = new Lokaler();

        lokaler[0] = lokaleStue;
        lokaler[1] = lokaleSovevaerelse;
        lokaler[2] = lokaleKoekken;
        lokaler[3] = lokaleKontor;
        lokaler[4] = lokaleSpisestue;

        System.out.println(lokaler);
    }

}

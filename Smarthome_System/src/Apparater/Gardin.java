package Apparater;

//Denne klasse er til regulering af Gardiner.
//Dette er en subclass af superclass Apparater.
public class Gardin extends Apparater {

    private Gardin[] gardiner = new Gardin[6];

    public Gardin(){

        Gardin gardinSoveværelse = new Gardin();
        Gardin gardinStue = new Gardin();
        Gardin gardinKoekken = new Gardin();

        gardiner[1] = gardinSoveværelse;
        gardiner[2] = gardinStue;
        gardiner[3] = gardinKoekken;
    }

    public void traekOp(){

    }
    public void traekNed(){

    }
}

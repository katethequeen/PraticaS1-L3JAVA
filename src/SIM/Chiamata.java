package SIM;

public class Chiamata {
    public String numeroChiamato;
    public double durataChiamata;

    public Chiamata(String _numeroChiamato, double _durataChiamata) {
        this.numeroChiamato = _numeroChiamato;
        this.durataChiamata = _durataChiamata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public double getDurataChiamata() {
        return durataChiamata;
    }

}

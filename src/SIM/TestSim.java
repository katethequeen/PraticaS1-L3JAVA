package SIM;

public class TestSim {
    public static void main(String[] args) {
        Sim miaSim = new Sim("24323");

        miaSim.aggiungiChiamata(new Chiamata("47616767", 12));
        miaSim.aggiungiChiamata(new Chiamata("12394323", 2));
        miaSim.aggiungiChiamata(new Chiamata("92482841", 40));
        miaSim.aggiungiChiamata(new Chiamata("24283583", 3));
        miaSim.aggiungiChiamata(new Chiamata("84372723", 1));
        miaSim.aggiungiChiamata(new Chiamata("37572838", 22));

        miaSim.stampaDati();
    }
}

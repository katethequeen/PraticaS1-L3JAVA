package SIM;
import java.util.ArrayList;

public class Sim {
    private String numero;
    private double credito;
    private ArrayList<Chiamata> listaChiamate;

    public Sim(String _numero) {
        this.numero = _numero;
        this.credito = 0.0;
        this.listaChiamate = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public double getCredito() {
        return credito;
    }

    public ArrayList<Chiamata> getListaChiamate() {
        return listaChiamate;
    }

    //Aggiungo chiamata ad Array
    public void aggiungiChiamata(Chiamata chiamata) {
        if(listaChiamate.size() == 5) {
            listaChiamate.remove(0);
        }
        listaChiamate.add(chiamata);
    }

    public void stampaDati() {
        System.out.println("Numero di Telefono: " + numero);
        System.out.println("Credito telefonico: " + credito);
        System.out.println("Ultime 5 chiamate effetuate: ");
        for(Chiamata chiamata : listaChiamate) {
            System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato() + ",Durata chiamata: " + chiamata.getDurataChiamata() + " minuti");
        }
    }
}


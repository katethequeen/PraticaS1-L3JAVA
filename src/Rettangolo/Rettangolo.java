package Rettangolo;

import java.util.ArrayList;

public class Rettangolo {
    private double altezza;
    private double larghezza;
    private double perimetro;
    private double area;

    Rettangolo(double _altezza, double _larghezza) {
        this.altezza = _altezza;
        this.larghezza = _larghezza;
        this.area = this.altezza * this.larghezza;
        this.perimetro = (this.altezza + this.larghezza) * 2;
    }

    public void stampaRettangolo() {
        System.out.println("Area del rettangolo: " + this.area);
        System.out.println("Perimetro del rettangolo: " + this.perimetro);
    }
    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        double sommaAreaRettangoli = rettangolo1.area + rettangolo2.area;
        double sommaPertimetroRettangoli = rettangolo1.perimetro + rettangolo2.perimetro;
        System.out.println("Area rettangolo1: " + rettangolo1.area + "\nArea rettangolo2: " + rettangolo2.area + "\nSomma area entrambi: " + sommaAreaRettangoli
                + "\nPerimetro rettangolo1: " + rettangolo1.perimetro + "\nPerimetro rettangolo2: "+ rettangolo2.perimetro + "\nLa somma dei perimetri è: " + sommaPertimetroRettangoli
        );

    }
}

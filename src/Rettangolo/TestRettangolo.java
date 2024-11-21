package Rettangolo;

public class TestRettangolo {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(2.3, 5.4);
        Rettangolo rettangolo2 = new Rettangolo(5.6, 8.1);
        rettangolo1.stampaRettangolo();
        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}

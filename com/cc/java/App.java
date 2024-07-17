

// App.java
public class App{
    public static void main(String[] args) {
        // Erzeugen von 3 Instanzen der Klasse Konto
        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();

        // Ausgabe des Anfangs-Kontostands aller 3 Objekte
        System.out.println("Anfangs-Kontostand:");
        System.out.println("Konto1: " + konto1.getKontostand());
        System.out.println("Konto2: " + konto2.getKontostand());
        System.out.println("Konto3: " + konto3.getKontostand());

        // Ändern des Kontostands
        konto1.setKontostand(konto1.getKontostand() * 2); // Verdoppelung
        konto2.setKontostand(konto2.getKontostand() * 3); // Verdreifachung
        konto3.setKontostand(konto3.getKontostand() * 10); // Verzehnfachung

        // Ausgabe des aktuellen Kontostands aller 3 Objekte
        System.out.println("\nAktueller Kontostand:");
        System.out.println("Konto1: " + konto1.getKontostand());
        System.out.println("Konto2: " + konto2.getKontostand());
        System.out.println("Konto3: " + konto3.getKontostand());
    }
}

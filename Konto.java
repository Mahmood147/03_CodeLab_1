public class Konto{
    // Int Variable kontostand mit dem Anfangswert 10000
    int kontostand = 10000;

    // Methode zum Abrufen des aktuellen Kontostands
    public int getKontostand() {
        return kontostand;
    }

    // Methode zum Setzen eines neuen Kontostands
    public void setKontostand(int neuerKontostand) {
        kontostand = neuerKontostand;
    }
}

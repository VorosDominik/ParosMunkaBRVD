package main;

public class Konyvtar {

    private AbstractTermek[] termekek;
    private int termekDb;

    public Konyvtar(int db) {
        termekDb = 0;
        termekek = new AbstractTermek[db];
    }

    public void felvesz(AbstractTermek termek) {
        if (termekDb < termekek.length) {
            termekek[termekDb++] = termek;
        } else {
            System.out.println("A Könyvtárban nincs hely!");
        }
    }

    public AbstractTermek[] getTermekek() {
        AbstractTermek[] jelenlegitermek = new AbstractTermek[this.termekek.length];
        for (int i = 0; i < termekDb; i++) {
            AbstractTermek aktualisTermek = this.termekek[i];
            if (aktualisTermek != null) {
                jelenlegitermek[i] = aktualisTermek;
            }
        }
        return jelenlegitermek;

    }

    public void termekek() {
        for (AbstractTermek termek : getTermekek()) {
            if (termek != null) {
                System.out.println(termek);
            }
        }
    }

    public void run() {
        
    }
}
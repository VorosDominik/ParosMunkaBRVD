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
        System.out.println("A könyvtárban lévő termékek");
        for (AbstractTermek termek : getTermekek()) {
            if (termek != null) {
                System.out.println(termek);
            }
        }
    }
    public void kolcsonozhető(){
            System.out.println("A könyvtárban lévő  kolcsonozhető termékek");
        for (AbstractTermek termek : getTermekek()) {
            if (termek != null) {
                
                if(termek instanceof Magazin){
                      System.out.println(termek);
                } 
                
                
                else {
                  ;
                }
            }
        }
    
    
    
    
    }

    public static void run() {
         Konyvtar k1 = new Konyvtar(5);

        k1.felvesz(new Konyv("konyv1"));
        k1.felvesz(new Konyv("konyv2"));
        k1.felvesz(new Magazin("Magazin3"));
        k1.felvesz(new Magazin("Magazin4"));
        k1.felvesz(new Magazin("Magazin5"));
        k1.felvesz(new Magazin("Kosuth Leves Táborában"));
        
        
        k1.termekek();
        k1.kolcsonozhető();
        
    }
}

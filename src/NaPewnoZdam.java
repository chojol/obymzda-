public class NaPewnoZdam {

    private String nazwaPrzedmiotu;
    private int przewidywanaOcena;
    private String nazwiskoNauczyciela;

    public NaPewnoZdam(String nazwaPrzedmiotu, int przewidywanaOcena, String nazwiskoNauczyciela){
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
        this.przewidywanaOcena = przewidywanaOcena;
        this.nazwiskoNauczyciela = nazwiskoNauczyciela;
    }

    public NaPewnoZdam(NaPewnoZdam naPewnoZdam){
        this.nazwaPrzedmiotu = naPewnoZdam.nazwaPrzedmiotu;
        this.przewidywanaOcena = naPewnoZdam.przewidywanaOcena;
        this.nazwiskoNauczyciela = naPewnoZdam.nazwiskoNauczyciela;
    }

    public String getNazwaPrzedmiotu() {
        return nazwaPrzedmiotu;
    }

    public void setNazwaPrzedmiotu(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }

    public int getPrzewidywanaOcena() {
        return przewidywanaOcena;
    }

    public void setPrzewidywanaOcena(int przewidywanaOcena) {
        this.przewidywanaOcena = przewidywanaOcena;
    }

    public String getNazwiskoNauczyciela() {
        return nazwiskoNauczyciela;
    }

    public void setNazwiskoNauczyciela(String nazwiskoNauczyciela) {
        this.nazwiskoNauczyciela = nazwiskoNauczyciela;
    }

    @Override
    public String toString(){
        return "na pewno zdam z " + this.nazwaPrzedmiotu + ". oczekuje dostać " + this.przewidywanaOcena + ". Nauczyciel " + this.nazwiskoNauczyciela + " jest najlepszy";
    }

    public void radosc(String tekst){
        for(int i=0; i<przewidywanaOcena; i++){
            System.out.println(tekst);
        }
    }
}
public class uzytkownik {
    String imie;
    String nazwisko;
    int wiek;
    String nick;

    public uzytkownik(String imie, String nazwisko, int wiek, String nick) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.nick = nick;
    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}

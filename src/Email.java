public class Email {
    private String testo;
    private String mittente;
    public Email(String testo, String mittente) {
        this.testo = testo;
        this.mittente = mittente;
    }
    public void setTesto(String testo) {
        this.testo = testo;
    }
    public String getTesto() {
        return testo;
    }
    public void setMittente(String mittente) {
        this.mittente = mittente;
    }
    public String getMittente() {
        return mittente;
    }
    public String toString() {
        return "Mittente: <" + mittente + "> ; Testo: <" + getTesto() + ">";
    }
}
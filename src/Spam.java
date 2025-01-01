public class Spam extends Email {
    private String avvertimento;
    public Spam(String testo, String mittente, String avvertimento) {
        super(testo, mittente);
        this.avvertimento = avvertimento;
    }
    public void setAvvertimento(String avvertimento) {
        this.avvertimento = avvertimento;
    }
    public String getAvvertimento() {
        return avvertimento;
    }
    public String getTesto() {
        return "ATTENZIONE: Il contenuto è stato segnalato come SPAM e non verrà mostrato.";
    }
}
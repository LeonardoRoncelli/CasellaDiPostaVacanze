public class Spam extends Email{
    String avvertimento;
    public Spam(String testo,String mittente,String avvertimento){
        super(testo,mittente);
        this.avvertimento=avvertimento;
    }
    public void setAvvertimento(String avvertimento){
        this.avvertimento=avvertimento;
    }
    public String getAvvertimento(){
        return avvertimento;
    }
}
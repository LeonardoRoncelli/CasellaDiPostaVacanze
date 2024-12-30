public class Casella extends Email{
    Email[]tutteLeEmail=new Email[1000];
    public Casella(String mittente,String testo){
        super(testo,mittente);
    }
    public void aggiungiEmail(Email aggiunta){
        for(int i=0;i<tutteLeEmail.length;i++){
            if(tutteLeEmail[i]==null){
                tutteLeEmail[i]=aggiunta;
                break;
            }
        }
    }
    public void visualizzaEmail(){
        for(int i=0;i<tutteLeEmail.length;i++){
            if(tutteLeEmail[i]!=null){
                System.out.println(tutteLeEmail[i].toString());
            }
        }
    }
    public String toString(){
        return "Mittente: "+"<"+getMittente()+">"+" ;"+"Testo: "+"<"+getTesto()+">";
    }
}
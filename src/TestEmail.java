import java.util.Scanner;
public class TestEmail {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        Casella casella= new Casella("","");
        int scelta;
        do{
            System.out.println("1 - Aggiungi una Email alla lista\n"+
                    "2 - Visualizza tutte le Email presenti nella lista\n"+
                    "0 - Esci");
            System.out.print("Inserisci la scelta: ");
            scelta= input.nextInt();
            switch (scelta){
                case 1:{
                    String mittente;
                    String testo;
                    System.out.print("Inserisci il mittente: ");
                    mittente= input.next();
                    System.out.print("Inserisci il testo: ");
                    testo= input.next();
                    Email aggiunta=new Email(mittente,testo);
                    casella.aggiungiEmail(aggiunta);
                    break;
                }
                case 2:{
                    casella.visualizzaEmail();
                    break;
                }
                case 0:{
                    break;
                }
                default:System.out.println("OPZIONE INSERITA NON VALIDA!");
            }
        }while (scelta!=0);
    }
}
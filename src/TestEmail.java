import java.util.Scanner;
public class TestEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Casella casella = new Casella();
        int scelta;
        do {
            System.out.println("1 - Aggiungi una Email alla lista\n" +
                    "2 - Visualizza tutte le Email presenti nella lista\n" +
                    "0 - Esci");
            System.out.print("Inserisci la scelta: ");
            scelta = input.nextInt();
            input.nextLine();
            switch (scelta) {
                case 1: {
                    System.out.println("1 - Email normale\n" +
                            "2 - Email SPAM");
                    System.out.print("Inserisci il tipo di email: ");
                    int tipo = input.nextInt();
                    input.nextLine();
                    System.out.print("Inserisci il mittente: ");
                    String mittente = input.nextLine();
                    System.out.print("Inserisci il testo: ");
                    String testo = input.nextLine();
                    if (tipo == 1) {
                        Email aggiunta = new Email(testo, mittente);
                        casella.aggiungiEmail(aggiunta);
                    } else if (tipo == 2) {
                        System.out.print("Inserisci l'avvertimento: ");
                        String avvertimento = input.nextLine();
                        Spam aggiunta = new Spam(testo, mittente, avvertimento);
                        casella.aggiungiEmail(aggiunta);
                    } else {
                        System.out.println("Tipo non valido!");
                    }
                    break;
                }
                case 2: {
                    casella.visualizzaEmail();
                    break;
                }
                case 0: {
                    System.out.println("Uscita dal programma.");
                    break;
                }
                default:
                    System.out.println("OPZIONE INSERITA NON VALIDA!");
            }
        } while (scelta!= 0);
    }
}
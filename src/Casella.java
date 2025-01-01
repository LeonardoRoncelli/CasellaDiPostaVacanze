public class Casella {
    private Email[] tutteLeEmail = new Email[1000];
    public void aggiungiEmail(Email aggiunta) {
        for (int i = 0; i < tutteLeEmail.length; i++) {
            if (tutteLeEmail[i] == null) {
                tutteLeEmail[i] = aggiunta;
                return;
            }
        }
        System.out.println("Errore: La casella di posta è piena!");
    }
    public void visualizzaEmail() {
        boolean vuota = true;
        for (int i = 0; i < tutteLeEmail.length; i++) {
            if (tutteLeEmail[i] != null) {
                System.out.println(tutteLeEmail[i]); // Usa il metodo toString di Email/Spam
                vuota = false;
            }
        }
        if (vuota) {
            System.out.println("Nessuna email presente nella lista.");
        }
    }
}
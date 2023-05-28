import java.util.*;
public class Main {

	public static void main(String[] args) {
		
        CollezioneSpedizioni collezione = new CollezioneSpedizioni();

        
        Scanner scanner = new Scanner(System.in);

        

        System.out.println("Inserisci il n umero di mittenti da inserire:");
        int numeroMittenti = scanner.nextInt();
        scanner.nextLine(); 

        // Ciclo per inserire i mittenti
        for (int i = 0; i < numeroMittenti; i++) {
            System.out.println("Inserisci i dati del mittente " + (i+1) + ":");
            
            System.out.print("Nome: ");
            String nomeMittente = scanner.nextLine();
            System.out.print("Cognome: ");
            String cognomeMittente = scanner.nextLine();
            System.out.print("Citta: ");
            String cittaMittente = scanner.nextLine();
            System.out.print("Indirizzo: ");
            String indirizzoMittente = scanner.nextLine();
            System.out.print("Numero ID: ");
            String numeroIDMittente = scanner.nextLine();
            System.out.print("Numero di telefono: ");
            String numeroTelefonoMittente = scanner.nextLine();
            Cliente mittente = new Cliente(nomeMittente, cognomeMittente, cittaMittente, indirizzoMittente, numeroIDMittente, numeroTelefonoMittente);
            collezione.aggiungiMittente(mittente);
        }

        
        System.out.print("Inserisci il numero di destinatari da aggiungere: ");
        int numeroDestinatari = scanner.nextInt();
        scanner.nextLine(); 
        
        // Ciclo per inserire i destinatari
        for (int i = 0; i < numeroDestinatari; i++) {
            System.out.println("Inserisci i dati del destinatario " + (i+1) + ":");
            System.out.println("Inserisci i dati del destinatario:");
            System.out.print("Nome: ");
            String nomeDestinatario = scanner.nextLine();
            System.out.print("Cognome: ");
            String cognomeDestinatario = scanner.nextLine();
            System.out.print("Citta: ");
            String cittaDestinatario = scanner.nextLine();
            System.out.print("Indirizzo: ");
            String indirizzoDestinatario = scanner.nextLine();
            System.out.print("Numero ID: ");
            String numeroIDDestinatario = scanner.nextLine();
            System.out.print("Numero di telefono: ");
            String numeroTelefonoDestinatario = scanner.nextLine();
            System.out.print("Inserisci il numero di mittenti da aggiungere: ");
            Cliente destinatario = new Cliente(nomeDestinatario, cognomeDestinatario, cittaDestinatario, indirizzoDestinatario, numeroIDDestinatario, numeroTelefonoDestinatario);
            collezione.aggiungiDestinatario(destinatario);
        }
        System.out.print("Inserisci il codice della spedizione: ");
        String codiceSpedizione = scanner.nextLine();
	}

}

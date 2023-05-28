import java.util.*;
// Classe per gestire l'inca-ricato
public class Incaricato {
    private CollezioneSpedizioni collezioneSpedizioni;

    public Incaricato(CollezioneSpedizioni collezioneSpedizioni) {
        this.collezioneSpedizioni = collezioneSpedizioni;
    }

    public void ricezione(String codice) {
        try {
            Spedizione spedizione = collezioneSpedizioni.ricercaSpedizione(codice);
            Cliente mittente = spedizione.getMittente();
            Cliente destinatario = spedizione.getDestinatario();
            System.out.println("Mittente: " + mittente.getNome() + " " + mittente.getCognome());
            System.out.println("Destinatario: " + destinatario.getNome() + " " + destinatario.getCognome());
            System.out.println("Mittente Indirizzo: " + mittente.getIndirizzo() + ", " + mittente.getCitta());
            System.out.println("Destinatario Indirizzo: " + destinatario.getIndirizzo() + ", " + destinatario.getCitta());
            System.out.println("Mittente Numero Telefono: " + mittente.getNumeroTelefono());
            System.out.println("Destinatario Numero Telefono: " + destinatario.getNumeroTelefono());
        } catch (NoSuchElementException e) {
            System.out.println("Spedizione non trovata");
        }
    }
}
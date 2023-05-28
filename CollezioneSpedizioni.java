import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class CollezioneSpedizioni {
    private List<Spedizione> spedizioni;
    private List<Cliente> mittenti;
    private List<Cliente> destinatari;

    public CollezioneSpedizioni() {
        mittenti = new ArrayList<>();
        destinatari = new ArrayList<>();
        spedizioni = new ArrayList<>();
    }

    public void aggiungiMittente(Cliente mittente) {
        mittenti.add(mittente);
    }

    public void aggiungiDestinatario(Cliente destinatario) {
        destinatari.add(destinatario);
    }
    

    public void aggiungiSpedizione(Spedizione spedizione) {
        spedizioni.add(spedizione);
    }

    public Spedizione ricercaSpedizione(String codice) throws NoSuchElementException {
        for (Spedizione spedizione : spedizioni) {
            if (spedizione.getCodice().equals(codice)) {
                return spedizione;
            }
        }
        throw new NoSuchElementException("Spedizione non trovata");
    }
    
    public Cliente ricercaMittentiPerID(String numeroID) {
        for (Cliente cliente : mittenti) {
            if (cliente.getNumeroID().equals(numeroID)) {
                return cliente; 
            }
        }
        return null; 
    }
    
    public Cliente ricercaDestinatariPerID(String numeroID) {
        for (Cliente cliente : destinatari) {
            if (cliente.getNumeroID().equals(numeroID)) {
                return cliente;
            }
        }
        return null; 
    }
}
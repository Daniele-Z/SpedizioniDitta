// Classe per rappresentare una spedizione
public class Spedizione {
    private String codice;
    private Cliente mittente;
    private Cliente destinatario;
    
    public Spedizione(String codice, Cliente mittente, Cliente destinatario) {
        this.codice = codice;
        this.mittente = mittente;
        this.destinatario = destinatario;
    }

    public String getCodice() {
        return codice;
    }

    public Cliente getMittente() {
        return mittente;
    }

    public Cliente getDestinatario() {
        return destinatario;
    }
}

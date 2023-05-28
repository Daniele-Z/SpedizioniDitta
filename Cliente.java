
public class Cliente {
    private String nome;
    private String cognome;
    private String citta;
    private String indirizzo;
    private String numeroID;
    private String numeroTelefono;

    public Cliente(String nome, String cognome, String citta, String indirizzo, String numeroID, String numeroTelefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.citta = citta;
        this.indirizzo = indirizzo;
        this.numeroID = numeroID;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCitta() {
        return citta;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getNumeroID() {
        return numeroID;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }
}
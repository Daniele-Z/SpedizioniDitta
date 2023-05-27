/*Fatto da Simone Peracchi */

public class Cliente {
	private String nome;
	private String cognome;
	private String citta;
	private String indirizzo;
	private int N_Tel; 
	private int numeroID; 
	
	public Cliente() {
		setNome(nome);
		setCognome(cognome);
		setCitta(citta);
		setIndirizzo(indirizzo);
		setN_Tel(N_Tel);
		setNumeroID(numeroID);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCongnome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public int getN_Tel() {
		return N_Tel;
	}
	public void setN_Tel(int n_Tel) {
		N_Tel = n_Tel;
	}
	public int getNumeroID() {
		return numeroID;
	}
	public void setNumeroID(int numeroID) {
		this.numeroID = numeroID;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
}

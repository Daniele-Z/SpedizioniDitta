/* Fatto da Zerasachi Daniele */
public class Spedizione {
	private Prodotto listaProdotti[];
	private int idSpedizione;
	
	public Prodotto(int num_prodotti, int idSpedizione){
		setIdSpedizione(idSpedizione);
		listaProdotti=new Prodotto[num_prodotti];
		for(int i=0;i<num_prodotti;i++) {
			listaProdotti[i]=new Prodotto();
		}
	}
	
	public Prodotto[] getListaProdotti() {
		return listaProdotti;
	}

	public void setListaProdotti(Prodotto listaProdotti[]) {
		this.listaProdotti = listaProdotti;
	}
	
	public void addProdotti(int i, int spedizione, String nome, int quantita, float prezzo) {
		listaProdotti[i].setNome(nome);
		listaProdotti[i].setQuantita(quantita);
		listaProdotti[i].setPrezzo(prezzo);
		
	}

	public int getIdSpedizione() {
		return idSpedizione;
	}

	public void setIdSpedizione(int idSpedizione) {
		this.idSpedizione = idSpedizione;
	}
	
	public void ricercaSpedizione(int idSpedizione) {
	    if (this.idSpedizione == idSpedizione) {
	        System.out.println("Spedizione trovata!");
	        System.out.println("ID Spedizione: " + idSpedizione);
	        System.out.println("Lista dei prodotti:");

	        for (Prodotto prodotto : listaProdotti) {
	            System.out.println("Nome: " + prodotto.getNome());
	            System.out.println("Quantità: " + prodotto.getQuantita());
	            System.out.println("Prezzo: " + prodotto.getPrezzo());
	            System.out.println("--------------------");
	        }
	    } else {
	        System.out.println("Spedizione non trovata.");
	    }
	}
}

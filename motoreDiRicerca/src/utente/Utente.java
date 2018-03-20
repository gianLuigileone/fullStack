package utente;

import gruppo.Gruppo;

public class Utente 
{
	private String idUtente;
	private Gruppo idGruppo;

	
	public Utente(String idUtente, Gruppo idGruppo) {
		super();
		this.idUtente = idUtente;
		this.idGruppo = idGruppo;
	}
	public String getIdUtente() {
		return idUtente;
	}
	public void setIdUtente(String idUtente) {
		this.idUtente = idUtente;
	}
	public Gruppo getIdGruppo() {
		return idGruppo;
	}
	public void setIdGruppo(Gruppo idGruppo) {
		this.idGruppo = idGruppo;
	}
	
	
	
	
}

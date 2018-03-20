package it.sopra.red.model.imp;

public class Utente 
{
	private String id;
	private String idGruppo;
	
	public Utente() {
		this.id = null;
		this.idGruppo = null;
	}
	public Utente(String id, String idGruppo) {
		
		this.id = id;
		this.idGruppo = idGruppo;
	}
	@Override
	public String toString() {
		return "Utente [id=" + id + ", idGruppo=" + idGruppo + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdGruppo() {
		return idGruppo;
	}
	public void setIdGruppo(String idGruppo) {
		this.idGruppo = idGruppo;
	}
	
}

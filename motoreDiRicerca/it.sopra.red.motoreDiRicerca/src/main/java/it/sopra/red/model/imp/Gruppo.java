package it.sopra.red.model.imp;

import java.util.HashSet;

public class Gruppo 
{
	
	private String idGruppo;
	HashSet<Page>listaPagine=new HashSet<Page>();
	
	
	
	public Gruppo(String idGruppo) {
		super();
		this.idGruppo = idGruppo;
	}
	public void addPagina(Page pagina)
	{
		listaPagine.add(pagina);
	}
	public void removePagina(Page pagina)
	{
		listaPagine.remove(pagina);
	}
	
	public String getIdGruppo() {
		return idGruppo;
	}
	public void setIdGruppo(String idGruppo) {
		this.idGruppo = idGruppo;
	}
	public HashSet<Page> getListaPagine() {
		return listaPagine;
	}
	public void setListaPagine(HashSet<Page> listaPagine) {
		this.listaPagine = listaPagine;
	}
	
}

package gruppo;
import enums.Azioni;
import pages.Pages;

public class Gruppo
{
	private String idGruppo;
	Pages sito;
	Azioni azioni;
	
	public Gruppo(String idGruppo,Pages siti,Azioni azioni) 
	{
				this.idGruppo = idGruppo;
				this.sito=siti;
				this.azioni=azioni;
	}

	public Pages getSito() {
		return sito;
	}

	public void setSito(Pages sito) {
		this.sito = sito;
	}

	public Azioni getAzioni() {
		return azioni;
	}

	public void setAzioni(Azioni azioni) {
		this.azioni = azioni;
	}

	public String getIdGruppo() {
		return idGruppo;
	}

	public void setIdGruppo(String idGruppo) {
		this.idGruppo = idGruppo;
	}
	
	
	
	
}

package esercizio.testFinale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comuni", schema = "GESTIONE_CF")
public class Comuni {

	@Id
	@GeneratedValue
	private int id;
	@Column(name = "Comune")
	private String comune;
	@Column(name = "Provincia")
	private String provincia;
	@Column(name = "Regione")
	private String regione;
	@Column(name = "Prefisso")
	private String prefisso;
	@Column(name = "CAP")
	private String cap;
	@Column(name = "CodFisco")
	private String codFisco;
	@Column(name = "Abitanti")
	private String abitanti;
	@Column(name = "Link")
	private String link;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComune() {
		return comune;
	}
	public void setComune(String comune) {
		this.comune = comune;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getRegione() {
		return regione;
	}
	public void setRegione(String regione) {
		this.regione = regione;
	}
	public String getPrefisso() {
		return prefisso;
	}
	public void setPrefisso(String prefisso) {
		this.prefisso = prefisso;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public String getCodFisco() {
		return codFisco;
	}
	public void setCodFisco(String codFisco) {
		this.codFisco = codFisco;
	}
	public String getAbitanti() {
		return abitanti;
	}
	public void setAbitanti(String abitanti) {
		this.abitanti = abitanti;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	

}

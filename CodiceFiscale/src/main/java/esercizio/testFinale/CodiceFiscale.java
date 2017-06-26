package esercizio.testFinale;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CodiceFiscale", schema = "GESTIONE_CF")

public class CodiceFiscale {

	@Id
	@GeneratedValue
	private int id;
	private String cognome;
	private String nome;
	private String sesso;
	private String dataDiNascita;
	private String comuneDiNascita;
	private String codiceFiscale;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public String getComuneDiNascita() {
		return comuneDiNascita;
	}

	public void setComuneDiNascita(String comuneDiNascita) {
		this.comuneDiNascita = comuneDiNascita;
	}

	public String getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(String dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	
	

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	@Override
	public String toString() {
		return "CodiceFiscale [id=" + id + ", cognome=" + cognome + ", nome=" + nome + ", sesso=" + sesso
				+ ", dataDiNascita=" + dataDiNascita + ", comuneDiNascita=" + comuneDiNascita + "]";
	}
	
	

	

	
	
	

}

package it.sincrono.corso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comuni")
public class Comune
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="nome")
	private String nome;
	@Column(name="id_regione")
	private int idRegione;
	@Column(name="id_provincia")
	private int idProvincia;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdRegione() {
		return idRegione;
	}
	public void setIdRegione(int idRegione) {
		this.idRegione = idRegione;
	}
	public int getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}
	
}

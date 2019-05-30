package it.sincrono.corso.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="regioni")
public class Regione
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "latitudine")
	private long latitudine;
	@Column(name = "longitudine")
	private long longitudine;
	
}

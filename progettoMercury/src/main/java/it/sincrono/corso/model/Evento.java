package it.sincrono.corso.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Evento {
	
	@Entity
	@Table(name="eventi")
	public class Provincia
	{
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		@Column(name="nome")
		private String nome;
		@Column(name="data_inizio")
		private Calendar dataInizio;
		@Column(name="data_fine")
		private Calendar dataFine;
		@Column(name="descrizione_evento")
		private String descrizioneEvento;
		@Column(name="tipologia_evento")
		private String tipologiaEvento;
		
	}

}

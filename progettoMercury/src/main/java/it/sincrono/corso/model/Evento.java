package it.sincrono.corso.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="eventi")
public class Evento
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
		public Calendar getDataInizio() {
			return dataInizio;
		}
		public void setDataInizio(Calendar dataInizio) {
			this.dataInizio = dataInizio;
		}
		public Calendar getDataFine() {
			return dataFine;
		}
		public void setDataFine(Calendar dataFine) {
			this.dataFine = dataFine;
		}
		public String getDescrizioneEvento() {
			return descrizioneEvento;
		}
		public void setDescrizioneEvento(String descrizioneEvento) {
			this.descrizioneEvento = descrizioneEvento;
		}
		public String getTipologiaEvento() {
			return tipologiaEvento;
		}
		public void setTipologiaEvento(String tipologiaEvento) {
			this.tipologiaEvento = tipologiaEvento;
		}
		
}
	



package br.com.itauhextra.horasextras.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itmn232_ocorrencia")

public class Ocorrencia {
	@Id
	@Column(name = "num_seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numSeq;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "data_oc")
	private LocalDate data;

	@Column(name = "num_horas")
	private LocalTime numHoras;

	@Column(name = "ponto_manual")
	private int pontoManual;

	@Column(name = "status_oc")
	private int status;

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario colaborador;

	@ManyToOne
	@JoinColumn(name = "id_atividade")
	private Atividade atividade;

	public int getNumSeq() {
		return numSeq;
	}

	public void setNumSeq(int numSeq) {
		this.numSeq = numSeq;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(LocalTime numHoras) {
		this.numHoras = numHoras;
	}

	public int getPontoManual() {
		return pontoManual;
	}

	public void setPontoManual(int pontoManual) {
		this.pontoManual = pontoManual;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Usuario getColaborador() {
		return colaborador;
	}

	public void setColaborador(Usuario colaborador) {
		this.colaborador = colaborador;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

}

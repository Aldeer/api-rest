package com.emagomiladev.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "pacientes", uniqueConstraints = { @UniqueConstraint(columnNames = { "dni" }) })
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private int dni;

	@Column(name = "fecha_de_nacimiento")
	private Date fechaNacimiento;

	@Column(name = "ultima_visita")
	private Date ultimaVisita;
	private double altura;
	private double peso;

	@Column(name = "obra_social")
	private int obraSolcial;

	public Paciente() {

	}

	public Paciente(Long id, String nombre, String apellido, int dni, Date fechaNacimiento, Date ultimaVisita,
			double altura, double peso, int obraSolcial) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.ultimaVisita = ultimaVisita;
		this.altura = altura;
		this.peso = peso;
		this.obraSolcial = obraSolcial;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getUltimaVisita() {
		return ultimaVisita;
	}

	public void setUltimaVisita(Date ultimaVisita) {
		this.ultimaVisita = ultimaVisita;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getObraSolcial() {
		return obraSolcial;
	}

	public void setObraSolcial(int obraSolcial) {
		this.obraSolcial = obraSolcial;
	}

}

package com.emagomiladev.app.dto;

import java.util.Date;

public class PacienteDTO {

	private Long id;
	private String nombre;
	private String apellido;
	private int dni;
	private Date fechaNacimiento;
	private Date ultimaVisita;
	private double altura;
	private double peso;
	private int obraSocial;

	public PacienteDTO() {

	}

	public PacienteDTO(Long id, String nombre, String apellido, int dni, Date fechaNacimiento, Date ultimaVisita,
			double altura, double peso, int obraSocial) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.ultimaVisita = ultimaVisita;
		this.altura = altura;
		this.peso = peso;
		this.obraSocial = obraSocial;
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

	public int getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(int obraSocial) {
		this.obraSocial = obraSocial;
	}

}

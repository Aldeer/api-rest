package com.emagomiladev.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emagomiladev.app.dto.PacienteDTO;
import com.emagomiladev.app.services.PacienteService;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {

	@Autowired
	private PacienteService pacienteService;
	
	@PostMapping("/guardar")
	public ResponseEntity<PacienteDTO> guardarPaciente(@RequestBody PacienteDTO pacienteDTO){
		
		return new ResponseEntity<PacienteDTO>(pacienteService.crearPaciente(pacienteDTO), HttpStatus.CREATED);
	}
}

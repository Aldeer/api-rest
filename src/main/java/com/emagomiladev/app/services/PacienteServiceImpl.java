package com.emagomiladev.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emagomiladev.app.dao.PacienteDAO;
import com.emagomiladev.app.dto.PacienteDTO;
import com.emagomiladev.app.entity.Paciente;
import com.emagomiladev.app.wrapper.PacienteWrapper;

@Service
public class PacienteServiceImpl implements PacienteService {

	@Autowired
	private PacienteDAO pacienteDAO;

	@Override
	public PacienteDTO crearPaciente(PacienteDTO pacienteDTO) {

		Paciente paciente = PacienteWrapper.dtoToEntity(pacienteDTO);
		Paciente nuevoPaciente = pacienteDAO.save(paciente);
		PacienteDTO pacienteRespuesta = PacienteWrapper.entityToDto(nuevoPaciente);
		
		return pacienteRespuesta;
	}

}

package com.emagomiladev.app.wrapper;

import com.emagomiladev.app.dto.PacienteDTO;
import com.emagomiladev.app.entity.Paciente;

public class PacienteWrapper {

	public static PacienteDTO entityToDto(Paciente paciente) {
		PacienteDTO pacienteDTO = new PacienteDTO();

		pacienteDTO.setId(paciente.getId());
		pacienteDTO.setNombre(paciente.getNombre());
		pacienteDTO.setDni(paciente.getDni());
		pacienteDTO.setFechaNacimiento(paciente.getFechaNacimiento());
		pacienteDTO.setUltimaVisita(paciente.getUltimaVisita());
		pacienteDTO.setAltura(paciente.getAltura());
		pacienteDTO.setPeso(paciente.getPeso());
		pacienteDTO.setObraSocial(paciente.getObraSolcial());

		return pacienteDTO;
	}

	public static Paciente dtoToEntity(PacienteDTO pacienteDTO) {
		Paciente paciente = new Paciente();

		paciente.setNombre(pacienteDTO.getNombre());
		paciente.setDni(pacienteDTO.getDni());
		paciente.setFechaNacimiento(pacienteDTO.getFechaNacimiento());
		paciente.setUltimaVisita(pacienteDTO.getUltimaVisita());
		paciente.setAltura(pacienteDTO.getAltura());
		paciente.setPeso(pacienteDTO.getPeso());
		paciente.setObraSolcial(pacienteDTO.getObraSocial());

		return paciente;
	}
}

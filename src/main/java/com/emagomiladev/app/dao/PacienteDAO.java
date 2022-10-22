package com.emagomiladev.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emagomiladev.app.entity.Paciente;

@Repository
public interface PacienteDAO extends JpaRepository<Paciente, Long>{

}

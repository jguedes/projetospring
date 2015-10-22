package br.com.senai.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.model.pessoa.professor.Professor;

public interface IProfessorDAO extends JpaRepository<Professor, Long> {

}

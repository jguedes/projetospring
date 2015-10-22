package br.com.senai.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.model.pessoa.aluno.Aluno;

public interface IAlunoDAO extends JpaRepository<Aluno, Long> {

}

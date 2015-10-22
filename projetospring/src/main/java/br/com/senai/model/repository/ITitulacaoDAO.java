package br.com.senai.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.model.titulacao.Titulacao;

public interface ITitulacaoDAO extends JpaRepository<Titulacao, Long> {

}

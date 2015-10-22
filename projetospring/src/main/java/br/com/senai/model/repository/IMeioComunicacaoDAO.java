package br.com.senai.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.model.meiocomunicacao.MeioComunicacao;

public interface IMeioComunicacaoDAO extends JpaRepository<MeioComunicacao, Long> {

}

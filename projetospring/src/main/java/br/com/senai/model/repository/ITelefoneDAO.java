package br.com.senai.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.model.pessoa.Pessoa;
import br.com.senai.model.telefone.Telefone;

public interface ITelefoneDAO extends JpaRepository<Telefone, Long> {

	List<Telefone> findByPessoa(Pessoa pessoa);

}

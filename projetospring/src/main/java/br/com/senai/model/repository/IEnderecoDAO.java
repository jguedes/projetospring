package br.com.senai.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.model.endereco.Endereco;
import br.com.senai.model.pessoa.Pessoa;

public interface IEnderecoDAO extends JpaRepository<Endereco, Long> {

	List<Endereco> findByPessoa(Pessoa pessoa);

}
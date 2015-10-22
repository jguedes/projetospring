package br.com.senai.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.endereco.Cidade;
import br.com.senai.model.endereco.Endereco;
import br.com.senai.model.pessoa.Sexo;
import br.com.senai.model.pessoa.professor.Professor;
import br.com.senai.model.telefone.Telefone;
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "professorEditMB")
public class ProfessorEditMB {

	@Autowired
	private Fachada fachada;

	private Professor professor;

	private Endereco novoEndereco;

	private Telefone novoTelefone;

	private String pageTitulo;

	@PostConstruct
	private void init() {
		professor = new Professor();
		professor.setEnderecos(new ArrayList<Endereco>());
		professor.setTelefones(new ArrayList<Telefone>());
		novoEndereco = new Endereco();
		novoTelefone = new Telefone();
		professor.getEnderecos().add(novoEndereco);
		professor.getTelefones().add(novoTelefone);
		pageTitulo = "Cadastro de Professor";
	}

	public void preAlterar(Professor professor) {
		fachada.getEndereco(professor);
		fachada.getTelefone(professor);
		novoEndereco = new Endereco();
		novoTelefone = new Telefone();
		professor.getEnderecos().add(novoEndereco);
		professor.getTelefones().add(novoTelefone);
		setProfessor(professor);
		pageTitulo = "Atualização de Professor";
	}

	public String salvar() {

		if (!novoEndereco.getLogradouro().isEmpty() && !novoEndereco.getBairro().isEmpty()) {

			professor.getEnderecos().add(novoEndereco);

		}

		fachada.salvarProfessor(professor);

		return "success";
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Sexo> listaSexo() {

		return Arrays.asList(Sexo.values());

	}

	public Endereco getNovoEndereco() {

		return novoEndereco;
	}

	public void setNovoEndereco(Endereco novoEndereco) {
		this.novoEndereco = novoEndereco;
	}

	public List<Cidade> listaCidade() {

		return Arrays.asList(Cidade.values());

	}

	public Telefone getNovoTelefone() {
		return novoTelefone;
	}

	public void setNovoTelefone(Telefone novoTelefone) {
		this.novoTelefone = novoTelefone;
	}

	public String getPageTitulo() {
		return pageTitulo;
	}

}

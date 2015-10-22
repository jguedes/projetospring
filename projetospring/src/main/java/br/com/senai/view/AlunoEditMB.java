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
import br.com.senai.model.pessoa.aluno.Aluno;
import br.com.senai.model.pessoa.professor.Professor;
import br.com.senai.model.telefone.Telefone;
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "alunoEditMB")
public class AlunoEditMB {

	@Autowired
	private Fachada fachada;

	private Aluno aluno;

	private Endereco novoEndereco;

	private Telefone novoTelefone;

	private String pageTitulo;

	public Endereco getNovoEndereco() {
		return novoEndereco;
	}

	public void setNovoEndereco(Endereco novoEndereco) {
		this.novoEndereco = novoEndereco;
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

	@PostConstruct
	private void init() {
		aluno = new Aluno();
		aluno.setEnderecos(new ArrayList<Endereco>());
		aluno.setTelefones(new ArrayList<Telefone>());
		novoEndereco = new Endereco();
		novoTelefone = new Telefone();
		aluno.getEnderecos().add(novoEndereco);
		aluno.getTelefones().add(novoTelefone);
		pageTitulo = "Cadastro de Aluno";
	}

	public void preAlterar(Aluno aluno) {
		fachada.getEndereco(aluno);
		fachada.getTelefone(aluno);
		novoEndereco = new Endereco();
		novoTelefone = new Telefone();
		aluno.getEnderecos().add(novoEndereco);
		aluno.getTelefones().add(novoTelefone);
		setAluno(aluno);
		pageTitulo = "Atualização de Aluno";
	}

	public String salvar() {
		long newMatricula = fachada.getNewMatricula();

		if (!novoEndereco.getLogradouro().isEmpty() && !novoEndereco.getBairro().isEmpty()) {

			aluno.getEnderecos().add(novoEndereco);

		}
		aluno.setMatricula(newMatricula);
		fachada.salvarAluno(aluno);
		return "success";
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Sexo> listaSexo() {

		return Arrays.asList(Sexo.values());

	}

	public List<Cidade> listaCidade() {

		return Arrays.asList(Cidade.values());

	}

	public List<Professor> listaProfessor() {

		return fachada.listarProfessor();

	}

}

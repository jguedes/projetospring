package br.com.senai.support;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.senai.controller.AlunoBC;
import br.com.senai.controller.EnderecoBC;
import br.com.senai.controller.MeioComunicacaoBC;
import br.com.senai.controller.ProfessorBC;
import br.com.senai.controller.PublicacaoBC;
import br.com.senai.controller.TelefoneBC;
import br.com.senai.controller.TitulacaoBC;
import br.com.senai.controller.UsuarioBC;
import br.com.senai.model.Usuario;
import br.com.senai.model.endereco.Endereco;
import br.com.senai.model.meiocomunicacao.MeioComunicacao;
import br.com.senai.model.pessoa.Pessoa;
import br.com.senai.model.pessoa.aluno.Aluno;
import br.com.senai.model.pessoa.professor.Professor;
import br.com.senai.model.publicacao.Publicacao;
import br.com.senai.model.telefone.Telefone;
import br.com.senai.model.titulacao.Titulacao;

@Component
public class Fachada {

	@Autowired
	private UsuarioBC usuarioBC;

	@Autowired
	private TitulacaoBC titulacaoBC;

	@Autowired
	private ProfessorBC professorBC;

	@Autowired
	private AlunoBC alunoBC;

	@Autowired
	private MeioComunicacaoBC meioComunicacaoBC;

	@Autowired
	private PublicacaoBC publicacaoBC;

	@Autowired
	private EnderecoBC enderecoBC;

	@Autowired
	private TelefoneBC telefoneBC;

	public void salvarUsuario(Usuario usuario) {
		usuarioBC.salvarUsuario(usuario);
	}

	public void excluirUsuario(Usuario usuario) {
		usuarioBC.excluirUsuario(usuario);
	}

	public List<Usuario> listarUsuario() {
		return usuarioBC.listarUsuario();
	}

	////////////////////////////////////////////
	// Fachada para TitulacaoBC
	////////////////////////////////////////////

	public void salvarTitulacao(Titulacao titulacao) {
		titulacaoBC.salvarTitulacao(titulacao);
	}

	public void excluirTitulacao(Titulacao titulacao) {
		titulacaoBC.excluirTitulacao(titulacao);
	}

	public List<Titulacao> listarTitulacao() {
		return titulacaoBC.listarTitulacao();
	}

	////////////////////////////////////////////
	// Fachada para ProfessorBC
	////////////////////////////////////////////

	public void salvarProfessor(Professor professor) {

		professorBC.salvarProfessor(professor);

	}

	public void excluirProfessor(Professor professor) {
		professorBC.excluirProfessor(professor);
	}

	public List<Professor> listarProfessor() {
		return professorBC.listarProfessor();
	}

	////////////////////////////////////////////
	// Fachada para AlunoBC
	////////////////////////////////////////////

	public void salvarAluno(Aluno aluno) {
		alunoBC.salvarAluno(aluno);
	}

	public void excluirAluno(Aluno aluno) {
		alunoBC.excluirAluno(aluno);
	}

	public List<Aluno> listarAluno() {
		return alunoBC.listarAluno();
	}

	public long getNewMatricula() {
		return alunoBC.getNewMatricula();
	}

	////////////////////////////////////////////
	// Fachada para MeioComunicacaoBC
	////////////////////////////////////////////

	public void salvarMeioComunicacao(MeioComunicacao meioComunicacao) {
		meioComunicacaoBC.salvarMeioComunicacao(meioComunicacao);
	}

	public void excluirMeioComunicacao(MeioComunicacao meioComunicacao) {
		meioComunicacaoBC.excluirMeioComunicacao(meioComunicacao);
	}

	public List<MeioComunicacao> listarMeioComunicacao() {
		return meioComunicacaoBC.listarMeioComunicacao();
	}

	////////////////////////////////////////////
	// Fachada para PublicacaoBC
	////////////////////////////////////////////

	public void salvarPublicacao(Publicacao publicacao) {
		publicacaoBC.salvarPublicacao(publicacao);
	}

	public void excluirPublicacao(Publicacao publicacao) {
		publicacaoBC.excluirPublicacao(publicacao);
	}

	public List<Publicacao> listarPublicacao() {
		return publicacaoBC.listarPublicacao();
	}

	public void getEndereco(Pessoa pessoa) {

		List<Endereco> e = enderecoBC.getEnderecoByPessoa(pessoa);

		pessoa.setEnderecos(e);

	}

	public void getTelefone(Pessoa pessoa) {

		List<Telefone> t = telefoneBC.getTelefoneByPessoa(pessoa);

		pessoa.setTelefones(t);

	}

}

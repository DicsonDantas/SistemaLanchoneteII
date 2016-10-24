package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.dominio.Cliente;

public class ClienteDAO {

	private EntityManager manager = null;

	public ClienteDAO() {
		super();

		// CRIAR UM FACTORY COM AS CONFIGURA��ES DO BANCO
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("masterdog");

		// CRIAR O ENTITY MANAGER PARA PERSISTIR OS OBJETOS
		this.manager = factory.createEntityManager();
	}

	public void incluir(Cliente cli) {
		// ABRIR TRANSA��O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.persist(cli);
		// FECHAR TRANSA��O
		this.manager.getTransaction().commit();
	}

	public void fecharConexao() {
		// FECHAR O ENTITY MANAGER
		this.manager.close();
	}

	public void alterar(Cliente cli) {
		// ABRIR TRANSA��O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.merge(cli);
		// FECHAR TRANSA��O
		this.manager.getTransaction().commit();
	}

	public void remover(Cliente cli) {
		// ABRIR TRANSA��O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.remove(cli);
		// FECHAR TRANSA��O
		this.manager.getTransaction().commit();
	}

	public Cliente obter(Integer codigo) {
		// CARREGAR O PRODUTO PELA CHAVE PRIM�RIA
		Cliente retorno = this.manager.find(Cliente.class, codigo);
		return retorno;
	}

	public List<Cliente> obterTodos() {
		List<Cliente> retorno = new ArrayList<Cliente>();
		return retorno;
	}

}

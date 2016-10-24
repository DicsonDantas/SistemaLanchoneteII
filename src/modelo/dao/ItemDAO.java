package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.dominio.Cliente;
import modelo.dominio.Item;

public class ItemDAO {

	private EntityManager manager = null;

	public ItemDAO() {
		super();

		// CRIAR UM FACTORY COM AS CONFIGURA합ES DO BANCO
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("masterdog");

		// CRIAR O ENTITY MANAGER PARA PERSISTIR OS OBJETOS
		this.manager = factory.createEntityManager();
	}

	public void incluir(Item it) {
		// ABRIR TRANSA플O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.persist(it);
		// FECHAR TRANSA플O
		this.manager.getTransaction().commit();
	}

	public void fecharConexao() {
		// FECHAR O ENTITY MANAGER
		this.manager.close();
	}

	public void alterar(Item it) {
		// ABRIR TRANSA플O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.merge(it);
		// FECHAR TRANSA플O
		this.manager.getTransaction().commit();
	}

	public void remover(Item it) {
		// ABRIR TRANSA플O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.remove(it);
		// FECHAR TRANSA플O
		this.manager.getTransaction().commit();
	}

	public Item obter(Integer codigo) {
		// CARREGAR O PRODUTO PELA CHAVE PRIM핾IA
		Item retorno = this.manager.find(Item.class, codigo);
		return retorno;
	}

	public List<Item> obterTodos() {
		List<Item> retorno = new ArrayList<Item>();
		return retorno;
	}

}

package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.dominio.ItemPedido;

public class ItemPedidoDAO {

	private EntityManager manager = null;

	public ItemPedidoDAO() {
		super();

		// CRIAR UM FACTORY COM AS CONFIGURA합ES DO BANCO
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("masterdog");

		// CRIAR O ENTITY MANAGER PARA PERSISTIR OS OBJETOS
		this.manager = factory.createEntityManager();
	}

	public void incluir(ItemPedido itped) {
		// ABRIR TRANSA플O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.persist(itped);
		// FECHAR TRANSA플O
		this.manager.getTransaction().commit();
	}

	public void fecharConexao() {
		// FECHAR O ENTITY MANAGER
		this.manager.close();
	}

	public void alterar(ItemPedido itped) {
		// ABRIR TRANSA플O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.merge(itped);
		// FECHAR TRANSA플O
		this.manager.getTransaction().commit();
	}

	public void remover(ItemPedido itped) {
		// ABRIR TRANSA플O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.remove(itped);
		// FECHAR TRANSA플O
		this.manager.getTransaction().commit();
	}

	public ItemPedido obter(Integer codigo) {
		// CARREGAR O PRODUTO PELA CHAVE PRIM핾IA
		ItemPedido retorno = this.manager.find(ItemPedido.class, codigo);
		return retorno;
	}

	public List<ItemPedido> obterTodos() {
		List<ItemPedido> retorno = new ArrayList<ItemPedido>();
		return retorno;
	}

}

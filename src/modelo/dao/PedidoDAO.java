package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.dominio.Pedido;

public class PedidoDAO {

	private EntityManager manager = null;

	public PedidoDAO() {
		super();

		// CRIAR UM FACTORY COM AS CONFIGURA합ES DO BANCO
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("masterdog");

		// CRIAR O ENTITY MANAGER PARA PERSISTIR OS OBJETOS
		this.manager = factory.createEntityManager();
	}

	public void incluir(Pedido ped) {
		// ABRIR TRANSA플O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.persist(ped);
		// FECHAR TRANSA플O
		this.manager.getTransaction().commit();
	}

	public void fecharConexao() {
		// FECHAR O ENTITY MANAGER
		this.manager.close();
	}

	public void alterar(Pedido ped) {
		// ABRIR TRANSA플O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.merge(ped);
		// FECHAR TRANSA플O
		this.manager.getTransaction().commit();
	}

	public void remover(Pedido ped) {
		// ABRIR TRANSA플O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.remove(ped);
		// FECHAR TRANSA플O
		this.manager.getTransaction().commit();
	}

	public Pedido obter(Integer codigo) {
		// CARREGAR O PRODUTO PELA CHAVE PRIM핾IA
		Pedido retorno = this.manager.find(Pedido.class, codigo);
		return retorno;
	}

	public List<Pedido> obterTodos() {
		List<Pedido> retorno = new ArrayList<Pedido>();
		return retorno;
	}

}

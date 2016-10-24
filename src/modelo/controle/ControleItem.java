
package modelo.controle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.dao.ClienteDAO;
import modelo.dao.ItemDAO;
import modelo.dominio.Item;

public class ControleItem {
    /* Esta classe tem o intuito de criar métodos aonde o usuário possa optar
    se seu sistema terá inserção de itens, ou se ficará por parte da administradora do SISTEMA/BD
    (o que seria um set na própria classe, sem utilização de métodos de entrada(leitura de dados) -> scanner)
    mas também deve poder caso o cliente desejar um método aonde o cliente insira um item novo caso queira
    ex: Cliente deseja inserir Pizza a um novo tipo de item.
    */ 
	
	public void cadastrarItem(){
	Item item1 = new Item(); 	
	Item item2 = new Item();
	Item item3 = new Item();
	Item item4 = new Item(); 	
	
	item1.setNome("Cachorro-Quente");
 	item1.setDescricao("Cachorro-Quente Completo!"); 
 	item1.setPreco(4.00);
 	
	item2.setNome("Hamburguer");
 	item2.setDescricao("X tudao completo!"); 
 	item2.setPreco(5.00);
 	
	item3.setNome("Refrigerante");
 	item3.setDescricao("Refrigerante lata 350ml"); 
 	item3.setPreco(3.00);
 	
	item4.setNome("Milk-Shake");
 	item4.setDescricao("Milk-shake de 500 Ml!"); 
 	item4.setPreco(5.00);
 	
 	ItemDAO itemdao = new ItemDAO();   
 	itemdao.incluir(item1);
 	itemdao.incluir(item2);
 	itemdao.incluir(item3);
 	itemdao.incluir(item4);
    
            
	
	}
	
}


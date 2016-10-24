package modelo.controle;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.dominio.Item;
import modelo.dominio.ItemPedido;
import modelo.dominio.Pedido;

public class ControlePedido {

	
	
	
Scanner read = new Scanner(System.in); 


	
	 public void efetuarPedido(){ 
	    
		/* revisar todo este metodo */ 
		
		String nomecachorroquente, nomehamburguer, nomerefrigerante,nomemilkshake;
		Double precocachorroquente, precohamburguer,precorefrigerante,precomilshake;
		Integer continua = 1; 
                
        Item it = new Item(); 
        List<Item> itens;
	
		
		    while(continua == 1){		    		    	    	
	        System.out.println("DIGITE QUAL PRODUTO DESEJADO : ");
	        System.out.println("1- Cachorro-Quente (R$4,00) \n2- Hamburguer (R$5,00) \n3- Refrigerante (R$3,00) \n4-Milk-Shake(R$5,00) ");
	        int escolha = read.nextInt(); 
	        	     switch(escolha){
	        	 // case 1 : itens.add
	        	 // case 2 : itens.add(item2);  ;break;
	        	 // case 3 : itens.add(item3);  ;break;
	        	 // case 4 : itens.add(item4);  ;break;
	        	        
	        	        }
	        System.out.println("Deseja continuar? 1- Para sim, 2- Para encerrar...");
       	    continua = read.nextInt();
       	    
		    }
	}
}
			 
	
	
	        




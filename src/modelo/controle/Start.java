
package modelo.controle;
import java.text.ParseException;
import java.util.Scanner;


public class Start {
	public static void main(String[] args){
		Integer escolha = 0; 
		Scanner read = new Scanner(System.in); 
		  



		
		
        ControleCliente controlecliente = new ControleCliente(); 
        ControlePedido controlepedido = new ControlePedido(); 
        ControleItem controleitem = new ControleItem(); 
        
        
        Integer continua = 1; 
        
		
	    do {		    		    	    	
	       System.out.println("-------- Ola seja bem vindo ao Mastery Lanches! --------");
System.out.println(" Já possui cadastro? Se não digite 3 para realizar o cadastro! ");
	        System.out.println("1- Efetuar Pedido  : \n2- Registrar Itens : \n3- Cadastrar cliente :   ");
	        escolha = read.nextInt() ; 
	        	     switch(escolha){
	        	 case 1 : controlepedido.efetuarPedido(); break; 
	        	 case 2 : controleitem.cadastrarItem();  break;
	        	 case 3 : controlecliente.cadastrarCliente(); break;
	        
	        	        
	        	        }
	
       	    
		    }
	    while(continua == 1); 
	    	}


		
		



	}




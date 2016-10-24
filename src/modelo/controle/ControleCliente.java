package modelo.controle;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Scanner;
import modelo.dao.ClienteDAO;
import modelo.dominio.Cliente;
public class ControleCliente{
	
	

Scanner read = new Scanner (System.in); 
Cliente cli = new Cliente();

	public void cadastrarCliente() throws ParseException{ 
        System.out.println("Digite o nome completo do cliente : ");
        String nome = read.nextLine(); 
        System.out.println("Digite o email do cliente : ");
        String email = read.nextLine();
        System.out.println("Digite o cpf do cliente : ");
        String cpf = read.nextLine(); 
        System.out.println("Digite a data de nascimento : "); 
        String datanasc = read.nextLine();
         
        
        // verificar erro // 
        DateFormat datenasc = DateFormat.getInstance(); 
        datenasc.parse(datanasc); 
        
        
ClienteDAO clidao = new ClienteDAO();   

clidao.incluir(cli);

	
	} 
	

    }
   
		
	
    
	
	
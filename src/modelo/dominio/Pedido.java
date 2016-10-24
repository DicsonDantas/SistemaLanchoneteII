package modelo.dominio;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tab_pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="cod_pedido")
	private Integer codigo;
	@Column(name="valor_unit_pedido")
	private Float valorUnit;
	@Column(name="valor_total_pedido")
	private Float valorTotal;
	
	@OneToMany
	@JoinColumn(name="fk_item")
	@Basic(fetch=FetchType.LAZY)
	private List<Item> itens;
	
	@ManyToOne
	@JoinColumn(name="fk_cliente")
	@Basic(fetch=FetchType.LAZY)
	private Cliente cliente; 
        /* revisar este relacionamento acima, 
        pode estar violando a integridade do banco. */
				
	
	public Pedido(Float valorUnit, Float valorTotal) {
		super();
		this.valorUnit = valorUnit;
		this.valorTotal = valorTotal;
		
		}

	public Pedido() {
		}
	
	
 	
        public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Float getValorUnit() {
		return valorUnit;
	}

	public void setValorUnit(Float valorUnit) {
		this.valorUnit = valorUnit;
	}

	public Float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}


	}
    

	
	




  
        
        

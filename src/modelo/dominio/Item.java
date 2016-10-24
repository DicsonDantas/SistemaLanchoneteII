package modelo.dominio;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tab_itens")
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
        /*Verificar quais são as diferenças de Estrategia 
        /*VERIFICAR O QUE É E PRA QUE SERVE: GENERATOR, ESCALE E PRECISION!(desconheço)// 
        ex @GeneratedValue(generator = Scale) */
        private Integer codigo;
	@Column(name="nome_item", nullable=false)
	private String nome;
	@Column(name="preco_item", nullable=false)
	private Double preco;
	@Column(name="descricao_item", nullable=true)
	private String descricao;
        
        /* No relacionamento entre item e pedido não há necessidade de um item apontar 
        para os pedidos que sairam, caso queira o dev pode usar um Join, ou pode se usar Fetchtype=Lazy
        e utilizar ManyToOne(revisar afirmação)*
        */


    public Item(Integer codigo, String nome, String descricao, Double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
      public Item() {
 
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
      
      
    
}

package br.edu.unifio.ecommerce.entidades;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class ItemPedido {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer quantidade;
    private BigDecimal valorUnitario;

    @ManyToOne 
    @JoinColumn (name = "pedido_id")
    private Pedido pedido;

    @ManyToOne 
    @JoinColumn (name = "produto_id")
    private Produto produto;

}

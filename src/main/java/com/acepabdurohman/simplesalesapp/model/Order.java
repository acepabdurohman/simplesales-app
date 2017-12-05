package com.acepabdurohman.simplesalesapp.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "t_order")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer quantity;

    private BigDecimal total;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;
}

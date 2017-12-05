package com.acepabdurohman.simplesalesapp.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequest {
    private String nama;
    private BigDecimal harga;
}

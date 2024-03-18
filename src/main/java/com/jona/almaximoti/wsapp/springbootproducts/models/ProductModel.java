package com.jona.almaximoti.wsapp.springbootproducts.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * <h2>ProductModel</h2>
 * 
 * Representacion de tabla de productos de la base de datos.
 * Clase usada para generar todas las operaciones relacionadas
 * a productos en la base de datos.
 * <br></br>
 * Nombre de la tabla: <b>product</b>
 * 
 * @author Jonathan Sanchez
 */
@Entity
@Table(name = "product")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Integer idProduct;

    @Column(name = "product_name", length = 50, nullable = false)
    private String productName;

    @Column(name = "product_key", nullable = false)
    private String key;

    @Column(name = "price", nullable = false)
    private Double price;
    
    @Column(name = "product_status", nullable = false)
    private Boolean productStatus = true;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "type_product_fk", referencedColumnName = "id_type_product")
    private TypeProductModel typeProduct;

    public ProductModel() {
    }

    public ProductModel(Integer idProduct, String productName, String key, Double price, Boolean productStatus,
            TypeProductModel typeProduct) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.key = key;
        this.price = price;
        this.productStatus = productStatus;
        this.typeProduct = typeProduct;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Boolean productStatus) {
        this.productStatus = productStatus;
    }

    public TypeProductModel getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(TypeProductModel typeProduct) {
        this.typeProduct = typeProduct;
    }

    
    
}

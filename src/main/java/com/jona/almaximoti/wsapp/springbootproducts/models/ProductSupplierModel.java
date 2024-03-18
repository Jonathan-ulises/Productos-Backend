package com.jona.almaximoti.wsapp.springbootproducts.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * <h2>ProductSupplierModel</h2>
 * 
 * Representacion de tabla de proveedores relacionados a los
 * productos registrados en la base de datos.
 * Clase usada para generar todas las operaciones relacionadas
 * a proveedores ralacionados a productos en la base de datos.
 * <br></br>
 * Nombre de la tabla: <b>product_supplier</b>
 * 
 * @author Jonathan Sanchez
 */
@Entity
@Table(name = "product_supplier")
public class ProductSupplierModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product_supplier")
    private Integer idProductSupplier;

    @Column(name = "supplier_product_key", length = 255, nullable = false)
    private String supplierProductKey;

    @Column(name = "supplier_cost", nullable = false)
    private Double supplierCost;

    @Column(name = "product_supplier_status")
    private Boolean productSupplierStatus = true;

    @ManyToOne
    @JoinColumn(name = "product_fk", referencedColumnName = "id_product")
    private ProductModel product;

    @ManyToOne
    @JoinColumn(name = "supplier_fk", referencedColumnName = "id_supplier")
    private SupplierModel supplier;
    
    
    public ProductSupplierModel() {
    }


    public ProductSupplierModel(Integer idProductSupplier, String supplierProductKey, Double supplierCost,
            Boolean productSupplierStatus, ProductModel product, SupplierModel supplier) {
        this.idProductSupplier = idProductSupplier;
        this.supplierProductKey = supplierProductKey;
        this.supplierCost = supplierCost;
        this.productSupplierStatus = productSupplierStatus;
        this.product = product;
        this.supplier = supplier;
    }


    public Integer getIdProductSupplier() {
        return idProductSupplier;
    }


    public void setIdProductSupplier(Integer idProductSupplier) {
        this.idProductSupplier = idProductSupplier;
    }


    public String getSupplierProductKey() {
        return supplierProductKey;
    }


    public void setSupplierProductKey(String supplierProductKey) {
        this.supplierProductKey = supplierProductKey;
    }


    public Double getSupplierCost() {
        return supplierCost;
    }


    public void setSupplierCost(Double supplierCost) {
        this.supplierCost = supplierCost;
    }


    public Boolean getProductSupplierStatus() {
        return productSupplierStatus;
    }


    public void setProductSupplierStatus(Boolean productSupplierStatus) {
        this.productSupplierStatus = productSupplierStatus;
    }


    public ProductModel getProduct() {
        return product;
    }


    public void setProduct(ProductModel product) {
        this.product = product;
    }


    public SupplierModel getSupplier() {
        return supplier;
    }


    public void setSupplier(SupplierModel supplier) {
        this.supplier = supplier;
    }

    
    
}

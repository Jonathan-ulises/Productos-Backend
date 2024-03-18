package com.jona.almaximoti.wsapp.springbootproducts.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * <h2>TypeProductModel</h2>
 * 
 * Representacion de tabla de tipos de producto de la base de datos.
 * Clase usada para generar todas las operaciones relacionadas
 * a tipos de producto en la base de datos.
 * <br></br>
 * Nombre de la tabla: <b>type_product</b>
 * 
 * @author Jonathan Sanchez
 */
@Entity
@Table(name = "type_product")
public class TypeProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_product")
    private Integer idTypeProduct;

    @Column(name = "type_product_name", length = 50, nullable = false)
    private String typeProductName;

    @Column(name = "type_product_description", length = 255, nullable = false)
    private String typeProduct;
    
    
    public TypeProductModel() {
    }

    public TypeProductModel(Integer idTypeProduct, String typeProductName, String typeProduct) {
        this.idTypeProduct = idTypeProduct;
        this.typeProductName = typeProductName;
        this.typeProduct = typeProduct;
    }


    public Integer getIdTypeProduct() {
        return idTypeProduct;
    }


    public void setIdTypeProduct(Integer idTypeProduct) {
        this.idTypeProduct = idTypeProduct;
    }


    public String getTypeProductName() {
        return typeProductName;
    }


    public void setTypeProductName(String typeProductName) {
        this.typeProductName = typeProductName;
    }


    public String getTypeProduct() {
        return typeProduct;
    }


    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    
}

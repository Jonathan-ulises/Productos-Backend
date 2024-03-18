package com.jona.almaximoti.wsapp.springbootproducts.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * <h2>SupplierModel</h2>
 * 
 * Representacion de tabla de proveedores de la base de datos.
 * Clase usada para generar todas las operaciones relacionadas
 * a proveedores en la base de datos.
 * <br></br>
 * Nombre de la tabla: <b>supplier</b>
 * 
 * @author Jonathan Sanchez
 */
@Entity
@Table(name = "supplier")
public class SupplierModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_supplier")
    private Integer idSupplier;

    @Column(name = "supplier_name", length = 50, nullable = false)
    private String supplierName;

    @Column(name = "supplier_description", length = 50, nullable = false)
    private String supplierDescription;


    public SupplierModel() {
    }


    public SupplierModel(Integer idSupplier, String supplierName, String supplierDescription) {
        this.idSupplier = idSupplier;
        this.supplierName = supplierName;
        this.supplierDescription = supplierDescription;
    }


    public Integer getIdSupplier() {
        return idSupplier;
    }


    public void setIdSupplier(Integer idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getSupplierName() {
        return supplierName;
    }


    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }


    public String getSupplierDescription() {
        return supplierDescription;
    }


    public void setSupplierDescription(String supplierDescription) {
        this.supplierDescription = supplierDescription;
    }

    
}

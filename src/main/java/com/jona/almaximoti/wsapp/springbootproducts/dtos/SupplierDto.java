package com.jona.almaximoti.wsapp.springbootproducts.dtos;

import com.jona.almaximoti.wsapp.springbootproducts.models.SupplierModel;

/**
 * <h2>SupplierDto</h2>
 * 
 * Esta clase define una estructura para objetos de proveedores.
 * Su proposito es el envio y recepcion de datos del cliente
 * que esten relacionados a Proveedores. Esta clase brindara 
 * los datos para generar instancias de {@link SupplierModel}
 * 
 * @author Jonathan Sanchez
 */
public class SupplierDto {
    
    private Integer idSupplier;
    private String supplierName;
    
    public SupplierDto() {
    }

    public SupplierDto(Integer idSupplier, String supplierName) {
        this.idSupplier = idSupplier;
        this.supplierName = supplierName;
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

    
    
}

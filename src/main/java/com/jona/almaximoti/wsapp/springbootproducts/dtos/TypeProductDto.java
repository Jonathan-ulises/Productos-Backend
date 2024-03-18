package com.jona.almaximoti.wsapp.springbootproducts.dtos;

import com.jona.almaximoti.wsapp.springbootproducts.models.TypeProductModel;

/**
 * <h2>TypeProductDto</h2>
 * 
 * Esta clase define una estructura para objetos de tipos de Productos.
 * Su proposito es el envio y recepcion de datos del cliente
 * que esten relacionados a Tipos de Productos. Esta clase brindara 
 * los datos para generar instancias de {@link TypeProductModel}
 * 
 * @author Jonathan Sanchez
 */
public class TypeProductDto {

    private Integer idTypeProduct;
    private String typeProductName;
    
    public TypeProductDto() {
    }

    public TypeProductDto(Integer idTypeProduct, String typeProductName) {
        this.idTypeProduct = idTypeProduct;
        this.typeProductName = typeProductName;
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

    
    
}

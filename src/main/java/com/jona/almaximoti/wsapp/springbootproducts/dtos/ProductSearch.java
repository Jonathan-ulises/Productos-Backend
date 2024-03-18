package com.jona.almaximoti.wsapp.springbootproducts.dtos;

/**
 * <h2></h2>
 * 
 * Clase usada para recibir datos de busqueda de productos
 * del cliente.
 * 
 * @author Jonathan Sanchez
 */
public class ProductSearch {

    private String key;
    private Integer typeProductId;
    
    
    public ProductSearch() {
    }

    public ProductSearch(String key, Integer typeProductId) {
        this.key = key;
        this.typeProductId = typeProductId;
    }

    
    public Integer getTypeProductId() {
        return typeProductId;
    }

    public void setTypeProductId(Integer typeProductId) {
        this.typeProductId = typeProductId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }    
}

package com.jona.almaximoti.wsapp.springbootproducts.dtos;

import com.jona.almaximoti.wsapp.springbootproducts.models.ProductModel;
import com.jona.almaximoti.wsapp.springbootproducts.models.TypeProductModel;

/**
 * <h2>ProductDto</h2>
 * 
 * Esta clase define una estructura para objetos de productos.
 * Su proposito es el envio y recepcion de datos del cliente
 * que esten relacionados a Productos. Esta clase brindara 
 * los datos para generar instancias de {@link ProductModel}
 * 
 * @author Jonathan Sanchez
 */
public class ProductDto {

    private Integer idProduct;
    private String productName;
    private String key;
    private Double price;
    private TypeProductModel typeProduct;
    private Boolean productStatus;
    
    public ProductDto() {
    }

    public ProductDto(Integer idProduct, String productName, String key, Double price, TypeProductModel typeProduct,
            Boolean productStatus) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.key = key;
        this.price = price;
        this.typeProduct = typeProduct;
        this.productStatus = productStatus;
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

    public TypeProductModel getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(TypeProductModel typeProduct) {
        this.typeProduct = typeProduct;
    }

    public Boolean getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Boolean productStatus) {
        this.productStatus = productStatus;
    }

    
    
}

package com.jona.almaximoti.wsapp.springbootproducts.dtos;

import com.jona.almaximoti.wsapp.springbootproducts.models.ProductModel;
import com.jona.almaximoti.wsapp.springbootproducts.models.ProductSupplierModel;
import com.jona.almaximoti.wsapp.springbootproducts.models.SupplierModel;

/**
 * <h2>ProductSupplierDto</h2>
 * 
 * Esta clase define una estructura para objetos de proveedores 
 * relacionados a un producto.
 * Su proposito es el envio y recepcion de datos del cliente
 * que esten relacionados a Proveedores relacionados a Productos. Esta clase brindara 
 * los datos para generar instancias de {@link ProductSupplierModel}
 * 
 * @author Jonathan Sanchez
 */
public class ProductSupplierDto {

    private Integer idProductSupplier;
    private String supplierProductKey;
    private Double supplierCost;
    private Boolean productSupplierStatus;
    private ProductModel product;
    private SupplierModel supplier;
    
    public ProductSupplierDto() {
    }

    public ProductSupplierDto(Integer idProductSupplier, String supplierProductKey, Double supplierCost,
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

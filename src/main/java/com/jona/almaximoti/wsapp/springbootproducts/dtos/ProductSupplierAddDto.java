package com.jona.almaximoti.wsapp.springbootproducts.dtos;

/**
 * <h2>ProductSupplierAddDto</h2>
 * 
 * Esta clase define una estructura para objetos de proveedores 
 * relacionados a un producto.
 * Su principal uso es de generar objetos con los datos necesarios para
 * guardar proveedores y relacionarlos a un Producto.
 * 
 * @author Jonathan Sanchez
 */
public class ProductSupplierAddDto {
    private Integer idProductSupplier;
    private String supplierProductKey;
    private Double supplierCost;
    private Boolean productSupplierStatus;
    private Integer idProduct;
    private Integer idSupplier;
    
    
    public ProductSupplierAddDto() {
    }


    public ProductSupplierAddDto(Integer idProductSupplier, String supplierProductKey, Double supplierCost,
            Boolean productSupplierStatus, Integer idProduct, Integer idSupplier) {
        this.idProductSupplier = idProductSupplier;
        this.supplierProductKey = supplierProductKey;
        this.supplierCost = supplierCost;
        this.productSupplierStatus = productSupplierStatus;
        this.idProduct = idProduct;
        this.idSupplier = idSupplier;
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


    public Integer getIdProduct() {
        return idProduct;
    }


    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }


    public Integer getIdSupplier() {
        return idSupplier;
    }


    public void setIdSupplier(Integer idSupplier) {
        this.idSupplier = idSupplier;
    }

    
}

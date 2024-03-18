package com.jona.almaximoti.wsapp.springbootproducts.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.jona.almaximoti.wsapp.springbootproducts.models.ProductSupplierModel;

/**
 * <h2>ProductSupplierRepository</h2>
 * 
 * Esta clase establece las relaciones de los procedimientos
 * almacenados para hacer operaciones de consulta, creacion,
 * edicion y eliminacion de {@link ProductSupplierModel}.
 * 
 * @author Jonathan Sanchez
 */
public interface ProductSupplierRepository extends JpaRepository<ProductSupplierModel, Integer>  {
    
    @Procedure("sp_get_all_suppliers_of_product")
    List<ProductSupplierModel> getAllSuppliersOfProduct(@Param("id") Integer id);

    @Procedure("sp_create_product_suppliers")
    List<ProductSupplierModel> addSuppliersToProduct(
        @Param("idProductSupplier") Integer id,
        @Param("productFk") Integer productFk,
        @Param("productSupplierStatus") Boolean status,
        @Param("supplierCost") Double cost,
        @Param("supplierFk") Integer supplierFk,
        @Param("supplierProductKey") String key
    );
} 

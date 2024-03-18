package com.jona.almaximoti.wsapp.springbootproducts.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.jona.almaximoti.wsapp.springbootproducts.models.ProductModel;

import java.util.List;

/**
 * <h2>ProductRepository</h2>
 * 
 * Esta clase establece las relaciones de los procedimientos
 * almacenados para hacer operaciones de consulta, creacion,
 * edicion y eliminacion de {@link ProductModel}.
 * 
 * @author Jonathan Sanchez
 */
public interface ProductRepository extends JpaRepository<ProductModel, Integer> {

    @Transactional
    @Procedure("sp_create_product")
    ProductModel createProduct(
        @Param("name") String name,
        @Param("price") Double price,
        @Param("key") String key,
        @Param("typeProductId") Integer type_product_id
    );

    
    @Transactional
    @Procedure("sp_update_product")
    ProductModel updateProduct(
        @Param("id") Integer id,
        @Param("name") String name,
        @Param("price") Double price,
        @Param("productKey") String key,
        @Param("typeProductId") Integer type_product_id
    );

    @Transactional
    @Procedure("sp_delete_product")
    void deleteProduct(Integer id);

    @Procedure("sp_get_all_products")
    List<ProductModel> getAllProducts();

    @Procedure("sp_find_product_by_id")
    ProductModel findProductById(Integer id);

    @Procedure("sp_search_product_by_key_and_type")
    List<ProductModel> searchByKeyAndTypeProduct(
        @Param("productKey") String productName,
        @Param("typeProduct") Integer typeProduct
    );
}

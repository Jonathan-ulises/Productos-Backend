package com.jona.almaximoti.wsapp.springbootproducts.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import com.jona.almaximoti.wsapp.springbootproducts.models.TypeProductModel;

/**
 * <h2>TypeProductRepository</h2>
 * 
 * Esta clase establece las relaciones de los procedimientos
 * almacenados para hacer operaciones de consulta, creacion,
 * edicion y eliminacion de {@link TypeProductModel}.
 * 
 * @author Jonathan Sanchez
 */
public interface TypeProductRepository extends JpaRepository<TypeProductModel, Integer> {
    

    @Procedure("sp_get_all_type_products")
    List<TypeProductModel> getAllTypeProduct();
}

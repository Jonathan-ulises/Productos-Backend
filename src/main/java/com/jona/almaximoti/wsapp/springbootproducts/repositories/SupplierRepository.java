package com.jona.almaximoti.wsapp.springbootproducts.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import com.jona.almaximoti.wsapp.springbootproducts.models.SupplierModel;

/**
 * <h2>SupplierRepository</h2>
 * 
 * Esta clase establece las relaciones de los procedimientos
 * almacenados para hacer operaciones de consulta, creacion,
 * edicion y eliminacion de {@link SupplierModel}.
 * 
 * @author Jonathan Sanchez
 */
public interface SupplierRepository extends JpaRepository<SupplierModel, Integer> {

    @Procedure("sp_get_all_suppliers")
    List<SupplierModel> getAllSuppliers();
}

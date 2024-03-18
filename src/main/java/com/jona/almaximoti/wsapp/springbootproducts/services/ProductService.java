package com.jona.almaximoti.wsapp.springbootproducts.services;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jona.almaximoti.wsapp.springbootproducts.dtos.ProductDto;
import com.jona.almaximoti.wsapp.springbootproducts.dtos.ProductSupplierAddDto;
import com.jona.almaximoti.wsapp.springbootproducts.dtos.ProductSupplierDto;
import com.jona.almaximoti.wsapp.springbootproducts.dtos.SupplierDto;
import com.jona.almaximoti.wsapp.springbootproducts.dtos.TypeProductDto;
import com.jona.almaximoti.wsapp.springbootproducts.models.ProductModel;
import com.jona.almaximoti.wsapp.springbootproducts.models.ProductSupplierModel;
import com.jona.almaximoti.wsapp.springbootproducts.models.SupplierModel;
import com.jona.almaximoti.wsapp.springbootproducts.models.TypeProductModel;
import com.jona.almaximoti.wsapp.springbootproducts.repositories.ProductRepository;
import com.jona.almaximoti.wsapp.springbootproducts.repositories.ProductSupplierRepository;
import com.jona.almaximoti.wsapp.springbootproducts.repositories.SupplierRepository;
import com.jona.almaximoti.wsapp.springbootproducts.repositories.TypeProductRepository;

import org.springframework.transaction.annotation.Transactional;

/**
 * <h2>ProductService</h2>
 * 
 * Clase que realiza las peticiones de informacion a los reposiorios
 * y genera estructura de datos usando los DTO dependiendo de la clase
 * de modelo necesaria.
 * 
 * @author Jonathan Sanchez
 * 
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private TypeProductRepository typeProductRepository;

    @Autowired
    private SupplierRepository supplierRepository;

    @Autowired
    private ProductSupplierRepository productSupplierRepository;

    
    @Transactional
    public ProductModel createProduct(String name, Double pricem, String key, Integer typeProductId) {
        return productRepository.createProduct(name, pricem, key, typeProductId);
    }

    @Transactional
    public ProductModel updateProduct(Integer id, String name, Double pricem, String key, Integer typeProductId) {
        return productRepository.updateProduct(id, name, pricem, key, typeProductId);
    } 

    @Transactional
    public List<ProductDto> getAllProducts() {
        List<ProductModel> products = productRepository.getAllProducts();
        if (products == null) {
            return Collections.emptyList();
        }

        return products.stream()
            .map(p -> new ProductDto(
                p.getIdProduct(), 
                p.getProductName(), 
                p.getKey(), 
                p.getPrice(),
                p.getTypeProduct(), 
                p.getProductStatus())).collect(Collectors.toList());
    }

    @Transactional
    public List<ProductDto> searchProduct(String name, Integer typeProductId) {
        List<ProductModel> products = productRepository.searchByKeyAndTypeProduct(name, typeProductId);
        if (products == null) {
            return Collections.emptyList();
        }

        return products.stream()
            .map(p -> new ProductDto(
                p.getIdProduct(), 
                p.getProductName(), 
                p.getKey(), 
                p.getPrice(),
                p.getTypeProduct(), 
                p.getProductStatus())).collect(Collectors.toList());
    }


    @Transactional
    public ProductDto getProductById(Integer id) {
        ProductModel product = productRepository.findProductById(id);
        if (product == null) {
            return null;
        }
        return new ProductDto(
            product.getIdProduct(), 
            product.getProductName(), 
            product.getKey(), 
            product.getPrice(),
            product.getTypeProduct(),
            product.getProductStatus());
    }

    @Transactional
    public List<TypeProductDto> getAllTypeProducts() {
        List<TypeProductModel> typeProducts = typeProductRepository.getAllTypeProduct();
        return typeProducts.stream()
        .map(tp -> new TypeProductDto(
            tp.getIdTypeProduct(), 
            tp.getTypeProductName())).collect(Collectors.toList());
    }

    @Transactional
    public List<SupplierDto> getAllSuppliers() {
        List<SupplierModel> suppliers = supplierRepository.getAllSuppliers();
        if (suppliers == null) {
            return Collections.emptyList();
        }
        return suppliers.stream()
            .map(sp -> new SupplierDto(
                sp.getIdSupplier(), 
                sp.getSupplierName())).collect(Collectors.toList());
    }

    @Transactional
    public boolean addUploadProductToSupplier(List<ProductSupplierAddDto> lProductSupplierDtos) {
        try {
            lProductSupplierDtos.forEach(sp -> {
                productSupplierRepository.addSuppliersToProduct(
                    sp.getIdProductSupplier(), 
                    sp.getIdProduct(), 
                    sp.getProductSupplierStatus(), 
                    sp.getSupplierCost(), 
                    sp.getIdSupplier(), 
                    sp.getSupplierProductKey());
            }); 
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Transactional
    public List<ProductSupplierDto> getSuppliersByProductId(Integer productId) {
        List<ProductSupplierModel> productSuppliers = productSupplierRepository.getAllSuppliersOfProduct(productId);
        return productSuppliers.stream()
                .map(productSupplier -> new ProductSupplierDto(
                    productSupplier.getIdProductSupplier(),
                    productSupplier.getSupplierProductKey(),
                    productSupplier.getSupplierCost(),
                    productSupplier.getProductSupplierStatus(),
                    productSupplier.getProduct(),
                    productSupplier.getSupplier()
                )).collect(Collectors.toList());
    }




    @Transactional
    public void deleteProduct(Integer id) {
        productRepository.deleteProduct(id);
    }
}

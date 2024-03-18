package com.jona.almaximoti.wsapp.springbootproducts.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jona.almaximoti.wsapp.springbootproducts.dtos.ProductDto;
import com.jona.almaximoti.wsapp.springbootproducts.dtos.ProductSearch;
import com.jona.almaximoti.wsapp.springbootproducts.dtos.ProductSupplierAddDto;
import com.jona.almaximoti.wsapp.springbootproducts.dtos.ProductSupplierDto;
import com.jona.almaximoti.wsapp.springbootproducts.dtos.SupplierDto;
import com.jona.almaximoti.wsapp.springbootproducts.dtos.TypeProductDto;
import com.jona.almaximoti.wsapp.springbootproducts.models.ProductModel;
import com.jona.almaximoti.wsapp.springbootproducts.services.ProductService;
import com.jona.almaximoti.wsapp.springbootproducts.utils.ResponseWS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <h2>ProductController</h2>
 * 
 * Controlador de peticiones para productos.
 * Ruta base: <b>"/api/products"</b>
 * 
 * @author Jonathan Sanchez
 */
@RestController
@RequestMapping("/api/products")
public class ProductController {


    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public ResponseWS<ProductModel> createProduct(@RequestBody ProductModel product) {
        ProductModel createdProduct = productService.createProduct(product.getProductName(), product.getPrice(), product.getKey(), product.getTypeProduct().getIdTypeProduct());
        return new ResponseWS<ProductModel>(createdProduct != null, createdProduct);
    }

    @PostMapping("/update")
    public ResponseWS<ProductModel> updateProduct(@RequestBody ProductModel product) {
        ProductModel updatedProduct = productService.updateProduct(product.getIdProduct(), product.getProductName(), product.getPrice(), product.getKey(), product.getTypeProduct().getIdTypeProduct());
       return new ResponseWS<ProductModel>(updatedProduct != null, updatedProduct);
    }
    
    @PostMapping("/delete")
    public ResponseWS<String> deleteProduct(@RequestBody ProductModel product) {
        productService.deleteProduct(product.getIdProduct());
        return new ResponseWS<String>(true, "Product deleted successfully");
    }

    @GetMapping("/getAll")
    public ResponseWS<List<ProductDto>> getAllProducts() {
        List<ProductDto> allProducts = productService.getAllProducts();
        return new ResponseWS<List<ProductDto>>(!allProducts.isEmpty(), allProducts);
    }

    @PostMapping("/findById")
    public ResponseWS<ProductDto> getOneProduct(@RequestBody ProductModel product) {
        ProductDto findedProduct = productService.getProductById(product.getIdProduct());
        return new ResponseWS<ProductDto>(findedProduct != null, findedProduct);
    }

    @GetMapping("/typeProducts")
    public ResponseWS<List<TypeProductDto>> getAllTypeProducts() {
        List<TypeProductDto> allTypes = productService.getAllTypeProducts();
        return new ResponseWS<List<TypeProductDto>>(!allTypes.isEmpty(), allTypes);
    }

    @GetMapping("/suppliers")
    public ResponseWS<List<SupplierDto>> getAllSuppliers() {
        List<SupplierDto> allSuppliers = productService.getAllSuppliers();
        return new ResponseWS<List<SupplierDto>>(!allSuppliers.isEmpty(), allSuppliers);
    }

    @PostMapping("/addProductToSupplier")
    public ResponseWS<String> addProductToSupplier(@RequestBody List<ProductSupplierAddDto> list) {
        Boolean callStatus = productService.addUploadProductToSupplier(list);    
        return new ResponseWS<String>(callStatus, callStatus ? "All supplier products update" : "The process fail");
    }

    @PostMapping("/getSuppliersProducts")
    public ResponseWS<List<ProductSupplierDto>> getSuppliersByProductId(@RequestBody ProductModel product) {
        List<ProductSupplierDto> productSupplierDtos = productService.getSuppliersByProductId(product.getIdProduct());
        return new ResponseWS<List<ProductSupplierDto>>(!productSupplierDtos.isEmpty(), productSupplierDtos);
    }

    @PostMapping("/uploadProductToSupplier")
    public ResponseWS<String> uploadProductToSupplier(@RequestBody List<ProductSupplierAddDto> list) {
        Boolean callStatus = productService.addUploadProductToSupplier(list);    
        return new ResponseWS<String>(callStatus, callStatus ? "All supplier products update" : "The process fail");
    }

    @PostMapping("/searchBykeyAndTypeProduct")
    public ResponseWS<List<ProductDto>> searchBykeyAndTypeProduct(@RequestBody ProductSearch search) {
        List<ProductDto> products = productService.searchProduct(search.getKey(), search.getTypeProductId());
        return new ResponseWS<List<ProductDto>>(!products.isEmpty(), products);
    }
}

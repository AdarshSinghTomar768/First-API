package com.example.cartservices;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
@RestController
public class ProductController {
    private final ProductServices productService;
    public ProductController(ProductServices productService){

        this.productService=productService;
    }
    @GetMapping("/products/product/{limit}")
    public Product[] getLimitedProducts(@PathVariable("limit") int limit){
        return productService.getLimitedProducts(limit);
    }

    @GetMapping("/products")
    public Product[] getAllProducts(){

        return productService.getAllProducts();
    }
    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id")Long id){

        return productService.getSingleProduct(id);
    }
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){

        return productService.addProduct(product);
    }
    @PatchMapping("/products/{id}")
    public Product updateProduct(@PathVariable("id")Long id){

        return productService.updateProduct(id);
    }
    @DeleteMapping("/products/{id}")
    public Product deleteProduct(@PathVariable("id")Long id){

        return productService.deleteProduct(id);
    }

}

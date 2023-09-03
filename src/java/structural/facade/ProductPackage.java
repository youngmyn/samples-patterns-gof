package structural.facade;

import structural.facade.enums.Products;

import java.util.List;

public class ProductPackage {
    private List<Products> products;

    public ProductPackage(List<Products> products) {
        this.products = products;
    }
    public void open(){
        System.out.println("\nIn your package is: ");
        products.forEach(System.out::println);
        System.out.println("\n");
    }
}

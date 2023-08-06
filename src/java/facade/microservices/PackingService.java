package facade.microservices;

import facade.ProductPackage;
import facade.enums.Products;

import java.util.List;

public class PackingService {
    public ProductPackage pack(List<Products> products){
        System.out.println("Packing....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new ProductPackage(products);
    }
}

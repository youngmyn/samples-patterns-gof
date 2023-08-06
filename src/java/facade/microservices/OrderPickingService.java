package facade.microservices;

import facade.enums.Products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderPickingService {
    private List<Products> basket;
    public OrderPickingService(){
        basket = new ArrayList<>();
    }
    public List<Products> pickOrder(Products... products){
        basket.clear();
        basket.addAll(Arrays.asList(products));
        return basket;
    }
}

package structural.facade.microservices;

import structural.facade.ProductPackage;

import java.util.LinkedList;
import java.util.Queue;

public class DeliveryService{
    private Queue<Deliveryman> deliverymen;
    public DeliveryService(){
        deliverymen = new LinkedList<>();
        deliverymen.add(new Deliveryman("Sergey"));
        deliverymen.add(new Deliveryman("Boris"));
    }
    public void sendPackage(String address, ProductPackage pack){
        if(address.isEmpty()||address==null) return;
        Deliveryman courier = deliverymen.poll();
        courier.deliver(address, pack);
        deliverymen.add(courier);
    }
    public class Deliveryman{
        private final String name;

        public Deliveryman(String name) {
            this.name = name;
        }

        public void deliver(String address, ProductPackage pack){
            try {
                System.out.println("Deliveryman "+name+": i'm leaving.");
                Thread.sleep(1000);
                System.out.println("On my way.");
                Thread.sleep(1000);
                System.out.println("Delivered to address "+address);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }
}

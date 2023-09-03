package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Blogger {
    private String name;
    private List<Subscriber> subscribers = new ArrayList<>();
    public Blogger(String name) {
        this.name = name;
    }

    private void notifyAllSubs(String notification){
        subscribers.forEach(subscriber -> subscriber.showNotification(name, notification));
    }
    public void releaseVideo(String title){
        /*...
            some code
          ...
        */
        System.out.println("Video \""+title+"\" realised");
        notifyAllSubs("HEY GUYS!!! I HAVE A NEW VIDEO!!!");

    }
    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
}

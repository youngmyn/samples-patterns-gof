package behavioral.observer.concreteSubs;

import behavioral.observer.Subscriber;

public class FacebookSubscriber implements Subscriber {
    @Override
    public void showNotification(String bloggerName, String notification) {
        System.out.println("+1 new notification from Facebook. "+bloggerName+":"+ notification);
    }
}

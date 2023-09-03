package behavioral.observer.concreteSubs;

import behavioral.observer.Subscriber;

public class YouTubeSubscriber implements Subscriber {
    @Override
    public void showNotification(String bloggerName, String notification) {
        System.out.println("+1 new notification from YouTube. "+bloggerName+":"+ notification);
    }
}

package pdp.patterns.observer;

import pdp.patterns.observer.events.PrimaryEventData;
import pdp.patterns.observer.events.SecondaryEventData;

import java.util.ArrayList;
import java.util.List;

public class PublisherEventDistributor {
    private List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifyPrimary(PrimaryEventData e) {
        for (Subscriber subscriber : subscribers) {
            subscriber.onPublisherPrimaryActionHappened(e);
        }
    }

    public void notifySecondary(SecondaryEventData e) {
        for (Subscriber subscriber : subscribers) {
            subscriber.onPublisherSecondaryActionHappened(e);
        }
    }
}

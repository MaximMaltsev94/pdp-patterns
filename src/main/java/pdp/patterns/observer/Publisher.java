package pdp.patterns.observer;

import pdp.patterns.observer.events.PrimaryEventData;
import pdp.patterns.observer.events.SecondaryEventData;

public class Publisher {

    private PublisherEventDistributor publisherEventDistributor;

    public Publisher(PublisherEventDistributor publisherEventDistributor) {
        this.publisherEventDistributor = publisherEventDistributor;
    }

    public void doPrimaryAction() {
        System.out.println("Publisher is performing primary action!!");
        publisherEventDistributor.notifyPrimary(new PrimaryEventData());
    }

    public void doSecondaryAction() {
        System.out.println("Publisher is performing secondary action!!");
        publisherEventDistributor.notifySecondary(new SecondaryEventData());

    }

}

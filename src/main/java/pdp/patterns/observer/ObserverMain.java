package pdp.patterns.observer;

import pdp.patterns.observer.events.PrimaryEventData;
import pdp.patterns.observer.events.SecondaryEventData;

public class ObserverMain {

    public static Subscriber subscriberImpl1 = new Subscriber() {
        public void onPublisherPrimaryActionHappened(PrimaryEventData e) {
            System.out.println("subscriber one : WOW! look at this! primary action is amazing!!!");
        }

        public void onPublisherSecondaryActionHappened(SecondaryEventData e) {
            System.out.println("subscriber one : mee, noisy secondary action");
        }
    };

    public static Subscriber subscriberImpl2 = new Subscriber() {
        public void onPublisherPrimaryActionHappened(PrimaryEventData e) {
            System.out.println("subscriber two : primary action is so beautiful");
        }

        public void onPublisherSecondaryActionHappened(SecondaryEventData e) {
            System.out.println("subscriber two : stupid action, don't even try talk to me!");
        }
    };

    public static void main(String[] args) {
        PublisherEventDistributor eventDistributor = new PublisherEventDistributor();
        eventDistributor.subscribe(subscriberImpl1);
        eventDistributor.subscribe(subscriberImpl2);
        Publisher publisher = new Publisher(eventDistributor);

        publisher.doPrimaryAction();
        publisher.doSecondaryAction();
    }
}

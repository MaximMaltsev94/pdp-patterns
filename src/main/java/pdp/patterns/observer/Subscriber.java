package pdp.patterns.observer;

import pdp.patterns.observer.events.PrimaryEventData;
import pdp.patterns.observer.events.SecondaryEventData;

public interface Subscriber {
    void onPublisherPrimaryActionHappened(PrimaryEventData e);
    void onPublisherSecondaryActionHappened(SecondaryEventData e);
}

package org.emsg.smart_connector.interception.messages;

import org.emsg.smart_connector.message.mqtt.AbstractMessage;
import org.emsg.smart_connector.message.subscriptions.Subscription;

/**
 * @author Shuttle
 */
public class InterceptSubscribeMessage {
    private final Subscription subscription;

    public InterceptSubscribeMessage(Subscription subscription) {
        this.subscription = subscription;
    }

    public String getClientID() {
        return subscription.getClientId();
    }

    public AbstractMessage.QOSType getRequestedQos() {
        return subscription.getRequestedQos();
    }

    public String getTopicFilter() {
        return subscription.getTopicFilter();
    }
}

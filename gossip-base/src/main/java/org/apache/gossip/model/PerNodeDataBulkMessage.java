package org.apache.gossip.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by pxsalehi on 22.08.17.
 */
public class PerNodeDataBulkMessage extends Base {
    private List<PerNodeDataMessage> messages = new ArrayList<>();

    public void addMessage(PerNodeDataMessage msg) {
        messages.add(msg);
    }

    public List<PerNodeDataMessage> getMessages() {
        return messages;
    }

    @Override
    public String toString() {
        return "GossipDataBulkMessage["
                + messages.stream().map(Object::toString).collect(Collectors.joining(","))
                + "]";
    }
}

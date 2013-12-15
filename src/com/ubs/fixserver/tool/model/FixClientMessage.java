package com.ubs.fixserver.tool.model;

import java.util.Collections;
import java.util.Map;

/**
 * Method getMessages is never returned null, return empty or values
 *
 * @author : Novobranchenko Oleksandr
 */
public final class FixClientMessage {

    private final Map<String, String> messages;

    public FixClientMessage(Map<String, String> messages) {
        this.messages = messages;
    }

    /**
     * Method getMessages is never returned null, return empty or values
     */
    public Map<String, String> getMessages() {
        return messages == null ? Collections.<String, String>emptyMap() : Collections.unmodifiableMap(messages);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FixClientMessage that = (FixClientMessage) o;

        if (messages != null ? !messages.equals(that.messages) : that.messages != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return messages != null ? messages.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "FixClientMessage{" +
                "messages=" + messages +
                '}';
    }
}

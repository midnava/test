package com.ubs.fixserver.tool.model;

import java.util.Map;

/**
 * @author : Novobranchenko Oleksandr
 */
public class FixClientMessage {

    private final Map<String, String> messages;

    public FixClientMessage(Map<String, String> messages) {
        this.messages = messages;
    }

    public Map<String, String> getMessages() {
        return messages;
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

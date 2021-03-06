package com.ubs.fixserver.tool.xml.model;


import com.ubs.fixserver.tool.xml.adapter.NormalizedStringAdapter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Collections;
import java.util.List;

/**
 * @author : Novobranchenko Oleksandr
 */
public final class Stage {
    @XmlAttribute(name = "name", required = true)
    private String name;

    @XmlAttribute(name = "timeout", required = false)
    private long timeout;

    @XmlAttribute(name = "wait", required = false)
    private long wait;

    @XmlAttribute(name = "skip", required = false)
    private boolean skip;

    @XmlElementWrapper(name = "REQUESTS")
    @XmlElement(name = "item")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    private List<String> requests;

    @XmlElementWrapper(name = "RESPONSES")
    @XmlElement(name = "item")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    private List<String> responses;

    public Stage() {
    }

    public Stage(String name, long timeout, long wait, boolean skip, List<String> requests, List<String> responses) {
        this.name = name;
        this.timeout = timeout;
        this.wait = wait;
        this.skip = skip;
        this.requests = requests;
        this.responses = responses;
    }

    public String getName() {
        return name;
    }

    public long getTimeout() {
        return timeout;
    }

    public long getWait() {
        return wait;
    }

    public boolean isSkip() {
        return skip;
    }

    public List<String> getRequests() {
        return Collections.unmodifiableList(requests);
    }

    public List<String> getResponses() {
        return Collections.unmodifiableList(responses);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stage stage = (Stage) o;

        if (skip != stage.skip) return false;
        if (timeout != stage.timeout) return false;
        if (wait != stage.wait) return false;
        if (name != null ? !name.equals(stage.name) : stage.name != null) return false;
        if (requests != null ? !requests.equals(stage.requests) : stage.requests != null) return false;
        if (responses != null ? !responses.equals(stage.responses) : stage.responses != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) (timeout ^ (timeout >>> 32));
        result = 31 * result + (int) (wait ^ (wait >>> 32));
        result = 31 * result + (skip ? 1 : 0);
        result = 31 * result + (requests != null ? requests.hashCode() : 0);
        result = 31 * result + (responses != null ? responses.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Stage{" +
                "name='" + name + '\'' +
                ", timeout=" + timeout +
                ", wait=" + wait +
                ", skip=" + skip +
                ", requests=" + requests +
                ", responses=" + responses +
                '}';
    }
}

package com.ubs.fixserver.tool.xml.model;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.Collections;
import java.util.List;

public class Test {

    @XmlAttribute(name = "name", required = true)
    private String name;

    @XmlAttribute(name = "timeout", required = false)
    private long timeout;

    @XmlAttribute(name = "wait", required = false)
    private long wait;

    @XmlElementWrapper(name = "STAGES")
    @XmlElement(name = "STAGE")
    private List<Stage> stages;

    public Test() {
    }

    public Test(String name, long timeout, long wait, List<Stage> stages) {
        this.name = name;
        this.timeout = timeout;
        this.wait = wait;
        this.stages = stages;
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

    public List<Stage> getStages() {
        return Collections.unmodifiableList(stages);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test = (Test) o;

        if (timeout != test.timeout) return false;
        if (wait != test.wait) return false;
        if (name != null ? !name.equals(test.name) : test.name != null) return false;
        if (stages != null ? !stages.equals(test.stages) : test.stages != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) (timeout ^ (timeout >>> 32));
        result = 31 * result + (int) (wait ^ (wait >>> 32));
        result = 31 * result + (stages != null ? stages.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", timeout=" + timeout +
                ", wait=" + wait +
                ", stages=" + stages +
                '}';
    }
}

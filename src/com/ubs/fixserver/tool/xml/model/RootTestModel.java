package com.ubs.fixserver.tool.xml.model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "TESTS")
public class RootTestModel {

    @XmlElement(name = "TEST", required = false)
    private List<TestModel> tests;

    public RootTestModel() {
    }

    public RootTestModel(List<TestModel> tests) {
        this.tests = tests;
    }

    public List<TestModel> getTests() {
        return tests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RootTestModel that = (RootTestModel) o;

        if (tests != null ? !tests.equals(that.tests) : that.tests != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return tests != null ? tests.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "RootTestModel{" +
                "tests=" + tests +
                '}';
    }
}

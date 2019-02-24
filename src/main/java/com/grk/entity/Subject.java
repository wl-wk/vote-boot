package com.grk.entity;

import java.util.List;

public class Subject {
    private Integer vsId;
    private String vsTitle;
    private Integer vsType;
    private Integer count;
    private List<Option> children;

    public Subject() {
        super();
    }

    public Subject(Integer vsId, String vsTitle, Integer vsType) {
        super();
        this.vsId = vsId;
        this.vsTitle = vsTitle;
        this.vsType = vsType;
    }

    public Integer getVsId() {
        return this.vsId;
    }

    public void setVsId(Integer vsId) {
        this.vsId = vsId;
    }

    public String getVsTitle() {
        return this.vsTitle;
    }

    public void setVsTitle(String vsTitle) {
        this.vsTitle = vsTitle;
    }

    public Integer getVsType() {
        return this.vsType;
    }

    public void setVsType(Integer vsType) {
        this.vsType = vsType;
    }

    public List<Option> getChildren() {
        return children;
    }

    public void setChildren(List<Option> children) {
        this.children = children;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "vsId=" + vsId +
                ", vsTitle='" + vsTitle + '\'' +
                ", vsType=" + vsType +
                ", count=" + count +
                ", children=" + children +
                '}';
    }
}

package com.grk.entity;

public class User {
    private Integer vuUserId;
    private String vuUserName;
    private String vuPassword;
    private Integer vuStatus;

    public User() {
        super();
    }

    public User(Integer vuUserId, String vuUserName, String vuPassword, Integer vuStatus) {
        super();
        this.vuUserId = vuUserId;
        this.vuUserName = vuUserName;
        this.vuPassword = vuPassword;
        this.vuStatus = vuStatus;
    }

    public Integer getVuUserId() {
        return this.vuUserId;
    }

    public void setVuUserId(Integer vuUserId) {
        this.vuUserId = vuUserId;
    }

    public String getVuUserName() {
        return this.vuUserName;
    }

    public void setVuUserName(String vuUserName) {
        this.vuUserName = vuUserName;
    }

    public String getVuPassword() {
        return this.vuPassword;
    }

    public void setVuPassword(String vuPassword) {
        this.vuPassword = vuPassword;
    }

    public Integer getVuStatus() {
        return this.vuStatus;
    }

    public void setVuStatus(Integer vuStatus) {
        this.vuStatus = vuStatus;
    }

}

package com.grk.entity;

public class Item {
    private Integer viId;
    private Integer voId;
    private Integer vsId;
    private Integer vuUserId;

    public Item() {
        super();
    }

    public Item(Integer viId, Integer voId, Integer vsId, Integer vuUserId) {
        super();
        this.viId = viId;
        this.voId = voId;
        this.vsId = vsId;
        this.vuUserId = vuUserId;
    }

    public Integer getViId() {
        return this.viId;
    }

    public void setViId(Integer viId) {
        this.viId = viId;
    }

    public Integer getVoId() {
        return this.voId;
    }

    public void setVoId(Integer voId) {
        this.voId = voId;
    }

    public Integer getVsId() {
        return this.vsId;
    }

    public void setVsId(Integer vsId) {
        this.vsId = vsId;
    }

    public Integer getVuUserId() {
        return this.vuUserId;
    }

    public void setVuUserId(Integer vuUserId) {
        this.vuUserId = vuUserId;
    }

}

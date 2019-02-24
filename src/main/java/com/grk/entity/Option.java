package com.grk.entity;

public class Option {
    private Integer voId;
    private String voOption;
    private Integer vsId;
    private Integer voOrder;
    private Integer voIdDelete;
    private Integer count;

    public Option() {
        super();
    }

    public Option(Integer voId, String voOption, Integer vsId, Integer voOrder, Integer voIdDelete) {
        super();
        this.voId = voId;
        this.voOption = voOption;
        this.vsId = vsId;
        this.voOrder = voOrder;
        this.voIdDelete = voIdDelete;
    }

    public Integer getVoId() {
        return this.voId;
    }

    public void setVoId(Integer voId) {
        this.voId = voId;
    }

    public String getVoOption() {
        return this.voOption;
    }

    public void setVoOption(String voOption) {
        this.voOption = voOption;
    }

    public Integer getVsId() {
        return this.vsId;
    }

    public void setVsId(Integer vsId) {
        this.vsId = vsId;
    }

    public Integer getVoOrder() {
        return this.voOrder;
    }

    public void setVoOrder(Integer voOrder) {
        this.voOrder = voOrder;
    }

    public Integer getVoIdDelete() {
        return this.voIdDelete;
    }

    public void setVoIdDelete(Integer voIdDelete) {
        this.voIdDelete = voIdDelete;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Option{" +
                "voId=" + voId +
                ", voOption='" + voOption + '\'' +
                ", vsId=" + vsId +
                ", voOrder=" + voOrder +
                ", voIdDelete=" + voIdDelete +
                ", count=" + count +
                '}';
    }
}

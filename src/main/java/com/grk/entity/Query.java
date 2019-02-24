package com.grk.entity;

public class Query {
    private Integer page;
    private Integer rows;
    private String keywords;

    public Query() {
    }


    public Query(Integer page, Integer rows) {
        this.page = page;
        this.rows = rows;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "Query{" +
                "page=" + page +
                ", rows=" + rows +
                ", keywords='" + keywords + '\'' +
                '}';
    }
}

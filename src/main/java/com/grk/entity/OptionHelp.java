package com.grk.entity;

import java.util.List;

public class OptionHelp {

    List<Option> list;

    public OptionHelp() {

    }


    public List<Option> getList() {
        return list;
    }

    public void setList(List<Option> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "OptionHelp{" +
                "list=" + list +
                '}';
    }
}

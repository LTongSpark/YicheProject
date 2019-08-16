package com.zytc.domain;

/**
 * Created by Administrator on 2018/4/25.
 */
public class YcData {
    private int id;
    private String Infotype;
    private String Interface;
    private String base;
    private String operation;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfotype() {
        return Infotype;
    }

    public void setInfotype(String infotype) {
        Infotype = infotype;
    }

    public String getInterface() {
        return Interface;
    }

    public void setInterface(String anInterface) {
        Interface = anInterface;
    }
    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getOptional() {
        return Optional;
    }

    public void setOptional(String optional) {
        Optional = optional;
    }

    private String Optional;


    @Override
    public String toString() {
        return "YcData{" +
                "id=" + id +
                ", Infotype='" + Infotype + '\'' +
                ", Interface='" + Interface + '\'' +
                ", base='" + base + '\'' +
                ", operation='" + operation + '\'' +
                ", Optional='" + Optional + '\'' +
                '}';
    }
}

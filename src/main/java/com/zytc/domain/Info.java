package com.zytc.domain;

/**
 * Created by Administrator on 2018/4/27.
 */
public class Info {
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private String info;

    @Override
    public String toString() {
        return "Info{" +
                "info='" + info + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Info info1 = (Info) o;

        return info != null ? info.equals(info1.info) : info1.info == null;
    }

    @Override
    public int hashCode() {
        return info != null ? info.hashCode() : 0;
    }
}

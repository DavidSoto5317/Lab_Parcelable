package com.example.david.lab1;

/**
 * Created by David on 2/05/2018.
 */

public class JsonItem {
    private String name;
    private int numberOfItem;
    private String value;

    public JsonItem(String name, int numberOfItem, String value) {
        this.name = name;
        this.numberOfItem = numberOfItem;
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfItem(int numberOfItem) {
        this.numberOfItem = numberOfItem;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItem() {
        return numberOfItem;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "JsonItem{" +
                "name='" + name + '\'' +
                ", numberOfItem=" + numberOfItem +
                ", value='" + value + '\'' +
                '}';
    }
}

package com.intranet.utils;

public class OpcionCombo {
    private String id;
    private String label;

    public OpcionCombo(String id, String label) {
        this.id = id;
        this.label = label;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return label;
    }
}

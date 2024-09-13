package com.example.ev2_iot_camila_diaz;

import java.io.Serializable;

public class Products implements Serializable{
    private String etxtName, etxtDesc;
    private int etxtPrice, etxtQuantity;

    public Products(String etxtName, int etxtQuantity, int etxtPrice, String etxtDesc){
        this.etxtName = etxtName;
        this.etxtQuantity = etxtQuantity;
        this.etxtPrice = etxtPrice;
        this.etxtDesc = etxtDesc;
    }

    public String getName() {
        return etxtName;
    }
    public int getPrice() {
        return etxtPrice;
    }
    public int getQuantity() {
        return etxtQuantity;
    }
    public String getDesc() {
        return etxtDesc;
    }

}

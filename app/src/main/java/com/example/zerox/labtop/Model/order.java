package com.example.zerox.labtop.Model;



public class order {
    public String customerName;
    public String customerPhone;
    public String laptopTitle;
    public String laptopPrice;
    public String customerAddress;


    public order(String customerName, String customerPhone, String customerAddress, String laptopTitle, String laptopPrice) {
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.laptopTitle = laptopTitle;
        this.laptopPrice = laptopPrice;
        this.customerAddress = customerAddress;
    }
}

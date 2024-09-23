package org.example.enums;

public enum Plan {
    BASIC("BASİC", 100);
    private String name;
    private int price;

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPrice(int price){
        this.price= price;
    }

    Plan(String name, int price){
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}




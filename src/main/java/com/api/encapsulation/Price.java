package com.api.encapsulation;

public class Price {
    protected int discount;
    private int regular;
    private int market;

    public int getDiscount(){

        return discount;
    }
    public int setDiscount(){

        return discount;
   }
    public int getRegular()
    {
        return regular;
    }
    public int setRegular(){

        return regular;
    }
    public int getMaket()
    {
        return market;
    }
    public int setMarket(){

        return market;
    }
   public void display(int regular, int discount,int market){
        this.regular=regular;
        this.discount=discount;
        this.market=market;
       System.out.println(this.getRegular()+this.getDiscount()+getMaket());
   }

    public static void main(String[] args) {
        Price fe=new Price();
        fe.display(10,20,10);
    }
}

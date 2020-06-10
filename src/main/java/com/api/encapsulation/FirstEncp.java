package com.api.encapsulation;

public class FirstEncp {
    private int i;
    private int j;

    public int getValueI(){
       return i;
    }
    public int setValueI(){
        return i;
   }
    public int getValueJ(){
        return j;
    }
    public int setValueJ(){
        return j;
    }
   public void display(int i, int j){
        this.i=i;
        this.j=j;
       System.out.println(this.getValueI()+this.getValueJ());
   }

    public static void main(String[] args) {
        FirstEncp fe=new FirstEncp();
       fe.display(10,20);
    }
}

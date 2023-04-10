package com.driver;

public class Pizza {

    private int price;
    private int vegprice=300;
    private int nonvegprice=400;
    private int cheeseprice=80;
    private int vegtopprice=70;
    private int nonvegtopprice=120;
    private int takeawayprice=20;
    private Boolean isVeg;
    private Boolean getbill=false;
    private String bill="";

    private Boolean cheeseadded=false;
    private Boolean toppingadded=false;
    private Boolean takeaway=false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price+=vegprice;
        }
        else{
            this.price+=nonvegprice;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
         if(!cheeseadded){
             this.price+=cheeseprice;
             cheeseadded=true;
         }
    }

    public void addExtraToppings(){
        if(!toppingadded){
            if(isVeg){
                this.price+=vegtopprice;
            }
            else{
                this.price+=nonvegtopprice;
            }

            toppingadded=true;
        }
    }

    public void addTakeaway(){
        if(!takeaway){
            this.price+=takeawayprice;
            takeaway=true;
        }
    }

    public String getBill(){
        if(!getbill){
            if(isVeg){
                this.bill+="Base Price Of The Pizza: 300"+"\n";
            }
            if(!isVeg){
                this.bill+="Base Price Of The Pizza: 400"+"\n";
            }
            if(cheeseadded){
                this.bill+="Extra Cheese Added: 80"+"\n";
            }
            if(toppingadded){
                this.bill+="Extra Toppings Added: 120"+"\n";
            }
            this.bill+="Total Price: "+this.price;
            getbill=true;
        }

        return this.bill;
    }
}

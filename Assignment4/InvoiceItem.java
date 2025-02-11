class InvoiceItem{
    private String ID, desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String ID, String desc, int qty, double unitPrice){
        this.ID = ID;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getID(){
        return ID;
    }

    public String getDesc(){
        return desc;
    }

    public int getQty(){
        return qty;
    }
    
    public void setQty(int qty){
        this.qty = qty;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
        return (qty * unitPrice);
    }

    public String toString(){
        return ("The InvoiceItem : " + "\nID : " + ID + "\ndesc : " + desc + "\nqty : " + qty + "\nunitPrice : " + unitPrice);
    }


    public static void main(String[] args){

        InvoiceItem i = new InvoiceItem("005", "Powerful_Sword", 5, 20.0);
        System.out.println(i);
        System.out.println("Total amount " + i.getTotal());

    }
}
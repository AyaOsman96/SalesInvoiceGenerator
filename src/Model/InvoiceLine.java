package Model;

public class InvoiceLine {

    private InvoiceHeader header;
    private int invNum;
    private String itemName;
    private float itemPrice;
    private int itemCount;
    private float itemTotal;


    public InvoiceLine(){

    }

    public InvoiceLine(InvoiceHeader h, int num, String name, float price, int count){
        this.header = h;
        this.invNum = num;
        this.itemName = name;
        this.itemPrice = price;
        this.itemCount = count;
    }

    public InvoiceHeader getHeader() {
        return header;
    }

    public void setHeader(InvoiceHeader h){
        this.header = h;
    }

    public int getInvNum() {
        return invNum;
    }

    public void setInvNum(int invNum) {
        this.invNum = invNum;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getCount() {
        return itemCount;
    }

    public void setCount(int count) {
        this.itemCount = count;
    }

    public float getItemTotal() {
        itemTotal = itemPrice*itemCount;
        return itemTotal;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" +
                "header=" + header.getInvHNum() +
                ", itemName='" + itemName +
                ", itemPrice=" + itemPrice +
                ", itemCount=" + itemCount + '}';
    }
}

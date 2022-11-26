package Model;

import java.util.Date;

public class InvoiceTable {

//    private int invNum;
//    private Date date;
//    private String cusName;
//    private float InvTotal;
    private float itmPrice;
    private String itmName;
    private int count;
    private int itmTotal;

    public InvoiceTable(){

    }

    public InvoiceTable(int x){

    }

    public float getItmPrice() {
        return itmPrice;
    }

    public void setItmPrice(float itmPrice) {
        this.itmPrice = itmPrice;
    }

    public String getItmName() {
        return itmName;
    }

    public void setItmName(String itmName) {
        this.itmName = itmName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getItmTotal() {
        return itmTotal;
    }

    public void setItmTotal(int itmTotal) {
        this.itmTotal = itmTotal;
    }
}

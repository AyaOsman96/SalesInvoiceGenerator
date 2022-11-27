package Model;

import java.util.ArrayList;

public class InvoiceHeader {

    private int invHNum;
    private String date;
    private String cusName;
    private ArrayList<InvoiceLine> items ;
    private float totalNo;

    public InvoiceHeader() {
    }

    public InvoiceHeader(int num, String date, String name){
        this.invHNum = num;
        this.date = date;
        this.cusName = name;
    }

    public int getInvHNum() {
        return invHNum;
    }

    public void setInvHNum(int invNum) {
        this.invHNum = invNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public void setItems(ArrayList<InvoiceLine> items){
        this.items = items;
    }

    public ArrayList<InvoiceLine> getItems(){
        if (items == null){
            items = new ArrayList<>();
        }
        return items;
    }
    public float getTotalNo() {
        for(int i=0; i<getItems().size(); i++){
            totalNo += getItems().get(i).getItemTotal();
        }
        return totalNo;
    }


    @Override
    public String toString() {
        return "Model.InvoiceHeader{" +
                "Invoice Number: " + invHNum +
                ", Date: " + date +
                ", Customer Name: " + cusName + " }";
    }
}

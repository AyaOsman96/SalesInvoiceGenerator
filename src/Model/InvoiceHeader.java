package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class InvoiceHeader {

    private int invNo;
    private Date date;
    //private DateFormat d= new SimpleDateFormat("dd-MM-yyyy");
    private String cusName;
    //private ArrayList<Invoice_Line>lines ;
    private int totalNo;

    public InvoiceHeader() {
    }

    public InvoiceHeader(int num,Date date, String name){
        super();
        this.invNo = num;
        this.date = date;
        this.cusName = name;
    }

    public int getInvNo() {
        return invNo;
    }

    public void setInvNo(int invNo) {
        this.invNo = invNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public int getTotalNo() {
        return totalNo;
    }

    public void setTotalNo(int totalNo) {
        this.totalNo = totalNo;
    }

    @Override
    public String toString() {
        return "Model.InvoiceHeader{" +
                "Invoice Number: " + invNo +
                ", Date: " + date +
                ", Customer Name: " + cusName + " }";
    }
}

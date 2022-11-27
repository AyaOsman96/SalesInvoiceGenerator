package Controller;
import View.InvGenGIU2;
//import View.InvoiceGenGIU;


public class MySIGApp {
    public static void main(String[] args) {
       InvGenGIU2 myApp = new InvGenGIU2("Sales Invoice Generator");
//        InvoiceGenGIU myApp = new InvoiceGenGIU("Sales Invoice Generator");
        myApp.setVisible(true);

    }

}

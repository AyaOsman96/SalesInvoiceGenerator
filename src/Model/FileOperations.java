package Model;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class FileOperations {

    public static ArrayList<InvoiceHeader> headers = new ArrayList<>();
    public static ArrayList<InvoiceLine> lines = new ArrayList<>();

    public static void readHeaderFile() {
        String line = "";
        String splitBy = ",";
        String [] invoicesRead = null;
        String [] linesData = null;
        try{
            BufferedReader br = new BufferedReader(
                    new FileReader(System.getProperty("user.dir")
                            + "\\resources\\InvoiceHeader.csv"));
            while ((line = br.readLine())!=null) {
                invoicesRead = line.split(splitBy);
                InvoiceHeader invoiceData = new InvoiceHeader();
                invoiceData.setInvHNum(Integer.valueOf(invoicesRead[0]));
                invoiceData.setDate(invoicesRead[1]);
                invoiceData.setCusName(invoicesRead[2]);
                headers.add(invoiceData);
            }

        } catch (IOException e) {e.printStackTrace();}

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(System.getProperty("user.dir")
                            + "\\resources\\InvoiceLine.csv"));
            while ((line = br.readLine())!=null)
            {
                linesData = line.split(splitBy);
                InvoiceLine invoiceL = new InvoiceLine();
                invoiceL.setInvNum(Integer.valueOf(linesData[0]));
                invoiceL.setItemName(linesData[1]);
                invoiceL.setItemPrice(Float.valueOf(linesData[2]));
                invoiceL.setCount(Integer.valueOf(linesData[3]));
                lines.add(invoiceL);
            }
        } catch (IOException e) {e.printStackTrace();}

        for (int i = 0; i < headers.size(); i++) {
            System.out.println("Invoice " + headers.get(i).getInvHNum() + " Num\n" + "{" + "\n"
                    + headers.get(i).getDate() + ", " + headers.get(i).getCusName());
            for (int j = 0; j < lines.size(); j++) {
                if ((lines.get(j).getInvNum()) == (headers.get(i).getInvHNum()))
                    System.out.println(lines.get(j).getItemName() + ", " + lines.get(j).getItemPrice()
                            + ", " + lines.get(j).getCount());
            }
            System.out.println("}");
            System.out.println("");
        }
    }

    /*public static void writeFile(ArrayList<InvoiceHeader> invoices) {


        try {


            FileWriter outputFile = new FileWriter(System.getProperty("user.dir")
                    + "\\resources\\InvoiceHeader.csv");

            String collect1 = invoices.stream().collect(Collectors.joining(",\n" + ":"));



        } catch (IOException e) {e.printStackTrace();}
    }*/

    public static void main(String[] args) {
        //writeFile(headers);
        //headers
        readHeaderFile();
    }
}




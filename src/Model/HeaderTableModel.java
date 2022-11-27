package Model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import Model.InvoiceHeader;

public class HeaderTableModel extends AbstractTableModel {

    private ArrayList<InvoiceHeader> incHdrList;
    String[] invoicesTblHdr = {"No.","Date","Customer","Total"};

    public HeaderTableModel() {
    }

    public HeaderTableModel(ArrayList<InvoiceHeader> incHdrList) {
        this.incHdrList = incHdrList;
    }

    @Override
    public int getRowCount() {
        return incHdrList.size();
    }

    @Override
    public int getColumnCount() {
        return invoicesTblHdr.length;
    }

    public String getColumnName(int col) {
        return invoicesTblHdr[col];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceHeader header = incHdrList.get(rowIndex);
        switch (columnIndex){
            case 0:
                return header.getInvHNum();
            case 1:
                return header.getDate();
            case 2:
                return header.getCusName();
            case 3:
                return header.getTotalNo();
        }
        return null;
    }
}

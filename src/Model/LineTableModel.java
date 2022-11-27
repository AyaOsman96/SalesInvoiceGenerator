package Model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class LineTableModel extends AbstractTableModel {

    private ArrayList<InvoiceLine> invLineList;
    private String[] invoicesItemsTblHdr = {"No.","Item Name","Item Price","Count","Item Total"};

    public LineTableModel() {
    }

    public LineTableModel(ArrayList<InvoiceLine> invLineList) {
        this.invLineList = invLineList;
    }

    @Override
    public int getRowCount() {
        return invLineList.size();
    }

    @Override
    public int getColumnCount() {
        return invoicesItemsTblHdr.length;
    }

    public String getColumnName(int col) {
        return invoicesItemsTblHdr[col];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceLine line = invLineList.get(rowIndex);
        switch (columnIndex){
            case 0:
                return line.getInvNum();
            case 1:
                return line.getItemName();
            case 2:
                return line.getItemPrice();
            case 3:
                return line.getCount();
            case 4:
                return line.getItemTotal();
        }
        return null;
    }
}

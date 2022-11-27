package View;

import Controller.ActListener;
import Model.HeaderTableModel;
import Model.InvoiceHeader;
import Model.InvoiceLine;
import Model.LineTableModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class InvGenGIU2 extends JFrame {

    InvoiceHeader invHeader;
    InvoiceLine invLine;
    private ArrayList<InvoiceHeader> headerArrayList;
    private ArrayList<InvoiceLine> itemsArrayList;
    private HeaderTableModel headerTable = new HeaderTableModel();
    private LineTableModel itemsTable = new LineTableModel();

    private JButton createNewInvoiceBtn;
    private JButton deleteInvoiceBtn;
    private JButton saveBtn;
    private JButton cancelBtn;
    private JButton createNewLineBtn;
    private JButton deleteLineBtn;

    private JMenu fileMnu;
    private JMenuBar mnuBar;
    private JMenuItem loadFileMnuItm;
    private JMenuItem saveFileMnuItm;

    private JTable invoicesTbl;
    private JTable invoicesItemsTbl;

    private JLabel invoiceNumLbl;
    private JLabel invoiceNumValueLbl;
    private JLabel invoiceDateLbl;
    private JLabel customerNameLbl;
    private JLabel invoiceTotalLbl;
    private JLabel invoiceTotalValueLbl;
    private JLabel invoiceDateValueLbl;
    private JLabel customerNameValueLbl;

//    private JPanel leftSidePnl;
//    private JPanel rightSidePnl;
//    private JPanel invoiceTblPnl;
//    private JPanel invoiceItemsTblPnl;

    private JPanel invoiceHeaderPnl;
    private JPanel invoiceItemsPnl;
    private JPanel invoicesTblPnl;

    private JScrollPane scrollTbl1 = null;
    private JScrollPane scrollTbl2;

    private ActListener actListener = new ActListener();

    public InvGenGIU2 (String title){
        super(title);
        initComponents();
    }

    private void initComponents() {

        createNewInvoiceBtn = new JButton("Create New Invoice");
        createNewInvoiceBtn.addActionListener(actListener);

        deleteInvoiceBtn = new JButton("Delete Invoice");
        deleteInvoiceBtn.addActionListener(actListener);

        saveBtn = new JButton("Save");
        saveBtn.addActionListener(actListener);

        cancelBtn = new JButton("Cancel");
        cancelBtn.addActionListener(actListener);

        createNewLineBtn = new JButton();
        deleteLineBtn = new JButton();

        fileMnu = new JMenu("File");
        mnuBar = new JMenuBar();

        loadFileMnuItm = new JMenuItem("Load File", 'L');
        loadFileMnuItm.setAccelerator(KeyStroke.getKeyStroke('O', KeyEvent.CTRL_MASK));
        loadFileMnuItm.addActionListener(actListener);

        saveFileMnuItm = new JMenuItem("Save File", 'S');
        saveFileMnuItm.setAccelerator(KeyStroke.getKeyStroke('S', KeyEvent.CTRL_MASK));
        saveFileMnuItm.addActionListener(actListener);

        setJMenuBar(mnuBar);
        mnuBar.add(fileMnu);
        fileMnu.add(loadFileMnuItm);
        fileMnu.add(saveFileMnuItm);

        invoicesTbl = new JTable();
        invoicesItemsTbl = new JTable();

        scrollTbl1 = new JScrollPane();
        scrollTbl2 = new JScrollPane();

        invoicesTbl.setModel(new DefaultTableModel(new Object[][]{},
                new String []{"No.", "Date", "Customer", "Total"})
        );
        scrollTbl1.setViewportView(invoicesTbl);


        invoicesItemsTbl.setModel(new DefaultTableModel(new Object [][] {},
                new String [] {})
        );
        scrollTbl2.setViewportView(invoicesItemsTbl);


        invoiceNumLbl = new JLabel("Invoice Number: ");
        invoiceNumValueLbl = new JLabel();
        invoiceDateLbl = new JLabel("Invoice Date: ");
        customerNameLbl = new JLabel("Customer Name: ");
        invoiceTotalLbl = new JLabel("Invoice Total: ");
        invoiceTotalValueLbl = new JLabel();

        invoiceDateValueLbl = new JLabel();
        customerNameValueLbl = new JLabel ();

        invoiceHeaderPnl = new JPanel();
        invoiceItemsPnl = new JPanel();
        invoicesTblPnl = new JPanel();



        invoicesTblPnl.setBorder(BorderFactory.createTitledBorder("Invoices Table"));

        invoicesTbl.setModel(new DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                        "No.", "Date", "Customer", "Total"}
        ));
        scrollTbl1.setViewportView(invoicesTbl);

        GroupLayout invoicesTblPnlLayout = new GroupLayout(invoicesTblPnl);
        invoicesTblPnl.setLayout(invoicesTblPnlLayout);
        invoicesTblPnlLayout.setHorizontalGroup(
                invoicesTblPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, invoicesTblPnlLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(scrollTbl1, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        invoicesTblPnlLayout.setVerticalGroup(
                invoicesTblPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(invoicesTblPnlLayout.createSequentialGroup()
                                .addComponent(scrollTbl1, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                                .addContainerGap())
        );

        GroupLayout invoiceHeaderPnlLayout = new GroupLayout(invoiceHeaderPnl);
        invoiceHeaderPnl.setLayout(invoiceHeaderPnlLayout);
        invoiceHeaderPnlLayout.setHorizontalGroup(
                invoiceHeaderPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(invoiceHeaderPnlLayout.createSequentialGroup()
                                .addGroup(invoiceHeaderPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(invoiceHeaderPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(invoiceHeaderPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(invoiceHeaderPnlLayout.createSequentialGroup()
                                                                .addGap(4, 4, 4)
                                                                .addComponent(invoiceNumLbl, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(invoiceDateLbl, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                                                .addComponent(customerNameLbl, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(invoiceTotalLbl, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                                .addGroup(invoiceHeaderPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, invoiceHeaderPnlLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(invoiceDateValueLbl, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(invoiceHeaderPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(invoiceHeaderPnlLayout.createSequentialGroup()
                                                        .addGap(8, 8, 8)
                                                        .addComponent(invoiceNumValueLbl, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(GroupLayout.Alignment.TRAILING, invoiceHeaderPnlLayout.createSequentialGroup()
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(invoiceHeaderPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(customerNameValueLbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(invoiceTotalValueLbl, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))))
                                .addContainerGap(273, Short.MAX_VALUE))
        );

        invoiceHeaderPnlLayout.setVerticalGroup(
                invoiceHeaderPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(invoiceHeaderPnlLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(invoiceHeaderPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(invoiceHeaderPnlLayout.createSequentialGroup()
                                                .addGroup(invoiceHeaderPnlLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(invoiceNumValueLbl)
                                                        .addComponent(invoiceNumLbl))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(invoiceHeaderPnlLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(invoiceDateValueLbl)
                                                        .addComponent(invoiceDateLbl))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(invoiceHeaderPnlLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(customerNameValueLbl)
                                                        .addComponent(customerNameLbl))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(invoiceTotalValueLbl))
                                        .addGroup(invoiceHeaderPnlLayout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(invoiceTotalLbl)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        invoiceItemsPnl.setBorder(BorderFactory.createTitledBorder("Invoice Items"));
        invoicesItemsTbl.setModel(new DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                        "No.", "Item Name", "Item Price", "Count", "Item Total"
                }
        ));
        scrollTbl2.setViewportView(invoicesItemsTbl);

        GroupLayout invoiceItemsPanelLayout = new GroupLayout(invoiceItemsPnl);
        invoiceItemsPnl.setLayout(invoiceItemsPanelLayout);
        invoiceItemsPanelLayout.setHorizontalGroup(
                invoiceItemsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(invoiceItemsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(invoiceItemsPanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(scrollTbl2, GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        invoiceItemsPanelLayout.setVerticalGroup(
                invoiceItemsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(invoiceItemsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, invoiceItemsPanelLayout.createSequentialGroup()
                                        .addComponent(scrollTbl2, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(invoicesTblPnl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(invoiceItemsPnl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(invoiceHeaderPnl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(createNewInvoiceBtn)
                                .addGap(95, 95, 95)
                                .addComponent(deleteInvoiceBtn)
                                .addGap(212, 212, 212)
                                .addComponent(createNewLineBtn)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteLineBtn)
                                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(invoiceHeaderPnl, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(invoiceItemsPnl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(invoicesTblPnl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(createNewInvoiceBtn)
                                                .addComponent(createNewLineBtn)
                                                .addComponent(deleteLineBtn))
                                        .addComponent(deleteInvoiceBtn))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(200,200);
        setSize(1000,500);
    }

    public ActListener getActionsListener() {
        return actListener;
    }

    public ArrayList<InvoiceLine> getItemsArrayList() {
        return itemsArrayList;
    }

    public void setItemsArrayList(ArrayList<InvoiceLine> itemsArrayList) {
        this.itemsArrayList = itemsArrayList;
    }

    public void setActListener(ActListener actListener) {
        this.actListener = actListener;
    }

    public void setHeaderArrayList(ArrayList<InvoiceHeader> headerArrayList) {
        this.headerArrayList = headerArrayList;
    }

    public ArrayList<InvoiceHeader> getHeaderArrayList() {
        return headerArrayList;
    }

    public InvoiceHeader getNo(int no){
        for (InvoiceHeader header : headerArrayList){
            if (header.getInvHNum() == no) {
                return header;
            }
        }
        return null;
    }

    public JTable getInvoicesTbl() {
        return invoicesTbl;
    }

    public void setInvoicesTbl(JTable invoicesTbl) {
        this.invoicesTbl = invoicesTbl;
    }

    public void setHeaderTable(HeaderTableModel headerTable) {
        this.headerTable = headerTable;
    }

    public HeaderTableModel getHeaderTable() {
        return headerTable;

    }

    public LineTableModel getItemsTable() {
        return itemsTable;
    }

    public void setItemsTable(LineTableModel itemsTable) {
        this.itemsTable = itemsTable;
    }

    public JLabel getCustomerNameValueLbl() {
        return customerNameValueLbl;
    }

    public void setCustomerNameValueLabel(JLabel customerNameValueLbl) {
        this.customerNameValueLbl = customerNameValueLbl;
    }

    public JLabel getInvoiceDateValueLabel() {
        return invoiceDateValueLbl;
    }

    public void setInvoiceDateValueLabel(JLabel invoiceDateValueLbl) {
        this.invoiceDateValueLbl = invoiceDateValueLbl;
    }

    public JLabel getInvoiceNumValueLabel() {
        return invoiceNumValueLbl;
    }

    public void setInvoiceNumValueLabel(JLabel invoiceNumValueLabel) {
        this.invoiceNumValueLbl = invoiceNumValueLbl;
    }

    public JLabel getInvoiceTotalValueLbl() {
        return invoiceTotalValueLbl;
    }

    public void setInvoiceTotalValueLbl(JLabel invoiceTotalValueLbl) {
        this.invoiceTotalValueLbl = invoiceTotalValueLbl;
    }

    public JTable getInvoicesItemsTbl() {
        return invoicesItemsTbl;
    }

    public void setInvoicesItemsTbl(JTable invoiceItemsTbl) {
        this.invoicesItemsTbl = invoiceItemsTbl;
    }

    /*public CreateNewInvoice getCreateNewInvoice() {
        return createNewInvoice;
    }

    public void setCreateNewInvoice(CreateNewInvoice createNewInvoice) {
        this.createNewInvoice = createNewInvoice;
    }

    public CreateNewLine getCreateNewLine() {
        return createNewLine;
    }

    public void setCreateNewLine(CreateNewLine createNewLine) {
        this.createNewLine = createNewLine;
    }*/


}

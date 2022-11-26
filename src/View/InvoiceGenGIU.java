package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;


public class InvoiceGenGIU extends JFrame {

    private JButton createNewInvoiceBtn;
    private JButton createNewLineBtn;
    private JLabel customerNameLbl;
    private JLabel customerNameValueLbl;
    private JButton deleteInvoiceBtn;
    private JButton deleteLineBtn;
    private JMenu fileMnu;
    private JMenuItem loadFileMnuItm;
    private JMenuItem saveFileMnuItm;
    private JLabel invoiceDateLbl;
    private JLabel invoiceDateValueLbl;
    private JPanel invoiceHeaderPnl;
    private JPanel invoiceItemsPnl;
    private JTable invoiceItemsTbl;
    private JLabel invoiceNumerLbl;
    private JLabel invoiceNumerValueLbl;
    private JLabel invoiceTotalLbl;
    private JLabel invoiceTotalValueLbl;
    private JPanel invoiceTblPnl;
    private JTable invoiceTbl;
    private JMenuBar jMnuBar;
    private JScrollPane jScrlPne1;
    private JScrollPane jScrlPne2;

    private String[] tblCol = {"No.","Date","Customer","Total"};



    public InvoiceGenGIU (){
        initComponents();
    }

    private void initComponents() {
        createNewInvoiceBtn = new JButton();
        createNewLineBtn = new JButton();;
        customerNameLbl = new JLabel();
        customerNameValueLbl = new JLabel();
        deleteInvoiceBtn = new JButton();;
        deleteLineBtn = new JButton();;
        fileMnu = new JMenu();
        loadFileMnuItm = new JMenuItem();
        saveFileMnuItm = new JMenuItem();
        invoiceDateLbl = new JLabel();
        invoiceDateValueLbl = new JLabel();
        invoiceHeaderPnl = new JPanel();
        invoiceItemsPnl = new JPanel();
        invoiceItemsTbl = new JTable();
        invoiceNumerLbl = new JLabel();
        invoiceNumerValueLbl = new JLabel();
        invoiceTotalLbl = new JLabel();
        invoiceTotalValueLbl = new JLabel();
        invoiceTblPnl = new JPanel();
        invoiceTbl = new JTable();
        jMnuBar = new JMenuBar();
        jScrlPne1 = new JScrollPane();
        jScrlPne2 = new JScrollPane();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(200,200);
        setSize(1000,500);

        invoiceTblPnl.setBorder(BorderFactory.createTitledBorder("Invoice InvoiceLine"));

        invoiceTbl.setModel(new DefaultTableModel(
                new Object[][]{

                }, tblCol));
        //invoiceTbl.getSelectionModel().addListSelectionListener(invoiceSelectionListener);
        jScrlPne1.setViewportView(invoiceTbl);

        GroupLayout invoiceTblPnlLayout = new GroupLayout(invoiceTbl);
        invoiceTblPnl.setLayout(invoiceTblPnlLayout);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package  GestionVente;

import Base_Données.Parameter;
import Base_Données.ResultSetTableModel;
import Base_Données.db_connection;
import java.sql.ResultSet;
import GestionVente.VenteTicket;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author bouzazi
 */
public class Recu extends javax.swing.JFrame {
ResultSet rs;
    db_connection db;
    /**
     * Creates new form Recu
     */
    public Recu() {
        db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB,new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
         inporter();
        date();
    }

     public void inporter() {
       String colon[] = {"num_Ticket","code_produit","reference","prix_vente","stock_sortie","subtotal"};
        rs = db.fcSelectCommand(colon, "vente", "num_Ticket='" + VenteTicket.txtTicket.getText() + "'");
        tbleImp.setModel(new ResultSetTableModel(rs));
        lbltotal.setText(VenteTicket.lbltot2.getText());
        lblcash.setText(VenteTicket.txtcas.getText());
        payapres();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbleImp = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblpay = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        lblcash = new javax.swing.JLabel();
        lblheure = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Reçu");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 20, 150, 50);

        tbleImp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "num_facture", "code_produit", "reference", "Prix de vente", "Stock sortire", "total "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbleImp);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 100, 630, 320);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Payé aprés :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(370, 500, 130, 28);

        lblpay.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblpay.setText("xx");
        lblpay.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblpay);
        lblpay.setBounds(550, 500, 83, 28);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Cash  :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(390, 460, 100, 28);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("total :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(400, 420, 100, 28);

        lbltotal.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbltotal.setText("xx");
        jPanel1.add(lbltotal);
        lbltotal.setBounds(560, 420, 83, 28);

        lblcash.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblcash.setText("xx");
        jPanel1.add(lblcash);
        lblcash.setBounds(560, 460, 83, 28);

        lblheure.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblheure.setText("date :");
        jPanel1.add(lblheure);
        lblheure.setBounds(110, 80, 100, 15);

        jLabel4.setText(" heure :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(350, 80, 46, 16);

        lbldate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbldate.setText("date :");
        jPanel1.add(lbldate);
        lbldate.setBounds(450, 80, 100, 20);

        jLabel8.setText("date :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 80, 34, 16);

        jPanel2.setBackground(new java.awt.Color(51, 0, 153));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("Imprimer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 383, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*      MessageFormat header =new MessageFormat("Report print");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}");
        try {
           tbleImp.print(jPanel.PrintMode.NORMAL,header ,footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("cannot print %s%n",e.getMessage());}*/
        
        //this.printComponents(null);
        
        
        PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Data");
            
            job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                    pf.setOrientation(PageFormat.LANDSCAPE);
                 if(pageNum > 0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.47,0.47);
            /*  JFrame f = new JFrame();
                   f.add(jPanel1);
                   f.add(tbleImp);
                   f.print(g2);*/
            
       jPanel1.print(g2);
                
                return Printable.PAGE_EXISTS;
                         
                
            }
    });
            boolean ok = job.printDialog();
        if(ok){
        try{
            
        job.print();
        }
        catch (PrinterException ex){
	ex.printStackTrace();
}
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
VenteTicket s = new VenteTicket();
s.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
     public void date(){
         
        lbldate.setText(VenteTicket.TempN.getText());
        lblheure.setText(VenteTicket.dateN.getText());
    }

    public void payapres() {
        int a = Integer.parseInt(VenteTicket.lbltot2.getText());
        int b = Integer.parseInt(VenteTicket.txtcas.getText());
        int c = b - a;
        lblpay.setText(Integer.toString(c));
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Recu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblcash;
    public javax.swing.JLabel lbldate;
    public javax.swing.JLabel lblheure;
    public javax.swing.JLabel lblpay;
    public javax.swing.JLabel lbltotal;
    public javax.swing.JTable tbleImp;
    // End of variables declaration//GEN-END:variables
}

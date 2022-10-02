/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GestionVente;

import Base_Données.Parameter;
import Base_Données.ResultSetTableModel;
import Base_Données.db_connection;
import static GestionVente.devis.txtTVA;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author bouzazi
 */
public class Produit extends javax.swing.JFrame {

    /**
     * Creates new form utilisateur
     */
    ResultSet rs;
    db_connection db;
    public Produit() {
        db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB, new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
        table();
     DateN();
    }
     public void DateN() {
        Date s = new Date();
        SimpleDateFormat tgl = new SimpleDateFormat("EEEE-dd-MMM-yyyy");
        SimpleDateFormat jam = new SimpleDateFormat("HH:mm");
        TempN.setText(jam.format(s));
        dateN.setText(tgl.format(s));}
     public void table() {
        String t[] = {"id","code_produit","reference","deseignation","Tva","rangement","fournisseur","remise","prix","stock"};
        rs = db.querySelect(t, "produit");
        tbl_prod.setModel(new ResultSetTableModel(rs));
    }
     void actualiser() {
        txtid.setText("");
        txtref.setText("");
        txtdes.setText("");
        txtran.setText("");
        txtTVA.setText("");
        txtfou.setText("");
        txtrem.setText("");
        txtpri.setText("");
        txtsto.setText("");}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_prod = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtdes = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtran = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtref = new javax.swing.JTextField();
        txtrem = new javax.swing.JTextField();
        txtpri = new javax.swing.JTextField();
        txtsto = new javax.swing.JTextField();
        txtfou = new javax.swing.JTextField();
        Ajouter = new javax.swing.JButton();
        Modifier = new javax.swing.JButton();
        Supprimer = new javax.swing.JButton();
        Actualiser = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_prod1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        txtTVA = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Recherche = new javax.swing.JButton();
        comrech = new javax.swing.JComboBox();
        txtrech = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        TempN = new javax.swing.JLabel();
        dateN = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        Retour = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(50, 50));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1400, 950));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 900));
        jPanel1.setLayout(null);

        tbl_prod.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbl_prod.setForeground(new java.awt.Color(0, 0, 102));
        tbl_prod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "code_produit", "reference", "deseignation", "TVA", "rangement", "fournisseur", "remise", "prix", "stock "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_prod.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_prodMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_prod);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 420, 1310, 380);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(850, 500));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Code produit  ");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 10, 130, 27);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Fournisseur ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 210, 110, 20);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Remise   % ");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 250, 120, 27);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Reference   ");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 50, 120, 27);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("Deseignation");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 90, 110, 27);
        jPanel2.add(txtdes);
        txtdes.setBounds(170, 90, 380, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("Prix  ");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 290, 90, 27);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Stock   ");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 330, 90, 27);
        jPanel2.add(txtran);
        txtran.setBounds(170, 170, 380, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setText("Rangement ");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 170, 110, 27);
        jPanel2.add(txtid);
        txtid.setBounds(170, 10, 380, 30);
        jPanel2.add(txtref);
        txtref.setBounds(170, 50, 380, 30);
        jPanel2.add(txtrem);
        txtrem.setBounds(170, 250, 380, 30);
        jPanel2.add(txtpri);
        txtpri.setBounds(170, 290, 380, 30);

        txtsto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstoActionPerformed(evt);
            }
        });
        jPanel2.add(txtsto);
        txtsto.setBounds(170, 330, 380, 30);
        jPanel2.add(txtfou);
        txtfou.setBounds(170, 210, 380, 30);

        Ajouter.setBackground(new java.awt.Color(255, 255, 255));
        Ajouter.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Ajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/A.png"))); // NOI18N
        Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterActionPerformed(evt);
            }
        });
        jPanel2.add(Ajouter);
        Ajouter.setBounds(630, 10, 40, 40);

        Modifier.setBackground(new java.awt.Color(255, 255, 255));
        Modifier.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/M.jpg"))); // NOI18N
        Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierActionPerformed(evt);
            }
        });
        jPanel2.add(Modifier);
        Modifier.setBounds(630, 60, 40, 40);

        Supprimer.setBackground(new java.awt.Color(255, 255, 255));
        Supprimer.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/S.png"))); // NOI18N
        Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerActionPerformed(evt);
            }
        });
        jPanel2.add(Supprimer);
        Supprimer.setBounds(630, 110, 40, 40);

        Actualiser.setBackground(new java.awt.Color(255, 255, 255));
        Actualiser.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Actualiser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AC.jpg"))); // NOI18N
        Actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualiserActionPerformed(evt);
            }
        });
        jPanel2.add(Actualiser);
        Actualiser.setBounds(630, 160, 40, 40);

        tbl_prod1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbl_prod1.setForeground(new java.awt.Color(0, 0, 102));
        tbl_prod1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "code_produit", "reference", "deseignation", "TVA", "rangement", "fournisseur", "remise", "prix", "stock "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_prod1.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_prod1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_prod1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_prod1);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(30, 450, 1380, 420);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("TVA");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(10, 130, 110, 27);
        jPanel2.add(txtTVA);
        txtTVA.setBounds(170, 130, 380, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 30, 760, 380);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        Recherche.setBackground(new java.awt.Color(255, 255, 255));
        Recherche.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Recherche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/R.png"))); // NOI18N
        Recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercheActionPerformed(evt);
            }
        });
        jPanel3.add(Recherche);
        Recherche.setBounds(510, 70, 50, 40);

        comrech.setForeground(new java.awt.Color(0, 0, 204));
        comrech.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "code_produit", "reference", "deseignation", "rangement", "fournisseur", "remise", "prix", "stock" }));
        jPanel3.add(comrech);
        comrech.setBounds(30, 70, 160, 40);
        jPanel3.add(txtrech);
        txtrech.setBounds(200, 70, 300, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(780, 40, 570, 210);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 100, 1430, 880);

        jPanel4.setBackground(new java.awt.Color(51, 0, 255));

        TempN.setBackground(new java.awt.Color(51, 0, 255));
        TempN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TempN.setForeground(new java.awt.Color(255, 255, 255));
        TempN.setText("TempN");

        dateN.setBackground(new java.awt.Color(51, 0, 255));
        dateN.setForeground(new java.awt.Color(255, 255, 255));
        dateN.setText("DateN");

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/4.JPG"))); // NOI18N

        jButton10.setBackground(new java.awt.Color(51, 0, 255));
        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close.png"))); // NOI18N
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        Retour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.JPG"))); // NOI18N
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gestion des produits ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(Retour, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TempN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Retour, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(dateN)
                            .addGap(18, 18, 18)
                            .addComponent(TempN))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, -4, 1410, 100);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterActionPerformed
        if (txtid.getText().equals("") || txtref.getText().equals("") || txtdes.getText().equals("")
                || txtfou.getText().equals("") || txtran.getText().equals("") ||txtTVA.getText().equals("") ||  txtrem.getText().equals("")
                || txtpri.getText().equals("") || txtsto.getText().equals("")
                ) {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
            String[] colon = {"code_produit","reference","deseignation","Tva","rangement","fournisseur","remise","prix","stock"};
            String[] inf = {txtid.getText(), txtref.getText(), txtdes.getText(),txtTVA.getText(),txtran.getText(),txtfou.getText()
            ,txtrem.getText(),txtpri.getText(),txtsto.getText()};
            System.out.println(db.queryInsert("produit", colon, inf));
            table();
            actualiser();
        }
    }//GEN-LAST:event_AjouterActionPerformed

    private void ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierActionPerformed
        if (txtid.getText().equals("") || txtref.getText().equals("") || txtdes.getText().equals("")
                || txtfou.getText().equals("") || txtran.getText().equals("") || txtrem.getText().equals("")
                || txtpri.getText().equals("") || txtsto.getText().equals("")
                ) {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
                  String[] colon = {"code_produit","reference","deseignation","Tva","rangement","fournisseur","remise","prix","stock"};
              String[] inf = {txtid.getText(), txtref.getText(), txtdes.getText(),txtTVA.getText(),txtran.getText(),txtfou.getText()
            ,txtrem.getText(),txtpri.getText(),txtsto.getText()};
            String id = String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 0));
            System.out.println(db.queryUpdate("produit", colon, inf, "id='" + id + "'"));
            table();
            actualiser();
        }
    }//GEN-LAST:event_ModifierActionPerformed

    private void SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerActionPerformed
 String id = String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "est ce que tu es sure que tu veux suuprimer", "attention!!!", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("produit", "id=" + id);
        } else {
            return;
        }
        table();

    }//GEN-LAST:event_SupprimerActionPerformed

    private void ActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualiserActionPerformed
actualiser(); table();        // TODO add your handling code here:
    }//GEN-LAST:event_ActualiserActionPerformed

    private void RechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercheActionPerformed
if (txtrech.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer quelque chose");
        } else {
            if (comrech.getSelectedItem().equals("code_produit")) {
                rs = db.querySelectAll("produit", "code_produit LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("reference")) {
                rs = db.querySelectAll("produit", "reference LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("deseignation")) {
                rs = db.querySelectAll("produit", "deseignation LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("rangement")) {
                rs = db.querySelectAll("produit", "rangement LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("fournisseur")) {
                rs = db.querySelectAll("produit", "fournisseur LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("remise")) {
                rs = db.querySelectAll("produit", "remise LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("prix")) {
                rs = db.querySelectAll("produit", "prix LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("stock")) {
                rs = db.querySelectAll("produit", "stock LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            
            
            }
        }
    }//GEN-LAST:event_RechercheActionPerformed

    private void tbl_prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_prodMouseClicked
        txtid.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 1)));
        txtref.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 2)));
        txtdes.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 3)));
           txtTVA.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 4)));
        txtran.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 5)));
txtfou.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 6)));
txtrem.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 7)));
txtpri.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 8)));
txtsto.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 9)));

       
    }//GEN-LAST:event_tbl_prodMouseClicked

    private void txtstoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstoActionPerformed

    private void tbl_prod1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_prod1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_prod1MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseClicked

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
        Principale p=new Principale();
        p.setVisible(true);
    }//GEN-LAST:event_RetourActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualiser;
    private javax.swing.JButton Ajouter;
    private javax.swing.JButton Modifier;
    private javax.swing.JButton Recherche;
    private javax.swing.JButton Retour;
    private javax.swing.JButton Supprimer;
    public static javax.swing.JLabel TempN;
    private javax.swing.JComboBox comrech;
    public static javax.swing.JLabel dateN;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_prod;
    private javax.swing.JTable tbl_prod1;
    private javax.swing.JTextField txtTVA;
    private javax.swing.JTextField txtdes;
    private javax.swing.JTextField txtfou;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtpri;
    private javax.swing.JTextField txtran;
    private javax.swing.JTextField txtrech;
    private javax.swing.JTextField txtref;
    private javax.swing.JTextField txtrem;
    private javax.swing.JTextField txtsto;
    // End of variables declaration//GEN-END:variables
}

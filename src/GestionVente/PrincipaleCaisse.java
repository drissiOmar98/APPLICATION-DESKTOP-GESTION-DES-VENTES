/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GestionVente;

/**
 *
 * @author bouzazi
 */
public class PrincipaleCaisse extends javax.swing.JFrame {

    /**
     * Creates new form Principale
     */
    public PrincipaleCaisse() {
        
        initComponents();
       
        ajoutProduit.setVisible(false);
        ajoutClient.setVisible(false);
        ajoutFournisseur.setVisible(false);
        devis.setVisible(false);
        BL.setVisible(false);
        facture.setVisible(false);
        avoir.setVisible(false);
        bc.setVisible(false);
        blFournisseur.setVisible(false);
        factureF.setVisible(false);
        venteT.setVisible(false);
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
        Ventes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        Achats = new javax.swing.JButton();
        Fichier = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        venteT = new javax.swing.JButton();
        devis = new javax.swing.JButton();
        BL = new javax.swing.JButton();
        facture = new javax.swing.JButton();
        avoir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        ajoutProduit = new javax.swing.JButton();
        ajoutClient = new javax.swing.JButton();
        ajoutFournisseur = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        bc = new javax.swing.JButton();
        blFournisseur = new javax.swing.JButton();
        factureF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(50, 50));

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));

        Ventes.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Ventes.setText("Ventes");
        Ventes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentesActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/4.JPG"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestion Commerciale");

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton5.setText("Quitter");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        Achats.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Achats.setText("Achats");
        Achats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AchatsActionPerformed(evt);
            }
        });

        Fichier.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Fichier.setText("Fichier");
        Fichier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FichierMouseClicked(evt);
            }
        });
        Fichier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FichierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fichier, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Achats, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ventes, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(645, 645, 645))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2)))
                .addGap(694, 694, 694))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(Fichier, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Ventes, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Achats, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        venteT.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        venteT.setText("Ticket");
        venteT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                venteTMouseClicked(evt);
            }
        });
        venteT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venteTActionPerformed(evt);
            }
        });

        devis.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        devis.setText("Devis");
        devis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devisActionPerformed(evt);
            }
        });

        BL.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BL.setText("B.Livraison");
        BL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLActionPerformed(evt);
            }
        });

        facture.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        facture.setText("Facture");
        facture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factureActionPerformed(evt);
            }
        });

        avoir.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        avoir.setText("Avoir");
        avoir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avoirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(devis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(venteT, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(facture, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(avoir, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(venteT, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(devis, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BL, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(facture, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avoir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        ajoutProduit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ajoutProduit.setText("Ajouter Produit ");
        ajoutProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutProduitActionPerformed(evt);
            }
        });

        ajoutClient.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ajoutClient.setText("Ajouter Client");
        ajoutClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutClientActionPerformed(evt);
            }
        });

        ajoutFournisseur.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ajoutFournisseur.setText("Ajouter Fournisseur");
        ajoutFournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutFournisseurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ajoutFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ajoutProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ajoutClient, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(ajoutProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ajoutClient, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ajoutFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        bc.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bc.setText("Bon de commande");
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });

        blFournisseur.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        blFournisseur.setText("B.Livraison");
        blFournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blFournisseurActionPerformed(evt);
            }
        });

        factureF.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        factureF.setText("Facture");
        factureF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factureFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(blFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(factureF, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bc, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(factureF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(219, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentesActionPerformed
     
        ajoutProduit.setVisible(false);
        ajoutClient.setVisible(false);
        ajoutFournisseur.setVisible(false);
        devis.setVisible(true);
        BL.setVisible(true);
        facture.setVisible(true);
        avoir.setVisible(true);
        bc.setVisible(false);
        blFournisseur.setVisible(false);
        factureF.setVisible(false);
        venteT.setVisible(true);
        
  //      VenteTicket c=new VenteTicket();
//c.setVisible(true);// TODO add your handling code here:
 // this.dispose();
    }//GEN-LAST:event_VentesActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
       this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void AchatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AchatsActionPerformed
       
       
        ajoutProduit.setVisible(false);
        ajoutClient.setVisible(false);
        ajoutFournisseur.setVisible(false);
        devis.setVisible(false);
        BL.setVisible(false);
        facture.setVisible(false);
        avoir.setVisible(false);
        bc.setVisible(true);
        blFournisseur.setVisible(true);
        factureF.setVisible(true);
        venteT.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_AchatsActionPerformed

    private void FichierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FichierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FichierActionPerformed

    private void FichierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FichierMouseClicked
    
        ajoutProduit.setVisible(true);
        ajoutClient.setVisible(true);
        ajoutFournisseur.setVisible(true);
        devis.setVisible(false);
        BL.setVisible(false);
        facture.setVisible(false);
        avoir.setVisible(false);
        bc.setVisible(false);
        blFournisseur.setVisible(false);
        factureF.setVisible(false);            
        venteT.setVisible(false);
 
        // TODO add your handling code here:
    }//GEN-LAST:event_FichierMouseClicked

    private void venteTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venteTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_venteTActionPerformed

    private void venteTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_venteTMouseClicked
        VenteTicket v=new VenteTicket();
        v.setVisible(true);
        // this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_venteTMouseClicked

    private void devisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devisActionPerformed
         devis d=new devis();
        d.setVisible(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_devisActionPerformed

    private void BLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLActionPerformed

        VenteBL v=new VenteBL();
        v.setVisible(true);
        

        // TODO add your handling code here:
    }//GEN-LAST:event_BLActionPerformed

    private void factureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factureActionPerformed
       VenteFacture v=new VenteFacture();
        v.setVisible(true);


        // TODO add your handling code here:
    }//GEN-LAST:event_factureActionPerformed

    private void avoirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avoirActionPerformed
        Avoir a=new Avoir();
        a.setVisible(true);


        // TODO add your handling code here:
    }//GEN-LAST:event_avoirActionPerformed

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
        BonCommande a=new BonCommande();
        a.setVisible(true);
    }//GEN-LAST:event_bcActionPerformed

    private void blFournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blFournisseurActionPerformed
        AchatBL a=new AchatBL();
        a.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_blFournisseurActionPerformed

    private void factureFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factureFActionPerformed

        AchatFacture a=new AchatFacture();
        a.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_factureFActionPerformed

    private void ajoutFournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutFournisseurActionPerformed
        Fournisseur a=new Fournisseur();
        a.setVisible(true);
    }//GEN-LAST:event_ajoutFournisseurActionPerformed

    private void ajoutClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutClientActionPerformed
         AjoutClient a=new AjoutClient();
        a.setVisible(true);
    }//GEN-LAST:event_ajoutClientActionPerformed

    private void ajoutProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutProduitActionPerformed
        Produit p=new Produit();
        p.setVisible(true);
      //  this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_ajoutProduitActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipaleCaisse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipaleCaisse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipaleCaisse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipaleCaisse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipaleCaisse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Achats;
    private javax.swing.JButton BL;
    private javax.swing.JButton Fichier;
    private javax.swing.JButton Ventes;
    private javax.swing.JButton ajoutClient;
    private javax.swing.JButton ajoutFournisseur;
    private javax.swing.JButton ajoutProduit;
    private javax.swing.JButton avoir;
    private javax.swing.JButton bc;
    private javax.swing.JButton blFournisseur;
    private javax.swing.JButton devis;
    private javax.swing.JButton facture;
    private javax.swing.JButton factureF;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton venteT;
    // End of variables declaration//GEN-END:variables
}

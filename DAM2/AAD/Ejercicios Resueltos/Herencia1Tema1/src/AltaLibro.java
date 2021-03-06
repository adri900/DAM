
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class AltaLibro extends javax.swing.JFrame {

    /**
     * Creates new form AltaLibro
     */
    public AltaLibro() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        altaLibro = new javax.swing.JLabel();
        etiTitulo = new javax.swing.JLabel();
        etiAutor = new javax.swing.JLabel();
        etiEditorial = new javax.swing.JLabel();
        etiISBN = new javax.swing.JLabel();
        etiPort = new javax.swing.JLabel();
        etiPag = new javax.swing.JLabel();
        etiPrecio = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtPag = new javax.swing.JTextField();
        txtISBN1 = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        combPort = new javax.swing.JComboBox();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        altaLibro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        altaLibro.setForeground(new java.awt.Color(0, 51, 255));
        altaLibro.setText("Alta de un Libro");

        etiTitulo.setText("Título");

        etiAutor.setText("Autor");

        etiEditorial.setText("Editorial");

        etiISBN.setText("ISBN");

        etiPort.setText("Tipo de Portada");

        etiPag.setText("Número de páginas");

        etiPrecio.setText("Precio");

        combPort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dura", "Blanda" }));
        combPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combPortActionPerformed(evt);
            }
        });

        btnAdd.setText("Añadir");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(altaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiAutor)
                                .addGap(18, 18, 18)
                                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiTitulo)
                                .addGap(18, 18, 18)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiEditorial)
                                    .addComponent(etiISBN))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtISBN1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(etiPrecio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecio))
                                    .addComponent(etiPag))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPag, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                                        .addComponent(btnAdd)))))))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(combPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiPort))
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(altaLibro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiAutor)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiEditorial)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiISBN)
                    .addComponent(txtISBN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(etiPort)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiPag)
                            .addComponent(txtPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiPrecio)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(combPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combPortActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        boolean b = true;
        String cad = "", titulo = null, autor = null, editorial = null, portada = null, isbn = null;
        int npag = 0;
        float precio = 0;
        
        if(txtTitulo.getText().isEmpty())
        {
            cad += "Falta el título\n";
            b = false;
        }

        if(txtAutor.getText().isEmpty())
        {
            cad += "Falta el autor\n";
            b = false;
        }

        if(txtEditorial.getText().isEmpty())
        {
            cad += "Falta la editorial\n";
            b = false;
        }

        if(txtISBN1.getText().isEmpty())
        {
            cad += "Falta el ISBN\n";
            b = false;
        }

        if(txtPag.getText().isEmpty())
        {
            cad += "Falta el número de páginas\n";
            b = false;
        }

        if(txtPrecio.getText().isEmpty())
        {
            cad += "Falta el precio\n";
            b = false;
        }

        if(b == false)
        {
            JOptionPane.showMessageDialog(null, cad, "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            try
            {
                titulo = txtTitulo.getText();
                autor = txtAutor.getText();
                editorial = txtEditorial.getText();
                isbn = txtISBN1.getText();
                npag = Integer.parseInt(txtPag.getText());
                precio = Float.parseFloat(txtPrecio.getText());
                portada = combPort.getSelectedItem().toString();
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "El formato de algún valor es incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
                b = false;
            }
            
            if(b == true)
            {
                Libro nuevoLibro = new Libro(titulo, portada, isbn, autor, editorial, npag, precio);
                Grafica.Libros.add(nuevoLibro);
                JOptionPane.showMessageDialog(null, "Libro añadido", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(AltaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel altaLibro;
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox combPort;
    private javax.swing.JLabel etiAutor;
    private javax.swing.JLabel etiEditorial;
    private javax.swing.JLabel etiISBN;
    private javax.swing.JLabel etiPag;
    private javax.swing.JLabel etiPort;
    private javax.swing.JLabel etiPrecio;
    private javax.swing.JLabel etiTitulo;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtISBN1;
    private javax.swing.JTextField txtPag;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}

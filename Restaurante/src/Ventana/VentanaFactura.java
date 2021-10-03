/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class VentanaFactura extends javax.swing.JFrame {

    /**
     * Creates new form VentanaFactura
     */
    private  DefaultTableModel modeloTablaFact = new DefaultTableModel();
    private ArrayList<Factura> facts;
    private int cont = 0;

    public VentanaFactura(ArrayList<Factura> facts) {
        initComponents();
        agregarModeloTablaFactura();
        this.facts = facts;
    }

    private void agregarModeloTablaFactura() {

        modeloTablaFact.addColumn("Producto");
        modeloTablaFact.addColumn("Cantidad");
        modeloTablaFact.addColumn("Tipo");
        modeloTablaFact.addColumn("Precio");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFactura = new javax.swing.JPanel();
        etiquetaNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        etiquetaTituloFact = new javax.swing.JLabel();
        etiquetaServicio = new javax.swing.JLabel();
        etiquetaNumFact = new javax.swing.JLabel();
        numFact = new javax.swing.JLabel();
        etiquetaMesero = new javax.swing.JLabel();
        etiquetaOrdenes = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        fechaactual = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        etiquetaTotal = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        etiquetaIva = new javax.swing.JLabel();
        iva = new javax.swing.JLabel();
        etiquetaTotalIva = new javax.swing.JLabel();
        totalIva = new javax.swing.JLabel();
        botonSiguiente = new javax.swing.JButton();
        etiquetaTel = new javax.swing.JLabel();
        cajaTel = new javax.swing.JTextField();
        etiquetaDirec = new javax.swing.JLabel();
        cajaDirec = new javax.swing.JTextField();
        cajaServicio = new javax.swing.JTextField();
        cajaMesero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFactura.setBackground(new java.awt.Color(0, 102, 153));

        etiquetaNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaNombre.setText("Nombre:");

        etiquetaTituloFact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaTituloFact.setText("Factura");

        etiquetaServicio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaServicio.setText("Servicio:");

        etiquetaNumFact.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaNumFact.setText("Num Factura:");

        numFact.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        numFact.setText("0");

        etiquetaMesero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaMesero.setText("Mesero:");

        etiquetaOrdenes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaOrdenes.setText(" Ordenes");

        etiquetaFecha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        fechaactual.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        tablaPedidos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tablaPedidos.setModel(modeloTablaFact);
        jScrollPane1.setViewportView(tablaPedidos);

        etiquetaTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaTotal.setText("Total: ");

        total.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        total.setText("0.0");

        etiquetaIva.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaIva.setText(" IVA:");

        iva.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        iva.setText("13%");

        etiquetaTotalIva.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaTotalIva.setText("Total + IVA:");

        totalIva.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        totalIva.setText("0.0");

        botonSiguiente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        botonSiguiente.setText("Siguiente fact.");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        etiquetaTel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaTel.setText("Telefono:");

        etiquetaDirec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaDirec.setText("Direccion: ");

        javax.swing.GroupLayout panelFacturaLayout = new javax.swing.GroupLayout(panelFactura);
        panelFactura.setLayout(panelFacturaLayout);
        panelFacturaLayout.setHorizontalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addComponent(etiquetaTel)
                        .addGap(18, 18, 18)
                        .addComponent(cajaTel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFacturaLayout.createSequentialGroup()
                                .addComponent(etiquetaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaactual, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFacturaLayout.createSequentialGroup()
                                .addComponent(etiquetaNumFact, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numFact, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaServicio)
                            .addComponent(etiquetaDirec))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFacturaLayout.createSequentialGroup()
                                .addComponent(cajaServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(etiquetaMesero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaMesero))
                            .addComponent(cajaDirec))
                        .addContainerGap())
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addComponent(etiquetaNombre)
                        .addGap(24, 24, 24)
                        .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaTotalIva)
                            .addComponent(etiquetaIva, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalIva, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelFacturaLayout.createSequentialGroup()
                                .addComponent(iva, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))))
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etiquetaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(etiquetaOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(etiquetaTituloFact, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelFacturaLayout.setVerticalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTituloFact, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNumFact, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numFact)
                    .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaactual, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaTel)
                        .addComponent(cajaTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDirec)
                    .addComponent(cajaDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(etiquetaOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaIva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSiguiente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTotalIva, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(totalIva))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed

        numFact.setText(String.valueOf(facts.get(cont).getnFact()));
        cajaNombre.setText(facts.get(cont).getNomCliente());
        cajaTel.setText(facts.get(cont).getTelCliente());
        cajaDirec.setText(facts.get(cont).getDirecCliente());
        cajaServicio.setText(facts.get(cont).getTipoServicio());
        cajaMesero.setText(facts.get(cont).getMesero());

        // llena la tabla con las comidas de la factura
        for (int i = 0; i < facts.get(cont).getLComida().size() - 1; i++) {

            modeloTablaFact.addRow(new Object[]{facts.get(cont).getLComida().get(i).getNombre(), facts.get(cont).getLComida().get(i).getCantidad(), facts.get(cont).getLComida().get(i).getTipo(), facts.get(cont).getLComida().get(i).getPrecio()});

        }

        total.setText(String.valueOf(facts.get(cont).calcularTotal()));
        totalIva.setText(String.valueOf(facts.get(cont).calcularConIva()));

        cont++;
    }//GEN-LAST:event_botonSiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VentanaFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JTextField cajaDirec;
    private javax.swing.JTextField cajaMesero;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaServicio;
    private javax.swing.JTextField cajaTel;
    private javax.swing.JLabel etiquetaDirec;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaIva;
    private javax.swing.JLabel etiquetaMesero;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaNumFact;
    private javax.swing.JLabel etiquetaOrdenes;
    private javax.swing.JLabel etiquetaServicio;
    private javax.swing.JLabel etiquetaTel;
    private javax.swing.JLabel etiquetaTituloFact;
    private javax.swing.JLabel etiquetaTotal;
    private javax.swing.JLabel etiquetaTotalIva;
    private javax.swing.JLabel fechaactual;
    private javax.swing.JLabel iva;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel numFact;
    private javax.swing.JPanel panelFactura;
    private javax.swing.JTable tablaPedidos;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalIva;
    // End of variables declaration//GEN-END:variables
}
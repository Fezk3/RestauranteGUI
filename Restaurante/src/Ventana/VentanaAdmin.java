/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import static Ventana.VentanRest.interfaz;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Admin
 */
public class VentanaAdmin extends javax.swing.JFrame implements WindowListener {

    /**
     * Creates new form VentanaAdmin
     */
    public static Interfaz interfaz;
    private ButtonGroup grupo;

    public VentanaAdmin(Interfaz nuevo) {
        initComponents();
        interfaz = nuevo;
        grupo = new ButtonGroup();
        grupo.add(radioBotonDasayuno);
        grupo.add(radioBotonAlmuerzo);
        grupo.add(radioBotonCena);
        grupo.add(radioBotonBebida);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelMeseros = new javax.swing.JPanel();
        etiquetaNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        etiquetaApellido = new javax.swing.JLabel();
        cajaApellido = new javax.swing.JTextField();
        etiquetaCelular = new javax.swing.JLabel();
        cajaCel = new javax.swing.JTextField();
        etiquetaSalario = new javax.swing.JLabel();
        cajaSalario = new javax.swing.JTextField();
        etiquetaPanelMesero = new javax.swing.JLabel();
        botonAgregaMesero = new javax.swing.JButton();
        panelComidas = new javax.swing.JPanel();
        etiquetaPanelComidas = new javax.swing.JLabel();
        etiquetaNombComida = new javax.swing.JLabel();
        cajaNombreComida = new javax.swing.JTextField();
        etiquetaTipo = new javax.swing.JLabel();
        etiquetaPrecio = new javax.swing.JLabel();
        cajaPrecio = new javax.swing.JTextField();
        botonAgregaComida = new javax.swing.JButton();
        radioBotonDasayuno = new javax.swing.JRadioButton();
        radioBotonAlmuerzo = new javax.swing.JRadioButton();
        radioBotonCena = new javax.swing.JRadioButton();
        radioBotonBebida = new javax.swing.JRadioButton();
        panelTotales = new javax.swing.JPanel();
        etiquetaPanelTotal = new javax.swing.JLabel();
        etiquetaTotalRest = new javax.swing.JLabel();
        cajaTotalRest = new javax.swing.JLabel();
        etiquetaTotalExp = new javax.swing.JLabel();
        cajaTotalExp = new javax.swing.JLabel();
        etiquetaToralParaLlevar = new javax.swing.JLabel();
        cajaTotalParaLlevar = new javax.swing.JLabel();
        BotonCalculaTotales = new javax.swing.JButton();

        etiquetaNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaNombre.setText("Nombre:");

        cajaNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etiquetaApellido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaApellido.setText("Apellido:");

        cajaApellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etiquetaCelular.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etiquetaCelular.setText("Celular:");

        cajaCel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etiquetaSalario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaSalario.setText("Salario:");

        cajaSalario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etiquetaPanelMesero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaPanelMesero.setText("Formulario Para Nuevos Meseros");

        botonAgregaMesero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonAgregaMesero.setText("Agregar a la Plantilla");
        botonAgregaMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregaMeseroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMeserosLayout = new javax.swing.GroupLayout(panelMeseros);
        panelMeseros.setLayout(panelMeserosLayout);
        panelMeserosLayout.setHorizontalGroup(
            panelMeserosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMeserosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMeserosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(etiquetaSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(etiquetaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelMeserosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaApellido)
                    .addComponent(cajaCel)
                    .addComponent(cajaSalario)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMeserosLayout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(panelMeserosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMeserosLayout.createSequentialGroup()
                                .addComponent(etiquetaPanelMesero)
                                .addGap(47, 47, 47))
                            .addComponent(cajaNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
            .addGroup(panelMeserosLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(botonAgregaMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMeserosLayout.setVerticalGroup(
            panelMeserosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMeserosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaPanelMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(panelMeserosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelMeserosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelMeserosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaCel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelMeserosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajaSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(botonAgregaMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        etiquetaPanelComidas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaPanelComidas.setText("Formulario Para Nueva Comidas");

        etiquetaNombComida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaNombComida.setText("Nombre:");

        cajaNombreComida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etiquetaTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaTipo.setText("Tipo:");

        etiquetaPrecio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaPrecio.setText("Precio:");

        botonAgregaComida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonAgregaComida.setText("Agregar al Menu");
        botonAgregaComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregaComidaActionPerformed(evt);
            }
        });

        radioBotonDasayuno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        radioBotonDasayuno.setText("Desayuno");

        radioBotonAlmuerzo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        radioBotonAlmuerzo.setText("Almuerzo");

        radioBotonCena.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        radioBotonCena.setText("Cena");

        radioBotonBebida.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        radioBotonBebida.setText("Bebida");

        javax.swing.GroupLayout panelComidasLayout = new javax.swing.GroupLayout(panelComidas);
        panelComidas.setLayout(panelComidasLayout);
        panelComidasLayout.setHorizontalGroup(
            panelComidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComidasLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelComidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelComidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etiquetaTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaNombComida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(etiquetaPrecio))
                .addGap(18, 18, 18)
                .addGroup(panelComidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaNombreComida)
                    .addComponent(cajaPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addGroup(panelComidasLayout.createSequentialGroup()
                        .addComponent(radioBotonDasayuno, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(panelComidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioBotonBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelComidasLayout.createSequentialGroup()
                                .addComponent(radioBotonAlmuerzo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioBotonCena, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComidasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelComidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComidasLayout.createSequentialGroup()
                        .addComponent(etiquetaPanelComidas, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComidasLayout.createSequentialGroup()
                        .addComponent(botonAgregaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))))
        );
        panelComidasLayout.setVerticalGroup(
            panelComidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaPanelComidas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panelComidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaNombComida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajaNombreComida, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(panelComidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBotonDasayuno)
                    .addComponent(radioBotonAlmuerzo)
                    .addComponent(radioBotonCena))
                .addGap(2, 2, 2)
                .addComponent(radioBotonBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelComidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajaPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAgregaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        etiquetaPanelTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaPanelTotal.setText("Totales Generados Hoy");

        etiquetaTotalRest.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaTotalRest.setText("Servicio Restaurante:");

        cajaTotalRest.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        etiquetaTotalExp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaTotalExp.setText("Servicio Express:");

        cajaTotalExp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        etiquetaToralParaLlevar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaToralParaLlevar.setText("Servicio Para Llevar:");

        cajaTotalParaLlevar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        BotonCalculaTotales.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonCalculaTotales.setText("Calcular Totales");
        BotonCalculaTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalculaTotalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTotalesLayout = new javax.swing.GroupLayout(panelTotales);
        panelTotales.setLayout(panelTotalesLayout);
        panelTotalesLayout.setHorizontalGroup(
            panelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaToralParaLlevar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaTotalExp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaTotalRest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaTotalRest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajaTotalExp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajaTotalParaLlevar, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTotalesLayout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(panelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTotalesLayout.createSequentialGroup()
                        .addComponent(etiquetaPanelTotal)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTotalesLayout.createSequentialGroup()
                        .addComponent(BotonCalculaTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
        );
        panelTotalesLayout.setVerticalGroup(
            panelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaPanelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaTotalRest, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(cajaTotalRest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(panelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaTotalExp, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(cajaTotalExp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(panelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaToralParaLlevar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(cajaTotalParaLlevar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonCalculaTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelComidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTotales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMeseros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelComidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregaMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregaMeseroActionPerformed
        String nombre, apellido, celular, salario;

        nombre = cajaNombre.getText();
        apellido = cajaApellido.getText();
        celular = cajaCel.getText();
        salario = cajaSalario.getText();

        if (nombre.equals("")) {
            showMessageDialog(null, "Llene todos los espacios antes de registrar", "Invalido", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (apellido.equals("")) {
            showMessageDialog(null, "Llene todos los espacios antes de registrar", "Invalido", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (celular.equals("")) {
            showMessageDialog(null, "Llene todos los espacios antes de registrar", "Invalido", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (salario.equals("")) {
            showMessageDialog(null, "Llene todos los espacios antes de registrar", "Invalido", JOptionPane.ERROR_MESSAGE);
            return;
        }

        interfaz.meseros.add(new Mesero(nombre, apellido, celular, Double.parseDouble(salario)));

        cajaNombre.setText("");
        cajaApellido.setText("");
        cajaCel.setText("");
        cajaSalario.setText("");

    }//GEN-LAST:event_botonAgregaMeseroActionPerformed

    private void botonAgregaComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregaComidaActionPerformed

        String comida, tpo = "", prec;

        comida = cajaNombreComida.getText();
        if(radioBotonDasayuno.isSelected()){
            tpo = radioBotonDasayuno.getText();
        }
        if(radioBotonAlmuerzo.isSelected()){
            tpo = radioBotonAlmuerzo.getText();
        }
        if(radioBotonCena.isSelected()){
            tpo = radioBotonCena.getText();
        }
        if(radioBotonBebida.isSelected()){
            tpo = radioBotonBebida.getText();
        }
        prec = cajaPrecio.getText();

        if (comida.equals("")) {
            showMessageDialog(null, "Llene todos los espacios antes de registrar", "Invalido", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (tpo.equals("")) {
            showMessageDialog(null, "Llene todos los espacios antes de registrar", "Invalido", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (prec.equals("")) {
            showMessageDialog(null, "Llene todos los espacios antes de registrar", "Invalido", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (tpo.equals("Desayuno")) {
            interfaz.menuDesayuno.agegarComida(new Comida(comida, tpo, Double.parseDouble(prec)));
        }
        if (tpo.equals("Almuerzo")) {
            interfaz.menuAlmuerzo.agegarAlmuerzo(new Comida(comida, tpo, Double.parseDouble(prec)));
        }
        if (tpo.equals("Cena")) {
            interfaz.menuCena.agegarCena(new Comida(comida, tpo, Double.parseDouble(prec)));
        }
        if (tpo.equals("Bebida")) {
            interfaz.menuBebida.agegarBebida(new Comida(comida, tpo, Double.parseDouble(prec)));
        }

        cajaNombreComida.setText("");
        grupo.clearSelection();
        cajaPrecio.setText("");

    }//GEN-LAST:event_botonAgregaComidaActionPerformed

    private void BotonCalculaTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalculaTotalesActionPerformed
        
        double totalA = 0, totalP = 0, totalE = 0;
        Factura fact;
        
        for(int i=0;i<interfaz.facturas.size();i++){
            
            fact = interfaz.facturas.get(i);
            
            if(fact.getTipoServicio().equals("Comer aqui")){
                
                totalA += (fact.calcularConIva());
                /*
               for(int j=0;j<fact.LComida.size();j++){
                   
                   totalA += (fact.calcularConIva());
                   
               }
               
               */
                
            }
            
            if(fact.getTipoServicio().equals("Para llevar")){
                
                for(int j=0;j<fact.LComida.size();j++){
                   
                   totalP += (fact.LComida.get(j).getCantidad() * fact.LComida.get(j).getPrecio());
                   
               }
                
            }
            
            if(fact.getTipoServicio().equals("Express")){
                
                for(int j=0;j<fact.LComida.size();j++){
                   
                   totalE += (fact.LComida.get(j).getCantidad() * fact.LComida.get(j).getPrecio());
                   
               }
                
            }
            
        }
        
        cajaTotalRest.setText(String.valueOf(totalA));
        cajaTotalParaLlevar.setText(String.valueOf(totalP));
        cajaTotalExp.setText(String.valueOf(totalE));
        
    }//GEN-LAST:event_BotonCalculaTotalesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel /
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
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAdmin(interfaz).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCalculaTotales;
    private javax.swing.JButton botonAgregaComida;
    private javax.swing.JButton botonAgregaMesero;
    private javax.swing.JTextField cajaApellido;
    private javax.swing.JTextField cajaCel;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaNombreComida;
    private javax.swing.JTextField cajaPrecio;
    private javax.swing.JTextField cajaSalario;
    private javax.swing.JLabel cajaTotalExp;
    private javax.swing.JLabel cajaTotalParaLlevar;
    private javax.swing.JLabel cajaTotalRest;
    private javax.swing.JLabel etiquetaApellido;
    private javax.swing.JLabel etiquetaCelular;
    private javax.swing.JLabel etiquetaNombComida;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPanelComidas;
    private javax.swing.JLabel etiquetaPanelMesero;
    private javax.swing.JLabel etiquetaPanelTotal;
    private javax.swing.JLabel etiquetaPrecio;
    private javax.swing.JLabel etiquetaSalario;
    private javax.swing.JLabel etiquetaTipo;
    private javax.swing.JLabel etiquetaToralParaLlevar;
    private javax.swing.JLabel etiquetaTotalExp;
    private javax.swing.JLabel etiquetaTotalRest;
    private javax.swing.JPanel panelComidas;
    private javax.swing.JPanel panelMeseros;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTotales;
    private javax.swing.JRadioButton radioBotonAlmuerzo;
    private javax.swing.JRadioButton radioBotonBebida;
    private javax.swing.JRadioButton radioBotonCena;
    private javax.swing.JRadioButton radioBotonDasayuno;
    // End of variables declaration//GEN-END:variables

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        this.setVisible(false);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

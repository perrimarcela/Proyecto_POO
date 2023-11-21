/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ar.com.checkinn.proyecto.gui;

import ar.com.checkinn.proyecto.dao.EmpleadoDAOImpl;
import ar.com.checkinn.proyecto.dao.HabitacionDAOImpl;
import ar.com.checkinn.proyecto.entities.Empleado;
import ar.com.checkinn.proyecto.entities.Habitacion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public final class VentanaEmpleado extends javax.swing.JInternalFrame {

    DefaultTableModel modeloEmpleado = new DefaultTableModel();
    
    public VentanaEmpleado() {
        initComponents();
        InhabilitarCasillas();
        
        jTable1.setModel(modeloEmpleado);
        modeloEmpleado.addColumn("ID EMpleado");
        modeloEmpleado.addColumn("Usuario");
        modeloEmpleado.addColumn("Clave");
        modeloEmpleado.addColumn("Alias");
        modeloEmpleado.addColumn("Estado");
        
        EmpleadoDAOImpl a = new EmpleadoDAOImpl();
        ArrayList lista = a.cargarLista();
        
        for (Object unObjeto : lista) {
            Empleado unEmpleado = (Empleado) unObjeto;
            Object[] rowData = {unEmpleado.getIdEmpleado(), unEmpleado.getUsuario(),unEmpleado.getClave(),unEmpleado.getAlias(),unEmpleado.isEstado()};
            modeloEmpleado.addRow(rowData);
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtIdEmpleado = new javax.swing.JTextField();
        TxtUsuario = new javax.swing.JTextField();
        TxtClave = new javax.swing.JTextField();
        TxtAlias = new javax.swing.JTextField();
        chbEstado = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnNuevo = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(750, 550));

        jPanel1.setBackground(new java.awt.Color(2, 160, 234));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPLEADO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Id Empleado:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Usuario:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Clave:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Alias:");

        TxtIdEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        TxtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        TxtClave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtClaveActionPerformed(evt);
            }
        });

        TxtAlias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAliasActionPerformed(evt);
            }
        });

        chbEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chbEstado.setText("Disponible");

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Empleado", "Usuario", "Clave", "Alias", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtIdEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TxtAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(chbEstado)))
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BtnNuevo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnNuevo.setText("Nuevo");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        BtnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.setToolTipText("");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnNuevo)
                .addGap(18, 18, 18)
                .addComponent(BtnGuardar)
                .addGap(18, 18, 18)
                .addComponent(BtnCancelar)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnNuevo))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtClaveActionPerformed

    private void TxtAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAliasActionPerformed

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        habilitarCasillas();
        TxtIdEmpleado.requestFocus();
        EmpleadoDAOImpl e = new EmpleadoDAOImpl(); 
        TxtIdEmpleado.setText(""+e.traerIdTrue()+"");
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        int rta = JOptionPane.showConfirmDialog(this, "Desea salir de esta ventana?");
        if (rta == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        EmpleadoDAOImpl b = new EmpleadoDAOImpl();
        Empleado a = new Empleado(Integer.parseInt(TxtIdEmpleado.getText()), TxtUsuario.getText(), TxtClave.getText(), TxtAlias.getText(), chbEstado.isSelected());
        
        b.insertar(a);
        
        Object[] rowData = {a.getIdEmpleado(), a.getUsuario(),a.getClave(), a.getAlias(), a.isEstado()};
        modeloEmpleado.addRow(rowData);
        limpiar();
    }//GEN-LAST:event_BtnGuardarActionPerformed

    public void InhabilitarCasillas() {
        TxtIdEmpleado.disable();
        TxtUsuario.disable();
        TxtClave.disable();
        TxtAlias.disable();
        chbEstado.disable();
    }
    
    public void habilitarCasillas() {
        TxtIdEmpleado.enable();
        TxtUsuario.enable();
        TxtClave.enable();
        TxtAlias.enable();
        chbEstado.enable();
    }
    
    public void limpiar() {
        TxtIdEmpleado.setText("");
        TxtUsuario.setText("");
        TxtClave.setText("");
        TxtAlias.setText("");
        chbEstado.setSelected(false);
        InhabilitarCasillas();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JTextField TxtAlias;
    private javax.swing.JTextField TxtClave;
    private javax.swing.JTextField TxtIdEmpleado;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JCheckBox chbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private Object iif(boolean estado, String activo, String inactivo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

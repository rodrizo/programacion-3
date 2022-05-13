package form;

import config.Conexion;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
//import constructors.Data;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmployeeForm extends javax.swing.JFrame {

    //Data getting = new Data();
    Conexion cn = new Conexion();
    Connection con;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;
    int id = 0;

    public EmployeeForm() {
        initComponents();
        setLocationRelativeTo(null);

        JOptionPane.showMessageDialog(null, "Para buscar un empleado debe ingresar el código", "¡ATENCIÓN!", JOptionPane.INFORMATION_MESSAGE);
        //listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtIgss = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtIsr = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtLoan = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTotalSueldo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BudgetTable = new javax.swing.JTable();

        jTextField2.setText("jTextField2");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Presupuestos");

        jPanel3.setBackground(new java.awt.Color(40, 55, 71));

        jPanel1.setBackground(new java.awt.Color(46, 64, 83));
        jPanel1.setForeground(new java.awt.Color(178, 186, 187));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 127, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sueldo nominal:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 22));

        txtSueldo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 127, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellido:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        txtLastName.setForeground(new java.awt.Color(0, 0, 0));
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 127, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Desc. IGSS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, 22));

        txtIgss.setForeground(new java.awt.Color(0, 0, 0));
        txtIgss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIgssActionPerformed(evt);
            }
        });
        jPanel1.add(txtIgss, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 127, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Desc. ISR");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, 22));

        txtIsr.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtIsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 127, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Desc. prestamos");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, 22));

        txtLoan.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 90, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sueldo real");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, 22));

        txtTotalSueldo.setEditable(false);
        txtTotalSueldo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtTotalSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 130, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 52));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 243, 244));
        jLabel4.setText("CONTROL DE EMPLEADOS");

        btnAgregar.setBackground(new java.awt.Color(46, 64, 83));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(46, 64, 83));
        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnReporte.setBackground(new java.awt.Color(46, 64, 83));
        btnReporte.setText("Reporte general");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Datos del empleado");

        BudgetTable.setBackground(new java.awt.Color(128, 139, 150));
        BudgetTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BudgetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Apellido", "Salario", "IGSS", "ISR", "Prestamos", "Salario Total"
            }
        ));
        BudgetTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BudgetTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(BudgetTable);
        if (BudgetTable.getColumnModel().getColumnCount() > 0) {
            BudgetTable.getColumnModel().getColumn(0).setMinWidth(50);
            BudgetTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            BudgetTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BudgetTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BudgetTableMouseClicked

        int row = BudgetTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún empleado");
        } else {
            /*
            id = Integer.parseInt((String) BudgetTable.getValueAt(row, 0).toString());
            String monto = (String) BudgetTable.getValueAt(row, 1).toString();
            String date = BudgetTable.getValueAt(row, 2).toString();
            String desc = (String) BudgetTable.getValueAt(row, 3);

            //setting in textfields
            txtId.setText("" + id);
            txtName.setText(monto);
            txtSueldo.setText(desc);
            
            //setting id in order to take it in the other form
            getting.setId(id);
            getting.setPresupuesto(Double.parseDouble(monto));
             */
        }
    }//GEN-LAST:event_BudgetTableMouseClicked

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        //Eliminar();
        listar();
        nuevo();
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        limpiarTabla(model);
        Buscar();
        //listar();
        nuevo();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Agregar();
        //listar();
        nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtIgssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIgssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIgssActionPerformed

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMouseEntered

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
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeForm().setVisible(true);
            }
        });
    }

    void listar() {
        String sql = "SELECT * FROM empleado";

        try {
            con = cn.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[] employee = new Object[8];
            model = (DefaultTableModel) BudgetTable.getModel();
            while (rs.next()) {
                employee[0] = rs.getInt(1);
                employee[1] = rs.getString(2);
                employee[2] = rs.getString(3);
                employee[3] = rs.getFloat(4);

                employee[4] = rs.getFloat(5);
                employee[5] = rs.getFloat(6);
                employee[6] = rs.getFloat(7);
                employee[7] = rs.getFloat(8);

                model.addRow(employee);
            }
            BudgetTable.setModel(model);

        } catch (Exception e) {
        }

    }

    void listById(int id) {
        String query = "SELECT * FROM empleado WHERE Codigo=" + id;

        try {
            con = cn.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            Object[] employee = new Object[8];
            model = (DefaultTableModel) BudgetTable.getModel();
            while (rs.next()) {
                employee[0] = rs.getInt(1);
                employee[1] = rs.getString(2);
                employee[2] = rs.getString(3);
                employee[3] = rs.getFloat(4);

                employee[4] = rs.getFloat(5);
                employee[5] = rs.getFloat(6);
                employee[6] = rs.getFloat(7);
                employee[7] = rs.getFloat(8);

                model.addRow(employee);
            }
            BudgetTable.setModel(model);

            JOptionPane.showMessageDialog(null, "Empleado encontrado con éxito");

        } catch (Exception e) {
        }

    }

    void Agregar() {

        int codigo = Integer.parseInt(txtId.getText());
        String nombre = txtName.getText();
        String apellido = txtLastName.getText();
        Float sueldo = Float.parseFloat(txtSueldo.getText());
        Float igss = (Float.parseFloat(txtIgss.getText())) / 100;
        Float isr = (Float.parseFloat(txtIsr.getText())) / 100;
        Float loans = Float.parseFloat(txtLoan.getText());

        //calculating total salary
        Float total = ((sueldo - (sueldo * (igss)))) - ((sueldo - (sueldo * (igss)))) * (isr) - loans;
        txtTotalSueldo.setText(total.toString());

        try {
            if (nombre.equals("") || (apellido.equals("")) || sueldo == null) {
                JOptionPane.showMessageDialog(null, "Debe ingresar datos del presupuesto");
                limpiarTabla(model);
            } else {

                String query = "INSERT INTO empleado (Codigo, Nombre, Apellido, Salario, IGSS, ISR, Prestamos, SalarioTotal) "
                        + "VALUES ('" + codigo + "','" + nombre + "','" + apellido + "','" + sueldo + "','" + igss + "','" + isr + "','" + loans + "','" + total + "')";

                con = cn.getConnection();
                st = con.createStatement();
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Empleado registrado con exito");
                limpiarTabla(model);
            }

        } catch (Exception e) {
        }

    }

    void Modificar() {
        /*
        Float monto = Float.parseFloat(txtName.getText());

        String descripcion = txtSueldo.getText();

        String sql = "UPDATE presupuesto SET Monto='" + monto + "',Fecha='" + time + "' ,Descripcion='" + descripcion + "' WHERE Id=" + id;
        try {
            if (monto != null || time == null || descripcion != null) {
                con = cn.getConnection();
                st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Presupuesto modificado con éxito");
                limpiarTabla(model);

            } else {
                JOptionPane.showMessageDialog(null, "Error...!!!");
            }

        } catch (Exception e) {
        }
         */
    }

    void Buscar() {
        int codigo = Integer.parseInt(txtId.getText());

        //String query = "SELECT * FROM empleado WHERE Codigo=" + codigo;
        try {
            if (Integer.valueOf(codigo) != null) {
                listById(codigo);

            } else {
                JOptionPane.showMessageDialog(null, "Error...!!!");
            }

        } catch (Exception e) {
        }
    }

    void Eliminar() {
        String sql = "DELETE FROM presupuesto WHERE Id=" + id;
        String sql2 = "DELETE FROM debitos WHERE debitos.IdBudget =" + id;
        int fila = BudgetTable.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "Presupuesto no seleccionado");
        } else {
            try {
                con = cn.getConnection();
                st = con.createStatement();
                st.executeUpdate(sql2);
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Presupuesto Eliminado");
                limpiarTabla(model);

            } catch (Exception e) {
            }

        }

    }

    void nuevo() {
        txtId.setText("");
        txtName.setText("");
        txtLastName.setText("");
        txtSueldo.setText("");
        txtIgss.setText("");
        txtIsr.setText("");
        txtLoan.setText("");
        txtTotalSueldo.setText("");
        txtName.requestFocus();
    }

    void limpiarTabla(DefaultTableModel model) {
        for (int i = 0; i < BudgetTable.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    void Actualizar() {
        limpiarTabla(model);
        listar();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BudgetTable;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIgss;
    private javax.swing.JTextField txtIsr;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLoan;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTotalSueldo;
    // End of variables declaration//GEN-END:variables
}

package pkg651puntodeventa;

import java.util.ArrayList;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ventas extends javax.swing.JFrame {
    
     String productos[]={"Cafe","Tabacos","Chelas","Galletas"};
     double precios[]={20.00,75.00,45.00,16.00};
     double precio=0; int cantidad=0; 
     
     DefaultComboBoxModel comboModel= new DefaultComboBoxModel(productos); // para el combobox
     ArrayList<ventastabla>listarventas=new ArrayList<ventastabla>();
     DefaultTableModel tableModel=new DefaultTableModel();
     

    public ventas() {
        initComponents();
        this.setTitle("Ventas de Hugo"); // para poner titulo al proyecto
        this.setLocationRelativeTo(null);
        cboproductos.setModel(comboModel); // mandar a llamar los valores del combobox
        
        tableModel.addColumn("Descripcion");// titulos columnas de la tabla
        tableModel.addColumn("Precio");
        tableModel.addColumn("Cantidad");
        tableModel.addColumn("Improte");
         
         actualizar();
        calcularPrecios();
        calcularsubtotal();
       
    }
  
    
    
    public void actualizar(){
   
        tblproductos.setModel(tableModel); //para actualizar la tabla
        while (tableModel.getRowCount()>0) {
        tableModel.removeRow(0);
            
        }
        
        for(ventastabla v: listarventas){
            Object x[]=new Object[4];
            x[0]= v.getDescripcion();
            x[1]=v.getPrecio();
            x[2]=v.getCantidad();
            x[3]=v.getImporte();
            tableModel.addRow(x);

        }
        calcularsubtotal(); // despues de actualizar se calcula el subtotal
    }
   
    
    public void calcularsubtotal(){
        double subtotal=0; 
        for (int i = 0; i < tableModel.getRowCount(); i++) { //recorre cada fila en el modelo de tabla y debuelve numero de filas en la tabla
            subtotal+=Double.parseDouble(tableModel.getValueAt(i, 3).toString()); //el objeto lo convierte a string y despues a double y lo suma
        }
        lblsubtotal.setText(String.valueOf(subtotal)); //actualiza el texto y de double lo convierte a string
        calculariva();
        totalfinal();
    }
    
    public void calculariva(){
        double subtotal= Double.parseDouble(lblsubtotal.getText());
        lbliva.setText(String.valueOf(subtotal*0.16));
    }
    public void totalfinal(){
        double subtotal= Double.parseDouble(lblsubtotal.getText());
        double iva= Double.parseDouble(lbliva.getText());
        lbltotal.setText(String.valueOf(subtotal+iva));
    }
    
    
    public void calcularPrecios(){
        precio= precios[cboproductos.getSelectedIndex()]; //da el precio de el objeto seleccionado
        cantidad=Integer.parseInt(spncantidad.getValue().toString()); //obtener la cantidad
        
        lblprecio.setText(String.valueOf(precio)); // coloca el precio
        lblimporte.setText(String.valueOf(precio*cantidad)); //multiplica la cantidad por el precio

    } 
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblproducto = new javax.swing.JLabel();
        lblcantidad = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboproductos = new javax.swing.JComboBox<>();
        spncantidad = new javax.swing.JSpinner();
        lblprecio = new javax.swing.JLabel();
        lblimporte = new javax.swing.JLabel();
        ctnagregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblproductos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblsubtotal = new javax.swing.JLabel();
        lbliva = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 255, 255));

        lblproducto.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblproducto.setText("PRODUCTO:");

        lblcantidad.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblcantidad.setText("CANTIDAD:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("PRECIO:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("IMPORTE:");

        cboproductos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cboproductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboproductosActionPerformed(evt);
            }
        });

        spncantidad.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        spncantidad.setModel(new javax.swing.SpinnerNumberModel(1, 0, 100, 1));
        spncantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spncantidadStateChanged(evt);
            }
        });

        lblprecio.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblprecio.setText("$");

        lblimporte.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblimporte.setText("$");

        ctnagregar.setBackground(new java.awt.Color(255, 255, 255));
        ctnagregar.setForeground(new java.awt.Color(255, 255, 0));
        ctnagregar.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\pngwing.com.png")); // NOI18N
        ctnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctnagregarActionPerformed(evt);
            }
        });

        tblproductos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tblproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblproductos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblproductosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tblproductos);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("SUBTOTAL:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setText("IVA:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setText("TOTAL:");

        lblsubtotal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblsubtotal.setText("$");
        lblsubtotal.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblsubtotalAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lbliva.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbliva.setText("$");

        lbltotal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(255, 51, 51));
        lbltotal.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblproducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboproductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spncantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblprecio, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(lblimporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(ctnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbliva, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(lblprecio))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblimporte)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblproducto)
                                .addComponent(cboproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ctnagregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(137, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spncantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcantidad))
                        .addGap(25, 25, 25)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblsubtotal)
                    .addComponent(jLabel8)
                    .addComponent(lbliva)
                    .addComponent(jLabel9)
                    .addComponent(lbltotal))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public boolean buscar(ventastabla nueva){
        for(ventastabla v: listarventas){
            if(v.getId()==nueva.getId()){
                int nuevacantidad=v.getCantidad()+nueva.getCantidad();
                v.setCantidad(nuevacantidad);
                v.setImporte(v.getPrecio()*nuevacantidad);
                return true;
        }
            
    }
        return false;
        }
    
    private void ctnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctnagregarActionPerformed

        ventastabla Ventastabla =new ventastabla();
        
        Ventastabla.setId(cboproductos.getSelectedIndex());
        Ventastabla.setDescripcion(cboproductos.getSelectedItem().toString());
        Ventastabla.setPrecio(precio);
        Ventastabla.setCantidad(cantidad);
        Ventastabla.setImporte(precio*cantidad);
        if(!buscar(Ventastabla)){
         listarventas.add(Ventastabla);   
        }
        
        
        
      
        actualizar();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_ctnagregarActionPerformed

    private void cboproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboproductosActionPerformed
    calcularPrecios();
        // TODO add your handling code here:
    }//GEN-LAST:event_cboproductosActionPerformed

    private void spncantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spncantidadStateChanged

        calcularPrecios();
            // TODO add your handling code here:
    }//GEN-LAST:event_spncantidadStateChanged

    private void tblproductosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblproductosAncestorAdded
            

        // TODO add your handling code here:
    }//GEN-LAST:event_tblproductosAncestorAdded

    private void lblsubtotalAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblsubtotalAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblsubtotalAncestorAdded

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
            java.util.logging.Logger.getLogger(ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboproductos;
    private javax.swing.JButton ctnagregar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcantidad;
    private javax.swing.JLabel lblimporte;
    private javax.swing.JLabel lbliva;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JLabel lblproducto;
    private javax.swing.JLabel lblsubtotal;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JSpinner spncantidad;
    private javax.swing.JTable tblproductos;
    // End of variables declaration//GEN-END:variables


}



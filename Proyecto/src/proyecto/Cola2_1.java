/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author kebelth
 */
public class Cola2_1 extends javax.swing.JFrame {

  private NodoC inicio;
  private NodoC fin;
  private NodoDC iniDC;
  private NodoDC finDC;
    
    public Cola2_1() {
        initComponents();
        this.inicio=null;
        this.fin=null;
        this.finDC=null;
        this.iniDC=null;
        setLocationRelativeTo(null);        // Centering on screen...
                       // Setting dimensions...
        setTitle("Ejemplo de Cola");
    }
 public boolean esVacia(){
        if(inicio==null){
            return true;
        }else{return false;}
    }
 
 public boolean esVaciaDC(){
      if(iniDC==null){
         return true;
      }else{
         return false;
      }
   }
 
 private void limpiar(){

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");

    }
 
   public void Encolar(){
    Dato d= new Dato();
    try{
    d.setCodeProducto(jTextField1.getText() );
    d.setDescripPro(jTextField2.getText());
    d.setCantExistente(Integer.parseInt(jTextField3.getText()));
    d.setPrecio(Integer.parseInt(jTextField4.getText()));
    
    NodoC nuevo =new NodoC();
    nuevo.setElemento(d);
    
    JOptionPane.showMessageDialog(null, "¡Los datos fueron grabados correctamente!");
    
    if(esVacia()){
        inicio=nuevo;
        fin=nuevo;
    }else{
        fin.setSiguiente(nuevo);
        fin=nuevo;
        
    }
}catch(Exception e){
        JOptionPane.showMessageDialog(null, "¡Error al guardar datos!");
    }
    limpiar();
}
   public void mostrarCola(){
        if(!esVacia()){
            String s= "";
            NodoC aux=inicio;
            while(aux!=null){
                s=s+ aux.getElemento().getCodeProducto()+"--"+ aux.getElemento().getDescripPro()+"--"+ aux.getElemento().getCantExistente()+"--"+ aux.getElemento().getPrecio()+"--";
                aux=aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La cola contiene:\n"+s);
        }else{
            JOptionPane.showMessageDialog(null, "La cola no contiene elementos para mostrar");
        }
    }   
   
   public void eliminarEspecifico(){
        if(!esVacia()){
            String descripcion=JOptionPane.showInputDialog(null,"Digite la descripcion del producto: ");
            if(inicio.getElemento().getDescripPro().equals(descripcion)){
                inicio=inicio.getSiguiente();
            }else{
                NodoC anterior;
                NodoC auxiliar;
                anterior=inicio;
                auxiliar=inicio.getSiguiente();
                while((auxiliar!=null)&&(!auxiliar.getElemento().getDescripPro().equals(descripcion))){
                    
                }
                if(auxiliar!=null){
                    anterior.setSiguiente(auxiliar.getSiguiente());
                }
            }
        }
    }
public void copiarColaAListaDC(){
      if(!esVacia()){
         NodoC aux=inicio;
         while(aux!=null){
            llenarListaDC(aux.getElemento());
            aux=aux.getSiguiente();
         }
         JOptionPane.showMessageDialog(null,"La cola fue copiada!");
      }else{
         JOptionPane.showMessageDialog(null,"No se puede copiar, cola vacía!");
      }
   }

    public void llenarListaDC(Dato d) {
        NodoDC nuevo = new NodoDC();
        nuevo.setElemento(d);
        if (esVaciaDC()) {
            iniDC = nuevo;
            finDC = nuevo;
            finDC.setSiguiente(iniDC);
            iniDC.setAnterior(finDC);
        } else if (d.getCantExistente()< iniDC.getElemento().getPrecio()) {
            nuevo.setSiguiente(iniDC);
            iniDC = nuevo;
            finDC.setSiguiente(iniDC);
            iniDC.setAnterior(finDC);
        } else if (d.getCantExistente() >= finDC.getElemento().getPrecio()) {
            finDC.setSiguiente(nuevo);
            finDC = nuevo;
            finDC.setSiguiente(iniDC);
            iniDC.setAnterior(finDC);
        } else {
            NodoDC aux = iniDC;
            while (aux.getSiguiente().getElemento().getCantExistente() < d.getPrecio()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);
        } 
    }
    
    public void mostrarListaDC(){
      if(!esVaciaDC()){
         String s=""; 
         NodoDC aux=iniDC;
         s=s+aux.getElemento().getDescripPro() +"<--"+ aux.getElemento().getCodeProducto()+"<--"+ aux.getElemento().getCantExistente()+"<--"+ aux.getElemento().getPrecio()+"-->";
         aux=aux.getSiguiente();
         while(aux!=iniDC){
            s=s+aux.getElemento().getDescripPro() +"<--"+ aux.getElemento().getCodeProducto()+"<--"+ aux.getElemento().getCantExistente()+"<--"+ aux.getElemento().getPrecio()+"-->";
            aux=aux.getSiguiente();
         }
         JOptionPane.showMessageDialog(null,
                 "La lista doble circular contiene: \n" +s );
      }else{
         JOptionPane.showMessageDialog(null,
                 "No se puede mostrar, lista vacía!");
      }
   }
    
    
  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Anonymous Pro", 1, 14)); // NOI18N
        jLabel1.setText("Digite el codigo del producto:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Anonymous Pro", 1, 14)); // NOI18N
        jLabel2.setText("Digite la descripcion del producto:");

        jLabel3.setFont(new java.awt.Font("Anonymous Pro", 1, 14)); // NOI18N
        jLabel3.setText("Digite la cantidad existente:");

        jLabel4.setFont(new java.awt.Font("Anonymous Pro", 1, 14)); // NOI18N
        jLabel4.setText("Digite el precio:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Anonymous Pro", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 102));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(126, 126, 126)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Encolar();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cola2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cola2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cola2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cola2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cola2_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}

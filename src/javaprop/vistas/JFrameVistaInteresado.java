package javaprop.vistas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javaprop.Cliente;
import javaprop.Modo;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Mariana
 */
public class JFrameVistaInteresado extends javax.swing.JFrame {
private Modo modo;
private Cliente cliente;

    public JFrameVistaInteresado(Modo mod) {
        initComponents();
        this.cliente = new Cliente();
        this.establecerModo(mod);
    }

    public JFrameVistaInteresado(Modo mod, Cliente cli) {
        initComponents();
        this.cliente = cli;
        this.establecerModo(mod);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelImagen = new javax.swing.JPanel();
        jLabelImagen = new javax.swing.JLabel();
        jPanelInfo = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelMail = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jPanelCampos = new javax.swing.JPanel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldMail = new javax.swing.JTextField();
        jTextFieldCelular = new javax.swing.JTextField();
        jPanelFooter = new javax.swing.JPanel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelWeb = new javax.swing.JLabel();
        jPanelBotonera = new javax.swing.JPanel();
        jButtonBorrar = new javax.swing.JButton();
        jToggleButtonEditar = new javax.swing.JToggleButton();
        jButtonAccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/images.png"))); // NOI18N

        javax.swing.GroupLayout jPanelImagenLayout = new javax.swing.GroupLayout(jPanelImagen);
        jPanelImagen.setLayout(jPanelImagenLayout);
        jPanelImagenLayout.setHorizontalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelImagenLayout.setVerticalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagenLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelImagen)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabelNombre.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelApellido.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jLabelApellido.setText("Apellido:");

        jLabelMail.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jLabelMail.setText("Mail:");

        jLabelCelular.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jLabelCelular.setText("Celular:");

        jTextFieldNombre.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jTextFieldApellido.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyTyped(evt);
            }
        });

        jTextFieldMail.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jTextFieldMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMailKeyTyped(evt);
            }
        });

        jTextFieldCelular.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jTextFieldCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCelularKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelCamposLayout = new javax.swing.GroupLayout(jPanelCampos);
        jPanelCampos.setLayout(jPanelCamposLayout);
        jPanelCamposLayout.setHorizontalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldMail, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
            .addComponent(jTextFieldCelular)
            .addComponent(jTextFieldApellido)
            .addComponent(jTextFieldNombre)
        );
        jPanelCamposLayout.setVerticalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelCelular)
                    .addComponent(jLabelMail)
                    .addComponent(jLabelApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(91, 91, 91))
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelApellido)
                .addGap(77, 77, 77)
                .addComponent(jLabelMail)
                .addGap(78, 78, 78)
                .addComponent(jLabelCelular)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelFooter.setBackground(java.awt.SystemColor.controlHighlight);
        jPanelFooter.setPreferredSize(new java.awt.Dimension(921, 62));

        jLabelAutor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelAutor.setForeground(new java.awt.Color(51, 51, 51));
        jLabelAutor.setText("Powered by mar1011");

        jLabelWeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/jp9.png"))); // NOI18N

        javax.swing.GroupLayout jPanelFooterLayout = new javax.swing.GroupLayout(jPanelFooter);
        jPanelFooter.setLayout(jPanelFooterLayout);
        jPanelFooterLayout.setHorizontalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addComponent(jLabelWeb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                .addComponent(jLabelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelFooterLayout.setVerticalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFooterLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabelWeb))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFooterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAutor)
                .addContainerGap())
        );

        jButtonBorrar.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jButtonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/delete.png"))); // NOI18N
        jButtonBorrar.setText("Eliminar");

        jToggleButtonEditar.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jToggleButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/edit.png"))); // NOI18N
        jToggleButtonEditar.setText("Editar");

        jButtonAccion.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jButtonAccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/back.png"))); // NOI18N
        jButtonAccion.setText("Atrás");

        javax.swing.GroupLayout jPanelBotoneraLayout = new javax.swing.GroupLayout(jPanelBotonera);
        jPanelBotonera.setLayout(jPanelBotoneraLayout);
        jPanelBotoneraLayout.setHorizontalGroup(
            jPanelBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoneraLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanelBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(jToggleButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanelBotoneraLayout.setVerticalGroup(
            jPanelBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAccion, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFooter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelBotonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        validacionCaracteres(evt);
        maximoCaracteres(evt);
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyTyped
       validacionCaracteres(evt);
       maximoCaracteres(evt);
    }//GEN-LAST:event_jTextFieldApellidoKeyTyped

    private void jTextFieldMailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMailKeyTyped
        validarCaracteresCorreo(evt);
        maximoCaracteres(evt);
    }//GEN-LAST:event_jTextFieldMailKeyTyped

    private void jTextFieldCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCelularKeyTyped
       validacionCaracteresCelular(evt);
       maximoCaracteres(evt);
    }//GEN-LAST:event_jTextFieldCelularKeyTyped

    public void iniciarVista(){
        this.setLocationRelativeTo(null);
        this.establecerIcono();
        this.setVisible(true);
    }
    
    private void llenarFicha(){
        this.jTextFieldNombre.setText(cliente.getNombre());
        this.jTextFieldApellido.setText(cliente.getApellido());
        this.jTextFieldMail.setText(cliente.getMail());
        this.jTextFieldCelular.setText(cliente.getCelular());
    }
    
    public void actualizarInteresado() throws NumberFormatException, NullPointerException{
        
        this.cliente.setNombre(this.jTextFieldNombre.getText());
        this.cliente.setApellido(this.jTextFieldApellido.getText());
        this.cliente.setMail(this.jTextFieldMail.getText());
        this.cliente.setCelular(this.jTextFieldCelular.getText());
    }
    
   public boolean validarCampos(){
       String nom = this.jTextFieldNombre.getText();
       String ape = this.jTextFieldApellido.getText();
       String mail = this.jTextFieldMail.getText();
       String cel = this.jTextFieldCelular.getText();
       boolean estado=true;
       if(nom.isEmpty()||ape.isEmpty()||cel.isEmpty()||mail.isEmpty()){
           estado= false;
       }      
      return estado;
   }
   
   public boolean validarMail(){
        String mail = this.jTextFieldMail.getText();
        boolean estado = true;
        if(!mail.contains("@")|| (!mail.contains(".com"))){
           estado=false;
       }
        return estado;
   }
    
   public void validarCaracteresCorreo(java.awt.event.KeyEvent evt){
       if(evt.getKeyChar()>=32 && evt.getKeyChar()<=44
          ||evt.getKeyChar()== 47
          ||evt.getKeyChar()>=58 && evt.getKeyChar() <=63
          ||evt.getKeyChar()>=91 && evt.getKeyChar()<=94
          ||evt.getKeyChar()==96  
          ||evt.getKeyChar()>=123 && evt.getKeyChar()<=255){
           
           evt.consume();
           JOptionPane.showMessageDialog(this,"No se permiten ciertos caracteres en el campo mail");
       }
   }
   
   public void validacionCaracteresCelular(java.awt.event.KeyEvent evt){
       if(evt.getKeyChar() >=32 && evt.getKeyChar()<=48
          || evt.getKeyChar()>=58 && evt.getKeyChar()<=255){
           evt.consume();
           JOptionPane.showMessageDialog(null, "Sólo se permiten números en el campo celular");
       }
   }
   
   public void validacionCaracteres(java.awt.event.KeyEvent evt){
       
       if(evt.getKeyChar() >=33 && evt.getKeyChar()<=64 
          || evt.getKeyChar()>=91 && evt.getKeyChar()<=96
          || evt.getKeyChar()>=123 && evt.getKeyChar()<=208
          || evt.getKeyChar()>=210 && evt.getKeyChar()<=240
          || evt.getKeyChar()>=242 && evt.getKeyChar()<=255){
           
           evt.consume();
           JOptionPane.showMessageDialog(this,"No se permiten caracteres especiales en el campo nombre o apellido"); 
       }
   }
   
   public void maximoCaracteres(java.awt.event.KeyEvent evt){
       int numCar=40;      
       if(jTextFieldNombre.getText().length()>=numCar
        ||jTextFieldApellido.getText().length()>=numCar
        ||jTextFieldMail.getText().length()>=numCar
        ||jTextFieldCelular.getText().length()>=numCar){
           evt.consume();
            JOptionPane.showMessageDialog(this,"Pasó el límite máximo de caracteres");
        }
   }
      private void establecerIcono(){
       Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/h1.png"));
       setIconImage(icon);
   }
   
    public void establecerModo(Modo mod){
          switch(mod){
              case AGREGAR:
                  jButtonAccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/add.png")));
                  jButtonAccion.setText("Agregar");
                  jButtonAccion.setFont(new Font("Roboto Slab",Font.PLAIN,14));
                  
                  this.jButtonBorrar.setVisible(false);
                  this.jToggleButtonEditar.setVisible(false);
                  activarCampos(true);
                  this.setTitle("Agregando un nuevo interesado");
                  break;
              case EDITAR:
                  activarCampos(true);
                  this.setTitle("Editando a " + this.jTextFieldNombre.getText() + " " + this.jTextFieldApellido.getText());              
                  break;
              case VER:
                  this.llenarFicha();
                  this.setTitle("Detalle Interesado");
                  activarCampos(false);
                  break;
          }
          this.validate();
      }
    
    private void activarCampos(boolean flag){
        for (int i = 0; i < this.jPanelCampos.getComponents().length; i++) {
            JTextComponent campo = (JTextComponent) this.jPanelCampos.getComponent(i);
            campo.setEditable(flag);
        }
    }
       
    public void cerrarVentana() {
        this.dispose();
    }
    
    //Manejadores
    public void manejarAccionEditar(ItemListener il){
        this.jToggleButtonEditar.addItemListener(il);
    }
    public void manejarAccionBorrar (ActionListener al){
        this.jButtonBorrar.addActionListener(al);
    }
    public void manejarAccion (ActionListener al) {
        this.jButtonAccion.addActionListener(al);
    }
    public Cliente getCliente(){
        return cliente;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccion;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelMail;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelWeb;
    private javax.swing.JPanel jPanelBotonera;
    private javax.swing.JPanel jPanelCampos;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelImagen;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JToggleButton jToggleButtonEditar;
    // End of variables declaration//GEN-END:variables
}

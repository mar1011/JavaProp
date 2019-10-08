package javaprop.vistas;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

/**
 *
 * @author Mariana
 */
public class JFrameVistaTipoInmueble extends javax.swing.JFrame {

    public JFrameVistaTipoInmueble() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupInmueble = new javax.swing.ButtonGroup();
        jPanelFooter = new javax.swing.JPanel();
        jLabelWeb = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jPanelInfo = new javax.swing.JPanel();
        jLabelInfo = new javax.swing.JLabel();
        jPanelTipos = new javax.swing.JPanel();
        jRadioButtonCasas = new javax.swing.JRadioButton();
        jRadioButtonDepto = new javax.swing.JRadioButton();
        jLabelCasa = new javax.swing.JLabel();
        jLabelDepto = new javax.swing.JLabel();
        jButtonConsultar = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaProp - Tipo de Inmuebles");

        jPanelFooter.setBackground(java.awt.SystemColor.controlHighlight);

        jLabelWeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/jp9.png"))); // NOI18N

        jLabelAutor.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabelAutor.setForeground(new java.awt.Color(51, 51, 51));
        jLabelAutor.setText("Powered by mar1011");

        javax.swing.GroupLayout jPanelFooterLayout = new javax.swing.GroupLayout(jPanelFooter);
        jPanelFooter.setLayout(jPanelFooterLayout);
        jPanelFooterLayout.setHorizontalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addComponent(jLabelWeb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabelAutor)
                .addContainerGap())
        );
        jPanelFooterLayout.setVerticalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelWeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFooterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelWeb.getAccessibleContext().setAccessibleName("jLabelWeb");
        jLabelAutor.getAccessibleContext().setAccessibleName("jLabelAutor");

        jLabelInfo.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jLabelInfo.setText("Elija el tipo de Inmueble que desea consultar:");

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                .addComponent(jLabelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonGroupInmueble.add(jRadioButtonCasas);
        jRadioButtonCasas.setFont(new java.awt.Font("Roboto Slab", 0, 12)); // NOI18N
        jRadioButtonCasas.setText("Casas");
        jRadioButtonCasas.setName("casa"); // NOI18N

        buttonGroupInmueble.add(jRadioButtonDepto);
        jRadioButtonDepto.setFont(new java.awt.Font("Roboto Slab", 0, 12)); // NOI18N
        jRadioButtonDepto.setText("Departamentos");
        jRadioButtonDepto.setName(""); // NOI18N

        jLabelCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/house (1).png"))); // NOI18N

        jLabelDepto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/department (1).png"))); // NOI18N

        jButtonConsultar.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jButtonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/consultation.png"))); // NOI18N
        jButtonConsultar.setText("Consultar");

        jButtonAtras.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/back.png"))); // NOI18N
        jButtonAtras.setText("Atrás");

        javax.swing.GroupLayout jPanelTiposLayout = new javax.swing.GroupLayout(jPanelTipos);
        jPanelTipos.setLayout(jPanelTiposLayout);
        jPanelTiposLayout.setHorizontalGroup(
            jPanelTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTiposLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanelTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelTiposLayout.createSequentialGroup()
                        .addComponent(jLabelCasa)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonCasas))
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelTiposLayout.createSequentialGroup()
                        .addComponent(jRadioButtonDepto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDepto))
                    .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanelTiposLayout.setVerticalGroup(
            jPanelTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTiposLayout.createSequentialGroup()
                .addGroup(jPanelTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTiposLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDepto)
                            .addComponent(jLabelCasa)))
                    .addGroup(jPanelTiposLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanelTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonDepto)
                            .addComponent(jRadioButtonCasas))))
                .addGap(56, 56, 56)
                .addGroup(jPanelTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   public void iniciarVista(){
       this.setLocationRelativeTo(null);
       this.establecerIcono();
       this.setVisible(true);
   }
   
   public String obtenerInmuebleSeleccionado(){
       String inmueble = "";
       if(this.jRadioButtonCasas.isSelected()){
           inmueble = "casa";
       }if(this.jRadioButtonDepto.isSelected()){
           inmueble = "departamento";
       }
       return inmueble;
   }
   
   private void establecerIcono(){
       Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/h1.png"));
       setIconImage(icon);
   }
   
  //Manejadores//
    public void manejarAccionAtras (ActionListener al) {
        this.jButtonAtras.addActionListener(al);
    }
    public void manejarAccionConsultar (ActionListener al){
        this.jButtonConsultar.addActionListener(al);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupInmueble;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelCasa;
    private javax.swing.JLabel jLabelDepto;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelWeb;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JPanel jPanelTipos;
    private javax.swing.JRadioButton jRadioButtonCasas;
    private javax.swing.JRadioButton jRadioButtonDepto;
    // End of variables declaration//GEN-END:variables
}

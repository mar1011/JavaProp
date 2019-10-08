package javaprop.vistas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mariana
 */
public class JFrameVistaPrincipal extends javax.swing.JFrame {

    public JFrameVistaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFooter = new javax.swing.JPanel();
        jLabelWeb = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jPanelWelcome = new javax.swing.JPanel();
        jLabelWelcome = new javax.swing.JLabel();
        jLabelExplicacion = new javax.swing.JLabel();
        jPanelBoton = new javax.swing.JPanel();
        jButtonConectar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInmobiliaria = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaProp - Inmobiliarias");
        setBackground(new java.awt.Color(204, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("JFrameVistaPrincipal"); // NOI18N

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jLabelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelFooterLayout.setVerticalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFooterLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabelAutor)
                .addContainerGap())
        );

        jLabelWelcome.setFont(new java.awt.Font("Roboto Slab", 0, 18)); // NOI18N
        jLabelWelcome.setText("Bienvenido! ");

        jLabelExplicacion.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jLabelExplicacion.setText("Haga click en cada Inmobiliaria para más detalle ");

        javax.swing.GroupLayout jPanelWelcomeLayout = new javax.swing.GroupLayout(jPanelWelcome);
        jPanelWelcome.setLayout(jPanelWelcomeLayout);
        jPanelWelcomeLayout.setHorizontalGroup(
            jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelExplicacion)
                    .addComponent(jLabelWelcome)))
        );
        jPanelWelcomeLayout.setVerticalGroup(
            jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelExplicacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonConectar.setBackground(new java.awt.Color(247, 246, 246));
        jButtonConectar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/seller.png"))); // NOI18N

        javax.swing.GroupLayout jPanelBotonLayout = new javax.swing.GroupLayout(jPanelBoton);
        jPanelBoton.setLayout(jPanelBotonLayout);
        jPanelBotonLayout.setHorizontalGroup(
            jPanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBotonLayout.setVerticalGroup(
            jPanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButtonConectar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTableInmobiliaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableInmobiliaria.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jTableInmobiliaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Mail", "Comisión"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableInmobiliaria.setOpaque(false);
        jTableInmobiliaria.setRowHeight(25);
        jTableInmobiliaria.setSelectionBackground(new java.awt.Color(26, 176, 176));
        jTableInmobiliaria.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableInmobiliaria);
        if (jTableInmobiliaria.getColumnModel().getColumnCount() > 0) {
            jTableInmobiliaria.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTableInmobiliaria.getColumnModel().getColumn(0).setMaxWidth(30);
            jTableInmobiliaria.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTableInmobiliaria.getColumnModel().getColumn(1).setMaxWidth(100);
            jTableInmobiliaria.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTableInmobiliaria.getColumnModel().getColumn(2).setMaxWidth(200);
            jTableInmobiliaria.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTableInmobiliaria.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void iniciarVista(){
        this.establecerIcono();
        this.setLocationRelativeTo(null); 
        ocultarColumnaID();
        this.setVisible(true);
    }
       public void mostrarCartelDeWarning (String mensaje){
           JOptionPane.showMessageDialog(null, mensaje, "Cuidado! ", JOptionPane.NO_OPTION);
       }
       
        public void mostrarCartelDeError (String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", 0);
       }
    
        public void mostrarCartelModificacion (String mensaje){
            JOptionPane.showMessageDialog(null, mensaje,"Modificar Precio Inmueble",1);
        }
        public void mostrarCartelAgregado (String mensaje){
            JOptionPane.showMessageDialog(null, mensaje,"Agregar Interesado",1);
        }
        
         public void mostrarCartelBorrado (String mensaje){
            JOptionPane.showMessageDialog(null, mensaje,"Borrar Interesado",1);
        }
          
        public void enviarMensajeInteresados (String mensaje){
            JOptionPane.showMessageDialog(null, mensaje, "Enviando información", 1);
        }
  
        public void agregarInmobiliaria(int id, String nombre, String mail, double comision) {
            DefaultTableModel dtf = (DefaultTableModel) this.jTableInmobiliaria.getModel();
            dtf.addRow(new Object[] { id, nombre, mail, comision });
	}

	private void ocultarColumnaID() {
		this.jTableInmobiliaria.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
		this.jTableInmobiliaria.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
		this.jTableInmobiliaria.getColumnModel().getColumn(0).setMaxWidth(0);
		this.jTableInmobiliaria.getColumnModel().getColumn(0).setMinWidth(0);
	}

	public int obtenerIDSeleccionado() {
		int nroFila = this.jTableInmobiliaria.getSelectedRow();
		return (int) this.jTableInmobiliaria.getValueAt(nroFila, 0);
	}

        public void setBotonConectadoABD(boolean conectado){
                
            if(conectado== true){
                this.jButtonConectar.setBackground(Color.green);
            }
        }
  
   private void establecerIcono(){
       Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/h1.png"));
       setIconImage(icon);
   }
       
    //Manejadores//
    public void manejarAccionConectar (ActionListener al) {
       this.jButtonConectar.addActionListener(al);
   }

    public void manejarClickEnTabla (MouseListener ml) {
       this.jTableInmobiliaria.addMouseListener(ml);
   }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelExplicacion;
    private javax.swing.JLabel jLabelWeb;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JPanel jPanelBoton;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelWelcome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableInmobiliaria;
    // End of variables declaration//GEN-END:variables

}

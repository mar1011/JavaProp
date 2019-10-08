package javaprop.vistas;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javaprop.Domicilio;
import javaprop.Inmueble;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mariana
 */
public class JFrameVistaInmuebles extends javax.swing.JFrame {

    public JFrameVistaInmuebles() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFooter = new javax.swing.JPanel();
        jLabelWeb = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jPanelInfo = new javax.swing.JPanel();
        jLabelInfo = new javax.swing.JLabel();
        jPanelBotonera = new javax.swing.JPanel();
        jButtonAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInmueble = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaProp - Inmuebles");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelFooterLayout.setVerticalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabelWeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAutor)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabelInfo.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jLabelInfo.setText("Para más detalle, clickear en cada Inmueble:");

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonAtras.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/back.png"))); // NOI18N
        jButtonAtras.setText("Atrás");

        javax.swing.GroupLayout jPanelBotoneraLayout = new javax.swing.GroupLayout(jPanelBotonera);
        jPanelBotonera.setLayout(jPanelBotoneraLayout);
        jPanelBotoneraLayout.setHorizontalGroup(
            jPanelBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelBotoneraLayout.setVerticalGroup(
            jPanelBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoneraLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTableInmueble.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableInmueble.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jTableInmueble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Domicilio", "Superficie", "Cant_Ambientes", "Precio", "Reservado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableInmueble.setRowHeight(25);
        jTableInmueble.setSelectionBackground(new java.awt.Color(26, 176, 176));
        jScrollPane1.setViewportView(jTableInmueble);
        if (jTableInmueble.getColumnModel().getColumnCount() > 0) {
            jTableInmueble.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTableInmueble.getColumnModel().getColumn(0).setMaxWidth(30);
            jTableInmueble.getColumnModel().getColumn(1).setPreferredWidth(400);
            jTableInmueble.getColumnModel().getColumn(1).setMaxWidth(400);
            jTableInmueble.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTableInmueble.getColumnModel().getColumn(2).setMaxWidth(100);
            jTableInmueble.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTableInmueble.getColumnModel().getColumn(3).setMaxWidth(100);
            jTableInmueble.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTableInmueble.getColumnModel().getColumn(4).setMaxWidth(80);
            jTableInmueble.getColumnModel().getColumn(5).setPreferredWidth(80);
            jTableInmueble.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(239, 239, 239)
                .addComponent(jPanelBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBotonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  public void iniciarVista(){
       this.setLocationRelativeTo(null);
       this.establecerIcono();
       this.ocultarColumnaID();
       this.setVisible(true);  
   }

      public void agregarCasas(int id, Domicilio domicilio, double superficie, int ambi,double precio,int reser) {
		DefaultTableModel dtf = (DefaultTableModel) this.jTableInmueble.getModel();
		dtf.addRow(new Object[] { id, domicilio, superficie, ambi,precio,reser });
	}
      
      public void agregarDeptos(int id, Domicilio domicilio, double superficie, int ambi,double precio,int reser) {
		DefaultTableModel dtf = (DefaultTableModel) this.jTableInmueble.getModel();
		dtf.addRow(new Object[] { id, domicilio,superficie,ambi,precio,reser});
	}
      
      public void limpiarFilas() {
		DefaultTableModel dtf = (DefaultTableModel) this.jTableInmueble.getModel();
		int cant = dtf.getRowCount();
		for (int i = cant; i > 0; i--) {
			dtf.removeRow(i - 1);
		}
	}
      	public int obtenerIDSeleccionado() {
		int nroFila = this.jTableInmueble.getSelectedRow();
		return (int) this.jTableInmueble.getValueAt(nroFila, 0);
	}
        
        public double obtenerPrecioInmueble(){
            int nroFila = this.jTableInmueble.getSelectedRow();
            return (double) this.jTableInmueble.getValueAt(nroFila, 4);
        }        
        
	private void ocultarColumnaID() {
		this.jTableInmueble.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
		this.jTableInmueble.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
		this.jTableInmueble.getColumnModel().getColumn(0).setMaxWidth(0);
		this.jTableInmueble.getColumnModel().getColumn(0).setMinWidth(0);
	}
        
        private void establecerIcono(){
            Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/h1.png"));
            setIconImage(icon);
        }
  
       public void cerrarVentana() {
        this.dispose();
       }
       
//Manejadores//
    public void manejarAccion (ActionListener al) {
        this.jButtonAtras.addActionListener(al);
    }
    
    public void manejarClickEnTabla (MouseListener ml) {
        this.jTableInmueble.addMouseListener(ml);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelWeb;
    private javax.swing.JPanel jPanelBotonera;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableInmueble;
    // End of variables declaration//GEN-END:variables


}

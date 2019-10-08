package javaprop.vistas;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javaprop.Casa;
import javaprop.DoubleFueraDeRangoException;
import javaprop.Inmueble;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mariana
 */
public class JFrameVistaDetalleInmueble extends javax.swing.JFrame {
private Inmueble inmueble;
private Casa casa;

    public JFrameVistaDetalleInmueble(Inmueble in) {
        initComponents();
        this.inmueble = new Inmueble();
        this.inmueble = in;
        this.inmueble.notificarReserva(in);           
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFooter = new javax.swing.JPanel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelWeb = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelDetalleInmueble = new javax.swing.JPanel();
        jPanelDetalles = new javax.swing.JPanel();
        jLabelMapa = new javax.swing.JLabel();
        jLabelCuarto = new javax.swing.JLabel();
        jLabelCuadrado = new javax.swing.JLabel();
        jLabelCasa = new javax.swing.JLabel();
        jLabelCartel = new javax.swing.JLabel();
        jLabelPizarra = new javax.swing.JLabel();
        jLabelDomicilio = new javax.swing.JLabel();
        jLabelSuperficie = new javax.swing.JLabel();
        jLabelCant_Ambientes = new javax.swing.JLabel();
        jLabelReservado = new javax.swing.JLabel();
        jLabelOtros = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jTextFieldPrecio = new javax.swing.JTextField();
        jPaneInteresadosInmueble = new javax.swing.JPanel();
        jPanelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInteresados = new javax.swing.JTable();
        jButtonAgregar = new javax.swing.JButton();
        jPanelImagen = new javax.swing.JPanel();
        jLabelImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaProp - Detalles Inmueble");

        jPanelFooter.setBackground(java.awt.SystemColor.controlHighlight);

        jLabelAutor.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabelAutor.setForeground(new java.awt.Color(51, 51, 51));
        jLabelAutor.setText("Powered by mar1011");

        jLabelWeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/jp9.png"))); // NOI18N

        javax.swing.GroupLayout jPanelFooterLayout = new javax.swing.GroupLayout(jPanelFooter);
        jPanelFooter.setLayout(jPanelFooterLayout);
        jPanelFooterLayout.setHorizontalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFooterLayout.createSequentialGroup()
                .addComponent(jLabelWeb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 551, Short.MAX_VALUE)
                .addComponent(jLabelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelFooterLayout.setVerticalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAutor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addComponent(jLabelWeb)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N

        jPanelDetalleInmueble.setToolTipText("");

        jLabelMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/map.png"))); // NOI18N

        jLabelCuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bedroom.png"))); // NOI18N

        jLabelCuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/area.png"))); // NOI18N

        jLabelCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/real-estate.png"))); // NOI18N

        jLabelCartel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/reserved.png"))); // NOI18N

        jLabelPizarra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/planning.png"))); // NOI18N

        jLabelDomicilio.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jLabelDomicilio.setText("Domicilio");

        jLabelSuperficie.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jLabelSuperficie.setText("Superficie");

        jLabelCant_Ambientes.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jLabelCant_Ambientes.setText("Ambientes");

        jLabelReservado.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jLabelReservado.setText("Reservado");

        jLabelOtros.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jLabelOtros.setText("Otros");

        jButtonModificar.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/edit.png"))); // NOI18N
        jButtonModificar.setText("Modificar");

        jButtonAtras.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/back.png"))); // NOI18N
        jButtonAtras.setText("Atrás");

        jTextFieldPrecio.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jTextFieldPrecio.setText("Precio");

        javax.swing.GroupLayout jPanelDetallesLayout = new javax.swing.GroupLayout(jPanelDetalles);
        jPanelDetalles.setLayout(jPanelDetallesLayout);
        jPanelDetallesLayout.setHorizontalGroup(
            jPanelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetallesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDetallesLayout.createSequentialGroup()
                        .addComponent(jLabelCuarto)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCant_Ambientes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDetallesLayout.createSequentialGroup()
                        .addComponent(jLabelCuadrado)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDetallesLayout.createSequentialGroup()
                        .addComponent(jLabelMapa)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDetallesLayout.createSequentialGroup()
                        .addGroup(jPanelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCasa)
                            .addComponent(jLabelCartel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelReservado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelDetallesLayout.createSequentialGroup()
                                .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addGroup(jPanelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelDetallesLayout.createSequentialGroup()
                        .addComponent(jLabelPizarra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanelDetallesLayout.setVerticalGroup(
            jPanelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetallesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelDetallesLayout.createSequentialGroup()
                        .addGroup(jPanelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMapa, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(49, 49, 49)
                        .addGroup(jPanelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCuadrado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelSuperficie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDetallesLayout.createSequentialGroup()
                        .addGroup(jPanelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelReservado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelCartel))
                .addGroup(jPanelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDetallesLayout.createSequentialGroup()
                        .addGroup(jPanelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDetallesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCuarto, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelPizarra, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelCant_Ambientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelDetallesLayout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabelOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(36, 36, 36))
                    .addGroup(jPanelDetallesLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButtonAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanelDetalleInmuebleLayout = new javax.swing.GroupLayout(jPanelDetalleInmueble);
        jPanelDetalleInmueble.setLayout(jPanelDetalleInmuebleLayout);
        jPanelDetalleInmuebleLayout.setHorizontalGroup(
            jPanelDetalleInmuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelDetalleInmuebleLayout.setVerticalGroup(
            jPanelDetalleInmuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDetalles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Detalle Inmueble", jPanelDetalleInmueble);

        jTableInteresados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableInteresados.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jTableInteresados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Mail", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableInteresados.setRowHeight(25);
        jTableInteresados.setSelectionBackground(new java.awt.Color(26, 176, 176));
        jTableInteresados.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableInteresados);
        if (jTableInteresados.getColumnModel().getColumnCount() > 0) {
            jTableInteresados.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTableInteresados.getColumnModel().getColumn(0).setMaxWidth(30);
            jTableInteresados.getColumnModel().getColumn(1).setPreferredWidth(130);
            jTableInteresados.getColumnModel().getColumn(1).setMaxWidth(150);
            jTableInteresados.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTableInteresados.getColumnModel().getColumn(2).setMaxWidth(200);
            jTableInteresados.getColumnModel().getColumn(3).setPreferredWidth(350);
            jTableInteresados.getColumnModel().getColumn(3).setMaxWidth(350);
            jTableInteresados.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTableInteresados.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jButtonAgregar.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/add (1).png"))); // NOI18N
        jButtonAgregar.setText("Agregar");

        javax.swing.GroupLayout jPanelTableLayout = new javax.swing.GroupLayout(jPanelTable);
        jPanelTable.setLayout(jPanelTableLayout);
        jPanelTableLayout.setHorizontalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        jPanelTableLayout.setVerticalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/images.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanelImagenLayout = new javax.swing.GroupLayout(jPanelImagen);
        jPanelImagen.setLayout(jPanelImagenLayout);
        jPanelImagenLayout.setHorizontalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImagenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelImagen)
                .addContainerGap())
        );
        jPanelImagenLayout.setVerticalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImagenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelImagen)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout jPaneInteresadosInmuebleLayout = new javax.swing.GroupLayout(jPaneInteresadosInmueble);
        jPaneInteresadosInmueble.setLayout(jPaneInteresadosInmuebleLayout);
        jPaneInteresadosInmuebleLayout.setHorizontalGroup(
            jPaneInteresadosInmuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneInteresadosInmuebleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPaneInteresadosInmuebleLayout.setVerticalGroup(
            jPaneInteresadosInmuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Interesados en Inmueble", jPaneInteresadosInmueble);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      public void iniciarVista(){
       this.setLocationRelativeTo(null);
       this.establecerIcono();
       llenarFicha();
       this.ocultarColumnaID();
       this.setVisible(true);  
   }
      
    public void agregarInteresados(int id, String nombre, String apellido, String mail, String celular ) {
      DefaultTableModel dtf = (DefaultTableModel) this.jTableInteresados.getModel();
      dtf.addRow(new Object[] { id, nombre, apellido, mail, celular });
      }
    
     public void limpiarFilas() {
		DefaultTableModel dtf = (DefaultTableModel) this.jTableInteresados.getModel();
		int cant = dtf.getRowCount();
		for (int i = cant; i > 0; i--) {
			dtf.removeRow(i - 1);
		}
	}
    
      public void llenarFicha(){    
         String dom = String.valueOf(inmueble.getDomicilio());   
         this.jLabelDomicilio.setText(dom);
         this.jLabelSuperficie.setText(inmueble.getSuperficie()+ "");
         this.jLabelCant_Ambientes.setText(inmueble.getCantAmbientes()+"");
         this.jTextFieldPrecio.setText(inmueble.getPrecio() + "");
         if(inmueble.getReservado()==0){
         this.jLabelReservado.setText("No reservado");
         }
      }
       
      public boolean campoJTexfieldPrecio(){
           boolean cambio;
           String precio = this.inmueble.getPrecio()+"";
           String precioActual = this.jTextFieldPrecio.getText();
          if(precio.equals(precioActual)){
              cambio=false;
          }else{
              cambio=true;
          }
          return cambio;
      }

      //se ejecuta despues de presionar el boton modificar.
      public void actualizarPrecioInmueble() throws NumberFormatException, DoubleFueraDeRangoException{        
         this.inmueble.setPrecio(Double.parseDouble(this.jTextFieldPrecio.getText()));
      }
            
      public int obtenerIDSeleccionado() {
		int nroFila = this.jTableInteresados.getSelectedRow();
		return (int) this.jTableInteresados.getValueAt(nroFila, 0);
	}
                     
        private void ocultarColumnaID() {
		this.jTableInteresados.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
		this.jTableInteresados.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
		this.jTableInteresados.getColumnModel().getColumn(0).setMaxWidth(0);
		this.jTableInteresados.getColumnModel().getColumn(0).setMinWidth(0);
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
    public void manejarCambioPrecio(ActionListener al){
        this.jButtonModificar.addActionListener(al);              
    }
    public void manejarAccionAgregar(ActionListener al){
        this.jButtonAgregar.addActionListener(al);
    }
    public void manejarClickEnTabla(MouseListener ml){
        this.jTableInteresados.addMouseListener(ml);
    }
    
    public Inmueble getInmueble(){
        return inmueble;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelCant_Ambientes;
    private javax.swing.JLabel jLabelCartel;
    private javax.swing.JLabel jLabelCasa;
    private javax.swing.JLabel jLabelCuadrado;
    private javax.swing.JLabel jLabelCuarto;
    private javax.swing.JLabel jLabelDomicilio;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelMapa;
    private javax.swing.JLabel jLabelOtros;
    private javax.swing.JLabel jLabelPizarra;
    private javax.swing.JLabel jLabelReservado;
    private javax.swing.JLabel jLabelSuperficie;
    private javax.swing.JLabel jLabelWeb;
    private javax.swing.JPanel jPaneInteresadosInmueble;
    private javax.swing.JPanel jPanelDetalleInmueble;
    private javax.swing.JPanel jPanelDetalles;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelImagen;
    private javax.swing.JPanel jPanelTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableInteresados;
    private javax.swing.JTextField jTextFieldPrecio;
    // End of variables declaration//GEN-END:variables
}

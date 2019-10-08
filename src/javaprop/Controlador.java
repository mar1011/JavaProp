package javaprop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javaprop.modelo.Modelo;
import javaprop.vistas.JFrameVistaDetalleInmueble;
import javaprop.vistas.JFrameVistaInmuebles;
import javaprop.vistas.JFrameVistaInteresado;
import javaprop.vistas.JFrameVistaTipoInmueble;
import javaprop.vistas.JFrameVistaPrincipal;
/**
 *
 * @author Mariana
 */
public class Controlador {
	private JFrameVistaPrincipal vp;
        private JFrameVistaTipoInmueble vti;
        private JFrameVistaInmuebles vi;
        private JFrameVistaDetalleInmueble vdi;
        private JFrameVistaInteresado vin;
	private Modelo m;
	
    public Controlador() {
        this.m = new Modelo();
        this.vp = new JFrameVistaPrincipal();
    }
    
    public void iniciar(){
        try {
            m.conectar("localhost/javaprop", "root", "root");
            this.vp.setBotonConectadoABD(true);
            this.cargarInmobiliarias();
            this.vp.setVisible(true);
            this.vp.manejarClickEnTabla(new ManejarClick());
                        
        }catch(Exception e){
            this.vp.setBotonConectadoABD(false);
            this.vp.mostrarCartelDeError("No se pudo conectar a la BD: " + e.getMessage());
            }
        }
	
    private void cargarInmobiliarias() {
        try {
            ArrayList<Inmobiliaria> inms = this.m.obtenerInmobiliarias();
            for (Inmobiliaria in : inms) {
               vp.agregarInmobiliaria(in.getId(),in.getNombre(),in.getMail(),in.getComision());
                }
        }catch(SQLException e) {
               vp.mostrarCartelDeError("No se pudieron listar las inmobiliarias: " + e.getMessage());
            }
	}
        
    private void cargarCasas(){
        try{
            ArrayList<Inmueble> casas = this.m.obtenerCasas(vp.obtenerIDSeleccionado());
            for(int i =0; i< casas.size();i++){
                Inmueble in =casas.get(i);
                vi.agregarCasas(in.getID(), in.getDomicilio(), in.getSuperficie(), in.getCantAmbientes(), in.getPrecio(), in.getReservado()  );
                }
        }catch(SQLException e){
                vp.mostrarCartelDeError("No se pudieron listar las casas:\n" + e.getMessage());
            }
        }
        
    private void cargarDeptos(){
        try{
            ArrayList<Inmueble> deptos = this.m.obtenerDeptos(vp.obtenerIDSeleccionado());
            for(int i =0; i< deptos.size();i++){
                Inmueble in =deptos.get(i);
                vi.agregarDeptos(in.getID(), in.getDomicilio(), in.getSuperficie(), in.getCantAmbientes(), in.getPrecio(), in.getReservado() );
                }
        }catch(SQLException e){
                vp.mostrarCartelDeError("No se pudieron listar los departamentos:\n" + e.getMessage());
            }
        }
   
    private void cargarInteresados(){
        try{
            vdi.limpiarFilas();
            ArrayList<Cliente> interesados = this.m.obtenerClienteInteresado(vi.obtenerIDSeleccionado());    
            for(int i =0; i< interesados.size();i++){
                Cliente c =interesados.get(i);
                 vdi.agregarInteresados(c.getId(),c.getNombre(),c.getApellido(),c.getMail(),c.getCelular());
                }
        }catch(SQLException e){
                vp.mostrarCartelDeError("No se pudieron cargar los interesados en este inmueble:\n" + e.getMessage());
            }
        }
    
    private void listarInteresadosEnVista(){
        try{
            vdi.limpiarFilas();
            ArrayList<Cliente> interesados = m.obtenerClienteInteresado(vi.obtenerIDSeleccionado());
            for (int i = 0; i < interesados.size(); i++) {
                Cliente cli = interesados.get(i);
                vdi.agregarInteresados(cli.getId(), cli.getNombre(), cli.getApellido(), cli.getMail(), cli.getCelular());
            }
        }catch(SQLException ex){
                vp.mostrarCartelDeError("Problema al listar los interesados\n" + ex.getMessage());
            }
        }
    
    private void agregarInteresado(){
        try{
           vin.actualizarInteresado();
           m.agregarInteresado(vin.getCliente());          
           vin.cerrarVentana();
        }catch(SQLException ex){
            vp.mostrarCartelDeError("Se produjo un error al agregar el cliente interesado\n\n" + ex.getMessage());
        }catch(NumberFormatException ex){
            vp.mostrarCartelDeError("Se produjo un error al agregar el cliente interesado\n\n" + "En el campo teléfono deben agregarse sólo números");
        }finally{
            vp.mostrarCartelAgregado("Se ha agregado un nuevo interesado");
            listarInteresadosEnVista();
        }
    }
    
    private void actualizarInteresado(){
        try{
            vin.actualizarInteresado();
            m.actualizarInteresado(vin.getCliente());  
        }catch(SQLException ex){
            vp.mostrarCartelDeError("Se produjo un error al actualizar el cliente interesado\n\n" + ex.getMessage());
        }catch(NumberFormatException ex){
            vp.mostrarCartelDeError("Se produjo un error al actualizar el cliente interesado\n\n" + "En el campo teléfono deben agregarse sólo números");
      
        }finally{
            listarInteresadosEnVista();
        }
    }
    
    private void borrarInteresado(){
        try{
            m.borrarInteresado(vin.getCliente());
        }catch(SQLException ex){
            vp.mostrarCartelDeError("Se produjo un error al borrar el contacto\n\n" + ex.getMessage());
        }finally{
            vin.cerrarVentana();
            vp.mostrarCartelBorrado("Se ha eliminado el interesado correctamente");
            listarInteresadosEnVista();
        }
    }
    
    private void actualizarPrecio() {
            try {               
              vdi.actualizarPrecioInmueble();
              m.actualizarPrecioInmueble(vdi.getInmueble());            
              vp.mostrarCartelModificacion("El precio se ha modificado");
              vp.enviarMensajeInteresados("Se ha enviado el cambio de precio a los Interesados en este inmueble"); 
            }catch(SQLException ex) {
               this.vp.mostrarCartelDeError("Error al actualizar el precio\n\n" + ex.getMessage());
            }catch(NumberFormatException ex){
               this.vp.mostrarCartelDeError("Error al actualizar el precio\n\n" + "Debe ingresar sólo números");        
            }catch(DoubleFueraDeRangoException ex){
               this.vp.mostrarCartelDeError("Error!\n" + ex.getMessage());
            }
            vdi.cerrarVentana();          
            vti.iniciarVista();
        }
	
private class ManejarClick implements MouseListener {
		
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
                vti = new JFrameVistaTipoInmueble();   
                vti.iniciarVista();
                vti.manejarAccionAtras(new ManejarAccionAtras());
                vti.manejarAccionConsultar(new ManejarAccionConsultar());
                vp.dispose();
            }
        }
        @Override
        public void mouseEntered(MouseEvent arg0) {
        }
        @Override
        public void mouseExited(MouseEvent arg0) {
        }
        @Override
        public void mousePressed(MouseEvent arg0) {
        }
        @Override
        public void mouseReleased(MouseEvent e) {
        }	               
    }

private class ManejarClickInmueble implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {     
                try {   
                    vdi = new JFrameVistaDetalleInmueble(m.obtenerInmueble(vi.obtenerIDSeleccionado()));
                    vdi.manejarCambioPrecio(new ManejadorAccionCambiarPrecio());
                }catch (SQLException ex) {
                    vp.mostrarCartelDeError("El inmueble no existe\n" + ex.getMessage());
                }
                vdi.iniciarVista();
                cargarInteresados();
                vdi.manejarClickEnTabla(new ManejarClickInteresado());
                vdi.manejarAccionAgregar(new ManejadorAccionAgregarInteresadoVDI());
                vdi.manejarAccion(new ManejadorAccionCerrarVentanaDI());           
                vi.dispose();
            }
        }
        @Override
        public void mousePressed(MouseEvent e) {           
        }
        @Override
        public void mouseReleased(MouseEvent e) {
        }
        @Override
        public void mouseEntered(MouseEvent e) {         
        }
        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

private class ManejarClickInteresado implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
           if(e.getClickCount() == 2){
               try{
                   vin = new JFrameVistaInteresado(Modo.VER, m.obtenerInteresado(vdi.obtenerIDSeleccionado()));
                   vin.manejarAccion(new ManejarAccionCerrarVentanaVIN());
               }catch(SQLException ex){
                   vp.mostrarCartelDeError("Ese interesado no existe\n" + ex.getMessage());
               }finally{
                   listarInteresadosEnVista();
               }
            vin.iniciarVista();
            vin.manejarAccionEditar(new ManejadorAccionEditarInteresadoVIN());
            vin.manejarAccionBorrar(new ManejadorAccionBorrarInteresadoVIN());
            vin.manejarAccion(new ManejarAccionCerrarVentanaVIN());
            vdi.dispose();
           }
        }

        @Override
        public void mousePressed(MouseEvent e) {         
        }
        @Override
        public void mouseReleased(MouseEvent e) {           
        }
        @Override
        public void mouseEntered(MouseEvent e) {            
        }
        @Override
        public void mouseExited(MouseEvent e) {           
        } 
 }    

private class ManejarAccionConsultar implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            vi = new JFrameVistaInmuebles();           
            String inmueble = vti.obtenerInmuebleSeleccionado();
            if(inmueble.equalsIgnoreCase("casa")){
                vi.iniciarVista();
                cargarCasas();
                vi.manejarClickEnTabla(new ManejarClickInmueble());               
            }else if(inmueble.equalsIgnoreCase("departamento")){
                vi.iniciarVista();
                cargarDeptos();
                vi.manejarClickEnTabla(new ManejarClickInmueble());
            }else{
                vp.mostrarCartelDeWarning("Debe seleccionar alguna de las categorias");
            }            
            vi.manejarAccion(new ManejadorAccionCerrarVentanaVI());
            vti.dispose();
            }
        }

private class ManejadorAccionAgregarInteresadoVDI implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {         
            vin = new JFrameVistaInteresado(Modo.AGREGAR);
            vin.manejarAccion(new ManejadorAccionAgregarInteresadoVIN());
            vin.iniciarVista();           
            }
        }
    
private class ManejadorAccionAgregarInteresadoVIN implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(vin.validarCampos()==true && vin.validarMail()==true){
                 agregarInteresado();
                 }else if(vin.validarCampos()==false){
                vp.mostrarCartelDeWarning("Todos los campos deben ser completado");
              vin.iniciarVista();
                }else if(vin.validarMail()==false){
                  vp.mostrarCartelDeWarning("Mail incorrecto!\n Debe contener un @ y un .");
                  vin.iniciarVista();
            }
            listarInteresadosEnVista();
        }    
}

private class ManejadorAccionEditarInteresadoVIN implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
           if(e.getStateChange() == 1){
               vin.establecerModo(Modo.EDITAR);
           }else{
               actualizarInteresado();
               vin.establecerModo(Modo.VER);
           }
        }   
}

private class ManejadorAccionBorrarInteresadoVIN implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            borrarInteresado();
            vin.cerrarVentana();
            vdi.iniciarVista();
            listarInteresadosEnVista();
        }
    }

private class ManejadorAccionCambiarPrecio implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            boolean cambio = vdi.campoJTexfieldPrecio();
            if(cambio==true){
            actualizarPrecio();   
            }else{
                vp.mostrarCartelDeWarning("No ha cambiado el valor del precio");
            }
        }
    }

private class ManejarAccionAtras implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            vp.iniciarVista();
            vti.dispose(); 
            }
        } 

private class ManejadorAccionCerrarVentanaVI implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
         vi.cerrarVentana();
         vti.iniciarVista();
            }
        }

private class ManejadorAccionCerrarVentanaDI implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           vdi.cerrarVentana();
           vi.iniciarVista();
            }
        }
 
private class ManejarAccionCerrarVentanaVIN implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           vin.cerrarVentana();
           vdi.iniciarVista();
            }
        }
}
package Presentacion.ListaDeReproduccion;

import Logica.Clases.Fabrica;
import Logica.Clases.Video;
import Logica.DataType.DtListaDeReproduccion;
import Logica.DataType.DtVideo;
import Logica.Enumerados.Privacidad;
import Logica.Interfaces.IAdmin;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;

public class frmQuitarVideoDeListaDeReproduccion extends javax.swing.JDialog {
    
    public DefaultListModel listModelUsuario = new DefaultListModel();
    public DefaultListModel listModelListaReproduccion = new DefaultListModel();
    public DefaultListModel listModelVideos = new DefaultListModel();
    Fabrica fabrica = Fabrica.getInstancia();
    IAdmin sys = fabrica.getIAdmin();    
    private String usrSeleccionado = "";
    private int idVideo, idListaRep;
    

    public frmQuitarVideoDeListaDeReproduccion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void limpiarListas(){
        listModelUsuario.clear();//Limpia la listaModeloUsuario
        listModelListaReproduccion.clear();//Limpia el modelo de ListaReproduccion
        listModelVideos.clear();//Limpia la listaModeloUsuario
        lstUsuarios.setModel(listModelUsuario); //Borra todos los datos del JList DuenioVideo
        lstListasRep.setModel(listModelListaReproduccion);
        lstVideos.setModel(listModelVideos);
    }
    
    private void limpiarListaRerp(){
        listModelListaReproduccion.clear();//Limpia el modelo de ListaReproduccion
        lstListasRep.setModel(listModelListaReproduccion);//Borra la lista 
    }
    
    private void limpiarListaVideos(){
        listModelVideos.clear();//Limpia el modelo de ListaVideos
        lstVideos.setModel(listModelVideos);//Borra la lista 
    }
    
    private void cargarListaUsuarios(){
        if(!sys.listarUsuarios().isEmpty()){
            for (int i = 0; i < sys.listarUsuarios().size(); i++) {
                listModelUsuario.add(i,sys.listarUsuarios().get(i).getNickname());
            }
            lstUsuarios.setModel(listModelUsuario);                 
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

        jPanel22 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jScrollPane43 = new javax.swing.JScrollPane();
        lstUsuarios = new javax.swing.JList<>();
        btnCancelar = new javax.swing.JButton();
        jLabel119 = new javax.swing.JLabel();
        jScrollPane44 = new javax.swing.JScrollPane();
        lstListasRep = new javax.swing.JList<>();
        jLabel120 = new javax.swing.JLabel();
        jScrollPane45 = new javax.swing.JScrollPane();
        lstVideos = new javax.swing.JList<>();
        btnQuitar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quitar video de lista de reproduccion");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel118.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel118.setText("Usuarios:");
        jPanel22.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lstUsuarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lstUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstUsuariosMouseClicked(evt);
            }
        });
        jScrollPane43.setViewportView(lstUsuarios);

        jPanel22.add(jScrollPane43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 300));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel22.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 210, 40));

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel119.setText("Videos:");
        jLabel119.setToolTipText("");
        jPanel22.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        lstListasRep.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lstListasRep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstListasRepMouseClicked(evt);
            }
        });
        jScrollPane44.setViewportView(lstListasRep);

        jPanel22.add(jScrollPane44, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 240, 300));

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel120.setText("Listas de Reproduccion:");
        jPanel22.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        lstVideos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lstVideos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstVideosMouseClicked(evt);
            }
        });
        jScrollPane45.setViewportView(lstVideos);

        jPanel22.add(jScrollPane45, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 230, 300));

        btnQuitar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQuitar.setText("Quitar");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });
        jPanel22.add(btnQuitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 230, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //listaRep->quitarVideo->cancelar
        limpiarListas();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        try {
            
            int opcion=JOptionPane.showConfirmDialog(null, 
                        "¿Realmente desea quitar de la lista el video ID: "+idVideo+"?"                            
                        , "Confirmar quitar Video", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(opcion == 0)
                sys.quitarVideoDeListaDeReproduccion(idVideo);//Elimina el video de la lista de reproduccion
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar quitar el video.", "Quitar Video", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Carga los usuarios al abrir el formulario
        cargarListaUsuarios();
    }//GEN-LAST:event_formWindowActivated

    private void lstUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstUsuariosMouseClicked
        limpiarListaRerp();//Borra la lista de reproduccion para mostrar las listas de reproduccion del usuario seleccionado
        // El sistema selecciona al usuario actual con el nickname seleccionado de la lista 
        usrSeleccionado = lstUsuarios.getSelectedValue();
        System.out.println("usuario seleccionado: "+usrSeleccionado);
        sys.seleccionarUsuario(usrSeleccionado); //Selecciona el usuarioSeleccionado
        //Obtiene la lista de reproduccion del usuario seleccionado
        if(!sys.listarListasDeReproduccionDeUsuario(usrSeleccionado).isEmpty()){
            for (int i = 0; i < sys.listarListasDeReproduccionDeUsuario(usrSeleccionado).size(); i++) {
                listModelListaReproduccion.add(i,
                        sys.listarListasDeReproduccionDeUsuario(usrSeleccionado).get(i).getId() +":"+
                        sys.listarListasDeReproduccionDeUsuario(usrSeleccionado).get(i).getNombre());               
            }            
            lstListasRep.setModel(listModelListaReproduccion);                 
        }
    }//GEN-LAST:event_lstUsuariosMouseClicked

    private void lstListasRepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstListasRepMouseClicked
        limpiarListaVideos();//Borra la lista de videos, para poder mostrar los nuevos datos        
        String[] id_nombre = lstListasRep.getSelectedValue().split(":");//Obtiene el id y el nombre como string
        idListaRep = Integer.parseInt(id_nombre[0]);                        //obtiene solo el id de la lista
        DtListaDeReproduccion dt = sys.seleccionarListaDeReproduccion(idListaRep);//Selecciona la lista de reproduccion        
        //Obtiene los videos de la lista de reproduccion seleccionada
        if(!sys.listarVideosDeListaDeReproduccion().isEmpty()){
            for (int i = 0; i < sys.listarVideosDeListaDeReproduccion().size(); i++) {
                listModelVideos.add(i,
                        sys.listarVideosDeListaDeReproduccion().get(i).getId()+":"+
                        sys.listarVideosDeListaDeReproduccion().get(i).getNombre());
            }            
            lstVideos.setModel(listModelVideos);                 
        } 
    }//GEN-LAST:event_lstListasRepMouseClicked

    private void lstVideosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstVideosMouseClicked
        String[] id_nombre = lstVideos.getSelectedValue().split(":");//Obtiene el id y el nombre como string
        idVideo = Integer.parseInt(id_nombre[0]);                    //obtiene solo el id del video 
    }//GEN-LAST:event_lstVideosMouseClicked

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        limpiarListas();
    }//GEN-LAST:event_formWindowDeactivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JList<String> lstListasRep;
    private javax.swing.JList<String> lstUsuarios;
    private javax.swing.JList<String> lstVideos;
    // End of variables declaration//GEN-END:variables
}

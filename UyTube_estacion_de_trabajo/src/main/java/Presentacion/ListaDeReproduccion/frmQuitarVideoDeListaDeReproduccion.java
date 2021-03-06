package Presentacion.ListaDeReproduccion;

import Logica.Fabrica;
import Logica.DataType.DtListaDeReproduccion;
import Logica.DataType.DtUsuario;
import Logica.DataType.DtVideo;
import Logica.Interfaces.IAdmin;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class frmQuitarVideoDeListaDeReproduccion extends javax.swing.JDialog {
    
    private ArrayList<Integer> indexListRes = new ArrayList();
    private ArrayList<Integer> indexVideos = new ArrayList();    
    IAdmin sys;    
    private String usrSeleccionado = "", nombreVideo="";
    private int idVideo, idListaRep;    

    public frmQuitarVideoDeListaDeReproduccion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            sys = Fabrica.getInstancia().getIAdmin();
            cargarListaUsuarios();// Carga los usuarios al abrir el formulario
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }  
    
    private void limpiarLstVideos(){
        DefaultListModel modelo = new DefaultListModel();
        lstVideos.setModel(modelo);
        indexVideos.clear();
    }
    
    private void cargarListaUsuarios(){
        DefaultListModel modelo = new DefaultListModel();
        try {
           if(!sys.listarUsuarios().isEmpty()){
            for(DtUsuario elem: sys.listarUsuarios()){
                modelo.addElement(elem.getNickname());
            }
            lstUsuarios.setModel(modelo);                 
        }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    private void cargarListaReproducion(ArrayList<DtListaDeReproduccion> dts){
        indexListRes.clear();
        DefaultListModel modelo = new DefaultListModel();
        if(!dts.isEmpty()){
            for (DtListaDeReproduccion elem : dts) {
                modelo.addElement(elem.getNombre());
                indexListRes.add(elem.getId());//guarda todos los id en la misma posicion que el modelo
            }            
            lstListasRep.setModel(modelo);
        }
        limpiarLstVideos();
    }
    
    private void cargarListaVideos(){
        indexVideos.clear();
        DefaultListModel modelo = new DefaultListModel();
        try {
            for (DtVideo elem : sys.listarVideosDeListaDeReproduccion()) {
                modelo.addElement(elem.getNombre());
                indexVideos.add(elem.getId());//guarda todos los id en la misma posicion que el modelo
            }
            lstVideos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
        setResizable(false);

        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel118.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel118.setText("Usuarios:");
        jPanel22.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lstUsuarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lstUsuarios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstUsuariosValueChanged(evt);
            }
        });
        jScrollPane43.setViewportView(lstUsuarios);

        jPanel22.add(jScrollPane43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 300));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel22.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, 40));

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel119.setText("Videos:");
        jLabel119.setToolTipText("");
        jPanel22.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        lstListasRep.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lstListasRep.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstListasRepValueChanged(evt);
            }
        });
        jScrollPane44.setViewportView(lstListasRep);

        jPanel22.add(jScrollPane44, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 200, 300));

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel120.setText("Listas de Reproducción:");
        jPanel22.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        lstVideos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lstVideos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstVideosValueChanged(evt);
            }
        });
        jScrollPane45.setViewportView(lstVideos);

        jPanel22.add(jScrollPane45, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 320, 300));

        btnQuitar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQuitar.setText("Quitar");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });
        jPanel22.add(btnQuitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 320, 40));

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
        try {
            sys.liberarMemoriaUsuario();
            sys.liberarMemoriaListaDeReproduccion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        if (lstUsuarios.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (lstListasRep.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una lista de reproducción", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (lstVideos.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un video", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int opcion = JOptionPane.showConfirmDialog(null,
                    "¿Realmente desea quitar de la lista el video: \"" + nombreVideo + "\"?",
                    "Confirmar quitar Video",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            
            if (opcion == 0) {
                sys.quitarVideoDeListaDeReproduccion(idVideo);//Elimina el video de la lista de reproduccion
                cargarListaVideos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void lstUsuariosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstUsuariosValueChanged
        
        if (evt.getValueIsAdjusting()) return;
        if (lstUsuarios.getSelectedIndex()<0) return;
        usrSeleccionado = lstUsuarios.getSelectedValue(); // El sistema selecciona al usuario actual con el nickname seleccionado de la lista 
        try {
            sys.seleccionarUsuario(usrSeleccionado); //Selecciona el usuarioSeleccionado
            ArrayList<DtListaDeReproduccion> dtListRep = sys.listarListasDeReproduccionDeUsuario(usrSeleccionado);
            cargarListaReproducion(dtListRep);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lstUsuariosValueChanged

    private void lstListasRepValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstListasRepValueChanged
        if (evt.getValueIsAdjusting()) return;
        if (lstListasRep.getSelectedIndex()<0) return;
        try {
            idListaRep=indexListRes.get(lstListasRep.getSelectedIndex());
            DtListaDeReproduccion dt = sys.seleccionarListaDeReproduccion(idListaRep);//Selecciona la lista de reproduccion        
            cargarListaVideos();                //Carga los videos de la lista seleccionada 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lstListasRepValueChanged

    private void lstVideosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstVideosValueChanged
        if (evt.getValueIsAdjusting()) return;
        if (lstVideos.getSelectedIndex()<0) return;
        idVideo = indexVideos.get(lstVideos.getSelectedIndex());
        nombreVideo = lstVideos.getSelectedValue();
    }//GEN-LAST:event_lstVideosValueChanged

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

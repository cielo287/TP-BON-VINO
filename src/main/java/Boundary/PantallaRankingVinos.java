
package Boundary;


import Control.GestorRankingVinos;
import Entity.Pais;
import Entity.Vino;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import jxl.write.WriteException;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PantallaRankingVinos extends javax.swing.JFrame {

    //ATRIBUTOS
    private GestorRankingVinos gestor;
    private LocalDate fechaDesdeTxt;
    private LocalDate fechaHastaTxt;
    private boolean cambioFechaPorValidacion = false;
    private String tipoResenaSeleccionada;
    private String formasVisualizacionReporte;
    private boolean confirmacionGeneracionReporte;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConfirmacionBtn;
    private javax.swing.JButton botonGenerarRankingBtn;
    private javax.swing.JButton btnImportarActualizacionVinos1;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbTipoReseña;
    private javax.swing.JComboBox<String> cmbTipoVisualizacion;
    private com.toedter.calendar.JDateChooser dateChooseDesde;
    private com.toedter.calendar.JDateChooser dateChooseHasta;
    private javax.swing.JLabel fechaDesdeLbl;
    private javax.swing.JLabel fechaHastaLbl;
    private javax.swing.JLabel fechaHastaLbl2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JLabel lblBonVino;
    private javax.swing.JLabel lblTipoReseña;
    private javax.swing.JLabel lblTipoVisualizacion;
    // End of variables declaration//GEN-END:variables


    // CONSTRUCTOR
    public PantallaRankingVinos() {
        initComponents();
        this.setLocationRelativeTo(null);
        fechaMaxima(new Date());
        cmbTipoReseña.setSelectedIndex(-1);
        cmbTipoVisualizacion.setSelectedIndex(-1);
        ocultarCampos();
        gestor = new GestorRankingVinos();
        dateChooseDesde.setDateFormatString("dd/MM/yyyy");
        dateChooseHasta.setDateFormatString("dd/MM/yyyy");
        inicializarListeners();
    }

    //CONFIGURACION FORMULARIO

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelPrincipal = new javax.swing.JPanel();
        botonGenerarRankingBtn = new javax.swing.JButton();
        lblBonVino = new javax.swing.JLabel();
        btnImportarActualizacionVinos1 = new javax.swing.JButton();
        botonConfirmacionBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fechaDesdeLbl = new javax.swing.JLabel();
        dateChooseDesde = new com.toedter.calendar.JDateChooser();
        fechaHastaLbl = new javax.swing.JLabel();
        dateChooseHasta = new com.toedter.calendar.JDateChooser();
        lblTipoReseña = new javax.swing.JLabel();
        cmbTipoReseña = new javax.swing.JComboBox<>();
        lblTipoVisualizacion = new javax.swing.JLabel();
        cmbTipoVisualizacion = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        fechaHastaLbl2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 608));
        setResizable(false);
        setSize(new java.awt.Dimension(1020, 600));

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(550, 400));

        jPanelPrincipal.setBackground(new java.awt.Color(114, 0, 38));
        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(1060, 600));

        botonGenerarRankingBtn.setBackground(new java.awt.Color(206, 66, 87));
        botonGenerarRankingBtn.setForeground(new java.awt.Color(255, 255, 255));
        botonGenerarRankingBtn.setText("Generar Ranking de Vinos");
        botonGenerarRankingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarRankingBtnActionPerformed(evt);
            }
        });

        lblBonVino.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        lblBonVino.setForeground(new java.awt.Color(255, 255, 255));
        lblBonVino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBonVino.setText("BON VINO");

        btnImportarActualizacionVinos1.setBackground(new java.awt.Color(206, 66, 87));
        btnImportarActualizacionVinos1.setForeground(new java.awt.Color(255, 255, 255));
        btnImportarActualizacionVinos1.setText("Importar actualización de vinos");

        botonConfirmacionBtn.setBackground(new java.awt.Color(206, 66, 87));
        botonConfirmacionBtn.setForeground(new java.awt.Color(255, 255, 255));
        botonConfirmacionBtn.setText("Generar reporte");
        botonConfirmacionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmacionBtnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pexels-grape-things-2954924 (1).jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jPanel2.setBackground(new java.awt.Color(206, 66, 87));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        fechaDesdeLbl.setBackground(new java.awt.Color(0, 0, 0));
        fechaDesdeLbl.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        fechaDesdeLbl.setForeground(new java.awt.Color(255, 255, 255));
        fechaDesdeLbl.setText("Ingresar fecha desde:");

        dateChooseDesde.setDateFormatString("dd/MM/yyyy\n");

        fechaHastaLbl.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        fechaHastaLbl.setForeground(new java.awt.Color(255, 255, 255));
        fechaHastaLbl.setText("Ingresar fecha hasta:");

        dateChooseHasta.setDateFormatString("dd/MM/yyyy\n");

        lblTipoReseña.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblTipoReseña.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoReseña.setText("Tipo de reseña:");

        cmbTipoReseña.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reseñas de Sommelier", "Reseñas normales", "Reseñas de amigos", " " }));
        cmbTipoReseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoReseñaActionPerformed(evt);
            }
        });

        lblTipoVisualizacion.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblTipoVisualizacion.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoVisualizacion.setText("Tipo de visualización:");

        cmbTipoVisualizacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excel", "En Pantalla", "PDF" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaHastaLbl)
                            .addComponent(fechaDesdeLbl))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateChooseDesde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateChooseHasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipoReseña)
                            .addComponent(lblTipoVisualizacion))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbTipoVisualizacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbTipoReseña, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooseDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaDesdeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaHastaLbl)
                    .addComponent(dateChooseHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoReseña)
                    .addComponent(cmbTipoReseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoVisualizacion)
                    .addComponent(cmbTipoVisualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(114, 0, 38));

        fechaHastaLbl2.setBackground(new java.awt.Color(255, 255, 255));
        fechaHastaLbl2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        fechaHastaLbl2.setForeground(new java.awt.Color(255, 255, 255));
        fechaHastaLbl2.setText("Generar ranking de los mejores vinos.");

        btnVolver.setText("<");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fechaHastaLbl2)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(fechaHastaLbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(botonGenerarRankingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 547, Short.MAX_VALUE)
                .addComponent(btnImportarActualizacionVinos1)
                .addGap(41, 41, 41))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBonVino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonConfirmacionBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(lblBonVino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(botonConfirmacionBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGenerarRankingBtn)
                    .addComponent(btnImportarActualizacionVinos1))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoReseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoReseñaActionPerformed

    }//GEN-LAST:event_cmbTipoReseñaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ocultarCampos();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void botonConfirmacionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmacionBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonConfirmacionBtnActionPerformed

    //METODOS CASO DE USO

    private void botonGenerarRankingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarRankingBtnActionPerformed
        habilitarPantalla();
        gestor.opGenerarRankingDeVinos(PantallaRankingVinos.this);
    }//GEN-LAST:event_botonGenerarRankingBtnActionPerformed



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
            java.util.logging.Logger.getLogger(PantallaRankingVinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaRankingVinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaRankingVinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaRankingVinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaRankingVinos().setVisible(true);
            }
        });
    }

    public void inicializarListeners() {
        dateChooseDesde.getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (!cambioFechaPorValidacion && "date".equals(evt.getPropertyName())) {
                    tomarFechaDesde();
                    fechaHastaLbl.setEnabled(true);
                    dateChooseHasta.setEnabled(true);
                }
            }
        });

        dateChooseHasta.getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (!cambioFechaPorValidacion && "date".equals(evt.getPropertyName())) {
                    tomarFechaHasta();

                    if (!validarFechas(fechaDesdeTxt, fechaHastaTxt)){
                        fechaDesdeTxt = null;
                        fechaHastaTxt = null;
                        fechaHastaLbl.setEnabled(false);
                        dateChooseHasta.setEnabled(false);
                    } else {
                        gestor.tomarFechasDesdeHasta(fechaDesdeTxt, fechaHastaTxt, PantallaRankingVinos.this);
                    }
                }
            }
        });

        // Listener para cmbTipoReseña
        cmbTipoReseña.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tomarTipoResena();
            }
        });

        cmbTipoVisualizacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tomarFormaDeVisualizacion();
            }
        });

        botonConfirmacionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int opcion = JOptionPane.showConfirmDialog(PantallaRankingVinos.this, "¿Estás seguro que quieres generar el reporte?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {

                    ObjectMapper mapper = new ObjectMapper();
                    mapper.registerModule(new JavaTimeModule());
                    String projectDir = System.getProperty("user.dir");
                    String jsonVinos = projectDir + File.separator + "src/main/java/JSON/vinos.json";
                    String jsonPaises = projectDir + File.separator + "src/main/java/JSON/paises.json";
                    InterfazExcel interfazExcel = new InterfazExcel();
                    List<Vino> listaVinos = null;
                    List<Pais> listapaises = null;
                    try {
                        listaVinos = mapper.readValue(new File(jsonVinos), new TypeReference<List<Vino>>() {});
                        listapaises = mapper.readValue(new File(jsonPaises), new TypeReference<List<Pais>>() {});

                        tomarConfPGReporte(listaVinos, listapaises, interfazExcel);

                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } catch (WriteException ex) {
                        throw new RuntimeException(ex);
                    }

                }
            }
        });

    }


    public void fechaMaxima(Date fechaActual) {
        dateChooseDesde.setMaxSelectableDate(fechaActual);
        dateChooseHasta.setMaxSelectableDate(fechaActual);
    }
    
    public void ocultarCampos() {
        
        botonGenerarRankingBtn.setVisible(true);
        lblBonVino.setVisible(true); 
        btnImportarActualizacionVinos1.setVisible(true);
        fechaDesdeLbl.setVisible(false); 
        dateChooseDesde.setVisible(false); 
        fechaHastaLbl.setVisible(false); 
        dateChooseHasta.setVisible(false); 
        fechaHastaLbl2.setVisible(false); 
        lblTipoReseña.setVisible(false); 
        cmbTipoReseña.setVisible(false); 
        lblTipoVisualizacion.setVisible(false); 
        cmbTipoVisualizacion.setVisible(false); 
        botonConfirmacionBtn.setVisible(false); 
        btnVolver.setVisible(false);
        jPanel2.setVisible(false);
        jPanel5.setVisible(false);
        jLabel1.setVisible(true);
    }



    public void habilitarPantalla(){
        botonGenerarRankingBtn.setVisible(false);
        lblBonVino.setVisible(true); 
        btnImportarActualizacionVinos1.setVisible(false);
        fechaDesdeLbl.setVisible(true); 
        dateChooseDesde.setVisible(true); 
        fechaHastaLbl.setVisible(true); 
        dateChooseHasta.setVisible(true); 
        fechaHastaLbl2.setVisible(true); 
        lblTipoReseña.setVisible(true); 
        cmbTipoReseña.setVisible(true); 
        lblTipoVisualizacion.setVisible(true); 
        cmbTipoVisualizacion.setVisible(true); 
        botonConfirmacionBtn.setVisible(true);
        btnVolver.setVisible(true);
        jPanel2.setVisible(true);
        jPanel5.setVisible(true);
        jLabel1.setVisible(false);
        
       //inhabilitar interaccion 
        fechaDesdeLbl.setEnabled(false);
        dateChooseDesde.setEnabled(false);
        fechaHastaLbl.setEnabled(false);
        dateChooseHasta.setEnabled(false);
        fechaHastaLbl2.setEnabled(true);
        lblTipoReseña.setEnabled(false);
        cmbTipoReseña.setEnabled(false);
        lblTipoVisualizacion.setEnabled(false);
        cmbTipoVisualizacion.setEnabled(false);
        botonConfirmacionBtn.setEnabled(false);
    }
    
    public void solicitarFechaDesdeYHasta() {
        fechaDesdeLbl.setEnabled(true);
        dateChooseDesde.setEnabled(true);
        
    }
    
    public void tomarFechaDesde() {
    Date fechaDesdeSeleccionada = dateChooseDesde.getDate();
    if (fechaDesdeSeleccionada != null) {
        fechaDesdeTxt = fechaDesdeSeleccionada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
  }
    
    public void tomarFechaHasta() {
        Date fechaDesdeSeleccionada = dateChooseHasta.getDate();
        if (fechaDesdeSeleccionada != null) {
            fechaHastaTxt = fechaDesdeSeleccionada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
    }
        
    public boolean validarFechas(LocalDate fechaDesde, LocalDate fechaHasta){
    if (fechaDesde != null && fechaHasta != null && fechaHasta.isBefore(fechaDesde)){
        JOptionPane.showMessageDialog(this, "La fecha hasta la que se quiere buscar no puede ser menor a la fecha desde cual se inicia la búsqueda", "Error", JOptionPane.ERROR_MESSAGE);
        // Establecer el booleano de cambio de fecha por validación para evitar el bucle infinito
        cambioFechaPorValidacion = true;
        dateChooseHasta.setDate(null);
        dateChooseDesde.setDate(null);
        
        // Restablecer el booleano después de completar la operación
        cambioFechaPorValidacion = false;
        return false;
    } else {
        return true;
    }
   }
    
    public void solicitarTipoResena(){
        lblTipoReseña.setEnabled(true);
        cmbTipoReseña.setEnabled(true);
    }
    
    public void tomarTipoResena(){
        tipoResenaSeleccionada = (String) cmbTipoReseña.getSelectedItem();
        if (tipoResenaSeleccionada != null && "Reseñas de Sommelier".equals(tipoResenaSeleccionada)) {
            gestor.tomarTipoResena(tipoResenaSeleccionada, PantallaRankingVinos.this);
    } else {
        JOptionPane.showMessageDialog(this, "¡Estamos trabajando! ¡Muy pronto vas a poder seleccionar ese tipo de reseñas!");
    
    }
  }
    
    public void mostrarFormasDeVisualizPSeleccion() {
        lblTipoVisualizacion.setEnabled(true);
        cmbTipoVisualizacion.setEnabled(true);
    }

    public void tomarFormaDeVisualizacion() {
        formasVisualizacionReporte = (String) cmbTipoVisualizacion.getSelectedItem();
        if (formasVisualizacionReporte != null && "Excel".equals(formasVisualizacionReporte)) {
            gestor.tomarFormaDeVisualiz(formasVisualizacionReporte, PantallaRankingVinos.this);
        } else {
            JOptionPane.showMessageDialog(this, "¡Estamos trabajando! ¡Muy pronto vas a poder seleccionar ese tipo de reseñas!");
        }
    }

    public void solicitarConfPGReporte(){
        botonConfirmacionBtn.setEnabled(true);
    }
    
    public void tomarConfPGReporte(List<Vino> listaVinos, List<Pais> listapaises, InterfazExcel interfazExcel) throws WriteException, IOException {
        confirmacionGeneracionReporte = true;

        gestor.tomarConfPGReporte(confirmacionGeneracionReporte, listaVinos, listapaises,PantallaRankingVinos.this , interfazExcel);
    }

    public void informarGeneracionExitosa(String informeFinal){
        JOptionPane.showMessageDialog(this, informeFinal);
        gestor.finCU();
    }
}

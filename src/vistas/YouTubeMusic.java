package vistas;

import entidades.Artista;
import entidades.Cancion;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class YouTubeMusic extends javax.swing.JFrame {

    private ArrayList<PanelCancion> canciones;
    public static LocalDateTime horaActual;

    public YouTubeMusic() {
        horaActual = LocalDateTime.now();
        canciones = new ArrayList<>();
        initComponents();

        this.setSize(1200, 590);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        cargarCanciones();
        mostrarCanciones();
        cargarHora();

    }

    private void cargarCanciones() {
        Artista artista1 = new Artista("ColdPlay", "");
        Cancion cancion1 = new Cancion("The Scientist", "Balada romántica - British Pop", artista1, "5:09");
        canciones.add(new PanelCancion(cancion1));
        Artista artista2 = new Artista("Patricio Rey y sus Redonditos de Ricota", "");
        Cancion cancion2 = new Cancion("Esa estrella era mi lujo", "rock", artista2, "2:56");
        canciones.add(new PanelCancion(cancion2));
        Artista artista3 = new Artista("Gustavo Cerati", "");
        Cancion cancion3 = new Cancion("Crimen", "Pop - Rock", artista3, "3:52");
        canciones.add(new PanelCancion(cancion3));
        Artista artista4 = new Artista("Divididos", "");
        Cancion cancion4 = new Cancion("Nene de antes", "Rock", artista4, "4:10");
        canciones.add(new PanelCancion(cancion4));
        Artista artista5 = new Artista("Babasónicos", "");
        Cancion cancion5 = new Cancion("Irresponsables", "Pop", artista5, "2:36");
        canciones.add(new PanelCancion(cancion5));
    }

    private void mostrarCanciones() {
        for (PanelCancion cancion : canciones) {
            panelCanciones.add(cancion);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        botonAdelantarHora = new javax.swing.JButton();
        panelCanciones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/YouTube_Music_Logo.png"))); // NOI18N

        labelHora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        botonAdelantarHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/skip_next.png"))); // NOI18N
        botonAdelantarHora.setContentAreaFilled(false);
        botonAdelantarHora.setFocusable(false);
        botonAdelantarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdelantarHoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(518, 518, 518)
                .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAdelantarHora, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelHora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAdelantarHora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelCanciones.setBackground(new java.awt.Color(255, 51, 51));
        panelCanciones.setForeground(new java.awt.Color(255, 51, 51));
        panelCanciones.setLayout(new java.awt.GridLayout(5, 0, 0, 10));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCanciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCanciones, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAdelantarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdelantarHoraActionPerformed
        horaActual = horaActual.plusHours(1);
        cargarHora();
        for (PanelCancion panelCancion : canciones) {
            panelCancion.getCancion().getEstado().horasSinReproduccion++;
            panelCancion.labelHoras.setText(panelCancion.getCancion().getEstado().horasSinReproduccion+"");
            panelCancion.getCancion().getEstado().medirPopularidad();
            panelCancion.cargarIcono();
        }

    }//GEN-LAST:event_botonAdelantarHoraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdelantarHora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JPanel panelCanciones;
    // End of variables declaration//GEN-END:variables

    private void cargarHora() {
        labelHora.setText(horaActual.getHour() + " : " + horaActual.getMinute() + "");
    }

}

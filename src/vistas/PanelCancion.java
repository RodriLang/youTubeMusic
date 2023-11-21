package vistas;

import entidades.Cancion;

public class PanelCancion extends javax.swing.JPanel {

    private Cancion cancion;

    public PanelCancion(Cancion cancion) {
        this.cancion = cancion;
        initComponents();
        cargarCancion();
        cargarIcono();
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelArtista = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonDislike = new javax.swing.JButton();
        labelLikes = new javax.swing.JLabel();
        labelDislikes = new javax.swing.JLabel();
        labelGuionLikes = new javax.swing.JLabel();
        botonLike = new javax.swing.JButton();
        botonPlay = new javax.swing.JButton();
        labelReproducciones = new javax.swing.JLabel();
        labelIcono = new javax.swing.JLabel();
        botonLike10K = new javax.swing.JButton();
        botonDislike10K = new javax.swing.JButton();
        botonPlay10K = new javax.swing.JButton();
        labelSinReproduccion = new javax.swing.JLabel();
        labelDuracion = new javax.swing.JLabel();
        labelHoras = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        labelArtista.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        labelArtista.setForeground(new java.awt.Color(255, 255, 255));
        labelArtista.setText("Nombre de la banda/ artista");

        labelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Título de la canción");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        botonDislike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dislike.png"))); // NOI18N
        botonDislike.setBorder(null);
        botonDislike.setBorderPainted(false);
        botonDislike.setContentAreaFilled(false);
        botonDislike.setFocusable(false);
        botonDislike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDislikeActionPerformed(evt);
            }
        });

        labelLikes.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        labelLikes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLikes.setText("000");

        labelDislikes.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        labelDislikes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDislikes.setText("000");

        labelGuionLikes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelGuionLikes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGuionLikes.setText("|");

        botonLike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/like.png"))); // NOI18N
        botonLike.setBorder(null);
        botonLike.setBorderPainted(false);
        botonLike.setContentAreaFilled(false);
        botonLike.setFocusable(false);
        botonLike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLikeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(botonLike, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLikes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelGuionLikes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelDislikes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonDislike, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelGuionLikes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelDislikes)
                .addComponent(labelLikes))
            .addComponent(botonDislike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonLike)
        );

        botonPlay.setForeground(new java.awt.Color(255, 255, 255));
        botonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play.png"))); // NOI18N
        botonPlay.setText("x1");
        botonPlay.setBorder(null);
        botonPlay.setBorderPainted(false);
        botonPlay.setContentAreaFilled(false);
        botonPlay.setFocusable(false);
        botonPlay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPlay.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPlayActionPerformed(evt);
            }
        });

        labelReproducciones.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelReproducciones.setForeground(new java.awt.Color(255, 255, 255));
        labelReproducciones.setText("0");

        botonLike10K.setForeground(new java.awt.Color(255, 255, 255));
        botonLike10K.setText("+10K");
        botonLike10K.setContentAreaFilled(false);
        botonLike10K.setFocusable(false);
        botonLike10K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLike10KActionPerformed(evt);
            }
        });

        botonDislike10K.setForeground(new java.awt.Color(255, 255, 255));
        botonDislike10K.setText("+1K");
        botonDislike10K.setContentAreaFilled(false);
        botonDislike10K.setFocusable(false);
        botonDislike10K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDislike10KActionPerformed(evt);
            }
        });

        botonPlay10K.setForeground(new java.awt.Color(255, 255, 255));
        botonPlay10K.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play.png"))); // NOI18N
        botonPlay10K.setText("x10K");
        botonPlay10K.setBorder(null);
        botonPlay10K.setBorderPainted(false);
        botonPlay10K.setContentAreaFilled(false);
        botonPlay10K.setFocusable(false);
        botonPlay10K.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPlay10K.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonPlay10K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPlay10KActionPerformed(evt);
            }
        });

        labelSinReproduccion.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        labelSinReproduccion.setForeground(new java.awt.Color(255, 255, 255));
        labelSinReproduccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSinReproduccion.setText("horas sin reproducción");

        labelDuracion.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        labelDuracion.setForeground(new java.awt.Color(255, 255, 255));
        labelDuracion.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelDuracion.setText("0:00");

        labelHoras.setForeground(new java.awt.Color(255, 255, 255));
        labelHoras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHoras.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSinReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(labelArtista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(labelReproducciones, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(botonPlay10K, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonLike10K)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonDislike10K, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelIcono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelReproducciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonDislike10K, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonLike10K, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonPlay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonPlay10K, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelHoras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSinReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelArtista)))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonLikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLikeActionPerformed
        int likes = Integer.parseInt(labelLikes.getText()) + 1;
        cancion.getEstado().setLikes(likes);
        labelLikes.setText(likes + "");
        cancion.getEstado().medirPopularidad();
        cargarIcono();
    }//GEN-LAST:event_botonLikeActionPerformed

    private void botonDislikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDislikeActionPerformed
        int dislikes = Integer.parseInt(labelDislikes.getText()) + 1;
        cancion.getEstado().setDislikes(dislikes);
        labelDislikes.setText(dislikes + "");
        cancion.getEstado().medirPopularidad();
        cargarIcono();
    }//GEN-LAST:event_botonDislikeActionPerformed

    private void botonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPlayActionPerformed
        int reproduciones = Integer.parseInt(labelReproducciones.getText()) + 1;
        cancion.getEstado().setReproducciones(reproduciones);
        labelReproducciones.setText(reproduciones + "");
        cancion.getEstado().horasSinReproduccion = 0;
        labelHoras.setText(cancion.getEstado().horasSinReproduccion+"");
        cancion.getEstado().medirPopularidad();
        cargarIcono();
    }//GEN-LAST:event_botonPlayActionPerformed

    private void botonDislike10KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDislike10KActionPerformed
        int dislikes = Integer.parseInt(labelDislikes.getText()) + 1000;
        cancion.getEstado().setDislikes(dislikes);
        labelDislikes.setText(dislikes + "");
        cancion.getEstado().medirPopularidad();
        cargarIcono();
    }//GEN-LAST:event_botonDislike10KActionPerformed

    private void botonLike10KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLike10KActionPerformed
        int likes = Integer.parseInt(labelLikes.getText()) + 10000;
        cancion.getEstado().setLikes(likes);
        labelLikes.setText(likes + "");
        cancion.getEstado().medirPopularidad();
        cargarIcono();
    }//GEN-LAST:event_botonLike10KActionPerformed

    private void botonPlay10KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPlay10KActionPerformed
        int reproduciones = Integer.parseInt(labelReproducciones.getText()) + 10000;
        cancion.getEstado().setReproducciones(reproduciones);
        labelReproducciones.setText(reproduciones + "");
        cancion.getEstado().horasSinReproduccion = 0;
        labelHoras.setText(cancion.getEstado().horasSinReproduccion+"");
        cancion.getEstado().medirPopularidad();
        cargarIcono();        cargarIcono();    }//GEN-LAST:event_botonPlay10KActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDislike;
    private javax.swing.JButton botonDislike10K;
    private javax.swing.JButton botonLike;
    private javax.swing.JButton botonLike10K;
    private javax.swing.JButton botonPlay;
    private javax.swing.JButton botonPlay10K;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelArtista;
    private javax.swing.JLabel labelDislikes;
    private javax.swing.JLabel labelDuracion;
    private javax.swing.JLabel labelGuionLikes;
    public javax.swing.JLabel labelHoras;
    private javax.swing.JLabel labelIcono;
    private javax.swing.JLabel labelLikes;
    private javax.swing.JLabel labelReproducciones;
    private javax.swing.JLabel labelSinReproduccion;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables

    public void cargarIcono() {
        labelIcono.setIcon(cancion.getEstado().getIcono());
    }

    private void cargarCancion() {
        labelTitulo.setText(cancion.getTitulo());
        labelArtista.setText(cancion.getAutor().toString());
        labelLikes.setText("0");
        labelDislikes.setText("0");
        labelHoras.setText(cancion.getEstado().horasSinReproduccion+"");
        labelDuracion.setText(cancion.getDuracion());
    }
    
}

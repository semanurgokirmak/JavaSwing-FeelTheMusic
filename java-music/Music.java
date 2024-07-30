
import javax.swing.*;


public class Music extends javax.swing.JFrame {
    // Müzikleri depolamak için dizi değişken oluştur
    String[] happySongs = {"Güneşe Dokundum - KÖFN", "Boş Bardak - Fettah Can", "Numaracı - Mabel Matiz", 
        "Cesaretsizce Olmuyor - Jabbar", "Kendime Yeni Bir Ben Lazım - Sertab Erener"};
    String[] disappointed = {"Beyoğlu - Emir Can İğrek", "Yalan - Tan Taşçı", "Bir Sevmek Bin Defa Ölmekmiş - 3 Hürel", 
        "Sevecek Sandım - Semicenk", "Dip - Madrigal"};
    String[] mess = {"Bu Saatten Sonra - İkilem", "Ne Zamandır Sendeyim - Madrigal", "Uyursam Geçer Mi? - Eskitilmiş Yaz", 
        "Kor - Emir Can İğrek", "Üzülmeye Nereden Başlasak? - Kendimden Hallice"};
    String[] sensitive = {"Saman Sarısı - Emir Can İğrek", "1001 - Emir Can İğrek", "her yanım yangın - Tuğkan", 
        "Bi' Sen Varsın - Simge Pınar, Canozan", "Özledim - Tuğkan"};

    public Music() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupMusic = new javax.swing.ButtonGroup();
        rBtnHappy = new javax.swing.JRadioButton();
        rBtnDisappointed = new javax.swing.JRadioButton();
        rBtnMess = new javax.swing.JRadioButton();
        btnShow = new javax.swing.JButton();
        rBtnSensitive = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Müzik Öneri");

        btnGroupMusic.add(rBtnHappy);
        rBtnHappy.setText("Mutlu");

        btnGroupMusic.add(rBtnDisappointed);
        rBtnDisappointed.setText("Paramparça 💔");

        btnGroupMusic.add(rBtnMess);
        rBtnMess.setText("altüst");

        btnShow.setText("GÖSTER");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnGroupMusic.add(rBtnSensitive);
        rBtnSensitive.setText("Hassas kalpler ");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modunu Seç");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rBtnHappy)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rBtnDisappointed)
                                .addGap(18, 18, 18)
                                .addComponent(rBtnMess))
                            .addComponent(btnShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(rBtnSensitive))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBtnHappy)
                    .addComponent(rBtnDisappointed)
                    .addComponent(rBtnMess)
                    .addComponent(rBtnSensitive))
                .addGap(31, 31, 31)
                .addComponent(btnShow)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        ImageIcon icon = new ImageIcon("images/music.png");
        
        if(rBtnHappy.isSelected()) {
            JOptionPane.showMessageDialog(this, happySongs, "Öneriler", JOptionPane.PLAIN_MESSAGE, icon);
        } else if(rBtnDisappointed.isSelected()) {
            JOptionPane.showMessageDialog(this, disappointed, "Öneriler", JOptionPane.PLAIN_MESSAGE, icon);
        } else if(rBtnMess.isSelected()) {
            JOptionPane.showMessageDialog(this, mess, "Öneriler", JOptionPane.PLAIN_MESSAGE, icon);
        } else if(rBtnSensitive.isSelected()) {
            JOptionPane.showMessageDialog(this, sensitive, "Öneriler", JOptionPane.PLAIN_MESSAGE, icon);
        }  else {
            JOptionPane.showMessageDialog(this, "Modunuzu seçin!", "Uyarı", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnShowActionPerformed


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
            java.util.logging.Logger.getLogger(Music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Music().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupMusic;
    private javax.swing.JButton btnShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rBtnDisappointed;
    private javax.swing.JRadioButton rBtnHappy;
    private javax.swing.JRadioButton rBtnMess;
    private javax.swing.JRadioButton rBtnSensitive;
    // End of variables declaration//GEN-END:variables
}

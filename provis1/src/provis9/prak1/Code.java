package provis9.prak1;
import javax.swing.JOptionPane;


public class Code extends javax.swing.JFrame {

   
    public Code() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        LABEL_NAMA = new javax.swing.JLabel();
        ButtonDuar = new javax.swing.JButton();
        LABEL_KELAS = new javax.swing.JLabel();
        LABEL_NIM = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pemrograman Provis");

        LABEL_NAMA.setText("Nama : XXXXXX");

        ButtonDuar.setText("RUBAH");
        ButtonDuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonDuarMouseClicked(evt);
            }
        });
        ButtonDuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDuarActionPerformed(evt);
            }
        });

        LABEL_KELAS.setText("Kelas : XXXXXX");

        LABEL_NIM.setText("NIM : XXXXXX");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LABEL_KELAS)
                    .addComponent(ButtonDuar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LABEL_NIM)
                    .addComponent(LABEL_NAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(LABEL_NAMA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LABEL_KELAS)
                .addGap(18, 18, 18)
                .addComponent(LABEL_NIM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonDuar)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void ButtonDuarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void ButtonDuarMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        LABEL_NAMA.setText("Nama : Alfredo Soritua");
        LABEL_KELAS.setText("Kelas : IF-9");
        LABEL_NIM.setText("NIM : 10118358");
        JOptionPane.showMessageDialog(null, "Selamat anda berhasil ");
    }                                       

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton ButtonDuar;
    private javax.swing.JLabel LABEL_KELAS;
    private javax.swing.JLabel LABEL_NAMA;
    private javax.swing.JLabel LABEL_NIM;
    // End of variables declaration                   
}
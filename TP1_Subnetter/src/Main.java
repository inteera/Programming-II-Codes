import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_IP = new javax.swing.JTextField();
        txt_SubnetMask = new javax.swing.JTextField();
        txt_TotalSubnets = new javax.swing.JTextField();
        btn_Calculate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Display = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_TotalSubnets.setText("4");

        btn_Calculate.setText("Calculate");
        btn_Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalculateActionPerformed(evt);
            }
        });

        txt_Display.setColumns(20);
        txt_Display.setRows(5);
        jScrollPane1.setViewportView(txt_Display);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txt_SubnetMask, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(txt_TotalSubnets, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(btn_Calculate)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SubnetMask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TotalSubnets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btn_Calculate)
                .addGap(170, 170, 170)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalculateActionPerformed
        calculateSubnets();
    }//GEN-LAST:event_btn_CalculateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }
    
    private void calculateSubnets(){
        // 192.168.1.0          11000000.10101000.00000001.00000000
        // 255.255.255.0        11111111.11111111.11111111.00000000
        //4
        int[][] ip = toBinary(txt_IP.getText());
        System.out.println("Ip: " + ip);
    }
    
    private int[][] toBinary(String n){
        int num = Integer.parseInt(n);
        int[][] binary = new int[4][35];
        int id = 0;
        for(int i = 0; i < 4; i++){
            while (num > 0) {
            binary[i][id++] = num % 2;
            num = num / 2;
            }
        }
        return binary;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Calculate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_Display;
    private javax.swing.JTextField txt_IP;
    private javax.swing.JTextField txt_SubnetMask;
    private javax.swing.JTextField txt_TotalSubnets;
    // End of variables declaration//GEN-END:variables
}

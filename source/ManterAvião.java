/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.table.DefaultTableModel;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;
/**
 *
 * @author Marcos
 */
public class ManterAvião extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarPassageiro
     */
    public ManterAvião() {
        initComponents();
        DefaultTableModel mode = (DefaultTableModel) tableStyle1.getModel();
        //Inserir valores na tabela
        ArrayList<Aviao> avioes = App.getAvioes();
        for(int i=0;i<avioes.size();i++){
            mode.addRow(new Object[] {avioes.get(i).getModelo(), avioes.get(i).getCapacidadeMaxima(),avioes.get(i).getNumeroMaximoViagens()}    );
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStyle1 = new TableStyle();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        myJButton1 = new MyJButton();
        myJButton2 = new MyJButton();
        myJButton3 = new MyJButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 196, 204));

        jPanel1.setBackground(new java.awt.Color(207, 241, 246));

        tableStyle1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Capacidade Máxima", "Nº Máx. de viagens"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableStyle1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableStyle1);

        jComboBox1.setBackground(new java.awt.Color(0, 118, 128));
        jComboBox1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar por", "Modelo", "Capacidade", "N° Máximo" }));


        jTextField1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 196, 204), 2, true));
        jTextField1.setCaretColor(new java.awt.Color(0, 196, 204));
        jTextField1.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e){}
            public void insertUpdate(DocumentEvent e){
                buscar();
            }
            public void removeUpdate(DocumentEvent e){
                if(jTextField1.getText().trim().isEmpty()){
                    DefaultTableModel mode = (DefaultTableModel) tableStyle1.getModel();
                    while(mode.getRowCount() != 0){
                        mode.removeRow(0);
                    }
                    for(int i=0;i<avioes.size();i++){
                        mode.addRow(new Object[] {avioes.get(i).getModelo(), avioes.get(i).getCapacidadeMaxima(), avioes.get(i).getNumeroMaximoViagens()});
                    }
                }
                else{
                    buscar();
                }
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(207, 241, 246));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel2.setText("Modelo:");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel3.setText("Capacidade Máxima");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel4.setText("Nº Máximo de viagens:");

        jTextField2.setBackground(new java.awt.Color(207, 241, 246));
        jTextField2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));


        jPanel4.setBackground(new java.awt.Color(0, 196, 204));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Dados do Avião");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTextField5.setBackground(new java.awt.Color(207, 241, 246));
        jTextField5.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField5.setCaretColor(new java.awt.Color(0, 204, 204));


        jTextField6.setBackground(new java.awt.Color(207, 241, 246));
        jTextField6.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));


        myJButton1.setText("Alterar");
        myJButton1.setCorHover(new java.awt.Color(0, 200, 142));
        myJButton1.setCorSelected(new java.awt.Color(255, 0, 0));
        myJButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        myJButton1.setRadius(20);
        myJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myJButton1ActionPerformed(evt);
            }
        });

        myJButton2.setText("Cadastrar");
        myJButton2.setActionCommand("");
        myJButton2.setCorHover(new java.awt.Color(0, 200, 142));
        myJButton2.setCorSelected(new java.awt.Color(255, 0, 0));
        myJButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 17)); // NOI18N
        myJButton2.setRadius(20);
        myJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myJButton2ActionPerformed(evt);
            }
        });

        myJButton3.setText("Cancelar");
        myJButton3.setCorHover(new java.awt.Color(0, 200, 142));
        myJButton3.setCorSelected(new java.awt.Color(255, 0, 0));
        myJButton3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        myJButton3.setRadius(20);
        myJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myJButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(myJButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(myJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(myJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField6)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myJButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myJButton1ActionPerformed
        if(alterar != -2){
            avioes.remove(alterar);
            DefaultTableModel model = (DefaultTableModel) tableStyle1.getModel();
            model.removeRow(alterar);
            jTextField6.setText(null); jTextField2.setText(null); jTextField5.setText(null);
            myJButton1.setText("ALTERAR");
            myJButton2.setText("CADASTRAR");
            alterar = -2;
        }
        else{
            if(alterar != -1){
                alterar = tableStyle1.getSelectedRow();
                jTextField6.setText(avioes.get(alterar).getModelo());
                jTextField2.setText(Integer.toString(avioes.get(alterar).getCapacidadeMaxima()));
                jTextField5.setText(Integer.toString(avioes.get(alterar).getNumeroMaximoViagens()));

                myJButton1.setText("EXCLUIR");
                myJButton2.setText("CONFIRMAR");
            }
        }
    }//GEN-LAST:event_myJButton1ActionPerformed

    private void myJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myJButton2ActionPerformed
        if(alterar != -2){
            Aviao aviao = avioes.get(alterar);

            aviao.setModelo(jTextField6.getText());
            aviao.setCapacidadeMaxima(Integer.parseInt(jTextField2.getText()));
            aviao.setNumeroMaximoViagens(Integer.parseInt(jTextField5.getText()));

            tableStyle1.setValueAt(jTextField6.getText(), alterar, 0);
            tableStyle1.setValueAt(jTextField2.getText(), alterar, 1);
            tableStyle1.setValueAt(jTextField5.getText(), alterar, 2);

            jTextField6.setText(null); jTextField2.setText(null); jTextField5.setText(null);

            myJButton1.setText("ALTERAR");
            myJButton2.setText("CADASTRAR");
            alterar = -2;
        }
        else{
            if (jTextField2.getText().trim().isEmpty() && jTextField5.getText().trim().isEmpty() && jTextField6.getText().trim().isEmpty());
            else{
                Aviao novoAviao = new Aviao(jTextField6.getText(),Integer.parseInt(jTextField2.getText()), Integer.parseInt(jTextField5.getText()));
                avioes.add(novoAviao);
                DefaultTableModel mode = (DefaultTableModel) tableStyle1.getModel();
                //Inserir valores na tabela
                mode.addRow(new Object[] {jTextField6.getText(), jTextField2.getText(),jTextField5.getText()});
                jTextField2.setText(null);jTextField5.setText(null);jTextField6.setText(null);
            }
        }
    }//GEN-LAST:event_myJButton2ActionPerformed

    private void myJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myJButton3ActionPerformed
        PrimeiraTela.iniciar();
        this.dispose();
    }//GEN-LAST:event_myJButton3ActionPerformed

    private void buscar(){
        DefaultTableModel mode = (DefaultTableModel) tableStyle1.getModel();
        while(mode.getRowCount() != 0){
            mode.removeRow(0);
        }
        switch(jComboBox1.getSelectedIndex()){
            case 0:
                    for(int i=0;i<avioes.size();i++){
                        mode.addRow(new Object[] {avioes.get(i).getModelo(), avioes.get(i).getCapacidadeMaxima(), avioes.get(i).getNumeroMaximoViagens()});
                }
                break;
            case 1:
                for (int c = 0; c < avioes.size(); c++){
                    try{
                        if(avioes.get(c).getModelo().substring(0, jTextField1.getText().length()).toUpperCase().equals(jTextField1.getText().toUpperCase())){
                            mode.addRow(new Object[] {avioes.get(c).getModelo(), avioes.get(c).getCapacidadeMaxima(), avioes.get(c).getNumeroMaximoViagens()});
                        }
                    }
                    catch(Exception e){}
                }
                break;
            case 2:
                for (int c = 0; c < avioes.size(); c++){
                    try{
                        if(Integer.toString(avioes.get(c).getCapacidadeMaxima()).substring(0, jTextField1.getText().length()).equals(jTextField1.getText())){
                            mode.addRow(new Object[] {avioes.get(c).getModelo(), avioes.get(c).getCapacidadeMaxima(), avioes.get(c).getNumeroMaximoViagens()});
                        }
                    }
                    catch(Exception e){}
                }
                break;
            case 3:
                for (int c = 0; c < avioes.size(); c++){
                    try{
                        if(Integer.toString(avioes.get(c).getNumeroMaximoViagens()).substring(0, jTextField1.getText().length()).equals(jTextField1.getText())){
                            mode.addRow(new Object[] {avioes.get(c).getModelo(), avioes.get(c).getCapacidadeMaxima(), avioes.get(c).getNumeroMaximoViagens()});
                        }                        
                    }
                    catch(Exception e){}

                }
                break;

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void iniciar() {
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
            java.util.logging.Logger.getLogger(ManterAvião.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManterAvião.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManterAvião.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManterAvião.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                javax.swing.JFrame tela = new ManterAvião();
                tela.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e){
                        App.serializar();
                    }
                });
                tela.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private MyJButton myJButton1;
    private MyJButton myJButton2;
    private MyJButton myJButton3;
    private TableStyle tableStyle1;
    private ArrayList<Aviao> avioes = App.getAvioes();
    private int alterar = 0;
    // End of variables declaration//GEN-END:variables
}

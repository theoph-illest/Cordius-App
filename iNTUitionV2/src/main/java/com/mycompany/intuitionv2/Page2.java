/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.intuitionv2;

/**
 *
 * @author cocorico
 */
public final class Page2 extends javax.swing.JFrame {

    String[][] quiz = new String[6][4];
    int question = 0;
    int meter = 0;
    
    public Page2() {
        initComponents();
        initData();
        update();
    }
    
    public void update() {
        jLabel2.setText(quiz[question][0]);
        jLabel1.setText(""+meter);
        Output.setText("");
        YesButton.setText(quiz[question][1]); NoButton.setText(quiz[question][2]); 
    }
    
    public void initData() {
        quiz[0][0] = "1. Are you unvaccinated against COVID-19?";
        quiz[0][1] = "Yes"; quiz[0][2] = "No";
        quiz[0][3] = "1";
        quiz[1][0] = "2. Is your temperature >37.8°C?";
        quiz[1][1] = "Yes"; quiz[1][2] = "No";
        quiz[1][3] = "1";
        quiz[2][0] = "3. Do you suddenly have trouble breathing?";
        quiz[2][1] = "Yes"; quiz[2][2] = "No";
        quiz[2][3] = "1";
        quiz[3][0] = "4. Have you been coughing more often than usual lately?";
        quiz[3][1] = "Yes"; quiz[3][2] = "No";
        quiz[3][3] = "1";
        quiz[4][0] = "5. Were you in a crowded area recently?";
        quiz[4][1] = "Yes"; quiz[4][2] = "No";
        quiz[4][3] = "1";
        quiz[5][0] = "Thank You!";
        quiz[5][1] = "Yes"; quiz[5][2] = "No";
        quiz[5][3] = "1";

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Output = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        YesButton = new javax.swing.JButton();
        NoButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 30, 350, 240);

        Output.setText("jLabel3");
        getContentPane().add(Output);
        Output.setBounds(40, 430, 300, 40);

        Background.setIcon(new javax.swing.ImageIcon("/Users/cocorico/Downloads/WhatsApp Image 2022-02-26 at 8.26.09 PM.jpeg")); // NOI18N
        Background.setText("jLabel1");
        getContentPane().add(Background);
        Background.setBounds(0, 0, 380, 670);

        YesButton.setText("jButton1");
        YesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(YesButton);
        YesButton.setBounds(30, 290, 140, 70);

        NoButton.setText("jButton2");
        NoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NoButton);
        NoButton.setBounds(200, 290, 140, 70);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 390, 290, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesButtonActionPerformed
        // TODO add your handling code here:
        if(quiz[question][3]=="1"){
            meter++; 
        }   
        question++; 
        update(); 
        if(meter<=2) 
        Output.setText("You are unlikely to have COVID-19");
        else if(meter<=4)
            Output.setText("You are likely to have COVID-19");
        else Output.setText("You have COVID-19. Please get tested");
    }//GEN-LAST:event_YesButtonActionPerformed

    private void NoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoButtonActionPerformed
        // TODO add your handling code here:
        question++; 
        update();
                if(meter<=2) 
        Output.setText("You are unlikely to have COVID-19");
        else if(meter<=4)
            Output.setText("You are likely to have COVID-19");
        else Output.setText("You have COVID-19. Please get tested");
    }//GEN-LAST:event_NoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton NoButton;
    private javax.swing.JLabel Output;
    private javax.swing.JButton YesButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}


package x.o.game;

import java.awt.Color;
import javax.swing.JButton;

public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setFont(new java.awt.Font("Adobe Caslon Pro", 1, 18)); // NOI18N
        setName("Game "); // NOI18N

        jButton1.setText("_");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("_");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("_");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("_");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("_");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("_");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("_");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("_");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("_");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(jButton1)
                    .addComponent(jButton7))
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton5)
                        .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton6)
                    .addComponent(jButton9))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    int counter = 0 ;
    
    void freeze_Buttons ()
    {
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
 
    }
    
    
    void Bold_Line ( JButton x , JButton y , JButton z)
    {
       x.setForeground(Color.red);
       y.setForeground(Color.red);
       z.setForeground(Color.red);
    }
    
    void check_winner ()
    {   
        boolean check = false ;
        
        if ( (jButton1.getText() == jButton2.getText() )  &&  ( jButton2.getText() == jButton3.getText()))  
        {  
  
            if ( jButton1.getText() =="X")
            {
                jLabel1.setText("First Player won");
                Bold_Line ( jButton1 , jButton2 , jButton3);
                freeze_Buttons ();
                check = true ;
            }
            else if (jButton1.getText() == "O")
            {
              jLabel1.setText("Second Player won");
              Bold_Line ( jButton1 , jButton2 , jButton3);
              freeze_Buttons ();
              check = true ;
            } 
  
        }
        
         if ( ( jButton4.getText()== jButton5.getText()) && (jButton5.getText()==jButton6.getText()))
        {
            if ( jButton4.getText() =="X")
            {
                jLabel1.setText("First Player won");
                 Bold_Line ( jButton4 , jButton5 , jButton6);
                freeze_Buttons ();
                check = true ;
            }
            else if (jButton4.getText() == "O")
            {
              jLabel1.setText("Second Player won"); 
               Bold_Line ( jButton4 , jButton5 , jButton6);
               freeze_Buttons ();
               check = true ;
            }
            
           
        }
         
         if ( (jButton7.getText()==jButton8.getText()) && ( jButton8.getText()==jButton9.getText()) )
        {  
            System.out.println ("ifffffff");
            if ( jButton7.getText()=="X")
            {
                jLabel1.setText("First Player won");
                 Bold_Line ( jButton7 , jButton8 , jButton9);
                freeze_Buttons ();
                check = true ;
            }
            else if (jButton7.getText()== "O")
            {
              jLabel1.setText("Second Player won");
               Bold_Line ( jButton7 , jButton8 , jButton9);
              freeze_Buttons ();
              check = true ;
            }
        }
          
        if ( (jButton1.getText()== jButton4.getText()) && (jButton4.getText()==jButton7.getText()))
        {
            if ( jButton1.getText() =="X")
            {
                jLabel1.setText("First Player won");
                Bold_Line ( jButton1 , jButton4 , jButton7);
                freeze_Buttons ();
                check = true ;
            }
            else if (jButton1.getText() == "O")
            {
              jLabel1.setText("Second Player won");
               Bold_Line ( jButton1 , jButton4 , jButton7);
              freeze_Buttons ();
              check = true ;
            }
            
        } 
          
         if ( (jButton2.getText()== jButton5.getText()) && (jButton5.getText()== jButton8.getText()))
        {
            if ( jButton2.getText() =="X")
            {
                jLabel1.setText("First Player won");
                 Bold_Line ( jButton2 , jButton5 , jButton8);
                freeze_Buttons ();
                check = true ;
            }
            else if (jButton2.getText() == "O")
            {
              jLabel1.setText("Second Player won"); 
               Bold_Line ( jButton2 , jButton5 , jButton8);
              freeze_Buttons ();
              check = true ;
            }
            
        }
           
         if ( (jButton3.getText()== jButton6.getText()) && (jButton6.getText()==jButton9.getText()))
        {
            if ( jButton3.getText() =="X")
            {
                jLabel1.setText("First Player won");
                 Bold_Line ( jButton3 , jButton6 , jButton9);
                freeze_Buttons ();
                check = true ;
            }
            else if (jButton3.getText() == "O")
            {
              jLabel1.setText("Second Player won");
               Bold_Line ( jButton3 , jButton6 , jButton9);
              freeze_Buttons ();
              check = true ;
            }
        }
            
         
        if ( (jButton1.getText() == jButton5.getText()) && (jButton5.getText() == jButton9.getText()))
        {
            if ( jButton1.getText() =="X")
            {
                jLabel1.setText("First Player won");
                Bold_Line( jButton1 , jButton5 , jButton9);
                freeze_Buttons ();
                check = true ;
            }
            else if (jButton1.getText() == "O")
            {
              jLabel1.setText("Second Player won");
              Bold_Line ( jButton1 , jButton5 , jButton9);
              freeze_Buttons ();
              check = true ;
            }
        }  
         
        if ( (jButton3.getText()== jButton5.getText()) && (jButton5.getText()==jButton7.getText()))
        {
            if ( jButton3.getText() =="X")
            {
                jLabel1.setText("First Player won");
                Bold_Line ( jButton3 , jButton5 , jButton7);
                freeze_Buttons ();
                check = true ;
            }
            else if (jButton3.getText() == "O")
            {
              jLabel1.setText("Second Player won"); 
              Bold_Line ( jButton3 , jButton5 , jButton7);
              freeze_Buttons ();
              check = true ;
            }
            
        }
          
        
        if (   (jButton1.getText()!="_") && (jButton2.getText()!="_") && (jButton3.getText()!="_") && 
                (jButton4.getText()!="_") && (jButton5.getText()!="_") && (jButton6.getText()!="_") &&
                (jButton7.getText()!="_") && (jButton8.getText()!="_") && (jButton9.getText()!="_") &&
                (check == false)
            )  
    
          {
            jLabel1.setText("No one won :( "); 
              freeze_Buttons ();
            
          }
  }
    
    void set_Button_Value( JButton x)
    {
        counter++;
        
        if (counter%2==0)
        {
            x.setText("O");
        }
        else 
        {
           x.setText("X");
        }
        
      //  System.out.println("before fun");
        
        check_winner ();
        
      //  System.out.println("after fun");
    }
    
    void check_Button ( JButton x)
    { 
      if (x.getText() == "_")
        {
            set_Button_Value(x);
        }
        
        else 
        {
            jLabel1.setText("This Button is not valid");
        }  
        
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        check_Button(jButton1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        check_Button(jButton2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       check_Button(jButton3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        check_Button(jButton4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        check_Button(jButton5);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       check_Button(jButton6);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       check_Button(jButton7);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       check_Button(jButton8);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        check_Button(jButton9);
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
  
    

}



import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aya
 */
public class Worms extends javax.swing.JFrame {

    /**
     * Creates new form Worms
     */
    public Worms() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));

        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    class Pile 
    {
        int start , end ;
        
      public void  set_start (int s)
      {
          start = s ;
      }
      
       public void  set_end (int e)
      {
          end = e ;
      }
        int get_start ()
      {
          return start ;
      }
      
      int get_end ()
      {
          return end ;
      }
      
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String input = jTextField1.getText();
        int num_of_Piles = Integer.parseInt(input.substring(0,input.indexOf(" ")));
        
       
        input = input.substring( input.indexOf(" ") +1);
        int prev_end = Integer.parseInt( input.substring(0,input.indexOf(" ")));
        input = input.substring( input.indexOf(" ") +1);
        ArrayList <Pile> arr = new ArrayList<>();
        
        Pile first = new Pile () ;
        first.set_start(1);
        first.set_end(prev_end);
        
        arr.add(first);
        
        
        for (int i=1 ; i<num_of_Piles ; i++)
        {
            Pile cur = new Pile () ;
            int start = prev_end +1 ;
            
            
            cur.set_start(start);
            
            int index = input.indexOf(" ");
            
            if (index != -1)
            { 
            int cur_num = Integer.parseInt( input.substring(0,index));
            input = input.substring( input.indexOf(" ") +1);
            
            int end = prev_end + cur_num ;
            cur.set_end(end);
            prev_end = end ;
            arr.add(cur);
            
            }
            
       
        } 
        
        int num_of_juicy_worms = Integer.parseInt(input.substring(0, input.indexOf(" ")));
        input = input.substring( input.indexOf(" ")+1 );
        ArrayList<Integer> res = new ArrayList<>();
        
        
        for (int i=0 ; i<num_of_juicy_worms ; i++)
        {   
            int end_of_cur_num = input.indexOf(" ");
            int indx_of_wanted_worm ;
            
            if (end_of_cur_num == -1)
            { 
                
            indx_of_wanted_worm = Integer.parseInt(input.substring(0));
            input = input.substring(0);   
            
            }
            else
            {
                
            indx_of_wanted_worm = Integer.parseInt(input.substring(0,end_of_cur_num));
            input = input.substring( input.indexOf(" ")+1 );
           
            }
            for (int j=0 ; j<num_of_Piles  ; j++)
            {
                if ( (indx_of_wanted_worm >= arr.get(j).get_start()) && (indx_of_wanted_worm <= arr.get(j).get_end()) )
                {
                    res.add(j+1);
                    break ;
                }
            }
            
        }
        
        
        String out = " Result = " + res.toString();
        jLabel1.setText(out);
     
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Worms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Worms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Worms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Worms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Worms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

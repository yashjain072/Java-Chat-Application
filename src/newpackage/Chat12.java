/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package newpackage;

import java.awt.Adjustable;
import java.awt.PopupMenu;
import static java.awt.SystemColor.text;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import newpackage.Chat_Right;

/**
 *
 * @author Yash Jain
 */
public class Chat12 extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    public Chat12() {
        initComponents();
        setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Profiile_click = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        chat_click = new javax.swing.JLabel();
        create_room = new javax.swing.JLabel();
        join_room = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Chat_Body = new javax.swing.JPanel();
        Chat_Title = new javax.swing.JLabel();
        Chat_txt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        send = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(43, 80, 77));

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\deskapp\\src\\icons\\user1.png")); // NOI18N

        Profiile_click.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Profiile_click.setForeground(new java.awt.Color(255, 255, 255));
        Profiile_click.setIcon(new javax.swing.ImageIcon("E:\\deskapp\\src\\icons\\edit_property_24px.png")); // NOI18N
        Profiile_click.setText("Yash Jain ");
        Profiile_click.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Profiile_click.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Profiile_click.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Profiile_clickMouseClicked(evt);
            }
        });

        home.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setIcon(new javax.swing.ImageIcon("E:\\deskapp\\src\\icons\\home_24px.png")); // NOI18N
        home.setText("  Home");
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        chat_click.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chat_click.setForeground(new java.awt.Color(255, 255, 255));
        chat_click.setIcon(new javax.swing.ImageIcon("E:\\deskapp\\src\\icons\\group_message_26px.png")); // NOI18N
        chat_click.setText("  Chat");
        chat_click.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chat_click.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        create_room.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        create_room.setForeground(new java.awt.Color(255, 255, 255));
        create_room.setIcon(new javax.swing.ImageIcon("E:\\deskapp\\src\\icons\\createroom.png")); // NOI18N
        create_room.setText("  Create Room");
        create_room.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create_room.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_roomMouseClicked(evt);
            }
        });

        join_room.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        join_room.setForeground(new java.awt.Color(255, 255, 255));
        join_room.setIcon(new javax.swing.ImageIcon("E:\\deskapp\\src\\icons\\join.png")); // NOI18N
        join_room.setText("  Join Room");
        join_room.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        settings.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        settings.setForeground(new java.awt.Color(255, 255, 255));
        settings.setIcon(new javax.swing.ImageIcon("E:\\deskapp\\src\\icons\\setting.png")); // NOI18N
        settings.setText("  Settings");
        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
        });

        Logout.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setIcon(new javax.swing.ImageIcon("E:\\deskapp\\src\\icons\\logout.png")); // NOI18N
        Logout.setText("  Log Out");
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home)
                    .addComponent(Profiile_click)
                    .addComponent(chat_click))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(create_room)
                            .addComponent(join_room)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(settings)
                                    .addComponent(Logout))))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Profiile_click)
                .addGap(39, 39, 39)
                .addComponent(home)
                .addGap(18, 18, 18)
                .addComponent(chat_click)
                .addGap(18, 18, 18)
                .addComponent(create_room)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(join_room)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(settings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Logout)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(169, 169, 169));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Let's Chat");

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\deskapp\\src\\icons\\icons8_menu_48px_1.png")); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\deskapp\\src\\icons\\logo2.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 493, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)))
        );

        Chat_Title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Chat_Title.setIcon(new javax.swing.ImageIcon("E:\\deskapp\\src\\icons\\user4.png")); // NOI18N
        Chat_Title.setText("Yash Jain");

        Chat_txt.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane2.setViewportView(txt_area);

        javax.swing.GroupLayout Chat_BodyLayout = new javax.swing.GroupLayout(Chat_Body);
        Chat_Body.setLayout(Chat_BodyLayout);
        Chat_BodyLayout.setHorizontalGroup(
            Chat_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(Chat_BodyLayout.createSequentialGroup()
                .addGroup(Chat_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Chat_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Chat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Chat_BodyLayout.setVerticalGroup(
            Chat_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Chat_BodyLayout.createSequentialGroup()
                .addComponent(Chat_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Chat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Chat_Body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Chat_Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        send.setIcon(new javax.swing.ImageIcon("E:\\deskapp\\src\\icons\\send.png")); // NOI18N
        send.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send.setMaximumSize(new java.awt.Dimension(40, 30));
        send.setMinimumSize(new java.awt.Dimension(40, 30));
        send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String msgout = "";
            msgout=Chat_txt.getText().trim();
            dout.writeUTF(msgout);
            Chat_txt.setText("");
        } catch (IOException ex) {
            Logger.getLogger(Chat12.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sendMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
      int res = JOptionPane.showConfirmDialog(null, Logout, "Chit-Chat", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
      if(res == 0) {
         Login l = new Login();
         l.setVisible(true);
         this.setVisible(false);
      } 
    }//GEN-LAST:event_LogoutMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_settingsMouseClicked

    private void Profiile_clickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Profiile_clickMouseClicked
        // TODO add your handling code here:
        Profile p =new Profile();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Profiile_clickMouseClicked

    private void create_roomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_roomMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_create_roomMouseClicked
/*    private void scrollToBottom() {
        JScrollBar verticalBar = sp.getVerticalScrollBar();
        AdjustmentListener downScroller = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                Adjustable adjustable = e.getAdjustable();
                adjustable.setValue(adjustable.getMaximum());
                verticalBar.removeAdjustmentListener(this);
            }
        };
        verticalBar.addAdjustmentListener(downScroller);
    }*/
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
            java.util.logging.Logger.getLogger(Chat12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chat12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chat12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chat12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chat12().setVisible(true);
            }
        });
        try{
            s = new Socket("127.0.0.1",1201);
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            String msgin="";
            while(!msgin.equals("exit")){
                msgin = din.readUTF();
                txt_area.setText(txt_area.getText().trim()+"\n Aman Gupta:"+msgin);
                
            }
        }catch(Exception e){
            
        }
    }
    //private javax.swing.JScrollPane sp;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Chat_Body;
    private javax.swing.JLabel Chat_Title;
    private javax.swing.JTextField Chat_txt;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Profiile_click;
    private javax.swing.JLabel chat_click;
    private javax.swing.JLabel create_room;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel join_room;
    private javax.swing.JLabel send;
    private javax.swing.JLabel settings;
    private static javax.swing.JTextArea txt_area;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku.cit260.group4.views;

import sudoku.Board;
import sudoku.controls.MainMenuControl;

/**
 *
 * @author Jessica
 */
public class NewGameFrame extends javax.swing.JFrame {
    private MainMenuControl mainCommands = new MainMenuControl();
    /**
     * Creates new form NewGameFrame
     */
    public NewGameFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
        public MainMenuControl getMainCommands(){
        return mainCommands;
    }
    public void setMainCommands(MainMenuControl mainCommands){
        this.mainCommands = mainCommands;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNewGamePanel = new javax.swing.JPanel();
        jNewGameTitle = new javax.swing.JPanel();
        jNewGameLabel = new javax.swing.JLabel();
        jButtonPanel = new javax.swing.JPanel();
        jEasyButton = new javax.swing.JButton();
        jMediumButton = new javax.swing.JButton();
        jHardButton = new javax.swing.JButton();
        jQuitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Game");

        jNewGamePanel.setBackground(new java.awt.Color(255, 153, 255));
        jNewGamePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jNewGameTitle.setBackground(new java.awt.Color(255, 153, 255));

        jNewGameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jNewGameLabel.setText("Choose a Level");

        javax.swing.GroupLayout jNewGameTitleLayout = new javax.swing.GroupLayout(jNewGameTitle);
        jNewGameTitle.setLayout(jNewGameTitleLayout);
        jNewGameTitleLayout.setHorizontalGroup(
            jNewGameTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNewGameTitleLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jNewGameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jNewGameTitleLayout.setVerticalGroup(
            jNewGameTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jNewGameTitleLayout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jNewGameLabel))
        );

        jButtonPanel.setBackground(new java.awt.Color(255, 204, 255));
        jButtonPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jEasyButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jEasyButton.setText("Easy");
        jEasyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEasyButtonMouseClicked(evt);
            }
        });

        jMediumButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jMediumButton.setText("Medium");
        jMediumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMediumButtonActionPerformed(evt);
            }
        });

        jHardButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jHardButton.setText("Hard");
        jHardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHardButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jButtonPanelLayout = new javax.swing.GroupLayout(jButtonPanel);
        jButtonPanel.setLayout(jButtonPanelLayout);
        jButtonPanelLayout.setHorizontalGroup(
            jButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jEasyButton)
                .addGap(18, 18, 18)
                .addComponent(jMediumButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jHardButton)
                .addGap(29, 29, 29))
        );
        jButtonPanelLayout.setVerticalGroup(
            jButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEasyButton)
                    .addComponent(jMediumButton)
                    .addComponent(jHardButton))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jQuitButton.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jQuitButton.setText("Quit");
        jQuitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jNewGamePanelLayout = new javax.swing.GroupLayout(jNewGamePanel);
        jNewGamePanel.setLayout(jNewGamePanelLayout);
        jNewGamePanelLayout.setHorizontalGroup(
            jNewGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jNewGameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jNewGamePanelLayout.createSequentialGroup()
                .addGroup(jNewGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jNewGamePanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jNewGamePanelLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jQuitButton)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jNewGamePanelLayout.setVerticalGroup(
            jNewGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNewGamePanelLayout.createSequentialGroup()
                .addComponent(jNewGameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jQuitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jNewGamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jNewGamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jQuitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_jQuitButtonActionPerformed

    private void jEasyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEasyButtonMouseClicked
        PlayGameView playGame = new PlayGameView();
        Board userBoard = new Board();
        userBoard.setBoard("E");
        playGame.getInput(userBoard);
    }//GEN-LAST:event_jEasyButtonMouseClicked

    private void jMediumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMediumButtonActionPerformed
        PlayGameView playGame = new PlayGameView();
        Board userBoard = new Board();
        userBoard.setBoard("M");
        playGame.getInput(userBoard);
    }//GEN-LAST:event_jMediumButtonActionPerformed

    private void jHardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHardButtonActionPerformed
        PlayGameView playGame = new PlayGameView();
        Board userBoard = new Board();
        userBoard.setBoard("H");
        playGame.getInput(userBoard);
    }//GEN-LAST:event_jHardButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jButtonPanel;
    private javax.swing.JButton jEasyButton;
    private javax.swing.JButton jHardButton;
    private javax.swing.JButton jMediumButton;
    private javax.swing.JLabel jNewGameLabel;
    private javax.swing.JPanel jNewGamePanel;
    private javax.swing.JPanel jNewGameTitle;
    private javax.swing.JButton jQuitButton;
    // End of variables declaration//GEN-END:variables
}

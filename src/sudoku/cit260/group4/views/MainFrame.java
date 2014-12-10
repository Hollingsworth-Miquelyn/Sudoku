package sudoku.cit260.group4.views;

import sudoku.controls.MainMenuControl;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica, Miquelyn, Jessica, Heidi
 */
public class MainFrame extends javax.swing.JFrame {
    
    private MainMenuControl mainCommands = new MainMenuControl();
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
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

        jpBody = new javax.swing.JPanel();
        jpTitle = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        jpMenuItems = new javax.swing.JPanel();
        newGame = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        help = new javax.swing.JButton();
        jtWelcome = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku");

        jpBody.setBackground(new java.awt.Color(255, 153, 255));
        jpBody.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jpTitle.setBackground(new java.awt.Color(255, 153, 255));
        jpTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jlTitle.setText("Sudoku");

        javax.swing.GroupLayout jpTitleLayout = new javax.swing.GroupLayout(jpTitle);
        jpTitle.setLayout(jpTitleLayout);
        jpTitleLayout.setHorizontalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTitle)
                .addGap(171, 171, 171))
        );
        jpTitleLayout.setVerticalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpMenuItems.setBackground(new java.awt.Color(51, 0, 51));
        jpMenuItems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        newGame.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        newGame.setText("New Game");
        newGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newGameMouseClicked(evt);
            }
        });

        quit.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        quit.setText("Quit");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        help.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        help.setText("Help");
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpMenuItemsLayout = new javax.swing.GroupLayout(jpMenuItems);
        jpMenuItems.setLayout(jpMenuItemsLayout);
        jpMenuItemsLayout.setHorizontalGroup(
            jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuItemsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(newGame))
                    .addComponent(help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpMenuItemsLayout.setVerticalGroup(
            jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newGame)
                .addGap(18, 18, 18)
                .addComponent(quit)
                .addGap(18, 18, 18)
                .addComponent(help)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtWelcome.setBackground(new java.awt.Color(255, 204, 255));
        jtWelcome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtWelcome.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to Sudoku. Please enter your name and start a new game. Good Luck!");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jtWelcome.setViewportView(jTextArea1);

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpMenuItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addComponent(jpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpMenuItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpBodyLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jtWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBody, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        this.dispose();
    }//GEN-LAST:event_quitActionPerformed

    private void newGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameMouseClicked
        NewGameView newGame = new NewGameView();
        newGame.getInput(null);
    }//GEN-LAST:event_newGameMouseClicked

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput(null);
    }//GEN-LAST:event_helpMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton help;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpMenuItems;
    private javax.swing.JPanel jpTitle;
    private javax.swing.JScrollPane jtWelcome;
    private javax.swing.JButton newGame;
    private javax.swing.JButton quit;
    // End of variables declaration//GEN-END:variables
}
import java.awt.Color;
import java.util.Random;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        lblTries = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblWord = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnStop = new javax.swing.JButton();
        btnO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hangman");
        setBounds(new java.awt.Rectangle(618, 235, 235, 235));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnA.setText("A");
        btnA.setEnabled(false);
        btnA.setMaximumSize(new java.awt.Dimension(42, 42));
        btnA.setMinimumSize(new java.awt.Dimension(42, 42));
        btnA.setPreferredSize(new java.awt.Dimension(46, 46));
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        jPanel1.add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        btnB.setText("B");
        btnB.setEnabled(false);
        btnB.setMaximumSize(new java.awt.Dimension(42, 42));
        btnB.setMinimumSize(new java.awt.Dimension(42, 42));
        btnB.setPreferredSize(new java.awt.Dimension(46, 46));
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        jPanel1.add(btnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        btnC.setText("C");
        btnC.setEnabled(false);
        btnC.setMaximumSize(new java.awt.Dimension(42, 42));
        btnC.setMinimumSize(new java.awt.Dimension(42, 42));
        btnC.setPreferredSize(new java.awt.Dimension(46, 46));
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel1.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        btnD.setText("D");
        btnD.setEnabled(false);
        btnD.setMaximumSize(new java.awt.Dimension(42, 42));
        btnD.setMinimumSize(new java.awt.Dimension(42, 42));
        btnD.setPreferredSize(new java.awt.Dimension(46, 46));
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        jPanel1.add(btnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        btnE.setText("E");
        btnE.setEnabled(false);
        btnE.setMaximumSize(new java.awt.Dimension(42, 42));
        btnE.setMinimumSize(new java.awt.Dimension(42, 42));
        btnE.setPreferredSize(new java.awt.Dimension(46, 46));
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });
        jPanel1.add(btnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        btnF.setText("F");
        btnF.setEnabled(false);
        btnF.setMaximumSize(new java.awt.Dimension(42, 42));
        btnF.setMinimumSize(new java.awt.Dimension(42, 42));
        btnF.setPreferredSize(new java.awt.Dimension(46, 46));
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });
        jPanel1.add(btnF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        btnG.setText("G");
        btnG.setEnabled(false);
        btnG.setMaximumSize(new java.awt.Dimension(42, 42));
        btnG.setMinimumSize(new java.awt.Dimension(42, 42));
        btnG.setPreferredSize(new java.awt.Dimension(46, 46));
        btnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGActionPerformed(evt);
            }
        });
        jPanel1.add(btnG, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        btnH.setText("H");
        btnH.setEnabled(false);
        btnH.setMaximumSize(new java.awt.Dimension(42, 42));
        btnH.setMinimumSize(new java.awt.Dimension(42, 42));
        btnH.setPreferredSize(new java.awt.Dimension(46, 46));
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });
        jPanel1.add(btnH, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        btnI.setText("I");
        btnI.setEnabled(false);
        btnI.setMaximumSize(new java.awt.Dimension(42, 42));
        btnI.setMinimumSize(new java.awt.Dimension(42, 42));
        btnI.setPreferredSize(new java.awt.Dimension(46, 46));
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });
        jPanel1.add(btnI, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        btnJ.setText("J");
        btnJ.setEnabled(false);
        btnJ.setMaximumSize(new java.awt.Dimension(42, 42));
        btnJ.setMinimumSize(new java.awt.Dimension(42, 42));
        btnJ.setPreferredSize(new java.awt.Dimension(46, 46));
        btnJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJActionPerformed(evt);
            }
        });
        jPanel1.add(btnJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, -1, -1));

        btnK.setText("K");
        btnK.setEnabled(false);
        btnK.setMaximumSize(new java.awt.Dimension(42, 42));
        btnK.setMinimumSize(new java.awt.Dimension(42, 42));
        btnK.setPreferredSize(new java.awt.Dimension(46, 46));
        btnK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKActionPerformed(evt);
            }
        });
        jPanel1.add(btnK, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        btnL.setText("L");
        btnL.setEnabled(false);
        btnL.setMaximumSize(new java.awt.Dimension(42, 42));
        btnL.setMinimumSize(new java.awt.Dimension(42, 42));
        btnL.setPreferredSize(new java.awt.Dimension(46, 46));
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });
        jPanel1.add(btnL, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        btnM.setText("M");
        btnM.setEnabled(false);
        btnM.setMaximumSize(new java.awt.Dimension(42, 42));
        btnM.setMinimumSize(new java.awt.Dimension(42, 42));
        btnM.setPreferredSize(new java.awt.Dimension(46, 46));
        btnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMActionPerformed(evt);
            }
        });
        jPanel1.add(btnM, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        btnN.setText("N");
        btnN.setEnabled(false);
        btnN.setMaximumSize(new java.awt.Dimension(42, 42));
        btnN.setMinimumSize(new java.awt.Dimension(42, 42));
        btnN.setPreferredSize(new java.awt.Dimension(46, 46));
        btnN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNActionPerformed(evt);
            }
        });
        jPanel1.add(btnN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        btnP.setText("P");
        btnP.setEnabled(false);
        btnP.setMaximumSize(new java.awt.Dimension(42, 42));
        btnP.setMinimumSize(new java.awt.Dimension(42, 42));
        btnP.setPreferredSize(new java.awt.Dimension(46, 46));
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });
        jPanel1.add(btnP, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        btnQ.setText("Q");
        btnQ.setEnabled(false);
        btnQ.setMaximumSize(new java.awt.Dimension(42, 42));
        btnQ.setMinimumSize(new java.awt.Dimension(42, 42));
        btnQ.setPreferredSize(new java.awt.Dimension(46, 46));
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQActionPerformed(evt);
            }
        });
        jPanel1.add(btnQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        btnR.setText("R");
        btnR.setEnabled(false);
        btnR.setMaximumSize(new java.awt.Dimension(42, 42));
        btnR.setMinimumSize(new java.awt.Dimension(42, 42));
        btnR.setPreferredSize(new java.awt.Dimension(46, 46));
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });
        jPanel1.add(btnR, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        btnS.setText("S");
        btnS.setEnabled(false);
        btnS.setMaximumSize(new java.awt.Dimension(42, 42));
        btnS.setMinimumSize(new java.awt.Dimension(42, 42));
        btnS.setPreferredSize(new java.awt.Dimension(46, 46));
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });
        jPanel1.add(btnS, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        btnT.setText("T");
        btnT.setActionCommand("V");
        btnT.setEnabled(false);
        btnT.setMaximumSize(new java.awt.Dimension(42, 42));
        btnT.setMinimumSize(new java.awt.Dimension(42, 42));
        btnT.setPreferredSize(new java.awt.Dimension(46, 46));
        btnT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTActionPerformed(evt);
            }
        });
        jPanel1.add(btnT, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));

        btnV.setText("V");
        btnV.setEnabled(false);
        btnV.setMaximumSize(new java.awt.Dimension(42, 42));
        btnV.setMinimumSize(new java.awt.Dimension(42, 42));
        btnV.setPreferredSize(new java.awt.Dimension(46, 46));
        btnV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVActionPerformed(evt);
            }
        });
        jPanel1.add(btnV, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        btnW.setText("W");
        btnW.setEnabled(false);
        btnW.setMaximumSize(new java.awt.Dimension(42, 42));
        btnW.setMinimumSize(new java.awt.Dimension(42, 42));
        btnW.setPreferredSize(new java.awt.Dimension(46, 46));
        btnW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWActionPerformed(evt);
            }
        });
        jPanel1.add(btnW, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        btnX.setText("X");
        btnX.setEnabled(false);
        btnX.setMaximumSize(new java.awt.Dimension(42, 42));
        btnX.setMinimumSize(new java.awt.Dimension(42, 42));
        btnX.setPreferredSize(new java.awt.Dimension(46, 46));
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });
        jPanel1.add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        btnY.setText("Y");
        btnY.setEnabled(false);
        btnY.setMaximumSize(new java.awt.Dimension(42, 42));
        btnY.setMinimumSize(new java.awt.Dimension(42, 42));
        btnY.setPreferredSize(new java.awt.Dimension(46, 46));
        btnY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYActionPerformed(evt);
            }
        });
        jPanel1.add(btnY, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        btnZ.setText("Z");
        btnZ.setEnabled(false);
        btnZ.setMaximumSize(new java.awt.Dimension(42, 42));
        btnZ.setMinimumSize(new java.awt.Dimension(42, 42));
        btnZ.setPreferredSize(new java.awt.Dimension(46, 46));
        btnZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZActionPerformed(evt);
            }
        });
        jPanel1.add(btnZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        btnU.setText("U");
        btnU.setEnabled(false);
        btnU.setMaximumSize(new java.awt.Dimension(42, 42));
        btnU.setMinimumSize(new java.awt.Dimension(42, 42));
        btnU.setPreferredSize(new java.awt.Dimension(46, 46));
        btnU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUActionPerformed(evt);
            }
        });
        jPanel1.add(btnU, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        btnStart.setText("Start Game");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel1.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        lblTries.setBackground(new java.awt.Color(153, 153, 153));
        lblTries.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTries.setText("0 tries");
        lblTries.setOpaque(true);
        lblTries.setVisible(false);
        jPanel1.add(lblTries, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.setLayout(new java.awt.BorderLayout());

        lblWord.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWord.setText("XXXXXXXXXXXXXXXX");
        lblWord.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblWord.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblWord, java.awt.BorderLayout.CENTER);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Welcome to Hangman");
        jPanel2.add(lblTitle, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 370, 90));

        btnStop.setLabel("Stop Game");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        jPanel1.add(btnStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));
        btnStop.setVisible(false);

        btnO.setText("O");
        btnO.setEnabled(false);
        btnO.setMaximumSize(new java.awt.Dimension(42, 42));
        btnO.setMinimumSize(new java.awt.Dimension(42, 42));
        btnO.setPreferredSize(new java.awt.Dimension(46, 46));
        btnO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOActionPerformed(evt);
            }
        });
        jPanel1.add(btnO, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        
        // enable tries counter and keyboard
        lblTries.setVisible(true);
        enableKeyboard(true);
        
        // array of possible words
        String[] words = {"PROGRAMMING", "OAKLAND", "UNIVERSITY", "SOFTWARE", "ENGINEERING"};
        
        //choose random word from list
        Random gen = new Random();
        word = words[gen.nextInt(4)];
        
        // set up lblWord
        for(int i=0; i<word.length(); i++){
            hiddenWord+= "-";
        }
        lblWord.setText(hiddenWord);
        
        // hide start button, show stop button
        btnStart.setVisible(false);
        btnStop.setVisible(true);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        
        // hide stop button, tries and show start button
        btnStart.setVisible(true);
        btnStop.setVisible(false);
        lblTries.setVisible(false);
        
        // disable keyboard
        enableKeyboard(false);
        
        // reset word and tries
        lblWord.setText("XXXXXXXXXXXXXXXX");
        lblWord.setForeground(Color.black);
        hiddenWord = "";
        word = "";
        tries = 0;
        lblTries.setText(tries + " tries");
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        
        // disable button
        btnA.setEnabled(false);
        
        // increase tries counter
        tries++;
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('A');       
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
                
        // disable button
        btnB.setEnabled(false);
        
        // increase tries counter
        tries++;
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('B');
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
                
        // disable button
        btnC.setEnabled(false);
        
        // increase tries counter
        tries++;
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('C');        
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        
        // disable button
        btnD.setEnabled(false);

        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('D');
    }//GEN-LAST:event_btnDActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        
        // disable button
        btnE.setEnabled(false);

        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('E');
    }//GEN-LAST:event_btnEActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        
        // disable button
        btnF.setEnabled(false);

        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('F');
    }//GEN-LAST:event_btnFActionPerformed

    private void btnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGActionPerformed
        
        // disable button
        btnG.setEnabled(false);

        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('G');
    }//GEN-LAST:event_btnGActionPerformed

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed
        
        // disable button
        btnH.setEnabled(false);

        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('H');
    }//GEN-LAST:event_btnHActionPerformed

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        
        // disable button
        btnI.setEnabled(false);

        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('I');
    }//GEN-LAST:event_btnIActionPerformed

    private void btnJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJActionPerformed
        
        // disable button
        btnJ.setEnabled(false);
        
        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('J');
    }//GEN-LAST:event_btnJActionPerformed

    private void btnKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKActionPerformed
        
        // disable button
        btnK.setEnabled(false);
        
        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('K');
    }//GEN-LAST:event_btnKActionPerformed

    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        
        // disable button
        btnL.setEnabled(false);
        
        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('L');
    }//GEN-LAST:event_btnLActionPerformed

    private void btnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMActionPerformed
        
        // disable button
        btnM.setEnabled(false);

        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('M');
    }//GEN-LAST:event_btnMActionPerformed

    private void btnNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNActionPerformed
        
        // disable button
        btnN.setEnabled(false);

        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('N');
    }//GEN-LAST:event_btnNActionPerformed

    private void btnOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOActionPerformed
        
        // disable button
        btnO.setEnabled(false);
        
        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('O');
    }//GEN-LAST:event_btnOActionPerformed

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        
        // disable button
        btnP.setEnabled(false);

        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('P');
    }//GEN-LAST:event_btnPActionPerformed

    private void btnQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQActionPerformed
        
        // disable button
        btnQ.setEnabled(false);
        
        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('Q');
    }//GEN-LAST:event_btnQActionPerformed

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
        
        // disable button
        btnR.setEnabled(false);

        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('R');
    }//GEN-LAST:event_btnRActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        
        // disable button
        btnS.setEnabled(false);
        
        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('S');
    }//GEN-LAST:event_btnSActionPerformed

    private void btnTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTActionPerformed
        
        // disable button
        btnT.setEnabled(false);

        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('T');
    }//GEN-LAST:event_btnTActionPerformed

    private void btnUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUActionPerformed
        
        // disable button
        btnU.setEnabled(false);
        
        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('U');
    }//GEN-LAST:event_btnUActionPerformed

    private void btnVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVActionPerformed
        
        // disable button
        btnV.setEnabled(false);

        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('V');
    }//GEN-LAST:event_btnVActionPerformed

    private void btnWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWActionPerformed
        
        // disable button
        btnW.setEnabled(false);

        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('W');
    }//GEN-LAST:event_btnWActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        
        // disable button
        btnX.setEnabled(false);

        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('X');
    }//GEN-LAST:event_btnXActionPerformed

    private void btnYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYActionPerformed
        
        // disable button
        btnY.setEnabled(false);
        
        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('Y');
    }//GEN-LAST:event_btnYActionPerformed

    private void btnZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZActionPerformed
        
        // disable button
        btnZ.setEnabled(false);
        
        // increase tries counter        
        tries++;        
        lblTries.setText(tries + " tries");
        
        //search word for letter
        searchWord('Z');
    }//GEN-LAST:event_btnZActionPerformed

    private void searchWord(char letter){
        
        for(int i =0; i<word.length(); i++){
            if (word.charAt(i) == letter){
                hiddenWord = changeCharInPosition(i, letter, hiddenWord);
            }
        }
        
        lblWord.setText(hiddenWord);
        
        //see if word is completely solved
        boolean isSolved = true;
        for(int i=0; i<hiddenWord.length(); i++){
            if (hiddenWord.charAt(i) == '-'){
                isSolved = false;
                break;
            }
        }
        if (isSolved == true){
            gameWon();
        }
    }
    
    private String changeCharInPosition(int position, char ch, String str){
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }
    
    private void enableKeyboard(boolean bool){
        
        btnA.setEnabled(bool);
        btnB.setEnabled(bool);
        btnC.setEnabled(bool);
        btnD.setEnabled(bool);
        btnE.setEnabled(bool);
        btnF.setEnabled(bool);
        btnG.setEnabled(bool);
        btnH.setEnabled(bool);
        btnI.setEnabled(bool);
        btnJ.setEnabled(bool);
        btnK.setEnabled(bool);
        btnL.setEnabled(bool);
        btnM.setEnabled(bool);
        btnN.setEnabled(bool);
        btnO.setEnabled(bool);
        btnP.setEnabled(bool);
        btnQ.setEnabled(bool);
        btnR.setEnabled(bool);
        btnS.setEnabled(bool);
        btnT.setEnabled(bool);
        btnU.setEnabled(bool);
        btnV.setEnabled(bool);
        btnW.setEnabled(bool);
        btnX.setEnabled(bool);
        btnY.setEnabled(bool);
        btnZ.setEnabled(bool); 
    }
    
    private void gameWon(){
        
        // disable keyboard
        enableKeyboard(false);
        
        lblWord.setForeground(Color.green);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTries;
    private javax.swing.JLabel lblWord;
    // End of variables declaration//GEN-END:variables
    private String hiddenWord = "";
    private String word = "";
    private int tries = 0;
}


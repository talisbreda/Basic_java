
import java.util.ArrayList;

public class Calculadora extends javax.swing.JFrame {

    String btn;
    String screen = "";
    int t = 255; // array size
    int cont = 0;
    boolean convertTest;
    double convertTestDouble;
    ArrayList<String> values = new ArrayList<String>();
    double[] valuesDouble = new double[t];
    boolean wait = false;
    String value = "";
    String afterComma = ",";

    public Calculadora() {
        initComponents();
    }
    

    //@SuppressWarnings("unchecked")
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
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 400));

        jButton1.setText("1");
        jButton1.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("4");
        jButton2.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("2");
        jButton4.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("0");
        jButton10.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButton11.setText("=");
        jButton11.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText(",");
        jButton12.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("/");
        jButton13.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("+");
        jButton14.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("-");
        jButton15.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("x");
        jButton16.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("raiz");
        jButton17.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setIcon(new javax.swing.ImageIcon("C:\\Users\\talis\\Desktop\\Atividades da Quarentena\\Programação I - Quarentena\\Aula23-Calculadora\\src\\backspace.png")); // NOI18N
        jButton18.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("C");
        jButton19.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("^");
        jButton20.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldScreen(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(190, 190, 190))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldScreen(java.awt.event.ActionEvent evt) {
        // screen
    }

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {
        // 0
        btn = "0";
        showOnScreen();
    }    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {        
        // 1
        btn = "1";
        showOnScreen();
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {        
        // 2
        btn = "2";
        showOnScreen();
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {        
        // 3
        btn = "3";
        showOnScreen();
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // 4
        btn = "4";
        showOnScreen();
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        // 5
        btn = "5";
        showOnScreen();
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {       
        // 6
        btn = "6";
        showOnScreen();
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {        
        // 7
        btn = "7";
        showOnScreen();
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {       
        // 8
        btn = "8";
        showOnScreen();
    }
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {        
        // 9
        btn = "9";
        showOnScreen();
    }
    
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
        // ,
        btn = ",";
        showOnScreen();
    }

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
        // +
        btn = "+";
        showOnScreen();
    }
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
        // -
        btn = "-";
        showOnScreen();
    }
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
        // x
        btn = "*";
        showOnScreen();
    }
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
        // /
        btn = "/";
        showOnScreen();
    }

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
        // Square root
        btn = "\u221A";
        showOnScreen();
    }
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {
        // ^
        btn = "^";
        showOnScreen();
    }

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
        // Erase
        values.remove(values.size() - 1);
        screen = screen.substring(0, screen.length() - 1);
        jTextField1.setText(screen);
    }

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
        // C
        jTextField1.setText("");
        screen = "";
        btn = "";
        cont = 0;
        value = "";
        for (int i = 0; i < t; i++) {
            valuesDouble[i] = 0;
        }
        values.clear();
        wait = false;
    }

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
        // =
        // Joining digits
        for (int i = 0; i < values.size(); i++) {
            convertTest = convert(values.get(i));
            if (convertTest != false) {
                if (values.get(i).length() == 1 && wait == false) {
                    wait = true;
                    values.add("");
                    if (value.equals("-") && (convert(values.get(i + 1)) == false || i == values.size() - 1)) {
                        value += values.get(i);
                        values.set(i, value);
                        value = "";
                    }
                } else {
                    cont++;
                    value += values.get(i - cont);
                    value += values.get(i);
                    values.set(i - cont, value);
                    value = "";
                    values.set(i, "");
                }
            } else if (values.get(i).equals("-")) {
                value += "-";
                if (i != 0) {
                    values.set(i, "+");
                }
            }
            if (convertTest == false) {
                cont = 0;
                wait = false;
            }
        }
        // Treating division by zero
        if (values.contains("/")) {
            for (int i = 0; i < values.size(); i++) {
                if (values.get(i).equals("/")) {
                    if (values.get(i + 1).equals("0")) {
                        values.clear();
                        jTextField1.setText("Não é possível dividir por zero");
                    }
                }
            }
        }
        // Joining comma with digits around it
        while (values.contains(",")) {
            int posVirgula = values.indexOf(",");
            for (int i = 1; i < values.size(); i++) {
                if (convert(values.get(posVirgula + i)) != false) {
                    afterComma += values.get(posVirgula + i);
                    break;
                }
            }
            value = "";
            value = values.get(posVirgula - 1);
            value += afterComma;
            values.set(posVirgula - 1, value);
            values.set(posVirgula, "");
            values.set(posVirgula + 1, "");
            afterComma = "0";
            values.set(posVirgula - 1, value.replace(',', '.'));
        }
        // Deleting empty strings inside the array
        while (values.contains("")) {
            for (int i = 0; i < values.size(); i++) {
                if (values.get(i).isEmpty()) {
                    values.remove(i);
                    break;
                }
            }
        }

        Calculate();
    }

    public void showOnScreen() {
        if (!convert(btn) && !convert(values.get(values.size() - 1))) {
            // If an operator is typed right after the other, replace the older one with the recent
            values.set(values.size() - 1, btn);
            screen = screen.substring(0, screen.length() - 1);
            screen += values.get(values.size() - 1);
            jTextField1.setText(screen);
        } else {
            // Show array values on screen
            values.add(btn);
            screen += btn;
            jTextField1.setText(screen);
        }

    }

    public boolean convert(String value) {
        // Testing if character is a number or an operator
        try {
            convertTestDouble = Double.parseDouble(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void removeValues(int i) {
        values.remove(i + 1);
        values.remove(i);
        i = 0;
    }

    public void Calculate() {
        while (values.size() > 1) {
            for (int i = 0; i < values.size(); i++) {
                if (values.get(i).equals("\u221A")) {
                    // Check if the character is the square root
                    // Calculate square root
                    valuesDouble[0] = Double.parseDouble(values.get(i + 1));
                    values.set(i, String.valueOf(Math.sqrt(valuesDouble[0])));
                    // Remove values from ArrayList
                    values.remove(i + 1);
                    i = 0;
                } else {
                    if (!convert(values.get(i))) {
                        valuesDouble[0] = Double.parseDouble(values.get(i - 1));
                        valuesDouble[1] = Double.parseDouble(values.get(i + 1));
                        switch(values.get(i)) {
                            case "^":
                                values.set(i - 1, String.valueOf(Math.pow(valuesDouble[0], valuesDouble[1])));
                                removeValues(i);
                                continue;
                            case "*":
                                values.set(i - 1, String.valueOf(valuesDouble[0] * valuesDouble[1]));
                                removeValues(i);
                                continue;
                            case "/":
                                values.set(i - 1, String.valueOf(valuesDouble[0] / valuesDouble[1]));
                                removeValues(i);
                                continue;
                            case "+":
                                values.set(i - 1, String.valueOf(valuesDouble[0] + valuesDouble[1]));
                                removeValues(i);
                                continue;
                            case "-":
                                values.set(i - 1, String.valueOf(valuesDouble[0] - valuesDouble[1]));
                                removeValues(i);
                                continue;
                        }
                        
                    }                    
                }         
            }     
        }
        jTextField1.setText(values.get(0));
    }

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

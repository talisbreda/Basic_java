import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Calculadora extends JFrame implements KeyListener {

    String btn;
    String screen = "";
    int cont = 0;
    boolean convertTest;
    double convertTestDouble;
    ArrayList<String> values = new ArrayList<String>();
    double[] finalValues = new double[255];
    boolean wait = false;
    String newValue = "";
    String afterComma = ",";

    public Calculadora() {
        super("pq nao funcionaaaaaa");
        Container c = getContentPane();
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        c.setLayout(layout);

        initComponents();
        jTextField1.setText("0");
        values.add("0");
        screen = "0";
        setSize(350, 400);
        setVisible(true);

    }

    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
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
                jButton1ActionPerformed();
            }
        });

        jButton2.setText("4");
        jButton2.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed();
            }
        });

        jButton3.setText("3");
        jButton3.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed();
            }
        });

        jButton4.setText("2");
        jButton4.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed();
            }
        });

        jButton5.setText("5");
        jButton5.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed();
            }
        });

        jButton6.setText("6");
        jButton6.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed();
            }
        });

        jButton7.setText("7");
        jButton7.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed();
            }
        });

        jButton8.setText("8");
        jButton8.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed();
            }
        });

        jButton9.setText("9");
        jButton9.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed();
            }
        });

        jButton10.setText("0");
        jButton10.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed();
            }
        });

        jButton11.setText("=");
        jButton11.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed();
            }
        });

        jButton12.setText(",");
        jButton12.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed();
            }
        });

        jButton13.setText("/");
        jButton13.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed();
            }
        });

        jButton14.setText("+");
        jButton14.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed();
            }
        });

        jButton15.setText("-");
        jButton15.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed();
            }
        });

        jButton16.setText("x");
        jButton16.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed();
            }
        });

        jButton17.setText("raiz");
        jButton17.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed();
            }
        });

        jButton18.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\talis\\Desktop\\Atividades da Quarentena\\Programação I - Quarentena\\Aula23-Calculadora\\src\\backspace.png")); // NOI18N
        jButton18.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed();
            }
        });

        jButton19.setText("C");
        jButton19.addKeyListener(this);
        jButton19.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed();
            }
        });

        jButton20.setText("^");
        jButton20.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed();
            }
        });

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldScreen();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 262,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton4,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton3,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton7,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton8,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton9,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton2,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton5,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton6,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton10,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton12,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton11,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                .addComponent(jButton15,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 62,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jButton14,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(132, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(190, 190, 190)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void keyPressed(KeyEvent e) {
//        JOptionPane.showMessageDialog(null, e.getKeyCode());
        btn = switch (e.getKeyCode()) {
            case 48:
            case 96: yield "0";
            case 49:
            case 97: yield "1";
            case 50:
            case 98: yield "2";
            case 51:
            case 99: yield "3";
            case 52:
            case 100: yield "4";
            case 53:
            case 101: yield "5";
            case 54:
            case 102: yield "6";
            case 55:
            case 103: yield "7";
            case 56:
            case 104: yield "8";
            case 57:
            case 105: yield "9";
            case 107: yield "+";
            case 109: yield "-";
            case 106: yield "*";
            case 111: yield "/";
            case 61:
            case 10: jButton11ActionPerformed(); yield null;
            case 110:
            case 44: yield ",";
            case 8:
                values.remove(values.size() - 1);
                screen = screen.substring(0, screen.length() - 1);
                jTextField1.setText(screen);
            default: yield null;
        };
        if (btn != null) showOnScreen();
        // 48 - 57
        // 96 - 105
        // 107 109 106 111 -> + - * /
        // 10 -> enter
        // 110 44 -> ,
        // 8 backspace
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    private void jTextFieldScreen() {
        // screen
    }

    private void jButton0ActionPerformed() {
        // 0
        btn = "0";
        showOnScreen();
    }

    private void jButton1ActionPerformed() {
        // 1
        btn = "1";
        showOnScreen();
    }

    private void jButton2ActionPerformed() {
        // 2
        btn = "2";
        showOnScreen();
    }

    private void jButton3ActionPerformed() {
        // 3
        btn = "3";
        showOnScreen();
    }

    private void jButton4ActionPerformed() {
        // 4
        btn = "4";
        showOnScreen();
    }

    private void jButton5ActionPerformed() {
        // 5
        btn = "5";
        showOnScreen();
    }

    private void jButton6ActionPerformed() {
        // 6
        btn = "6";
        showOnScreen();
    }

    private void jButton7ActionPerformed() {
        // 7
        btn = "7";
        showOnScreen();
    }

    private void jButton8ActionPerformed() {
        // 8
        btn = "8";
        showOnScreen();
    }

    private void jButton9ActionPerformed() {
        // 9
        btn = "9";
        showOnScreen();
    }

    private void jButton12ActionPerformed() {
        // ,
        btn = ",";
        showOnScreen();
    }

    private void jButton14ActionPerformed() {
        // +
        btn = "+";
        showOnScreen();
    }

    private void jButton15ActionPerformed() {
        // -
        btn = "-";
        showOnScreen();
    }

    private void jButton16ActionPerformed() {
        // x
        btn = "*";
        showOnScreen();
    }

    private void jButton13ActionPerformed() {
        // /
        btn = "/";
        showOnScreen();
    }

    private void jButton17ActionPerformed() {
        // Square root
        btn = "\u221A";
        showOnScreen();
    }

    private void jButton20ActionPerformed() {
        // ^
        btn = "^";
        showOnScreen();
    }

    private void jButton18ActionPerformed() {
        // Erase
        values.remove(values.size() - 1);
        screen = screen.substring(0, screen.length() - 1);
        jTextField1.setText(screen);
    }

    private void jButton19ActionPerformed() {
        // C
        jTextField1.setText("0");
        screen = "0";
        btn = "0";
        cont = 0;
        newValue = "";
        for (int i = 0; i < 255; i++) {
            finalValues[i] = 0;
        }
        values.clear();
        values.add("0");
        wait = false;
    }

    private void jButton11ActionPerformed() {
        // =
        // Joining digits
        for (int i = 0; i < values.size(); i++) {
            if (isNumber(values.get(i))) {
                newValue += values.get(i);
                values.set(i, "");
                values.set(cont, newValue);
                finalValues[cont] = Double.parseDouble(newValue);
            } else {
                if (values.contains("")) {
                    for (int j = 0; j < values.size(); j++) {
                        if (values.get(j).isEmpty()) {
                            values.remove(j);
                            i--;
                        }
                    }
                }
                cont = i + 1;
                newValue = "";
            }
        }
        cont = 0;
        newValue = "";
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
            int commaPosition = values.indexOf(",");
            for (int i = 1; i < values.size(); i++) {
                if (isNumber(values.get(commaPosition + i))) {
                    afterComma += values.get(commaPosition + i);
                    break;
                }
            }
            newValue = values.get(commaPosition - 1) + afterComma;
            values.set(commaPosition - 1, newValue);
            values.remove(commaPosition + 1);
            values.remove(commaPosition);
            afterComma = ",";
            values.set(commaPosition - 1, newValue.replace(',', '.'));
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
        if (!isNumber(btn)
                && values.size() > 1
                && !isNumber(values.get(values.size() - 1))
                && !btn.equals("\u221a")) {
            // If an operator is typed right after the other, replace the older one with the
            // recent
            values.set(values.size() - 1, btn);
            screen = screen.substring(0, screen.length() - 1) + values.get(values.size() - 1);
            jTextField1.setText(screen);
        } else if (screen.equals("0")) {
            screen = btn;
            values.clear();
        } else {
            screen += btn;
        }
        // Show updated values on screen
        values.add(btn);
        jTextField1.setText(screen);

    }

    public boolean isNumber(String newValue) {
        // Testing if character is a number or an operator
        try {
            convertTestDouble = Double.parseDouble(newValue);
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
                if (!isNumber(values.get(i))) {
                    switch (values.get(i)) {
                        case "^":
                            finalValues[0] = Double.parseDouble(values.get(i - 1));
                            finalValues[1] = Double.parseDouble(values.get(i + 1));
                            values.set(i - 1, String.valueOf(Math.pow(finalValues[0], finalValues[1])));
                            removeValues(i);
                            continue;
                        case "\u221a":
                            finalValues[0] = Double.parseDouble(values.get(i + 1));
                            if (i > 0 && isNumber(values.get(i - 1))) {
                                values.set(i, "*");
                                values.set(i + 1, String.valueOf(Math.sqrt(finalValues[0])));
                            } else {
                                values.set(i, String.valueOf(Math.sqrt(finalValues[0])));
                                values.remove(i + 1);
                            }
                            i = 0;
                    }
                }
            }
            for (int i = 0; i < values.size(); i++) {
                if (!isNumber(values.get(i))) {
                    finalValues[0] = Double.parseDouble(values.get(i - 1));
                    finalValues[1] = Double.parseDouble(values.get(i + 1));
                    switch (values.get(i)) {
                        case "/":
                            values.set(i - 1, String.valueOf(finalValues[0] / finalValues[1]));
                            removeValues(i);
                            continue;
                        case "*":
                            values.set(i - 1, String.valueOf(finalValues[0] * finalValues[1]));
                            removeValues(i);
                    }
                }
            }
            for (int i = 0; i < values.size(); i++) {
                if (!isNumber(values.get(i))) {
                    finalValues[0] = Double.parseDouble(values.get(i - 1));
                    finalValues[1] = Double.parseDouble(values.get(i + 1));
                    switch (values.get(i)) {
                        case "-":
                            values.set(i - 1, String.valueOf(finalValues[0] - finalValues[1]));
                            removeValues(i);
                            continue;
                        case "+":
                            values.set(i - 1, String.valueOf(finalValues[0] + finalValues[1]));
                            removeValues(i);
                    }
                }
            }
        }
        screen = values.get(0);
        jTextField1.setText(values.get(0));
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });*/
        Calculadora calc = new Calculadora();
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

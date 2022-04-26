
public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
        this.GIF.setVisible(false);
        this.GDivision.setVisible(false);
        this.GSuma.setVisible(false);
        this.GResta.setVisible(false);
        this.GMultiplicacion.setVisible(false);
        this.GMod.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Num1 = new javax.swing.JTextField();
        Num2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Suma = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Division = new javax.swing.JButton();
        Multiplicacion = new javax.swing.JButton();
        Mod = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Resultado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        GIF = new javax.swing.JLabel();
        AC = new javax.swing.JButton();
        GMod = new javax.swing.JLabel();
        GDivision = new javax.swing.JLabel();
        GMultiplicacion = new javax.swing.JLabel();
        GResta = new javax.swing.JLabel();
        GSuma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("Digite los números que desea operar:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 45, -1, -1));
        jPanel1.add(Num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 105, 69, -1));
        jPanel1.add(Num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 105, 69, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setText("Que operación que desea realizar:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 153, -1, -1));

        Suma.setText("+");
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });
        jPanel1.add(Suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        Resta.setText("-");
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });
        jPanel1.add(Resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        Division.setText("/");
        Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionActionPerformed(evt);
            }
        });
        jPanel1.add(Division, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        Multiplicacion.setText("*");
        Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(Multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        Mod.setText("%");
        Mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModActionPerformed(evt);
            }
        });
        jPanel1.add(Mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel3.setText("El resultado de su operación es :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 278, -1, -1));

        Resultado.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jPanel1.add(Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 349, 40));

        jLabel4.setText("Num1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 85, -1, -1));

        jLabel5.setText("Num2");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 85, -1, -1));

        GIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GIF.gif"))); // NOI18N
        jPanel1.add(GIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        AC.setText("AC");
        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });
        jPanel1.add(AC, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        GMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mod.gif"))); // NOI18N
        jPanel1.add(GMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        GDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/division.gif"))); // NOI18N
        jPanel1.add(GDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        GMultiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multiplicacion.gif"))); // NOI18N
        jPanel1.add(GMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        GResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resta.gif"))); // NOI18N
        jPanel1.add(GResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        GSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/suma.gif"))); // NOI18N
        jPanel1.add(GSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 570, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
        double N1 = 0;
        double N2 = 0;
        double Resultado;
        String n1;
        String n2;
        String R = "0";
        try {
            n1 = this.Num1.getText();
            n2 = this.Num2.getText();
            N1 = Double.parseDouble(n1);
            N2 = Double.parseDouble(n2);
        } catch (NumberFormatException x) {
            System.out.println("Error de Formato");
        }
        Resultado = N1 + N2;
        R = Double.toString(Resultado);
        this.Resultado.setText(R + " ");
        this.GIF.setVisible(true);
        this.GSuma.setVisible(true);
    }//GEN-LAST:event_SumaActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
        double N1 = 0;
        double N2 = 0;
        double Resultado;
        String n1;
        String n2;
        String R = "0";

        try {
            n1 = this.Num1.getText();
            n2 = this.Num2.getText();
            N1 = Double.parseDouble(n1);
            N2 = Double.parseDouble(n2);
        } catch (NumberFormatException x) {
            System.out.println("Error de Formato");
        }
        Resultado = N1 - N2;
        R = Double.toString(Resultado);
        this.Resultado.setText(R + " ");
        this.GIF.setVisible(true);
        this.GResta.setVisible(true);
    }//GEN-LAST:event_RestaActionPerformed

    private void MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicacionActionPerformed
        double N1 = 0;
        double N2 = 0;
        double Resultado;
        String n1;
        String n2;
        String R = "0";

        try {
            n1 = this.Num1.getText();
            n2 = this.Num2.getText();
            N1 = Double.parseDouble(n1);
            N2 = Double.parseDouble(n2);
        } catch (NumberFormatException x) {
            System.out.println("Error de Formato");
        }
        Resultado = N1 * N2;
        R = Double.toString(Resultado);
        this.Resultado.setText(R + " ");
        this.GIF.setVisible(true);
        this.GMultiplicacion.setVisible(true);
    }//GEN-LAST:event_MultiplicacionActionPerformed

    private void DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionActionPerformed
        double N1 = 0;
        double N2 = 0;
        double Resultado;
        String n1;
        String n2;
        String R = "0";

        try {
            n1 = this.Num1.getText();
            n2 = this.Num2.getText();
            N1 = Double.parseDouble(n1);
            N2 = Double.parseDouble(n2);
            Resultado = N1 / N2;
        } catch (NumberFormatException x) {
            System.out.println("Error de Formato");
        } catch (ArithmeticException e) {
            System.out.println("División indeterminada");
        }
        Resultado = N1 / N2;
        R = Double.toString(Resultado);
        this.Resultado.setText(R + " ");
        this.GIF.setVisible(true);
        this.GDivision.setVisible(true);
    }//GEN-LAST:event_DivisionActionPerformed

    private void ModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModActionPerformed
        double N1 = 0;
        double N2 = 0;
        double Resultado;
        String n1;
        String n2;
        String R = "0";

        try {
            n1 = this.Num1.getText();
            n2 = this.Num2.getText();
            N1 = Double.parseDouble(n1);
            N2 = Double.parseDouble(n2);
        } catch (NumberFormatException x) {
            System.out.println("Error de Formato");
        }
        Resultado = N1 % N2;
        R = Double.toString(Resultado);
        this.Resultado.setText(R + " ");
        this.GIF.setVisible(true);
        this.GMod.setVisible(true);
    }//GEN-LAST:event_ModActionPerformed

    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed
        this.Num1.setText(" ");
        this.Num2.setText(" ");
        this.Resultado.setText(" ");
        this.GIF.setVisible(false);
        this.GDivision.setVisible(false);
        this.GSuma.setVisible(false);
        this.GResta.setVisible(false);
        this.GMultiplicacion.setVisible(false);
        this.GMod.setVisible(false);
    }//GEN-LAST:event_ACActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AC;
    private javax.swing.JButton Division;
    private javax.swing.JLabel GDivision;
    private javax.swing.JLabel GIF;
    private javax.swing.JLabel GMod;
    private javax.swing.JLabel GMultiplicacion;
    private javax.swing.JLabel GResta;
    private javax.swing.JLabel GSuma;
    private javax.swing.JButton Mod;
    private javax.swing.JButton Multiplicacion;
    private javax.swing.JTextField Num1;
    private javax.swing.JTextField Num2;
    private javax.swing.JButton Resta;
    private javax.swing.JLabel Resultado;
    private javax.swing.JButton Suma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

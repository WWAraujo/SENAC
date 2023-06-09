package Telas;


import SQL.DAO.VendasDAO;
import cadastro.model.Venda;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Essa tela exibe todas as vendas no banco de dados tento sintético como analítico table pedido e item_pedido
 * @author Wallace Wagner, Rafael de Souza, Semaías de Oliveira
 *
 */
public class Relatorio extends javax.swing.JFrame {

    /**
     * Creates new form RelatorioAnalitico
     */
    Venda objRelatorioSintetico = null;

    public Relatorio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTotalPeriodo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRelatorio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSintetico = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAnalitico = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cldInicio = new com.toedter.calendar.JDateChooser();
        cldFinal = new com.toedter.calendar.JDateChooser();
        lblValorTotalSintetico = new javax.swing.JLabel();
        lblValorTotalAnalitico = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório");

        jLabel1.setText("Data Inicio :");

        jLabel2.setText("Data Final :");

        btnRelatorio.setText("Buscar");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        tblSintetico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NF", "Cliente", "Valor", "Data"
            }
        ));
        tblSintetico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSinteticoMouseClicked(evt);
            }
        });
        tblSintetico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblSinteticoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblSinteticoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblSintetico);

        tblAnalitico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Produto", "Quantidade", "Valor"
            }
        ));
        tblAnalitico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblAnaliticoKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblAnalitico);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Valor total do Periodo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Valor total da compra:");

        lblValorTotalSintetico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblValorTotalSintetico.setText("0");

        lblValorTotalAnalitico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblValorTotalAnalitico.setText("0");

        javax.swing.GroupLayout lblTotalPeriodoLayout = new javax.swing.GroupLayout(lblTotalPeriodo);
        lblTotalPeriodo.setLayout(lblTotalPeriodoLayout);
        lblTotalPeriodoLayout.setHorizontalGroup(
            lblTotalPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblTotalPeriodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblTotalPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTotalPeriodoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lblValorTotalSintetico)
                        .addGap(148, 148, 148))
                    .addGroup(lblTotalPeriodoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cldInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cldFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTotalPeriodoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(lblValorTotalAnalitico)
                .addGap(150, 150, 150))
        );

        lblTotalPeriodoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cldFinal, cldInicio});

        lblTotalPeriodoLayout.setVerticalGroup(
            lblTotalPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblTotalPeriodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblTotalPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lblTotalPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cldInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cldFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lblTotalPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorTotalSintetico)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(lblTotalPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorTotalAnalitico))
                .addGap(23, 23, 23))
        );

        lblTotalPeriodoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cldFinal, cldInicio});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTotalPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed

        double valorTotalData = 0;

        //Formatar a data inicio da busca.
        Date dataInicio = (cldInicio.getDate());
        String dataInicioFormatada = null;
        if (dataInicio != null) {
            SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");
            dataInicioFormatada = formatador.format(dataInicio);
        } else {
            JOptionPane.showMessageDialog(this, "Seleciona a data inicio");
        }

        //Formatar a data final da busca.
        Date dataFinal = (cldFinal.getDate());
        String dataFinalFormatada = null;
        if (dataFinal != null) {
            SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");
            dataFinalFormatada = formatador.format(dataFinal);
        } else {
            JOptionPane.showMessageDialog(this, "Seleciona a data final");
        }

        //Chamar o banco de dedados passando as datas
        if (dataInicioFormatada != null && dataFinalFormatada != null) {
            ArrayList<Venda> lista = VendasDAO.listaSintetico(dataInicioFormatada, dataFinalFormatada);
            DefaultTableModel modelo = (DefaultTableModel) tblSintetico.getModel();

            //Limpar a tabela
            modelo.setRowCount(0);
            //Atualizar ou Preencher tabela
            for (Venda item : lista) {
                modelo.addRow(new String[]{
                    String.valueOf(item.getIdNota()),
                    String.valueOf(item.getIdCliente()),
                    String.valueOf(item.getValorTotalNota()),
                    String.valueOf(item.getDatavenda()),});
                valorTotalData += item.getValorTotalNota();
            }
            String vt = valorTotalData + "";
            lblValorTotalSintetico.setText(vt);
        }
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void tblSinteticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinteticoMouseClicked

        int linhaSelecionada = tblSintetico.getSelectedRow();
        double valorTotalanalitico = 0;

        if (linhaSelecionada >= 0) {
            Venda obj = new Venda();
            obj.setIdNota(Integer.parseInt(tblSintetico.getValueAt(linhaSelecionada, 0).toString() + ""));

            //Chamar o banco de dedados passando o numero da nota
            ArrayList<Venda> lista = VendasDAO.listaAnalitico(obj);
            DefaultTableModel modelo = (DefaultTableModel) tblAnalitico.getModel();

            //Limpar a tabela
            modelo.setRowCount(0);
            //Atualizar ou Preencher tabela
            for (Venda item : lista) {
                modelo.addRow(new String[]{
                    String.valueOf(item.getIdProd()),
                    String.valueOf(item.getQtdProd()),
                    String.valueOf(item.getValorUnid()),});
                valorTotalanalitico += (item.getQtdProd() * item.getValorUnid());
            }
            String vt = valorTotalanalitico + "";
            lblValorTotalAnalitico.setText(vt);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha");
        }

    }//GEN-LAST:event_tblSinteticoMouseClicked

    private void tblAnaliticoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAnaliticoKeyPressed

    }//GEN-LAST:event_tblAnaliticoKeyPressed

    private void tblSinteticoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSinteticoKeyPressed
        int linhaSelecionada = tblSintetico.getSelectedRow();
        double valorTotalanalitico = 0;

        if (linhaSelecionada >= 0) {
            Venda obj = new Venda();
            obj.setIdNota(Integer.parseInt(tblSintetico.getValueAt(linhaSelecionada, 0).toString() + ""));

            //Chamar o banco de dedados passando o numero da nota
            ArrayList<Venda> lista = VendasDAO.listaAnalitico(obj);
            DefaultTableModel modelo = (DefaultTableModel) tblAnalitico.getModel();

            //Limpar a tabela
            modelo.setRowCount(0);
            //Atualizar ou Preencher tabela
            for (Venda item : lista) {
                modelo.addRow(new String[]{
                    String.valueOf(item.getIdProd()),
                    String.valueOf(item.getQtdProd()),
                    String.valueOf(item.getValorUnid()),});
                valorTotalanalitico += (item.getQtdProd() * item.getValorUnid());
            }
            String vt = valorTotalanalitico + "";
            lblValorTotalAnalitico.setText(vt);

        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha");
        }

    }//GEN-LAST:event_tblSinteticoKeyPressed

    private void tblSinteticoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSinteticoKeyReleased
        
    }//GEN-LAST:event_tblSinteticoKeyReleased

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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRelatorio;
    private com.toedter.calendar.JDateChooser cldFinal;
    private com.toedter.calendar.JDateChooser cldInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel lblTotalPeriodo;
    private javax.swing.JLabel lblValorTotalAnalitico;
    private javax.swing.JLabel lblValorTotalSintetico;
    private javax.swing.JTable tblAnalitico;
    private javax.swing.JTable tblSintetico;
    // End of variables declaration//GEN-END:variables
}

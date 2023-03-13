
import SQL.DAO.ProdutoDAO;
import cadastro.model.Produto;
import com.toedter.calendar.JDateChooser;
import javax.swing.JOptionPane;

        
/**
 * Essa tela pega os dados do produto para fazer o cadastro de informações com GRUD na tela ProdutoDAO
 *@author Wallace Wagner, Rafael de Souza, Semaías de Oliveira
 * 
 */
public class CadastroProduto extends javax.swing.JFrame {
    
    Produto objCadastroProduto = null;

    /**
     * Creates new form CadastroProduto
     */
    public CadastroProduto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public CadastroProduto(Produto obj) {
        initComponents();
        this.objCadastroProduto = obj;

        //Atribuindo os valores do objeto aos campos do formulário
        //this.lblID.setText(String.valueOf(obj.getIdCliente()));
        this.txtNomeProd.setText(String.valueOf(obj.getNomeProd()));
        this.txtPrecoProd.setText(String.valueOf(obj.getPrecoProd()));
        this.txtTipoProd.setText(String.valueOf(obj.getTipoProd()));
        this.cbxTamanhoProd.setSelectedItem(String.valueOf(obj.getTamanhoProd()));
        this.cbxMarcaProd.setSelectedItem(String.valueOf(obj.getMarcaProd()));
        this.txtQtdProd.setText(String.valueOf(obj.getQuantidadeProd()));
        this.txtDescricaoProd.setText(String.valueOf(obj.getDescricaoProd()));

    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnInserirProd = new javax.swing.JButton();
        btnConsultaProd = new javax.swing.JButton();
        btnAlterarProd = new javax.swing.JButton();
        btnExcluirProd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDescricaoProd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNomeProd = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtQtdProd = new javax.swing.JFormattedTextField();
        txtTipoProd = new javax.swing.JTextField();
        cbxMarcaProd = new javax.swing.JComboBox<>();
        cbxTamanhoProd = new javax.swing.JComboBox<>();
        txtPrecoProd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Produto");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTOQUE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnInserirProd.setText("INSERIR");
        btnInserirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirProdActionPerformed(evt);
            }
        });

        btnConsultaProd.setText("CONSULTAR");
        btnConsultaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaProdActionPerformed(evt);
            }
        });

        btnAlterarProd.setText("ALTERAR");
        btnAlterarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdActionPerformed(evt);
            }
        });

        btnExcluirProd.setText("EXCLUIR");
        btnExcluirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tipo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tamanho:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Marca/Fabricante:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Descrição:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Quantidade:");

        txtNomeProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Preço:");

        cbxMarcaProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Nike", "Adidas", "Asics", "Puma", "Fila", "New Balance", "Olympikus" }));

        cbxTamanhoProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "PP", "M", "G", "GG", "XG", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescricaoProd)
                            .addComponent(txtNomeProd, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                            .addComponent(txtQtdProd)
                            .addComponent(txtTipoProd)
                            .addComponent(cbxMarcaProd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxTamanhoProd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecoProd)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExcluirProd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultaProd)
                        .addGap(23, 23, 23)
                        .addComponent(btnInserirProd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterarProd, btnConsultaProd, btnExcluirProd, btnInserirProd});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrecoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(cbxTamanhoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxMarcaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtQtdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricaoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirProd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserirProd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterarProd, btnConsultaProd, btnExcluirProd, btnInserirProd});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDescricaoProd, txtNomeProd});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarProdActionPerformed

    private void txtNomeProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdActionPerformed

    private void btnInserirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirProdActionPerformed
        
        //Preparando objeto para novo cadastro no banco de dados
        if (this.objCadastroProduto == null) {
            // nome, preço, tipo, tamanho, marca, quantidade, descrição
            String nomeProd = (txtNomeProd.getText());
            double precoProd = Double.parseDouble(txtPrecoProd.getText() +"");
            String tipoProd = (txtTipoProd.getText());
            String tamanhoProd = String.valueOf(cbxTamanhoProd.getSelectedItem());
            String marcaProd = String.valueOf(cbxMarcaProd.getSelectedItem());
            int quantidadeProd= Integer.parseInt(txtQtdProd.getText()+"");
            String descricaoProd= (txtDescricaoProd.getText());
            
            //Validando se o tamanho foi Selecionado.
            if (tamanhoProd.equals("Selecione...")) {
                tamanhoProd = null;
            }
            
            //Conferindo de o Usuário inseriu Nome, CPF, Data de Nascimento antes de chamar o DAO.
            if (nomeProd != null && precoProd > 0 && tamanhoProd != null && quantidadeProd > 0) {

                objCadastroProduto = new Produto(nomeProd, precoProd, tipoProd,
                        tamanhoProd, marcaProd, quantidadeProd, descricaoProd);
                boolean retorno = ProdutoDAO.salvar(objCadastroProduto);
                if (retorno) {
                    JOptionPane.showMessageDialog(this, "Produto adicionado ao estoque!");
                    objCadastroProduto = null;
                } else {
                    JOptionPane.showMessageDialog(this, "Ops! Parece que o estoquista esta de folga!");
                    objCadastroProduto = null;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Digite o Nome, CPF e \n Informe a Data de Nascimento!");
                objCadastroProduto = null;
            }
        }
    }//GEN-LAST:event_btnInserirProdActionPerformed

    private void btnExcluirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirProdActionPerformed

    private void btnConsultaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaProdActionPerformed
        TelaConsultaProduto consulta = new TelaConsultaProduto();
        consulta.setVisible(true);
    }//GEN-LAST:event_btnConsultaProdActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProd;
    private javax.swing.JButton btnConsultaProd;
    private javax.swing.JButton btnExcluirProd;
    private javax.swing.JButton btnInserirProd;
    private javax.swing.JComboBox<String> cbxMarcaProd;
    private javax.swing.JComboBox<String> cbxTamanhoProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDescricaoProd;
    private javax.swing.JFormattedTextField txtNomeProd;
    private javax.swing.JTextField txtPrecoProd;
    private javax.swing.JFormattedTextField txtQtdProd;
    private javax.swing.JTextField txtTipoProd;
    // End of variables declaration//GEN-END:variables
}

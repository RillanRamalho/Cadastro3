import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.FlowLayout;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTextPane;
import javax.swing.JList;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

import Acesso.ProdutoAcesso;
import Controle.ControleProduto;
import Entidade.ProdutoEntidade;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;;
public class CadastroProd extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel panel; 
	private JButton btnNovo;
	private JButton btnSalvar;
	private JButton btnEditar;
	private JButton btnCancelar;
	private JButton btnExcluir;
	private JButton btnFechar;
	private JPanel contentPane;
	private JTextField textCod;
	private JTextField textProduto;
	private JTextField textPreco;
	private JTextField textEstoque;
	private JComboBox cBoxFornecedor;
	private JLabel lblEstoque;
	private JLabel lblPreco;
	private JLabel lblProduto;
	private JLabel lblCadastroProduto;
	private JLabel lblCodigo;
	private JLabel data;
	private JScrollBar scrollBar;
	private JPanel lista;
	Locale localBR = new Locale("pt", "BR");
	
	ProdutoAcesso acesso = new ProdutoAcesso();
	ProdutoEntidade entidade = new ProdutoEntidade();
	ControleProduto controle = new ControleProduto();
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
				CadastroProd frame = new CadastroProd();
				frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
}
	

	public CadastroProd() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblCadastroProduto = new JLabel("Cadastro Produto");
		lblCadastroProduto.setFont(new Font("Arial", Font.BOLD, 16));
		lblCadastroProduto.setForeground(new Color(0, 0, 0));
		lblCadastroProduto.setBounds(214, 11, 143, 20);
		contentPane.add(lblCadastroProduto);

		panel = new JPanel();
		panel.setBounds(10, 42, 533, 358);
		contentPane.add(panel);
		panel.setLayout(null);

		lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setBounds(10, 11, 46, 14);
		panel.add(lblCodigo);

		textCod = new JTextField();
		textCod.setBounds(91, 8, 432, 20);
		panel.add(textCod);
		textCod.setColumns(10);

		lblProduto = new JLabel("Produto:");
		lblProduto.setBounds(10, 48, 71, 14);
		panel.add(lblProduto);

		textProduto = new JTextField();
		textProduto.setColumns(10);
		textProduto.setBounds(91, 45, 432, 20);
		panel.add(textProduto);

		lblEstoque = new JLabel("Quantidade:");
		lblEstoque.setBounds(10, 84, 78, 14);
		panel.add(lblEstoque);

		textEstoque = new JTextField();
		textEstoque.setBounds(91, 81, 432, 20);
		panel.add(textEstoque);
		textEstoque.setColumns(10);

		lblPreco = new JLabel("Pre\u00E7o:");
		lblPreco.setBounds(10, 118, 46, 14);
		panel.add(lblPreco);

		JLabel lblFornecedor = new JLabel("Fornecedor:");
		lblFornecedor.setBounds(10, 154, 78, 14);
		panel.add(lblFornecedor);

		cBoxFornecedor = new JComboBox();
		cBoxFornecedor.setBounds(91, 151, 432, 20);
		panel.add(cBoxFornecedor);

		btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}	
		});
		btnNovo.setBounds(22, 205, 89, 23);
		panel.add(btnNovo);

		JButton btnEditar = new JButton("Editar\r\n");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
								
			}
		});
		btnEditar.setBounds(121, 205, 89, 23);
		panel.add(btnEditar);

		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			entidade.setProduto(textProduto.getText());
			entidade.setEstoque(Integer.parseInt(textEstoque.getText()));
			entidade.setPreco(Double.parseDouble(textPreco.getText()));
			entidade.getFornecedor();
			controle.salvar(entidade);
			}

		});
		btnSalvar.setBounds(220, 205, 89, 23);
		panel.add(btnSalvar);

		btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entidade.setProduto(textProduto.getText());
				entidade.setEstoque(Integer.parseInt(textEstoque.getText()));
				entidade.setPreco(Double.parseDouble(textPreco.getText()));
				controle.excluir(entidade);
				textProduto.setEnabled(!true);
				textProduto.setText("");
				textPreco.setEnabled(!true);
				textPreco.setText("");
				textEstoque.setEnabled(!true);
				textEstoque.setText("");
				controle.excluir(entidade);
				JOptionPane.showMessageDialog(null,"Registro excluído com sucesso");
			}
		});
		btnExcluir.setBounds(319, 205, 89, 23);
		panel.add(btnExcluir);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnCancelar.setBounds(418, 205, 89, 23);
		panel.add(btnCancelar);
		
		textPreco = new JTextField();
		textPreco.setColumns(10);
		textPreco.setBounds(91, 115, 432, 20);
		panel.add(textPreco);
		
		scrollBar = new JScrollBar();
		scrollBar.setBounds(506, 239, 17, 108);
		panel.add(scrollBar);
		
		lista = new JPanel();
		lista.setBounds(10, 239, 497, 108);
		panel.add(lista);
				
		
		data = new JLabel("dd/mm/yy");
		data.setBounds(463, 16, 80, 14);
		contentPane.add(data);
		Date dat = new Date(System.currentTimeMillis());
		data.setText(""+dat);
		
	}
}

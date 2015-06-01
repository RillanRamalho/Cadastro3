import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JList;


public class CadastroFornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField textFornecedor;
	private JTextField textNomeFant;
	private JTextField textTel;
	private JTextField textEmail;
	private JTextField textEnd;
	private JLabel lblCadastroFornecedor;
	private JButton btnSalvar;
	private	JButton btnExcluir;
	private JButton btnCancelar;
	private JButton btnEditar;
	private JButton btnNovo;
	private JLabel lblEndereco;
	private JLabel lblEmail;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNomeFantasia;
	private JLabel lblTelefone;
	private JList listFornecedor;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFornecedor frame = new CadastroFornecedor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroFornecedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 36, 534, 356);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Fornecedor:");
		lblNewLabel.setBounds(0, 8, 73, 14);
		panel.add(lblNewLabel);
		
		lblNomeFantasia = new JLabel("Nome Fantasia:");
		lblNomeFantasia.setBounds(0, 36, 93, 14);
		panel.add(lblNomeFantasia);
		
		lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(0, 61, 73, 14);
		panel.add(lblTelefone);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setBounds(0, 86, 46, 14);
		panel.add(lblEmail);
		
		lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setBounds(0, 114, 73, 14);
		panel.add(lblEndereco);
		
		textFornecedor = new JTextField();
		textFornecedor.setBounds(103, 8, 427, 20);
		panel.add(textFornecedor);
		textFornecedor.setColumns(10);
		
		btnNovo = new JButton("Novo");
		btnNovo.setBounds(23, 208, 89, 23);
		panel.add(btnNovo);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(122, 208, 89, 23);
		panel.add(btnEditar);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(221, 208, 89, 23);
		panel.add(btnSalvar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(320, 208, 89, 23);
		panel.add(btnExcluir);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(419, 208, 89, 23);
		panel.add(btnCancelar);
		
		listFornecedor = new JList();
		listFornecedor.setBounds(10, 242, 513, 111);
		panel.add(listFornecedor);
		
		textNomeFant = new JTextField();
		textNomeFant.setColumns(10);
		textNomeFant.setBounds(103, 33, 427, 20);
		panel.add(textNomeFant);
		
		textTel = new JTextField();
		textTel.setColumns(10);
		textTel.setBounds(103, 58, 427, 20);
		panel.add(textTel);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(103, 83, 427, 20);
		panel.add(textEmail);
		
		textEnd = new JTextField();
		textEnd.setColumns(10);
		textEnd.setBounds(103, 111, 427, 20);
		panel.add(textEnd);
		
		lblCadastroFornecedor = new JLabel("Cadastro Fornecedor");
		lblCadastroFornecedor.setFont(new Font("Arial", Font.BOLD, 16));
		lblCadastroFornecedor.setBounds(184, 11, 179, 14);
		contentPane.add(lblCadastroFornecedor);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane}));
	}
}

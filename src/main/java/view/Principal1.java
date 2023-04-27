package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControladorDocente;
import model.Docente;

import java.awt.GridBagLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.util.List;

import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal1 extends JFrame {

	private JPanel contentPane;
	private JComboBox<Docente> jcbSeleccionar;
	private JTextField tf_filtrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal1 frame = new Principal1();
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
	public Principal1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblNewLabel_2 = new JLabel("docentes y asgnaturas");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 0;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);

		tf_filtrar = new JTextField();
		GridBagConstraints gbc_tf_filtrar = new GridBagConstraints();
		gbc_tf_filtrar.gridwidth = 2;
		gbc_tf_filtrar.insets = new Insets(0, 0, 5, 5);
		gbc_tf_filtrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_filtrar.gridx = 0;
		gbc_tf_filtrar.gridy = 1;
		contentPane.add(tf_filtrar, gbc_tf_filtrar);
		tf_filtrar.setColumns(10);

		JButton btnFiltrar = new JButton("Filtrar");
		btnFiltrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarValoresDocenteEnJComboBox();
			}
		});
		btnFiltrar.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_btnFiltrar = new GridBagConstraints();
		gbc_btnFiltrar.insets = new Insets(0, 0, 5, 0);
		gbc_btnFiltrar.gridx = 2;
		gbc_btnFiltrar.gridy = 1;
		contentPane.add(btnFiltrar, gbc_btnFiltrar);

		jcbSeleccionar = new JComboBox<Docente>();
		GridBagConstraints gbc_jcbSeleccionar = new GridBagConstraints();
		gbc_jcbSeleccionar.gridwidth = 2;
		gbc_jcbSeleccionar.insets = new Insets(0, 0, 5, 5);
		gbc_jcbSeleccionar.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbSeleccionar.gridx = 0;
		gbc_jcbSeleccionar.gridy = 2;
		contentPane.add(jcbSeleccionar, gbc_jcbSeleccionar);

		JButton btnNewButton_1 = new JButton("Cargar materias");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 2;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);

		JLabel lblNewLabel = new JLabel("Asignaturas no seleccionadas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 3;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("asignaturas seleccionadas");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 3;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JButton btnNewButton_2 = new JButton(">>");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 4;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);

		JButton btnNewButton_3 = new JButton(">");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 1;
		gbc_btnNewButton_3.gridy = 5;
		contentPane.add(btnNewButton_3, gbc_btnNewButton_3);

		JButton btnNewButton_4 = new JButton("<");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 1;
		gbc_btnNewButton_4.gridy = 6;
		contentPane.add(btnNewButton_4, gbc_btnNewButton_4);

		JButton btnNewButton_5 = new JButton("<<");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 1;
		gbc_btnNewButton_5.gridy = 7;
		contentPane.add(btnNewButton_5, gbc_btnNewButton_5);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 5;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 4;
		contentPane.add(panel, gbc_panel);

		JButton btnNewButton_6 = new JButton("Guardar");
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_6.gridx = 1;
		gbc_btnNewButton_6.gridy = 8;
		contentPane.add(btnNewButton_6, gbc_btnNewButton_6);

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 5;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 4;
		contentPane.add(panel_1, gbc_panel_1);
	}

	private void cargarValoresDocenteEnJComboBox() {
		// Cargamos valores dentro del combobox
		List<Docente> lista = ControladorDocente.filtrarDocente(this.tf_filtrar.getText());
		for (int i = 0; i < lista.size(); i++) {
			jcbSeleccionar.addItem(lista.get(i));
		}

	}

}

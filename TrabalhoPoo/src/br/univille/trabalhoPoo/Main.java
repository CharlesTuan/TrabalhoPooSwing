package br.univille.trabalhoPoo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Main {
	
	private static JPanel painel1, painel2;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Nova Janela");
		frame.setPreferredSize(new Dimension(300, 300));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		
		
		JMenuBar menuBar = new JMenuBar();
		
		// Cria o menu Arquivo
		JMenu menuArquivo = new JMenu("Arquivo");
		menuArquivo.setMnemonic(KeyEvent.VK_A);
		
		// Cria os itens do menu
		JMenuItem item = new JMenuItem("Sair",KeyEvent.VK_I);
		item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Fecha a tela
				//frame.setVisible(false);
				//frame.dispose();
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			}
		});
		
		
		JMenu subMenu = new JMenu("Novo");
		JMenuItem item6 = new JMenuItem("Projeto",new ImageIcon("assets/imgs/icone_folder.png"));
		JMenuItem item7 = new JMenuItem("Arquivo",new ImageIcon("assets/imgs/icone_novo.png"));

		//Submenu
		subMenu.add(item6);
		subMenu.add(item7);
		
		// Adiciona os items no menu
		menuArquivo.add(item);
		
		JMenu menuConfigs = new JMenu("Editar");
		JMenuItem checkItem = new JMenuItem("Limpar Campos");
		checkItem.setSelected(true);
		checkItem.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				JOptionPane.showMessageDialog(null, "Item selecionado? "+checkItem.isSelected());
			}
		});

		JCheckBoxMenuItem radio1 = new JCheckBoxMenuItem("Exibir Moedas");
		JCheckBoxMenuItem radio2 = new JCheckBoxMenuItem("Exibir Temperaturas");
		JCheckBoxMenuItem radio3 = new JCheckBoxMenuItem("Exibir Comprimentos");
		radio1.setSelected(true);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);
		
		
		menuConfigs.add(checkItem);
		menuConfigs.addSeparator();
		menuConfigs.add(radio1);
		menuConfigs.add(radio2);
		menuConfigs.add(radio3);
		
		
		JMenu menu2 = new JMenu("Ajuda");
		JMenuItem item5 = new JMenuItem("Desenvolvedores");
		JMenuItem item8 = new JMenuItem("Repositório do Github");
		JMenuItem item10 = new JMenuItem("Sobre");
		
		
		
		menu2.add(item5);
		menu2.add(item8);
		menu2.add(item10);
		
		// Adicina o menu na barra
		menuBar.add(menuArquivo);
		menuBar.add(menuConfigs);
		menuBar.add(menu2);
		
		//Adiciona Menu Bar
		frame.setJMenuBar(menuBar);
		
				
		
		
///////////////////////////////////////////////////////////////////////////////////////////////,
		
		JTabbedPane tabPane = new JTabbedPane();
		tabPane.setBorder(BorderFactory.createEmptyBorder(10,10	, 10, 10));
		ImageIcon icon = new ImageIcon("assets/imgs/icone_folder.png");
		
		Color colors[] = {Color.WHITE,Color.BLUE
				,Color.DARK_GRAY,Color.YELLOW,Color.MAGENTA};
		

			tabPane.addTab("Moeda", icon,criarPainelMoeda(), "Hint do Tab ");
			painel1 = criarPanel(Color.decode("#fffccc"), "");
			JLabel label = new JLabel("De: ");
			String itens31 [] = {"Celsius","Kelvin"};
			
			JComboBox<String> comboBox = new JComboBox<String>(itens31);
			comboBox.setSelectedIndex(0);
			JLabel label20 = new JLabel("                    De: ");
			String itens131 [] = {"Kelvin","Celsius"};
			JTextField label11 = new JTextField();
			JTextField label17 = new JTextField();
			label17.setPreferredSize(new Dimension(65, 25));
			label11.setPreferredSize(new Dimension(65, 25));
			JButton botaozao = new JButton();
			botaozao.setPreferredSize(new Dimension(130, 25));
			botaozao.setText("Converter");
			
			JComboBox<String> comboBox1 = new JComboBox<String>(itens131);
			comboBox1.setSelectedIndex(0);
			painel1.setBorder(BorderFactory.createEmptyBorder(0,0, 0, 10));
			painel1.add(label);
			painel1.add(comboBox);
			painel1.add(label11);
			JPanel x = new JPanel();
			x.setPreferredSize(new Dimension(0,10));
			painel1.add(x);
			painel1.add(label20);
			painel1.add(comboBox1);
			painel1.add(label17);
			painel1.add(botaozao);
			
			tabPane.addTab("moeda", icon, painel1, "Hint do Tab ");
			painel2 = criarPanel(Color.decode("#fffccc"), "");
			
			JLabel label1 = new JLabel("De: ");
			tabPane.addTab("moeda", icon, painel2, "Hint do Tab ");
			String itens310 [] = {"Metro","Milimetro"};
			JComboBox<String> comboBox34 = new JComboBox<String>(itens310);
			comboBox.setSelectedIndex(0);
			JLabel label202 = new JLabel("                    De: ");
			String itens1310 [] = {"Milimetro","Metro"};
			JTextField label110 = new JTextField();
			JTextField label170 = new JTextField();
			label170.setPreferredSize(new Dimension(65, 25));
			label110.setPreferredSize(new Dimension(65, 25));
			JButton botaozaoo = new JButton();
			botaozaoo.setPreferredSize(new Dimension(130, 25));
			botaozaoo.setText("Converter");
			
			JComboBox<String> comboBox12 = new JComboBox<String>(itens1310);
			comboBox1.setSelectedIndex(0);
			painel2.setBorder(BorderFactory.createEmptyBorder(0,0, 0, 10));
			painel2.add(label1);
			painel2.add(comboBox34);
			painel2.add(label110);
			JPanel xy = new JPanel();
			xy.setPreferredSize(new Dimension(0,10));
			painel2.add(xy);
			painel2.add(label202);
			painel2.add(comboBox12);
			painel2.add(label170);
			painel2.add(botaozaoo);
		
		
		// Adiciona o painel na janela
		frame.add(tabPane);
		frame.pack();
		
		frame.show();

	}
	
	private static JPanel criarPainelMoeda() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("De: ");
		String itens [] = {"Real","Dollar","Euro"};
		
		JComboBox<String> comboBox = new JComboBox<String>(itens);
		comboBox.setSelectedIndex(0);
		JLabel label20 = new JLabel("                    De: ");
		String itens1 [] = {"Real","Dollar","Euro"};
		JTextField label11 = new JTextField();
		JTextField label17 = new JTextField();
		label17.setPreferredSize(new Dimension(65, 25));
		label11.setPreferredSize(new Dimension(65, 25));
		JButton botaozao = new JButton();
		botaozao.setPreferredSize(new Dimension(130, 25));
		botaozao.setText("Converter");
		
		JComboBox<String> comboBox1 = new JComboBox<String>(itens1);
		comboBox1.setSelectedIndex(0);
		panel.setBorder(BorderFactory.createEmptyBorder(0,0, 0, 10));
		panel.add(label);
		panel.add(comboBox);
		panel.add(label11);
		JPanel x = new JPanel();
		x.setPreferredSize(new Dimension(0,10));
		panel.add(x);
		panel.add(label20);
		panel.add(comboBox1);
		panel.add(label17);
		panel.add(botaozao);
		return panel;
	}
	
	
	// Cria um painel com a cor de fundo e um label
    private static JPanel criarPanel(Color color, String texto) {
    	JPanel panel = new JPanel();
    	panel.setToolTipText(texto);
    	panel.setBackground(color);
    	panel.add(new JLabel(texto));
    	panel.setPreferredSize(new Dimension(100, 200));
    	// Configura um tamanho padrao do painel
    	return panel;
    }
		

	}
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Console;

public class Choose {

	public JFrame frame;
	private JTextField txtCars;
	private JTextField txtEngines;
	private JList list_1;
	private JButton btnCreate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Choose window = new Choose();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Choose() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.focus"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		String [] Cars ={"Auris","Jazz","Mercedes"};
		String [] Engines = {"1400","1600","1800"};
		
		JList list = new JList(Cars);
		list.setBackground(Color.LIGHT_GRAY);
		list.setFont(new Font("Dialog", Font.BOLD, 16));
		list.setForeground(Color.RED);
		list.setBounds(26, 92, 126, 145);
		frame.getContentPane().add(list);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		txtCars = new JTextField();
		txtCars.setFont(new Font("Century Schoolbook L", Font.BOLD | Font.ITALIC, 20));
		txtCars.setForeground(Color.ORANGE);
		txtCars.setBackground(SystemColor.activeCaption);
		txtCars.setEditable(false);
		txtCars.setText("Cars");
		txtCars.setBounds(26, 37, 114, 35);
		frame.getContentPane().add(txtCars);
		txtCars.setColumns(10);
		
		txtEngines = new JTextField();
		txtEngines.setText("Engines");
		txtEngines.setForeground(Color.ORANGE);
		txtEngines.setFont(new Font("Century Schoolbook L", Font.BOLD | Font.ITALIC, 20));
		txtEngines.setEditable(false);
		txtEngines.setColumns(10);
		txtEngines.setBackground(SystemColor.activeCaption);
		txtEngines.setBounds(283, 37, 114, 35);
		frame.getContentPane().add(txtEngines);
		
		list_1 = new JList(Engines);
		list_1.setBackground(Color.LIGHT_GRAY);
		list_1.setForeground(Color.RED);
		list_1.setBounds(293, 95, 114, 142);
		frame.getContentPane().add(list_1);
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		btnCreate = new JButton("    CREATE");
		btnCreate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String engine = (String) list_1.getSelectedValue();
				String car = (String) list.getSelectedValue();
				if(car != null && engine != null){
					Creator c = new Creator(engine, car);
					Main m = new Main(c.getCar());
					frame.setVisible(false);
					m.frame.setVisible(true);
				}
				else{
					JOptionPane.showMessageDialog(frame, "Please check your choose !!!");
				}
				
			}
		});
		btnCreate.setBounds(283, 249, 117, 35);
		frame.getContentPane().add(btnCreate);
		
	}
}

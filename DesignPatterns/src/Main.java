import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Checkbox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class Main {

	public JFrame frame;
	private JTextField txtModel;
	private JTextField txtMaxSpeed;
	private JTextField txtCost;
	private Car car;
	private JLabel lblSpeed;
	private JLabel lblCost;
	private JLabel lblNewLabel;
	private JTextField txtAcceleration;
	private JLabel lblAcc;
	private JTextField txtBrake;
	private JLabel lblBrake;
	private JTextField txtOptions;
	private JTextField txtEngineVol;
	private JLabel lblVolume;
	private JLabel lblExit;
	private JLabel lblBack;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public Main(Car c) {
		car = c;
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

		txtModel = new JTextField();
		txtModel.setForeground(Color.RED);
		txtModel.setFont(new Font("FreeSans", Font.BOLD, 12));
		txtModel.setBackground(Color.LIGHT_GRAY);
		txtModel.setEditable(false);
		txtModel.setText("Model:");
		txtModel.setBounds(12, 35, 81, 19);
		frame.getContentPane().add(txtModel);
		txtModel.setColumns(10);

		txtMaxSpeed = new JTextField();
		txtMaxSpeed.setForeground(Color.RED);
		txtMaxSpeed.setFont(new Font("FreeSans", Font.BOLD, 12));
		txtMaxSpeed.setBackground(Color.LIGHT_GRAY);
		txtMaxSpeed.setEditable(false);
		txtMaxSpeed.setText("Max Speed:");
		txtMaxSpeed.setBounds(12, 61, 81, 19);
		frame.getContentPane().add(txtMaxSpeed);
		txtMaxSpeed.setColumns(10);

		txtCost = new JTextField();
		txtCost.setForeground(Color.RED);
		txtCost.setFont(new Font("FreeSans", Font.BOLD, 12));
		txtCost.setBackground(Color.LIGHT_GRAY);
		txtCost.setText("Cost:");
		txtCost.setEditable(false);
		txtCost.setColumns(10);
		txtCost.setBounds(12, 93, 81, 19);
		frame.getContentPane().add(txtCost);

		JLabel lblModel = new JLabel(car.model);
		lblModel.setBounds(100, 35, 90, 19);
		frame.getContentPane().add(lblModel);

		lblSpeed = new JLabel(Double.toString(car.maxSpeed) + "km/h");
		lblSpeed.setBounds(100, 62, 70, 17);
		frame.getContentPane().add(lblSpeed);

		lblCost = new JLabel("$" + Double.toString(car.cost()));
		lblCost.setBounds(100, 95, 70, 15);
		frame.getContentPane().add(lblCost);
		ImageIcon icon = new ImageIcon(car.display());
		lblNewLabel = new JLabel(icon);
		lblNewLabel.setBounds(248, 79, 115, 111);
		frame.getContentPane().add(lblNewLabel);

		txtAcceleration = new JTextField();
		txtAcceleration.setText("Acceleration:");
		txtAcceleration.setForeground(Color.RED);
		txtAcceleration.setFont(new Font("FreeSans", Font.BOLD, 12));
		txtAcceleration.setEditable(false);
		txtAcceleration.setColumns(10);
		txtAcceleration.setBackground(Color.LIGHT_GRAY);
		txtAcceleration.setBounds(12, 124, 81, 19);
		frame.getContentPane().add(txtAcceleration);

		lblAcc = new JLabel(car.accelerate());
		lblAcc.setBounds(100, 126, 70, 15);
		frame.getContentPane().add(lblAcc);

		txtBrake = new JTextField();
		txtBrake.setText("Brake:");
		txtBrake.setForeground(Color.RED);
		txtBrake.setFont(new Font("FreeSans", Font.BOLD, 12));
		txtBrake.setEditable(false);
		txtBrake.setColumns(10);
		txtBrake.setBackground(Color.LIGHT_GRAY);
		txtBrake.setBounds(12, 158, 81, 19);
		frame.getContentPane().add(txtBrake);

		lblBrake = new JLabel(car.brake());
		lblBrake.setBounds(100, 160, 70, 15);
		frame.getContentPane().add(lblBrake);

		Checkbox checkbox = new Checkbox("Sunroof");

		checkbox.setBackground(Color.WHITE);
		checkbox.setFont(new Font("Dialog", Font.BOLD, 12));
		checkbox.setForeground(Color.BLUE);
		checkbox.setBounds(183, 228, 115, 23);
		frame.getContentPane().add(checkbox);

		Checkbox checkbox_1 = new Checkbox("ParkingSensor");
		checkbox_1.setForeground(Color.BLUE);
		checkbox_1.setFont(new Font("Dialog", Font.BOLD, 12));
		checkbox_1.setBackground(Color.WHITE);
		checkbox_1.setBounds(304, 228, 135, 23);
		frame.getContentPane().add(checkbox_1);
		
		Checkbox checkbox_2 = new Checkbox("Steel Rİm");
		checkbox_2.setFont(new Font("Dialog", Font.BOLD, 12));
		checkbox_2.setForeground(Color.BLUE);
		checkbox_2.setBackground(Color.WHITE);
		checkbox_2.setBounds(248, 196, 115, 23);
		frame.getContentPane().add(checkbox_2);
		

		txtOptions = new JTextField();
		txtOptions.setEditable(false);
		txtOptions.setBackground(Color.LIGHT_GRAY);
		txtOptions.setForeground(Color.RED);
		txtOptions.setFont(new Font("FreeSans", Font.BOLD, 12));
		txtOptions.setText("Options:");
		txtOptions.setBounds(12, 216, 70, 19);
		frame.getContentPane().add(txtOptions);
		txtOptions.setColumns(10);
		txtOptions.setVisible(false);
		
		JTextArea txtrOptions = new JTextArea();
		txtrOptions.setFont(new Font("Dialog", Font.BOLD, 12));
		txtrOptions.setBackground(UIManager.getColor("Button.focus"));
		txtrOptions.setText("Options");
		txtrOptions.setBounds(100, 218, 100, 82);
		frame.getContentPane().add(txtrOptions);
		txtrOptions.setVisible(false);
		txtrOptions.setLineWrap(true);
		txtrOptions.setWrapStyleWord(true);


		JButton btnAdd = new JButton("       Add");
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!check(checkbox,checkbox_1,checkbox_2)){
					JOptionPane.showMessageDialog(frame, "Please check one of them !!!");
				}
				if(checkbox.getState()){
					car = new Sunroof(car);
					checkbox.setVisible(false);
					checkbox.setState(false);
					lblCost.setText("$"+Double.toString(car.cost()));
					txtOptions.setVisible(true);
					txtrOptions.setVisible(true);
					txtrOptions.setText(car.properties());
					
				}
				if(checkbox_1.getState()){
					car = new ParkSensor(car);
					checkbox_1.setVisible(false);
					checkbox_1.setState(false);
					lblCost.setText("$"+Double.toString(car.cost()));
					txtOptions.setVisible(true);
					txtrOptions.setVisible(true);
					txtrOptions.setText(car.properties());
				}
				
				if(checkbox_2.getState()){
					car = new SteelRim(car);
					checkbox_2.setVisible(false);
					checkbox_2.setState(false);
					lblCost.setText("$"+Double.toString(car.cost()));
					txtOptions.setVisible(true);
					txtrOptions.setVisible(true);
					txtrOptions.setText(car.properties());
				}
				
				if(fullAdded(checkbox,checkbox_1,checkbox_2)){
					btnAdd.setVisible(false);
				}

			}
		});
		btnAdd.setBounds(304, 257, 117, 25);
		frame.getContentPane().add(btnAdd);
		
		txtEngineVol = new JTextField();
		txtEngineVol.setEditable(false);
		txtEngineVol.setBackground(Color.LIGHT_GRAY);
		txtEngineVol.setFont(new Font("FreeSans", Font.BOLD, 12));
		txtEngineVol.setForeground(Color.RED);
		txtEngineVol.setText("Engine Vol:");
		txtEngineVol.setBounds(12, 189, 81, 19);
		frame.getContentPane().add(txtEngineVol);
		txtEngineVol.setColumns(10);
		
		lblVolume = new JLabel(car.setMotor());
		lblVolume.setBounds(100, 191, 70, 15);
		frame.getContentPane().add(lblVolume);
		
		lblExit = new JLabel("Exit");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblExit.setIcon(new ImageIcon("C:/Users/Z/workspace/DesignPatterns/exit.png"));
		lblExit.setBounds(375, 101, 64, 64);
		frame.getContentPane().add(lblExit);
		
		lblBack = new JLabel("");
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Choose window = new Choose();
				frame.setVisible(false);
				window.frame.setVisible(true);
			}
		});
		lblBack.setIcon(new ImageIcon("C:/Users/Z/workspace/DesignPatterns/back.png"));
		lblBack.setBounds(12, 0, 39, 23);
		frame.getContentPane().add(lblBack);
		
		
		
		
		
		
		
	}

	boolean check(Checkbox checkbox, Checkbox checkbox_1,Checkbox checkbox_2) {
		return (checkbox.getState() || checkbox_1.getState() || checkbox_2.getState());
	}
	
	boolean fullAdded(Checkbox checkbox, Checkbox checkbox_1,Checkbox checkbox_2) {
		return !(checkbox.isVisible()||checkbox_1.isVisible()||checkbox_2.isVisible());
	}
}

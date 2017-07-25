package Calculators;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator {

	private JFrame frmBasicCalculator;
	private JTextField textField;
	
	double firstNum;
	double secNum;
	String oper;
	double result;
	boolean cptON = false;
	boolean bgnON = false;
	double pmt;
	double iPerY;
	double n;
	double pv;
	double fv=0;
	double k=1;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmBasicCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
	
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBasicCalculator = new JFrame();
		frmBasicCalculator.getContentPane().setBackground(new Color(128, 128, 128));
		frmBasicCalculator.setBackground(new Color(175, 238, 238));
		frmBasicCalculator.setForeground(Color.CYAN);
		frmBasicCalculator.setResizable(false);
		frmBasicCalculator.setTitle("Time Value Of Money Calculator");
		frmBasicCalculator.setBounds(100, 100, 405, 404);
		frmBasicCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBasicCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 240));
		textField.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		textField.setBounds(10, 11, 285, 53);
		frmBasicCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		final JButton btn1 = new JButton("1");
		btn1.setBackground(Color.ORANGE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumb = textField.getText() + btn1.getText();
				textField.setText(enterNumb);
			}
		});
		btn1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		btn1.setBounds(10, 75, 89, 28);
		frmBasicCalculator.getContentPane().add(btn1);
		
		final JButton btn2 = new JButton("2");
		btn2.setBackground(Color.ORANGE);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumb = textField.getText() + btn2.getText();
				textField.setText(enterNumb);
			}
		});
		btn2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		btn2.setBounds(109, 75, 89, 28);
		frmBasicCalculator.getContentPane().add(btn2);
		
		final JButton btn3 = new JButton("3");
		btn3.setBackground(Color.ORANGE);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumb = textField.getText() + btn3.getText();
				textField.setText(enterNumb);
			}
		});
		btn3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		btn3.setBounds(208, 75, 89, 28);
		frmBasicCalculator.getContentPane().add(btn3);
		
		final JButton btn4 = new JButton("4");
		btn4.setBackground(Color.ORANGE);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumb = textField.getText() + btn4.getText();
				textField.setText(enterNumb);
			}
		});
		btn4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		btn4.setBounds(10, 115, 89, 28);
		frmBasicCalculator.getContentPane().add(btn4);
		
		final JButton btn5 = new JButton("5");
		btn5.setBackground(Color.ORANGE);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumb = textField.getText() + btn5.getText();
				textField.setText(enterNumb);
			}
		});
		btn5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		btn5.setBounds(109, 115, 89, 28);
		frmBasicCalculator.getContentPane().add(btn5);
		
		final JButton btn6 = new JButton("6");
		btn6.setBackground(Color.ORANGE);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumb = textField.getText() + btn6.getText();
				textField.setText(enterNumb);
			}
		});
		btn6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		btn6.setBounds(208, 115, 89, 28);
		frmBasicCalculator.getContentPane().add(btn6);
		
		final JButton btn7 = new JButton("7");
		btn7.setBackground(Color.ORANGE);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumb = textField.getText() + btn7.getText();
				textField.setText(enterNumb);
			}
		});
		btn7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		btn7.setBounds(10, 155, 89, 28);
		frmBasicCalculator.getContentPane().add(btn7);
		
		final JButton btn8 = new JButton("8");
		btn8.setBackground(Color.ORANGE);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumb = textField.getText() + btn8.getText();
				textField.setText(enterNumb);
			}
		});
		btn8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		btn8.setBounds(109, 155, 89, 28);
		frmBasicCalculator.getContentPane().add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.setBackground(Color.ORANGE);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumb = textField.getText() + btn9.getText();
				textField.setText(enterNumb);
			}
		});
		btn9.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		btn9.setBounds(208, 155, 89, 28);
		frmBasicCalculator.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(Color.PINK);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				oper = "+";
			}
		});
		btnPlus.setFont(new Font("SansSerif", Font.PLAIN, 20));
		btnPlus.setBounds(10, 194, 89, 35);
		frmBasicCalculator.getContentPane().add(btnPlus);
		
		JButton btnMul = new JButton("*");
		btnMul.setBackground(Color.PINK);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				oper = "*";
			}
		});
		btnMul.setFont(new Font("SansSerif", Font.BOLD, 19));
		btnMul.setBounds(208, 240, 89, 35);
		frmBasicCalculator.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBackground(Color.PINK);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				oper = "/";
			}
		});
		btnDiv.setFont(new Font("SansSerif", Font.PLAIN, 20));
		btnDiv.setBounds(10, 240, 89, 35);
		frmBasicCalculator.getContentPane().add(btnDiv);
		
		final JButton btnDot = new JButton(".");
		btnDot.setBackground(Color.PINK);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumb = textField.getText() + btnDot.getText();
				textField.setText(enterNumb);
			}
		});
		btnDot.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnDot.setBounds(109, 240, 89, 35);
		frmBasicCalculator.getContentPane().add(btnDot);
		
		final JButton btnZero = new JButton("0");
		btnZero.setBackground(Color.ORANGE);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterNumb = textField.getText() + btnZero.getText();
				textField.setText(enterNumb);
			}
		});
		btnZero.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		btnZero.setBounds(109, 194, 89, 35);
		frmBasicCalculator.getContentPane().add(btnZero);
		
		JButton btnAns = new JButton("=");
		btnAns.setBackground(new Color(0, 255, 255));
		btnAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ans;
				
				secNum = Double.parseDouble(textField.getText());
				if(oper=="+"){
					result = firstNum + secNum;
					ans = String.format("%.2f", result);
					textField.setText(ans);
				}
				else if(oper=="-"){
					result = firstNum - secNum;
					ans = String.format("%.2f", result);
					textField.setText(ans);
				}
				else if(oper=="/"){
					result = firstNum / secNum;
					ans = String.format("%.2f", result);
					textField.setText(ans);
				}
				else if(oper=="*"){
					result = firstNum * secNum;
					ans = String.format("%.2f", result);
					textField.setText(ans);
				}
				
			}
		});
		btnAns.setFont(new Font("SansSerif", Font.PLAIN, 20));
		btnAns.setBounds(10, 329, 192, 36);
		frmBasicCalculator.getContentPane().add(btnAns);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setBackground(new Color(255, 240, 245));
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if(textField.getText().length() > 0 ){
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		btnBackSpace.setBounds(300, 15, 89, 34);
		frmBasicCalculator.getContentPane().add(btnBackSpace);
		
		JButton button = new JButton("-");
		button.setBackground(Color.PINK);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				oper = "-";
			}
		});
		button.setFont(new Font("SansSerif", Font.PLAIN, 20));
		button.setBounds(208, 194, 89, 35);
		frmBasicCalculator.getContentPane().add(button);
		
		JButton btnAC = new JButton("Clear");
		btnAC.setBackground(new Color(211, 211, 211));
		btnAC.setFont(new Font("SansSerif", Font.PLAIN, 17));
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				k=1;
				fv=0;
			}
		});
		btnAC.setBounds(307, 72, 82, 35);
		frmBasicCalculator.getContentPane().add(btnAC);
		
		JButton btnRate = new JButton("I/Y");
		btnRate.setBackground(new Color(152, 251, 152));
		btnRate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iPerY = (Double.parseDouble(textField.getText()))/100.0;
				textField.setText("");
				
				
			}
		});
		btnRate.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnRate.setBounds(307, 241, 82, 35);
		frmBasicCalculator.getContentPane().add(btnRate);
		
		JButton btnN = new JButton("N");
		btnN.setBackground(new Color(152, 251, 152));
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				n = Double.parseDouble(textField.getText());
				textField.setText("");
			}
		});
		btnN.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnN.setBounds(307, 195, 82, 35);
		frmBasicCalculator.getContentPane().add(btnN);
		
		JButton btnPV = new JButton("PV");
		btnPV.setBackground(new Color(152, 251, 152));
		btnPV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cptON==false){
				pv = Double.parseDouble(textField.getText());
				textField.setText("");}
				else if(cptON==true){
					pv = ((pmt*k)/iPerY - fv)*(Math.pow(1+iPerY, -n)) - ((pmt*k)/iPerY);
					textField.setText(Double.toString(pv));
				}
			}
		});
		btnPV.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnPV.setBounds(307, 152, 82, 35);
		frmBasicCalculator.getContentPane().add(btnPV);
		
		JButton btnFV = new JButton("FV");
		btnFV.setBackground(new Color(152, 251, 152));
		btnFV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cptON==true){
					 fv = ((pmt*k)/iPerY) - (Math.pow((1+iPerY), n)*(pv+((pmt*k)/iPerY)));
					textField.setText(Double.toString(fv));
				}else{
					fv = Double.parseDouble(textField.getText());
					textField.setText("");
				}
			}
		});
		btnFV.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnFV.setBounds(307, 284, 82, 35);
		frmBasicCalculator.getContentPane().add(btnFV);
		
		JButton btnPMT = new JButton("PMT");
		btnPMT.setBackground(new Color(152, 251, 152));
		btnPMT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cptON==false){
					pmt = Double.parseDouble(textField.getText());
					textField.setText("");
				}else if(cptON==true){
				double payment = pmt(pv,n,iPerY,fv,k);
				textField.setText(Double.toString(payment));
				}
			}
		});
		btnPMT.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnPMT.setBounds(307, 330, 82, 35);
		frmBasicCalculator.getContentPane().add(btnPMT);
		
		JButton btnCPT = new JButton("CPT");
		btnCPT.setBackground(new Color(152, 251, 152));
		btnCPT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cptON = true;
				textField.setText("");
			}
		});
		btnCPT.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnCPT.setBounds(208, 330, 89, 35);
		frmBasicCalculator.getContentPane().add(btnCPT);
		
		JButton btnBgn = new JButton("BGN");
		btnBgn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bgnON=true;
				k=1+iPerY;
			}
		});
		btnBgn.setBackground(new Color(152, 251, 152));
		btnBgn.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnBgn.setBounds(307, 112, 82, 35);
		frmBasicCalculator.getContentPane().add(btnBgn);
		
		JButton btnNcr = new JButton("nCr");
		btnNcr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNcr.setBackground(new Color(152, 251, 152));
		btnNcr.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnNcr.setBounds(109, 283, 89, 35);
		frmBasicCalculator.getContentPane().add(btnNcr);
		
		JButton btnNpr = new JButton("nPr");
		btnNpr.setBackground(new Color(152, 251, 152));
		btnNpr.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnNpr.setBounds(10, 283, 89, 35);
		frmBasicCalculator.getContentPane().add(btnNpr);
		
		JButton button_1 = new JButton("INV");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double show = 1/Double.parseDouble(textField.getText());
				textField.setText(Double.toString(show));
			}
		});
		button_1.setBackground(new Color(152, 251, 152));
		button_1.setFont(new Font("SansSerif", Font.PLAIN, 18));
		button_1.setBounds(208, 283, 89, 35);
		frmBasicCalculator.getContentPane().add(button_1);
		
	}

	protected double pmt(double pv2, double n2, double iPerY2, double fv2, double k2) {

		
		double monPay = (pv2 + ((pv2+fv2)/(Math.pow((1+iPerY2), n2)-1)))*((-iPerY2)/k2);
		return monPay;
	}
}

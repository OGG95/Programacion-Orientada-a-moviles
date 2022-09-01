package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

	private JPanel texto;
	private JTextField text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	double n1=0,n2=0,result=0;
	String operacion="";
	
	
	
	public Calculadora() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 514);
		texto = new JPanel();
		texto.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(texto);
		texto.setLayout(null);
		
		JButton porcentaje = new JButton("%");
		porcentaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		porcentaje.setBounds(25, 95, 66, 62);
		texto.add(porcentaje);
		
		JButton raiz = new JButton("√");
		raiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		raiz.setBounds(90, 95, 66, 62);
		texto.add(raiz);
		
		JButton elevado = new JButton("x²");
		elevado.setBounds(155, 95, 66, 62);
		texto.add(elevado);
		
		JButton sobrex = new JButton("1/X");
		sobrex.setBounds(221, 95, 66, 62);
		texto.add(sobrex);
		
		JButton ce = new JButton("CE");
		ce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(null);
			}
		});
		ce.setBounds(25, 158, 66, 62);
		texto.add(ce);
		
		JButton c = new JButton("C");
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(null);
				n1=0;
				n2=0;
			}
		});
		c.setBounds(90, 158, 66, 62);
		texto.add(c);
		
		JButton borrar = new JButton("⌫");
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(null);
			}
		});
		borrar.setBounds(155, 158, 66, 62);
		texto.add(borrar);
		
		JButton dividir = new JButton("/");
		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1= Double.parseDouble(text.getText());
				operacion ="/";
				text.setText(null);
			}
		});
		dividir.setBounds(221, 158, 66, 62);
		texto.add(dividir);
		
		JButton siete = new JButton("7");
		siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"7");
			}
		});
		siete.setBounds(25, 216, 66, 62);
		texto.add(siete);
		
		JButton ocho = new JButton("8");
		ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"8");
			}
		});
		ocho.setBounds(90, 216, 66, 62);
		texto.add(ocho);
		
		JButton nueve = new JButton("9");
		nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"9");
			}
		});
		nueve.setBounds(155, 216, 66, 62);
		texto.add(nueve);
		
		JButton multiplicar = new JButton("X");
		multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1= Double.parseDouble(text.getText());
				operacion ="*";
				text.setText(null);
			}
		});
		multiplicar.setBounds(221, 216, 66, 62);
		texto.add(multiplicar);
		
		JButton cuatro = new JButton("4");
		cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"4");
			}
			
		});
		cuatro.setBounds(25, 277, 66, 62);
		texto.add(cuatro);
		
		JButton cinco = new JButton("5");
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"5");
			}
		});
		cinco.setBounds(90, 277, 66, 62);
		texto.add(cinco);
		
		JButton seis = new JButton("6");
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"6");
			}
		});
		seis.setBounds(155, 277, 66, 62);
		texto.add(seis);
		
		JButton restar = new JButton("-");
		restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1= Double.parseDouble(text.getText());
				operacion ="-";
				text.setText(null);
			}
		});
		restar.setBounds(221, 277, 66, 62);
		texto.add(restar);
		
		JButton uno = new JButton("1");
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"1");
			}
		});
		uno.setBounds(25, 338, 66, 62);
		texto.add(uno);
		
		JButton dos = new JButton("2");
		dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"2");
			}
			
		});
		dos.setBounds(90, 338, 66, 62);
		texto.add(dos);
		
		JButton tres = new JButton("3");
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"3");
			}
		});
		tres.setBounds(155, 338, 66, 62);
		texto.add(tres);
		
		JButton sumar = new JButton("+");
		sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1= Double.parseDouble(text.getText());
				operacion ="+";
				text.setText(null);
			}
		});
		sumar.setBounds(221, 338, 66, 62);
		texto.add(sumar);
		
		JButton masMenos = new JButton("+/-");
		masMenos.setBounds(25, 400, 66, 62);
		texto.add(masMenos);
		
		JButton cero = new JButton("0");
		cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"0");
			}
		});
		cero.setBounds(90, 400, 66, 62);
		texto.add(cero);
		
		JButton coma = new JButton(",");
		coma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+".");
			}
		});
		coma.setBounds(155, 400, 66, 62);
		texto.add(coma);
		
		JButton igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacioncalc();
			}
		});
		igual.setBounds(221, 400, 66, 62);
		texto.add(igual);
		
		text = new JTextField();
		text.setEditable(false);
		text.setBounds(25, 34, 257, 50);
		texto.add(text);
		text.setColumns(10);
	}
	public void operacioncalc() {
		String msj="";
		n2= Double.parseDouble(text.getText());
		text.setText(null);
		switch(operacion) {
		case "+":
			result=n1+n2;
			break;
		case "-":
			result=n1-n2;
			break;
		case "*":
			result=n1*n2;
			break;
		case "/":
			if (n2==0) {
				msj="Error";
			}else {
				result=n1/n2;
			}
			break;
		}
		if(msj!="") {
			text.setText(msj);
		}else {
			text.setText(String.valueOf(result));
		}
	}
	
}

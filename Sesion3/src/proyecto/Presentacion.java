package proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Presentacion  extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
	private JTextField textoDecimal;
	private JTextField textoBinario;
	private JTextField textoOctal;
	private JTextField textoHexadecimal;
	
	private JLabel etiquetaDecimal;
	private JLabel etiquetaBinario;
	private JLabel etiquetaOctal;
	private JLabel etiquetaHexadecimal;
	
	private Negocio negocio;

	public static void main(String[] args) {
		new Presentacion();
	}
	
	public Presentacion() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		negocio=new Negocio();
		
		etiquetaDecimal = new JLabel( "Decimal" );
		etiquetaDecimal.setBounds(12, 16, 80, 30);
		contentPane.add(etiquetaDecimal);
		
		etiquetaBinario = new JLabel( "Binario" );
		etiquetaBinario.setBounds(12, 55, 80, 19);
		contentPane.add(etiquetaBinario);
		
		etiquetaOctal = new JLabel( "Octal" );
		etiquetaOctal.setBounds(12, 90, 65, 19);
		contentPane.add(etiquetaOctal);
		
		etiquetaHexadecimal = new JLabel( "Hexadecimal" );
		etiquetaHexadecimal.setBounds(12, 115, 80, 19);
		contentPane.add(etiquetaHexadecimal);
		
		textoDecimal = new JTextField();
		textoDecimal.setBounds(90, 16, 126, 30);
		textoDecimal.setName("Decimal");
		contentPane.add(textoDecimal);
		textoDecimal.addActionListener(this);
		
		textoBinario = new JTextField();
		textoBinario.setBounds(90, 47, 126, 30);
		textoBinario.setName("Binario");
		contentPane.add(textoBinario);
		textoBinario.addActionListener(this);
		
		textoOctal = new JTextField();
		textoOctal.setBounds(90, 78, 126, 30);
		textoOctal.setName("Octal");
		contentPane.add(textoOctal);
		textoOctal.addActionListener(this);
		
		textoHexadecimal = new JTextField();
		textoHexadecimal.setBounds(90, 108, 126, 30);
		textoHexadecimal.setName("Hexadecimal");
		contentPane.add(textoHexadecimal);
		textoHexadecimal.addActionListener(this);
		
		setResizable(false);
		setTitle("Conversion de bases");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 530, 514);
		setLocationRelativeTo( null );
		setVisible( true );
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		JTextField opcion;
		String resultadoBinario;
		String resultadoDecimal;
		String resultadoOctal;
		String resultadoHexadecimal;
		try {
			Object fuente = evt.getSource();
			if(fuente instanceof JTextField) {
				opcion=((JTextField)evt.getSource());
				switch(opcion.getName()) {
				
				case"Decimal":
					System.out.println("Decimal:" + opcion.getText());
					resultadoBinario=negocio.convierteDecimalABinario(opcion.getText());
					resultadoOctal=negocio.convierteDecimalAOctal(opcion.getText());
					resultadoHexadecimal=negocio.convierteDecimalAHexadecimal(opcion.getText());
					textoBinario.setText( resultadoBinario );
					textoOctal.setText( resultadoOctal );
					textoHexadecimal.setText( resultadoHexadecimal );
					break;
				
				case"Binario":
					System.out.println("Binario:" + opcion.getText());
					resultadoDecimal=negocio.convierteBinarioADecimal(opcion.getText());
					resultadoOctal=negocio.convierteBinarioAOctal(opcion.getText());
					resultadoHexadecimal=negocio.convierteBinarioAHexadecimal(opcion.getText());
					textoDecimal.setText( resultadoDecimal );
					textoOctal.setText( resultadoOctal );
					textoHexadecimal.setText( resultadoHexadecimal );
					
					
					break;
					
				case"Octal":
					System.out.println("Octal:" + opcion.getText());
					break;
				
				case"Hexadecimal":
					System.out.println("Hexadecimal:" + opcion.getText());
				break;
			
			}
			}
				
			
		/*	
			
			
		*/
		
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog( null, "Excepcion: "+ e.getMessage() );
			textoDecimal.setText( "" );
			textoBinario.setText( "" );
			textoHexadecimal.setText( "" );
			textoOctal.setText( "" );
		}
	}
	
	
}
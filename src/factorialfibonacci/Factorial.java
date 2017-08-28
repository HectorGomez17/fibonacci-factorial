/**
 * @author Andrés López Esquivel
 * Grupo: 5IM8.
 * Profesor: Emmanuel Oropeza.
 * @version 1.0
 * @date 17/08/17
 */

/**
 *PACKAGE 
 */
package factorialfibonacci;

/**
 * IMPORT
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *CLASE: Fibonacci
 *Descripción de la clase: Permite calcular el factorial de un número
 */
public class Factorial extends JFrame implements ActionListener {
    //VARIABLES
    JTextField ReciboNumero, EntregoNumero;
    JButton CalculoNumero;
    JLabel IntroduceNumero;
    
    int Factorial;
    int NumeroRecibido; 
    
    //Constructor
    public Factorial(){
        InicializarVentana();
        InicializarComponentes();
        Factorial = 0;
        NumeroRecibido = 0; 
    }
    
    /**
     * Método InicializarVentana
     * Descripción: Define las características de la ventana del menú
     * Tipo: void
     * Modificardor de acceso: privado
     */
    public void InicializarVentana(){
        setTitle("FACTORIAL");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setBackground(new Color(0,0,0));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    
    /**
     * Método InicializarComponentes
     * Descripción: Define las caracterísitcas de las componentes de
     * la ventana.
     * Tipo: void.
     * Modificador de acceso: privado
     */  
    public void InicializarComponentes(){
        IntroduceNumero = new JLabel("Introduce un numero: ");
        CalculoNumero = new JButton("CALCULAR");
        ReciboNumero = new JTextField ();
        EntregoNumero = new JTextField();
        
        setLayout(new BorderLayout());
        
        add(IntroduceNumero, BorderLayout.NORTH);        
        add(UbicacionCentro(), BorderLayout.CENTER);
        add(CalculoNumero, BorderLayout.SOUTH);
        
        CalculoNumero.addActionListener(this);
        
        IntroduceNumero.setVisible(true);
        CalculoNumero.setVisible(true);
        ReciboNumero.setVisible(true);
        EntregoNumero.setVisible(true);
    }
    
    /**
     * Método: UbicacionCentro
     * Descripción: Permite hacer un acomodo central de los componentes
     * indicados.
     * Tipo: JPanel
     * Modificador de acceso: private
     * @return centro: Devuelve el reacomodo central de los componentes. 
     */
    private JPanel UbicacionCentro(){
        JPanel centro = new JPanel();
        centro.setLayout(new BoxLayout(centro, BoxLayout.Y_AXIS));
        centro.add(ReciboNumero);
        centro.add(EntregoNumero);
        return centro;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == CalculoNumero){
            NumeroRecibido = Integer.parseInt(ReciboNumero.getText());
            Factorial = NumeroRecibido;
            for(int i = NumeroRecibido - 1; i >= 1; i--){
                Factorial = Factorial *  i; 
            }
            EntregoNumero.setText(String.valueOf(Factorial));
        }
    }
}//FIN DE LA CLASE

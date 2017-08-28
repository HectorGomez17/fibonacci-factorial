/**
 * @author Andrés López Esquivel
 * Grupo: 5IM8.
 * Profesor: Emmanuel Oropeza.
 * @version 1.0
 * @date 17/08/17
 */

//PACKAGE
package factorialfibonacci;

//IMPORT
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *CLASE: MenuOperaciones
 *Descripción de la clase: Muestra las operaciones disponibles dentro
 * del programa. 
 */
public class MenuOperaciones extends JFrame implements ActionListener {
    /*VARIABLES*/
    //BOTONES
    JButton BotonFibonacci, BotonFactorial;
    //LABEL
    JLabel Aviso;
    
    /**
     * Constructor
     */
    MenuOperaciones(){
        InicializarVentana();
        InicializarComponentes();
    }
    
    /**
     * Método InicializarVentana
     * Descripción: Define las características de la ventana del menú
     * Tipo: void
     * Modificardor de acceso: privado
     */
    private void InicializarVentana(){
        setTitle("Menu");
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
    private void InicializarComponentes(){
        //Inicialización de botones
        BotonFibonacci = new JButton ("FIBONACCI");
        BotonFactorial = new JButton ("FACTORIAL");
        //Inicialización de label
        Aviso = new JLabel("Escoja una operacion");
        
        //Posicionamiento de componentes
        setLayout(new BorderLayout());
        
        //Inserción de componentes al campo gráfico
        add(Aviso, BorderLayout.NORTH);
        add(AcomodoCentralBotones(), BorderLayout.CENTER);
        
        //Agregamos ActionListener a los botones
        BotonFibonacci.addActionListener(this);
        BotonFibonacci.addActionListener(this);
        
        //Habilitamos como visibles los componentes
        BotonFibonacci.setVisible(true);
        BotonFactorial.setVisible(true);
        Aviso.setVisible(true);
        
    }
    /**
     * Método: AcomodoCentralBotones
     * Descripción: Permite hacer un acomodo central de los botones indicados.
     * Tipo: JPanel
     * Modificador de acceso: private
     * @return centro: Devuelve el reacomodo central de los botones. 
     */
    private JPanel AcomodoCentralBotones(){
        JPanel centro = new JPanel();
        centro.setLayout(new BoxLayout(centro, BoxLayout.Y_AXIS));
        centro.add(BotonFibonacci);
        centro.add(BotonFactorial);
        
        return centro;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == BotonFibonacci)
        {
            //Creamos un objeto de la clase Fibonacci
            Fibonacci ObjetoFibonacci = new Fibonacci();
            ObjetoFibonacci.setVisible(true);
        }
        else if (e.getSource() == BotonFactorial)
        {
            //Creamos un objeto de la clase Factorial
            Factorial ObjetoFactorial = new Factorial();
            ObjetoFactorial.setVisible(true);            
        }
    }   
    
}//FIN DE LA CLASE

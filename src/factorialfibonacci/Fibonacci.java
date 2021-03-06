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
 *Descripción de la clase: Permite mostrar la serie de Fibonacci
 */
public class Fibonacci extends JFrame implements ActionListener {
    //VARIABLES    
    JTextField ReciboNumero, EntregoNumero;
    JButton CalculoNumero;
    JLabel IntroduceNumero;
    
    int Factorial;
    int NumeroRecibido; 
    
    //Constructor
    public Fibonacci(){
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
        setTitle("FIBONACCI");
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
        //Inicialización de JLabel
        IntroduceNumero = new JLabel("Introduce un numero: ");
        //Inicialización de botones
        CalculoNumero = new JButton("CALCULAR");
        //Inicialización de JTextField
        ReciboNumero = new JTextField ();
        EntregoNumero = new JTextField();
        //Posicionamiento de componentes
        setLayout(new BorderLayout());
        //Inserción de componentes al campo gráfico
        add(IntroduceNumero, BorderLayout.NORTH);        
        add(UbicacionCentro(), BorderLayout.CENTER);
        add(CalculoNumero, BorderLayout.SOUTH);
        // Agregamos ActionListener a los botones
        CalculoNumero.addActionListener(this);
        //Habilitamos como visibles los componentes
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
    
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == CalculoNumero){
            int resultado = Integer.parseInt(ReciboNumero.getText());
            int nums = 0;
            int nums2=1;        

            String fibo="0 1 ";

            for(int i=0; i<=resultado-2; i++){

                int nums3;
                fibo+=(nums2+nums)+" ";
                nums3=nums;
                nums=nums2;
                nums2=nums3+nums2;                    

            }

            EntregoNumero.setText(String.valueOf(fibo));

        }

    }
}//FIN DE LA CLASE
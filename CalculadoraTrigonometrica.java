import javax.swing.JOptionPane;

public class CalculadoraTrigonometrica {
    public static void main(String[] args) {
        // Incialmente, se definirán algunas variables que se utilizarán a lo largo del código:
        // Variables relacionadas a los nombres de las funciones trigonométricas:

        String funcion; // Esta variable puede ser seno, coseno o tangente

        String tipoFuncion; // Esta variable puede ser normal, inversa o hiperbólica

        // Variables relacionadas a los valores a evaluar en las funciones:
        double angulo; // Variable que almacenará los valores que se utilizarán para las funciones normales.

        double argInversa; // Variable que almacenará los valores que se utilizarán para las funciones inversas.

        double numeroReal; // Variable que almacenará los valores que se utilizarán para las funciones hiperbólicas.

        // Mensaje que le pedirá al usuario escribir la función con la que desea trabajar:
        funcion = JOptionPane.showInputDialog("Escriba la función trigonométrica que quiera calcular (sen, cos o tan): ");

        // Condiciones encargadas del calculo de todo lo relacionado a la función coseno (normal, inversa e hiperbólica):
        if (funcion.equals("cos")) {
            
            // Mensaje en el que el usuario introducirá el tipo de función coseno con la que desea trabajar (normal, inversa o hiperbólica):
            tipoFuncion = JOptionPane.showInputDialog("¿Qué tipo de función coseno desea evaluar (normal, inversa o hiperbólica): ");
            
            // Condición encargada del calculo de la función coseno normal:
            if (tipoFuncion.equals("normal")) {

                angulo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el ángulo cuyo coseno desea conocer: "));

                System.out.println("El coseno del ángulo "+ angulo +" es "+ Math.cos(angulo));

            }
            
            // Condición encargada de calcular la inversa de una función coseno:
            else if (tipoFuncion.equals("inversa")) {
                
                argInversa = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es el valor cuyo arcocoseno desea conocer? "));

                System.out.println("El arcocoseno de "+ argInversa +" (en radianes) es: "+ Math.acos(argInversa));

            }
            
            // Condición encargada de calcular la hiperbólica de una función coseno:
            else {

                numeroReal = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es el valor cuyo coseno hiperbólico desea conocer? "));

                System.out.println("El resultado de la función coseno hiperbólico de  "+ numeroReal +" es "+ Math.cosh(numeroReal));
        
            }     
        }

        // Condiciones encargadas de la función seno:
        else if (funcion.equals("sen")) {

            // Mensaje en el que el usuario introducirá el tipo de función seno con la que desea trabajar (normal, inversa o hiperbólica):
            tipoFuncion = JOptionPane.showInputDialog("¿Qué tipo de función seno desea evaluar (normal, inversa o hiperbólica): ");

            // Condición encargada del calculo de la función seno normal:
            if (tipoFuncion.equals("normal")) {

                angulo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el ángulo cuyo seno desea conocer: "));

                System.out.println("El seno del ángulo "+ angulo +" es "+ Math.sin(angulo));

            }

            // Condición encargada de calcular la inversa de una función seno:
            else if (tipoFuncion.equals("inversa")) {

                argInversa = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es el valor cuyo arcoseno desea conocer? "));

                System.out.println("El arcocoseno de"+ argInversa +" (en radianes) es: "+ Math.asin(argInversa));

            }

            // Condición encargada de calcular la hiperbólica de una función seno:
            else {

                numeroReal = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es el valor cuyo seno hiperbólico desea conocer? "));

                System.out.println("El resultado de la función seno hiperbólico de  "+ numeroReal +" es "+ Math.sinh(numeroReal));

            }
        }

        // Condiciones encargadas de la función tangente:
        else {

            // Mensaje en el que el usuario introducirá el tipo de función tangente con la que desea trabajar (normal, inversa o hiperbólica):
            tipoFuncion = JOptionPane.showInputDialog("¿Qué tipo de función tangente desea evaluar (normal, inversa o hiperbólica): ");
            
            // Condición encargada del calculo de la función coseno normal:
            if (tipoFuncion.equals("normal")) {

                angulo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el ángulo cuya tangente desea conocer: "));

                System.out.println("La tangente del ángulo "+ angulo +" es "+ Math.tan(angulo));

            }

            // Condición encargada de calcular la inversa de una función tangente:
            else if (tipoFuncion.equals("inversa")) {

                argInversa = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es el valor cuyo arcotangente desea conocer? "));

                System.out.println("El arcotangente de"+ argInversa +" (en radianes) es: "+ Math.atan(argInversa));

            }

            // Condición encargada de calcular la hiperbólica de una función tangente:
            else {

                numeroReal = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es el valor cuya tangente hiperbólica desea conocer? "));

                System.out.println("El resultado de la función tangente hiperbólica de  "+ numeroReal +" es "+ Math.tanh(numeroReal));

            }

        }

    }
}
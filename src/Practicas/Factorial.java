package Practicas;
// para calcular el factorial hay que multiplicar  desde 1 hasta el numero dado.

//Ej : si el numero dado es 7 debemos multiplicar 7x1-7x2-7x3-7x4-7x5-7x6-7x7
//Ej : Si el numero dado es 4 debemos multiplicar 4x1-4x2-4x3-4x4

import javax.swing.*;

public class Factorial {
    public static void main(String[] args) {

        int numero;
        long factorial = 1; //siempre hay que igualarlo a uno porque es una multiplicacion interativa.

        // en este caso se utilice el joptionpane pero tambien se puede importar el scanner.

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        // si el numero dado es 5 entonces la formula multiplicara 5x1-5x2-5x3-5x4-5x5

        //para esto el bucle for es la mejor opcion.

        for (int i=1;i<=numero;i++){
            factorial *=i;  //multiplicacion iterativa
        }
        System.out.println("El Factorial de "+numero+" es "+factorial);

    }

}


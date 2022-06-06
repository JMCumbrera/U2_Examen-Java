package Examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;

import static java.lang.System.exit;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Byte edad = null;
        Byte mes = null;
        String miNombre = "Juan Manuel Cumbrera López";
        List<Integer> tablas;   // Esta variable la relacionaremos con la función edadMes, y según la edad
        // y el mes del alumno/a devolverá una lista (de tablas de multiplicar a mostrar)
        // o un mensaje de error

        // Leo desde teclado la edad del alumno y el mes actual
        List<String> listaEntrada = new ArrayList<String>(2);
        try {
            String entrada;
            Scanner readline = new Scanner(in);

            System.out.println("Introduzca la configuración del programa en este formato: <edadDelAlumno>,  <mesActual>");
            // entrada = String.valueOf(readline);
            // Esta línea provoca que el programa no te permita leer entrada por teclado,
            // directamente salta el mensaje "La entrada no es correcta"
            entrada = readline.next();  // Esta línea SI permite leer correctamente la entrada por teclado
            listaEntrada = List.of(entrada.split(","));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Linea Inicial de programa
        System.out.println("*".repeat(80));
        System.out.println("PROGRAMA DE GENERACIÓN DE TABLAS: " + miNombre);

        // Linea inicio cabecera
        System.out.println("_".repeat(80));

        if (listaEntrada.size() != 2) {     //Compruebo el tamaño de la lista, si es != 2, finaliza el programa
            System.out.println("La entrada no es correcta");
            System.out.println("_".repeat(80));

        } else {    // Si no, leo edad y mes. Asigno -1 si hay error en la lectura.
            try { edad = Byte.valueOf(listaEntrada.get(0).trim()); } catch (Exception e) { edad = -1; }
            try { mes = Byte.valueOf(listaEntrada.get(1).trim()); } catch (Exception e) { mes = -1; }

            assert edad != null;
            assert mes != null;
            if (edad <= 0 || mes <= 0) {
                System.out.println("La entrada no es correcta");
                System.out.println("_".repeat(80));
            } else {
                tablas = edadMes(edad,mes);
                System.out.println("_".repeat(80));
                tablasDeMultiplicar(tablas);
            }
        }
        // Linea final de programa
        System.out.println("*".repeat(80));
    }

    // #####################################
    // DEFINICIÓN DEL CUERPO DEL PROGRAMA
    // #####################################

    public static List<Integer> edadMes (Byte edad, Byte mes) {
        // Estas variables son las listas, que representan las tablas que se deberán mostrar
        // por pantalla, según la edad y mes introducidos
        List<Integer> tablas0 = new ArrayList<Integer>();   // Esta variable en concreto se usa para ponerla al final de la función,
        tablas0.add(0);                                     // debido a que si al final de esta no hay un return, no funcionará

        List<Integer> tablas1 = new ArrayList<Integer>();
        tablas1.add(1);
        tablas1.add(3);
        tablas1.add(5);

        List<Integer> tablas2 = new ArrayList<Integer>();
        tablas2.add(2);
        tablas2.add(4);

        List<Integer> tablas3 = new ArrayList<Integer>();
        tablas3.add(6);
        tablas3.add(8);
        tablas3.add(10);

        List<Integer> tablas4 = new ArrayList<Integer>();
        tablas4.add(7);
        tablas4.add(9);

        List<Integer> tablas5 = new ArrayList<Integer>();
        tablas5.add(11);
        tablas5.add(12);
        tablas5.add(13);


         // La siguiente cadena de if funciona de la siguiente manera, si la edad es correcta y el mes es correcto,
         // se devolverá la lista con las tablas de multiplicar pertinentes, si la edad es incorrecta,
         // pero el mes es correcto, se devolverá el mensaje de error advirtiendo de la edad incorrecta, si la
         // edad es correcta, pero el mes es incorrecto, se devolverá el mensaje de error advirtiendo del mes incorrecto

        if (edad >= 6 && edad <= 8) {
            if (mes < 1 || mes > 12) {
                System.out.println("Mes: " + mes + ". El mes es erróneo");
                System.out.println("_".repeat(80));
                System.out.println("*".repeat(80));
                exit(0);   // Gracias a esta función, podemos salir del programa una vez que hemos
                                   // recibido el mensaje de error, y que así, no muestre ninguna tabla de
                                   // multiplicar por pantalla
            } else {
                System.out.println("Edad: " + edad + ". El alumno está dentro del rango [6-8]");
                if (mes % 2 == 0) {
                    System.out.println("Mes: " + mes + ". El mes es par, corresponde las tablas siguientes: {2,4}");
                    return tablas2;
                } else if (mes % 2 != 0) {
                    System.out.println("Mes: " + mes + ". El mes es impar, corresponde las tablas siguientes: {1,3,5}");
                    return tablas1;
                }
            }
        } else if (edad >= 9 && edad <= 10) {
            if (mes < 1 || mes > 12) {
                System.out.println("Mes: " + mes + ". El mes es erróneo");
                System.out.println("_".repeat(80));
                System.out.println("*".repeat(80));
                exit(0);
            } else {
                System.out.println("Edad: " + edad + ". El alumno está dentro del rango [9-10]");
                if (mes % 2 == 0) {
                    System.out.println("Mes: " + mes + ". El mes es par, corresponde las tablas siguientes: {6,8,10}");
                    return tablas3;
                } else if (mes % 2 != 0) {
                    System.out.println("Mes: " + mes + ". El mes es impar, corresponde las tablas siguientes: {7,9}");
                    return tablas4;
                }
            }
        } else if (edad >= 11 && edad <= 12) {
            if (mes < 1 || mes > 12) {
                System.out.println("Mes: " + mes + ". El mes es erróneo");
                System.out.println("_".repeat(80));
                System.out.println("*".repeat(80));
                exit(0);
            } else {
                System.out.println("Edad: " + edad + ". El alumno está dentro del rango [11-12]");
                if (mes % 2 == 0) {
                    System.out.println("Mes: " + mes + ". El mes es par, corresponde las tablas siguientes: {11,12,13}");
                    return tablas5;
                } else if (mes % 2 != 0) {
                    System.out.println("Mes: " + mes + ". El mes es impar, corresponde las tablas siguientes: {11,12,13}");
                    return tablas5;
                }
            }
        } else if (edad < 6 || edad > 12) {
            System.out.println("Edad: " + edad + ". No se contempla esa edad");
            System.out.println("_".repeat(80));
            System.out.println("*".repeat(80));
            exit(0);
        }

        return tablas0;
    }

    public static void tablasDeMultiplicar (List<Integer> tablas) {
        System.out.println();
        tablas.forEach((t) -> {
            int i;
            System.out.println("TABLA DEL " + t);
            System.out.println("*".repeat(11));
            for (i = 1; i <= 10; i++) {     // Aquí el for usará los números del 1 al 10 para la tabla de multiplicar
                System.out.println(t + " * " + i + " = " + t*i);    // Y aquí, en cada línea, mostrará cada multiplicación
            }
            System.out.println();
        });
    }
}

package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Información general
        String nombreProgramador, correo, ciudad, pais, tipoContrato, nivelExperiencia, cliente1, cliente2, cliente3;
        int edad, aniosExperiencia;
        double tarifaBase, tarifaNivel, tarifaExperiencia;

        // Entrada de información general
        System.out.print("Ingrese el nombre del programador: ");
        nombreProgramador = sc.nextLine();

        System.out.print("Ingrese el correo electrónico: ");
        correo = sc.nextLine();

        System.out.print("Ingrese la ciudad: ");
        ciudad = sc.nextLine();

        System.out.print("Ingrese el país: ");
        pais = sc.nextLine();

        System.out.print("Ingrese el tipo de contrato (Fulltime/Parttime/Freelance): ");
        tipoContrato = sc.nextLine();

        System.out.print("Ingrese el nivel de experiencia (Junior/Senior): ");
        nivelExperiencia = sc.nextLine();

        System.out.print("Ingrese la edad del programador: ");
        edad = sc.nextInt();

        System.out.print("Ingrese los años de experiencia: ");
        aniosExperiencia = sc.nextInt();

        // Ajuste de tarifa según experiencia
        tarifaBase = 50.0; // base por hora
        tarifaNivel = (nivelExperiencia.equalsIgnoreCase("Senior")) ? 20 : 0;
        tarifaExperiencia = aniosExperiencia * 1.5;
        double tarifaHoraFinal = tarifaBase + tarifaNivel + tarifaExperiencia;

        System.out.println("\nTarifa final por hora calculada: $" + tarifaHoraFinal);

        // Información de proyectos
        System.out.println("\nIngrese los nombres de los 3 clientes:");
        sc.nextLine(); // limpiar buffer
        System.out.print("Cliente 1: ");
        cliente1 = sc.nextLine();
        System.out.print("Cliente 2: ");
        cliente2 = sc.nextLine();
        System.out.print("Cliente 3: ");
        cliente3 = sc.nextLine();

        int horasProyecto1, horasProyecto2, horasProyecto3;
        double bonusCliente1, bonusCliente2, bonusCliente3;
        double pagoProyecto1, pagoProyecto2, pagoProyecto3;
        double subtotal, descuentos, impuestos, totalFinal;

        // Captura de horas
        System.out.print("Horas trabajadas para " + cliente1 + ": ");
        horasProyecto1 = sc.nextInt();
        System.out.print("Bono adicional para " + cliente1 + ": ");
        bonusCliente1 = sc.nextDouble();

        System.out.print("Horas trabajadas para " + cliente2 + ": ");
        horasProyecto2 = sc.nextInt();
        System.out.print("Bono adicional para " + cliente2 + ": ");
        bonusCliente2 = sc.nextDouble();

        System.out.print("Horas trabajadas para " + cliente3 + ": ");
        horasProyecto3 = sc.nextInt();
        System.out.print("Bono adicional para " + cliente3 + ": ");
        bonusCliente3 = sc.nextDouble();

        // Cálculos de pago por proyecto
        pagoProyecto1 = (horasProyecto1 * tarifaHoraFinal) + bonusCliente1;
        pagoProyecto2 = (horasProyecto2 * tarifaHoraFinal) + bonusCliente2;
        pagoProyecto3 = (horasProyecto3 * tarifaHoraFinal) + bonusCliente3;

        subtotal = pagoProyecto1 + pagoProyecto2 + pagoProyecto3;

        // Operaciones adicionales
        descuentos = subtotal * 0.03; // 3% de fondo de ahorro
        impuestos = subtotal * 0.09;  // 9% de retenciones

        totalFinal = subtotal - descuentos - impuestos;

        // Captura fecha actual
        LocalDate fechaActual = LocalDate.now();
        // Impresión del reporte
        System.out.println("\n----- REPORTE DE PAGO -----");
        System.out.println("Nombre del programador: " + nombreProgramador);
        System.out.println("Correo: " + correo);
        System.out.println("Ciudad: " + ciudad + ", " + pais);
        System.out.println("Fecha de liquidación: " + fechaActual);
        System.out.println("Tipo de contrato: " + tipoContrato);
        System.out.println("Nivel de experiencia: " + nivelExperiencia);
        System.out.println("Tarifa por hora: $" + tarifaHoraFinal);

        System.out.println("\nDetalle por cliente:");
        System.out.println(cliente1 + ": $" + pagoProyecto1);
        System.out.println(cliente2 + ": $" + pagoProyecto2);
        System.out.println(cliente3 + ": $" + pagoProyecto3);

        System.out.println("\nSubtotal: $" + subtotal);
        System.out.println("Descuentos (3%): $" + descuentos);
        System.out.println("Impuestos (9%): $" + impuestos);
        System.out.println("Total a recibir: $" + totalFinal);

        sc.close();
    }
}
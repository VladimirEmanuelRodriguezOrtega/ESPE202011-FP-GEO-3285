/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12.taxes;

import java.util.Scanner;

/**
 *
 * @author nuevo
 */
public class HW12Taxes {
// porcentaje del iva como constante
    final static double IVA_PERCENTAGE = 12;
    // salario basico unificado
    final static double BASIC_SALARY = 400.00;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        
        do {
            System.out.println("1) calculate IVA");
            System.out.println("2) calculate ISD");
            System.out.println("3) calculate income tax");
            System.out.println("4) exit");
            System.out.println();
            
            System.out.print("Enter an option: ");
            option = input.nextInt();
            input.nextLine();
            
            if (option < 1 || option > 4) continue;
            
            if (option == 4) {
                break;
            }
            
            System.out.println();
            System.out.println();
            
            if (option == 1) {
                double amount;
                double calculated;
                
                System.out.print("Enter the amount: ");
                amount = input.nextDouble();
                input.nextLine();
                calculated = calculateIva(amount);
                System.out.println("calculated (" + IVA_PERCENTAGE + "): " + calculated);
            } else if (option == 2) {
                int isdMethod;
                double amount;
                
                System.out.print("Enter the amount: ");
                amount = input.nextDouble();
                input.nextLine();
                
                System.out.println();
                System.out.println("1) traslado de dinero al exterior");
                System.out.println("2) Transferencias internacionales y envío de divisas");
                System.out.println("3) Espectáculos públicos");
                System.out.println();
                    
                do {
                    System.out.print("Enter an option: ");
                    isdMethod = input.nextInt();
                    input.nextLine();
                } while (isdMethod < 1 || isdMethod > 3);
                
                double calculated = calculateIsd(amount, isdMethod);
                System.out.println("calculated: " + calculated);
            } else if (option == 3) {
                double salary;
                double expenses;
                
                System.out.print("Enter your salary: ");
                salary = input.nextDouble();
                input.nextLine();
                
                System.out.print("Enter your personal expenses: ");
                expenses = input.nextDouble();
                input.nextLine();
                
                double calculated = calculateIncomeTax(salary, expenses);
                System.out.println("calculated: " + calculated);
            }
            
            System.out.println();
            System.out.println();
        } while (option != 4);
    }
    
    // calculo del impuesto al valor agregado
    public static double calculateIva(double amount) {
        double total = amount + (amount * (IVA_PERCENTAGE / 100));
        return total;
    }
    
    // calculo del impuesto a la salida de divisas
    // method 1: traslado de dinero al exterior
    // method 2: Transferencias internacionales y envío de divisas
    // method 3: Espectáculos públicos
    //
    // mas informacion:
    // https://www.pichincha.com/portal/blog/post/que-es-isd
    // https://www.superbancos.gob.ec/bancos/ufaqs/que-porcentaje-me-cobran-por-la-salida-de-divisas/
    public static double calculateIsd(double amount, int method) {
        double limit;
        
        if (method == 1) {
            limit = BASIC_SALARY * 3;
        } else if (method == 2) {
            limit = 5000;
        } else { // en el metodo 3 solo se regresa el 5%
            return amount * 0.05;
        }
        
        // si el monto es menor al limite no cobramos ISD
        if (amount < limit) {
            return 0;
        }
        
        // valor libre de ISD
        double freeIsdValue = amount - limit;
        
        // total calculado
        double total =  freeIsdValue * 0.05;
        
        return total;
    }
    
    // calculo de impuesto a la renta
    //
    // mas informacion:
    // https://tusfinanzas.ec/todo-lo-que-necesitas-saber-para-el-pago-del-impuesto-a-la-renta/
    public static double calculateIncomeTax(double salary, double personalExpenses) {
        // ingresos mensuales netos
        double monthlyIncome = salary - (salary * 0.0945);
        // ingresos anuales netos
        double annualIncome = monthlyIncome * 12;
        // base imponible
        double taxBase = annualIncome - personalExpenses;
        
        double basicFraction = 0; // fracción basica
        double basicFractionTax = 0; // impuesto fraccion basica
        double excessFractionTax = 0; // impuesto fraccion excedente
        
        if (taxBase >= 0 && taxBase < 11291) {
            basicFraction = 0;
            basicFractionTax = 0;
            excessFractionTax = 0;
        } else if (taxBase >= 11291 && taxBase < 14391) {
            basicFraction = 11290;
            basicFractionTax = 0;
            excessFractionTax = 5;
        } else if (taxBase >= 14391 && taxBase < 17991) {
            basicFraction = 14390;
            basicFractionTax = 155;
            excessFractionTax = 10;
        } else if (taxBase >= 17991 && taxBase < 21601) {
            basicFraction = 17990;
            basicFractionTax = 515;
            excessFractionTax = 12;
        } else if (taxBase >= 21601 && taxBase < 43191) {
            basicFraction = 21600;
            basicFractionTax = 948;
            excessFractionTax = 15;
        } else if (taxBase >= 43191 && taxBase < 64771) {
            basicFraction = 43190;
            basicFractionTax = 4187;
            excessFractionTax = 20;
        } else if (taxBase >= 64771 && taxBase < 86371) {
            basicFraction = 64770;
            basicFractionTax = 8503;
            excessFractionTax = 25;
        } else if (taxBase >= 86371 && taxBase < 115141) {
            basicFraction = 86370;
            basicFractionTax = 13903;
            excessFractionTax = 30;
        } else if (taxBase >= 115141) {
            basicFraction = 115140;
            basicFractionTax = 22534;
            excessFractionTax = 35;
        }
        
        //  impuesto sobre la fracción excedente
        double taxOverExcess = (taxBase - basicFraction) * (excessFractionTax / 100);
        double incomeTax = basicFractionTax + taxOverExcess;
        
        return incomeTax;
    }
}

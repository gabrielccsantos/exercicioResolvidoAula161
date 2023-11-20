package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner read = new Scanner(System.in);

        Employee emp;

        List<Employee> empList = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numberEmployees = read.nextInt();
        read.nextLine();
        for(int i = 1; i <= numberEmployees; i++){
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced? (y / n)");
            char letter = read.nextLine().toLowerCase().charAt(0);
            System.out.print("Name: ");
            String nameEmployee = read.nextLine();
            System.out.print("Hours: ");
            int hoursWork = read.nextInt();
            System.out.print("Value per Hour: ");
            double valuePerHour = read.nextDouble();

            if(letter == 'y'){
                System.out.print("Addicional Charge: ");
                double addCharge = read.nextDouble();

                Employee employee = new OutsourcedEmployee(nameEmployee, hoursWork, valuePerHour, addCharge);

                empList.add(employee);
            }
            else {
                Employee employee = new Employee(nameEmployee, hoursWork, valuePerHour);

                empList.add(employee);
            }
            read.nextLine();
        }

        System.out.print("PAYMENTS: ");

        for(Employee employees : empList){
            System.out.println(employees);
        }

        read.close();
    }
}
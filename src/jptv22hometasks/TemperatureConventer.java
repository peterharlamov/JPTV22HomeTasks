/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22hometasks;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class TemperatureConventer {

    private final Scanner scanner; 

    TemperatureConventer(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void doConvert() {
        boolean repeat = true;
        do {
            System.out.println("+ + + + + + + + + + + + +");
            System.out.println("+ Конвертер температуры +");
            System.out.println("+ + + + + + + + + + + + +");
            System.out.println("Выберите номер задачи из списка: ");
            System.out.println("0. Выход из конвентера");
            System.out.println("1. Цельсий -> Фаренгейт");
            System.out.println("2. Фаренгейт -> Цельсий");
            System.out.println("№ задачи: ");
            int task = this.scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход из конвертера");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("+ + + + + + + + + + + + +");
                    System.out.println("Цельсий -> Фаренгейт");
                    System.out.println("Введите значение в цельсиях: ");
                    int Celsi = this.scanner.nextInt();
                    double farngate;
                    farngate = (int) Math.round((Celsi * 1.8) + 32);
                    System.out.println("Температура в Цельсиях: " + farngate);
                    break;
                case 2:
                    System.out.println("+ + + + + + + + + + + + +");
                    System.out.println("Фаренгейт -> Цельсий");
                    System.out.println("Введите значение в фаренгейтах: ");
                    int fahrenheit = this.scanner.nextInt();
                    int celsius = (int) Math.round((fahrenheit - 32) / 1.8);
                    System.out.println("Температура в Цельсиях: " + celsius);
                    break;
                default:
                    System.out.println("Выберите номер из списка задач!");
                    break;
        }
        }while(repeat);
    }   
}
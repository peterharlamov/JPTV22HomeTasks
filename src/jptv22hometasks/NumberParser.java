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
class NumberParser {
    
    private final Scanner scanner;

    public NumberParser(Scanner scanner) {
        this.scanner = scanner;
    }

    public void doParse() {
        boolean repeat = true;
        System.out.println();
        System.out.println("++++++++++++++++++++++++");
        System.out.println("+     Парсер числа     +");
        System.out.println("++++++++++++++++++++++++");
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt(); scanner.nextLine();
        
        // код решения 
        int edCount = number % 10;         // единицы
        int decCount = (number / 10) % 10; // десятки
        int hundredsCount = number / 100;  // сотни
        int sumNumbers = edCount + decCount + hundredsCount;
        System.out.printf("В веденном числе: %n");
        System.out.printf("  - единиц: %d%n", edCount);
        System.out.printf("  - десятков: %d%n", decCount);
        System.out.printf("  - сумма цифр: %d%n", sumNumbers);
        System.out.println();
    }
    
}

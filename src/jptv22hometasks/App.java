/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22hometasks;

import java.util.Scanner;
import jptv22hometasks.BooksArray.CreateBooksArray;

/**
 *
 * @author pupil
 */
public class App {
    
    private final Scanner scanner;
    boolean repeat;
    
    public App() {
        this.scanner = new Scanner(System.in);
    }
    
    public void run() {
        boolean repeat = true;
        do {
            System.out.println("Выберите номер задачи из списка: ");
            System.out.println("0. Выход из программы");
            System.out.println("1. Конвертер температуры");
            System.out.println("2. Парсер числа");
            System.out.println("3. Температура за год");
            System.out.println("4. Задача с массивом целых чисел");
            System.out.println("5. Задача с массивом книг");
            System.out.println("№ задачи: ");
            int task = this.scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход из программы");
                    repeat = false;
                    break;
                case 1:
                    TemperatureConventer tempConventer = new TemperatureConventer(scanner);
                    tempConventer.doConvert();
                    break;
                case 2:
                    NumberParser numberParser = new NumberParser(scanner);
                    numberParser.doParse();
                    break;
                case 3:
                    WeatherInYear yearsWeather = new WeatherInYear(scanner);
                    yearsWeather.run();
                case 4:
                    ArrayDemo arrayDemo = new ArrayDemo(scanner);
                    arrayDemo.runDemo();
                case 5:
                    CreateBooksArray createBooksArray = new CreateBooksArray();
                    createBooksArray.doCreateArray();
                default:
                    System.out.println("Выберите номер из списка задач!");
                    break;
            }
        }while(repeat);
    }
    
}

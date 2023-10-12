/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22hometasks;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class WeatherInYear {

    private final Scanner scanner;
    
    private enum MONTHS {
        Январь,Февраль,Март,Апрель,Май,Июнь,Июль,Август,Сентябрь,Октябрь,Ноябрь,Декабрь
    }

    public WeatherInYear(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        Random random = new Random();
        int min = -30;
        int max = 40;
        
        System.out.println("Массив погоды в году по месяцам: ");
        int[][] weatherInYear = new int[12][];
        weatherInYear[0] = new int[31];
        weatherInYear[1] = new int[28];
        weatherInYear[2] = new int[31];
        weatherInYear[3] = new int[30];
        weatherInYear[4] = new int[31];
        weatherInYear[5] = new int[30];
        weatherInYear[6] = new int[31];
        weatherInYear[7] = new int[31];
        weatherInYear[8] = new int[30];
        weatherInYear[9] = new int[31];
        weatherInYear[10] = new int[30];
        weatherInYear[11] = new int[31];
        
        for (int i = 0; i < weatherInYear.length; i++) {
            for (int j = 0; j < weatherInYear[i].length; j++) {
                weatherInYear[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        
        System.out.printf("%14s"," ");
        for(int si = 0;si<31;si++){
            System.out.printf("%-4d",si+1);
        }
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < weatherInYear.length; i++) {
            System.out.printf("%10s: ",MONTHS.values()[i]);
            for (int j = 0; j < weatherInYear[i].length; j++) {
                System.out.printf("%4d",weatherInYear[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
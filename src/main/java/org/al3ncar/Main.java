package org.al3ncar;

import java.util.Scanner;

import org.al3ncar.core.CalculosBasic;
import org.al3ncar.core.Telas;

public class Main {
    public static void main(String[] args) {
        var cal = new CalculosBasic();
        var telas = new Telas();
        Scanner sc = new Scanner(System.in);
        telas.TelaPrincipal();
        String a = sc.nextLine();
        switch (a) {
            case "1":
                cal.Soma();
                break;
            case "2":
                cal.Subtrair();
                break;
            case "3":
                cal.Dividir();
                break;
            case "4":
                cal.Multiplicar();
                break;
            default:
                break;
        }
    }
}
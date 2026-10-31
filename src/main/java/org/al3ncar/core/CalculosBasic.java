package org.al3ncar.core;

import java.util.Scanner;

public class CalculosBasic {
    public void Soma(){
        Scanner sc = new Scanner(System.in);
        int a = 0,b = 0,c = 0;
        System.out.println("Qual o primeiro numero");
        a = sc.nextInt();
        System.out.println("Qual o segundo numero");
        b = sc.nextInt();
        c = a+b;
        System.out.println("Resultado: " + c );
        sc.close();
    }
    public void Subtrair(){
        Scanner sc = new Scanner(System.in);
        int a = 0,b = 0,c = 0;
        System.out.println("Qual o primeiro numero");
        a = sc.nextInt();
        System.out.println("Qual o segundo numero");
        b = sc.nextInt();
        c = a-b;
        System.out.println("Resultado: " + c );
        sc.close();
    }
    public void Multiplicar(){
        Scanner sc = new Scanner(System.in);
        int a = 0,b = 1,c = 0;
        System.out.println("Qual o primeiro numero");
        a = sc.nextInt();
        System.out.println("Qual o segundo numero");
        b = sc.nextInt();
        c = a*b;
        System.out.println("Resultado: " + c );
        sc.close();
    }
    public void Dividir(){
        Scanner sc = new Scanner(System.in);
        int a = 0,b = 0,c = 0;
        System.out.println("Qual o primeiro numero");
        a = sc.nextInt();
        System.out.println("Qual o segundo numero");
        b = sc.nextInt();
        c = a/b;
        System.out.println("Resultado: " + c );
        sc.close();
    }
}

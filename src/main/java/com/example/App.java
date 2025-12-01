package com.example;

/**
 * Простейшее Java-приложение для демонстрации CI/CD.
 * Содержит бизнес-метод greet() и точку входа main().
 */
public class App {

    /**
     * Точка входа. При запуске `java -jar ...` выведет приветствие.
     */
    public static void main(String[] args) {
        System.out.println(greet("World"));
    }

    /**
     * Бизнес-метод: формирует приветствие.
     */
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}

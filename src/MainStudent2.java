/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author L0324020 - Milla Agustin
 */
public class MainStudent2 {
    public static void main(String[] args) {
        Student2 s = new Student2("Milla", 70);
        System.out.println(s.getName() + " memiliki score " + s.getScore());

        s.addScore(20);
        System.out.println("Setelah addScore(20): " + s.getScore());

        try {
            s.addScore(20);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        s.reduceScore(30);
        System.out.println("Setelah reduceScore(30): " + s.getScore());
    }
}



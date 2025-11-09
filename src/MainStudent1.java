/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author L0324020 - Milla Agustin
 */
public class MainStudent1 {
    public static void main(String[] args) {
        Student1 s = new Student1("Milla", 85);
        System.out.println(s.getName() + " memiliki nilai " + s.getScore());

        s.setScore(95);
        System.out.println("Setelah diperbarui: " + s.getScore());

        try {
            s.setScore(120);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

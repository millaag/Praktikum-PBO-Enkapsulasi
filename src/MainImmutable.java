/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author L0324020 - Milla Agustin
 */
public class MainImmutable {
    public static void main(String[] args) {
        ImmutableStudent s1 = new ImmutableStudent("Milla", 80);
        ImmutableStudent s2 = s1.withAddedScore(10);

        System.out.println("s1: " + s1.getName() + " = " + s1.getScore());
        System.out.println("s2: " + s2.getName() + " = " + s2.getScore());

        try {
            s1.withAddedScore(30);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

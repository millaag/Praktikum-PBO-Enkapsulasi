/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author L0324020 - Milla Agustin
 */
import java.util.*;

public class MainTeam {
    public static void main(String[] args) {
        Team team = new Team();
        team.addMember(new Student2("Milla", 85));
        team.addMember(new Student2("Agustin", 90));

        System.out.println("Daftar anggota tim:");
        for (Student2 s : team.getMembers()) {
            System.out.println("- " + s.getName() + " (" + s.getScore() + ")");
        }

        
        List<Student2> copy = team.getMembers();
        copy.clear(); 

        System.out.println("Setelah clear copy, anggota asli:");
        for (Student2 s : team.getMembers()) {
            System.out.println("- " + s.getName() + " (" + s.getScore() + ")");
        }
    }
}


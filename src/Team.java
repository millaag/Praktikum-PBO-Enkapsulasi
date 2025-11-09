/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author L0324020 - Milla Agustin
 */
import java.util.*;

public class Team {
    private List<Student2> members = new ArrayList<>();

    public void addMember(Student2 s) {
        members.add(s);
    }

    public List<Student2> getMembers() {
        return new ArrayList<>(members); 
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author L0324020 - Milla Agustin
 */
public class Student2 {
    private String name;
    private int score;

    public Student2(String name, int score) {
        this.name = name;
        if (score < 0 || score > 100)
            throw new IllegalArgumentException("Score harus antara 0 dan 100");
        this.score = score;
    }

    public String getName() { return name; }
    public int getScore() { return score; }

    public void addScore(int delta) {
        if (score + delta > 100)
            throw new IllegalArgumentException("Score tidak boleh lebih dari 100");
        score += delta;
    }

    public void reduceScore(int delta) {
        if (score - delta < 0)
            throw new IllegalArgumentException("Score tidak boleh kurang dari 0");
        score -= delta;
    }
}

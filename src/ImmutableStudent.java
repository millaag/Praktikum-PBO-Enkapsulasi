/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author L0324020 - Milla Agustin
 */
public final class ImmutableStudent {
    private final String name;
    private final int score;

    public ImmutableStudent(String name, int score) {
        this.name = name;
        if (score < 0 || score > 100)
            throw new IllegalArgumentException("Score harus antara 0 dan 100");
        this.score = score;
    }

    public String getName() { return name; }
    public int getScore() { return score; }

    public ImmutableStudent withAddedScore(int delta) {
        int newScore = score + delta;
        if (newScore < 0 || newScore > 100)
            throw new IllegalArgumentException("Score hasil perubahan tidak valid");
        return new ImmutableStudent(name, newScore);
    }
}

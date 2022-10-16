package edu.davi.sintaxe;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int finalAvarage = 6;

        if (finalAvarage<6)
            System.out.println("Disapproved");
        else if (finalAvarage==6)
            System.out.println("Tiebreaker test");
        else
            System.out.println("Approved");

    }
}

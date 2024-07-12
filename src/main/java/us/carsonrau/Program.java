package us.carsonrau;

import us.carsonrau.models.Board;
import us.carsonrau.models.PieceColor;
import us.carsonrau.utils.PieceColorUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

    // This is the main runner function
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to CLI Chess.");
        char colorChar = getColor();
        PieceColor color = PieceColorUtils.getColor(colorChar);
        Board b = new Board();
    }

    private static char getColor() throws IOException {
        char color;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                System.out.println("Would you like to be white (W) or black? (B)");
                String input = br.readLine().trim();
                if (!input.isEmpty()) {
                    color = input.charAt(0);
                } else {
                    color = ' ';
                }
                color = color == 'b' ? 'B' : color;
                color = color == 'w' ? 'W' : color;
            } while (color != 'B' && color != 'W');
        }
        if (color == 'W') {
            System.out.println("Welcome, white team.");
        } else {
            System.out.println("Welcome, black team.");
        }
    }
}

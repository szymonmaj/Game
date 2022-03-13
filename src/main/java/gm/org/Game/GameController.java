package gm.org.Game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Scanner;

@Controller
public class GameController {

    @GetMapping("/")
    @ResponseBody
    public static void hello() {
        Scanner reader = new Scanner(System.in);
        while(true) {
            System.out.println("Wpisz liczbę:");
            try {
                int input1 = reader.nextInt();
                System.out.println("Wpisz kolejną liczbę:");
                int input2 = reader.nextInt();
                int sum = input1 + input2;
                System.out.println("Wynik: " + sum);
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        }
    }

}

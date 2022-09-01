import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class startupChat {
    public static void main(String[] args) {

        int amount = (int) Math.round(Math.random()*7) +3;
        String output = "";

        System.out.println(amount);

        for (;amount > 0; amount--){
            Scanner curent = new Scanner(System.in);
            output += curent.nextLine() + "      " + LocalTime.now() + "\n";
        }

        System.out.println(output);

    }
}

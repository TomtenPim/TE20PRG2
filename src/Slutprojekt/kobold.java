package Slutprojekt;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

public class kobold extends Creature {
    public kobold(){
        Connection conn = null;
        String user = "te20";
        String password = "";

        try {
            File login = new File("./src/Slutprojekt/databaselogin.txt");
            Scanner myReader = new Scanner(login);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                password = data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        try {
            conn = DriverManager.getConnection("jdbc:mysql://db.umea-ntig.se:3306/te20? "+
                    "allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            Statement stmt = conn.createStatement();
            String SQLQuery = "SELECT * FROM sa04monsters WHERE name ='kobold'";
            ResultSet result = stmt.executeQuery(SQLQuery);

            while (result.next()) {
                name = result.getString("name");
                stats[0] = result.getInt("stren");
                stats[1] = result.getInt("dexte");
                stats[2] = result.getInt("const");
                stats[3] = result.getInt("intel");
                stats[4] = result.getInt("wisdo");
                stats[5] = result.getInt("chari");
                ac = result.getInt("ac");
                hp = roll(result.getInt("hpCount"),result.getInt("hpType"),result.getInt("hpBonus"));
                proficiencyBonus = result.getInt("pBonus");
                attackstat = 1 ;
                movement = result.getInt("movement");
                dmgDiceCount = result.getInt("dmgDiceCount");
                dmgDice = result.getInt("dmgDice");
                combatBonus = ((int)(Math.floor(stats[attackstat]/2)- 5 + proficiencyBonus));
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

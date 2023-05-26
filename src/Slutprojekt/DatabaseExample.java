package Slutprojekt;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

public class DatabaseExample {
    public static void main(String[] args) {
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
            String SQLQuery = "SELECT * FROM sa04monsters WHERE name ='goblin'";
            ResultSet result = stmt.executeQuery(SQLQuery);

            ResultSetMetaData metadata = result.getMetaData();

            int numCols = metadata.getColumnCount();
            for (int i = 1 ; i <= numCols ; i++) {
                System.out.println(metadata.getColumnClassName(i));
            }

            while (result.next()) {
                String output = "";
                output += result.getInt("id") + ", " +
                        result.getString("name") + ", " +
                        result.getInt("stren") + ", " +
                        result.getInt("dexte") + ", " +
                        result.getInt("const") + ", " +
                        result.getInt("intel") + ", " +
                        result.getInt("wisdo") + ", " +
                        result.getInt("chari") + ", " +
                        result.getInt("ac") + ", " +
                        result.getInt("hpCount") + ", " +
                        result.getInt("hpType") + ", " +
                        result.getInt("hpBonus") + ", " +
                        result.getInt("pBonus") + ", " +
                        result.getString("attackStat") + ", " +
                        result.getInt("movement") + ", " +
                        result.getInt("dmgDiceCount") + ", " +
                        result.getInt("dmgDice") + ", "
                ;
                System.out.println(output);
            }

            /*
            String name = JOptionPane.showInputDialog(null,"Namn");
            String lösen = JOptionPane.showInputDialog(null,"Lösen");

            SQLQuery = "INSERT INTO sa04loginUsers(author, password) VALUES ('"+ name +"','"+ lösen +"')";
            stmt.executeUpdate(SQLQuery);
            */

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

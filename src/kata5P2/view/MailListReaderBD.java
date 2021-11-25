package kata5P2.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MailListReaderBD {

        private Connection connect() {
        String url = "jdbc:sqlite:.\\src\\Prueba.db";
        Connection conn = null;
        try {
            //Creamos un objeto Connection para conectarnos a la BD SQLite.
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public ArrayList<String> read(String nameFile) {
        String url = "jdbc:sqlite:.\\src\\Prueba.db";
        String sql = "SELECT * FROM EMAIL";
        ArrayList<String> eemail = new ArrayList<>();
        try (Connection conn = this.connect();
                //Creamos una instancia de la clase Statement a partir del objeto Connection.
                Statement stmt = conn.createStatement();
                //Se crea una instancia de la clase ResultSet invocando el método executeQuery() delobjeto Statement. Este método acepta una instrucción SELECT.
                ResultSet rs = stmt.executeQuery(sql)) {
            //Se hace un bucle usando el método next() del objeto ResultSet.
            while (rs.next()) {
                //Finalmente, se usa un método get de ResultSet, como por ejemplo, getInt(),getString(), getDouble(), etc. para obtener en cada iteración los datos.
                eemail.add(rs.getString("direccion"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return eemail;
    }
}

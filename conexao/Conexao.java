package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {
    
    public Connection getConnection(){
        try {
            
            Class.forName("org.postgresql.Driver");
            Connection cx = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SistemaHotel", "postgres" , "123456");
            return cx;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Não foi possivel conectar"+ex);
            return null;
        }
    
    
    }
    
}

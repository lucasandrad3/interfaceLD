package interfaceld;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;


public class logar{

String url;
String sql;
String email;
String senha;
boolean logado = false;

	public boolean entrar()throws Exception{
			url = "jdbc:oracle:thin:@localhost:1521:xe";
                        sql = "select senha from dadosUser where email=('"+email+"')";
                        
			try(Connection con2 = DriverManager.getConnection(url, "ldev", "ld");
					PreparedStatement stm2 = con2.prepareStatement(sql);
					ResultSet rs2 = stm2.executeQuery()){
				while(rs2.next()){
				if(rs2.getString("senha").equals(senha)){
					logado = true;
                                       
					
				}else{
					logado = false;
                                       
					}
                                }
                        }
                                
        
		
		return logado;
	}
        
}
 


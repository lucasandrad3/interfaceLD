/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaceld;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Eder
 */
public class CriarConta{
                        String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String email;
                        String nome;
                        String senha;
                        String data_nascimento;
                        String area;	
			String sql = "insert into dadosUser values(?,?,?,?,?)";
                        public void create()throws Exception {
                            try(Connection con = DriverManager.getConnection(url, "ldev", "ld");
                            PreparedStatement stm = con.prepareStatement(sql)){
                            stm.setString(1, email);
                            stm.setString(2, nome);
                            stm.setString(3, senha);
                            stm.setString(4, data_nascimento);
                            stm.setString(5, area);
                            stm.addBatch();
                            stm.executeBatch();
                            JOptionPane.showMessageDialog(null, "usuario Criado");
                        }
                    }
    
}

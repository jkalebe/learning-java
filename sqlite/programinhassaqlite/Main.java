package sqlite.programinhassaqlite;

import java.sql.Statement;
import java.lang.System.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sqlite.conexoes.ConexaoSQLite;

public class Main{
    public static void main(String[] args) {
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        
        ResultSet resultSet = null;
        Statement statement = null;

        conexaoSQLite.conectar();
        String query = "SELECT * FROM tbl_pessoa;";

        statement = conexaoSQLite.criarStatement();

        try {
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                System.out.println("Dados da pessoa");
                System.out.println("id = "+resultSet.getInt("id"));
                System.out.println("nome = "+resultSet.getString("nome"));
                System.out.println("idade = "+resultSet.getInt("idade"));
                System.out.println("-----------------------------------------");
            }
        } catch (SQLException e) {
            System.out.println("Erro misteriosos");
        }finally{
            try {
                resultSet.close();
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Erro misterioso de fechamento");
            }
        }
    }
}
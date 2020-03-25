package sqlite.conexoes;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexaoSQLite{
    private Connection conexao;

    /**
     *Conecta a um banco de dados [cria o banco se não existir] 
     * @return
     */
     
    public boolean conectar(){
        try {
            String url = "jdbc:sqlite:/home/kalebe/Projects/learning-java/sqlite/programinhassaqlite/banco_de_dados/banco_sqlite.db";
            this.conexao = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
        System.out.println("conetctado");
        return true;
    }
    public boolean desconectar(){
        try {
            if(this.conexao.isClosed() == false){
                this.conexao.close();
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
        System.out.println("desconetctado");
        return true;
    }

    /**
     * Criar os statement para os sqls serem executados
     * @return
     */

    public Statement criarStatement(){
        try {
            return this.conexao.createStatement();
        } catch (SQLException e) {
            return null;
        }
    }

        /**
     * Criar os statement para os sqls serem executados
     * @return
     */

    public PreparedStatement criarPreparedStatement(String sql){
        try {
            return this.conexao.prepareStatement(sql);
        } catch (SQLException e) {
            return null;
        }
    }

    public Connection getConexao(){
        return this.conexao;
    }
}
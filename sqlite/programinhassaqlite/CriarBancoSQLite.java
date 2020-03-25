package sqlite.programinhassaqlite;

import java.sql.SQLException;
import java.sql.Statement;

import sqlite.conexoes.ConexaoSQLite;

public class CriarBancoSQLite{
    private final ConexaoSQLite conexaoSQLite;

    public CriarBancoSQLite(ConexaoSQLite pConexaoSQLite){
        this.conexaoSQLite = pConexaoSQLite;
    }
    
    public void criarTabelaPessoa(){
        String sql = "CREATE TABLE IF NOT EXISTS tbl_pessoa"
        + "("
        + "id integer PRIMARY KEY,"
        + "nome text NOT NULL,"
        + "idade integer"
        + ");";

    //executando o sql de criar tabelas
    boolean conectou = false;

    try {
        conectou = this.conexaoSQLite.conectar();

        Statement stmt = this.conexaoSQLite.criarStatement();

        stmt.execute(sql); 
        System.out.println("Tabela pessoa criada");

    } catch (SQLException e) {
        //messagem de erro na criação da tabela

    }finally{
        if(conectou){
            this.conexaoSQLite.desconectar();
        }
    }

    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Vista.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author MAWIL
 */
public class SQLMetodos {
    
    Conexionbd conexion = new Conexionbd();

    /*public ArrayList<String> mpoliglota() throws SQLException{
        ArrayList<String> lista1 = new ArrayList<String>();
        String sql = "SELECT * FROM poliglota";
        ResultSet rs = conexion.query(sql);
        while(rs.next()){
            lista1.add(rs.getString("pol_poliglota"));
        }
        return lista1;
    }
    
    public ArrayList<String> mnacionalidades() throws SQLException{
        ArrayList<String> lista2 = new ArrayList<String>();
        String sql = "SELECT * FROM nacionalidad";
        ResultSet rs = conexion.query(sql);
        while(rs.next()){
            lista2.add(rs.getString("nac_nacionalidad"));
        }
        return lista2;
    }
    
    public ArrayList<String> msexo() throws SQLException{
        ArrayList<String> lista3 = new ArrayList<String>();
        String sql = "SELECT * FROM sexo";
        ResultSet rs = conexion.query(sql);
        while(rs.next()){
            lista3.add(rs.getString("sex_sexo"));
        }
        return lista3;
    }
    
    public ArrayList<String> mformacion() throws SQLException{
        ArrayList<String> lista4 = new ArrayList<String>();
        String sql = "SELECT * FROM formacion";
        ResultSet rs = conexion.query(sql);
        while(rs.next()){
            lista4.add(rs.getString("for_formacion"));
        }
        return lista4;
    }
    
    public ArrayList<String> mdireccion() throws SQLException{
        ArrayList<String> lista5 = new ArrayList<String>();
        String sql = "SELECT * FROM direccion";
        ResultSet rs = conexion.query(sql);
        while(rs.next()){
            lista5.add(rs.getString("dir_direccion"));
        }
        return lista5;
    }*/
}

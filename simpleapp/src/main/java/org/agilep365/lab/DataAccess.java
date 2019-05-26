package org.agilep365.lab;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.common.db.RowMapper;
import org.common.db.SqliteHelper;
public class DataAccess {

    public void initDB(){
        try {
            SqliteHelper h = new SqliteHelper("testHelper.db");
            //h.executeUpdate("drop table if exists test;");


            String sql = "create table " +
                    "exam_users(" +
                    "eusername varchar(20)," +
                    "epassword varchar(20)," +
                    "firstName varchar(20)," +
                    "lastName varchar(20)," +
                    "gender char(6)," +
                    "age int" +
                    ");";
            System.out.println(sql);
            h.executeUpdate(sql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void addUser(){
        try {
            SqliteHelper h = new SqliteHelper("testHelper.db");
            h.executeUpdate("insert into test values('sqliteHelper test1');");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void main(String args[]){
        new DataAccess().initDB();
    }
}
